## Default behaviour

- Adds mandatory authentication for all URLs (except few, e.g. /error)
- Adds login form
- Handles login error
- Creates a user and sets a default password
    - username: user
    - password: generated while starting the application
- exposes `logout` option (e.g.http://localhost:8080/logout)
    
## Configure Authentication
- AuthenticationManager manages the authentication
- Use AuthenticationManagerBuilder to configure the authentication type
- Extend `WebSecurityConfigurerAdapter` class
- Override `configure(AuthenticationManagerBuilder auth)` method
- setup the authentication type with corresponding details

### In-Memory Authentication
- `AuthenticationManagerBuilder` with builder pattern helps to construct the `AuthenticationManager`
- Build with the username, password and roles (multiple users can be configured)

## Configure Authorization
- Setup different level of access for different APIs
- Use HttpSecurity to configure the authorization
- Extend `WebSecurityConfigurerAdapter` class
- Override `configure(HttpSecurity http)` method
- setup the authorization with corresponding details
- Build with the path(antMatchers), role(can specify multiple roles) and type of login
- Go with the most restricted access to the least restricted 