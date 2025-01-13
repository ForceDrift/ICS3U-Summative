package Core_Features;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class Authentication extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository userRepository; //get from db

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username -> {
            org.springframework.security.core.userdetails.User.UserBuilder builder = 
                    org.springframework.security.core.userdetails.User.builder().username(username);

            userRepository.findByUsername(username)
                    .map(u -> builder.password(u.getPassword()).roles("USER")) //check if use exists
                    .orElseThrow(() -> new UsernameNotFoundException("User not found."));

            return builder.build();
        });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/dashboard") // Redirect after successful login
                .failureUrl("/login?error")
                .and()
                .logout()
                .logoutSuccessUrl("/");
    }
}
