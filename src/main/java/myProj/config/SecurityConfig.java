package myProj.config;



import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                      //  .requestMatchers("/profi").hasRole("ADMIN")
                        .requestMatchers("/profi-user-myorders", "/profi-welcome-user").hasRole("USER")
                        .requestMatchers("/profi-welcome", "/profi-registration").permitAll()
                      .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll())

                 .formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
         //       .formLogin(formLogin -> formLogin
//                        .loginPage("/profi-user-login")
////                        .loginProcessingUrl("/profi-user-login")
//                        .defaultSuccessUrl("/profi-registration").permitAll())
//                        //.successForwardUrl("/profi-registration")
//
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutUrl("/profi-logout")
//                        .logoutSuccessUrl("/profi-welcome-")
//                        .permitAll()
//                )
                .build();
    }



    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("u")
                        .password("p")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
}
