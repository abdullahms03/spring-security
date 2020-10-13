## Default behaviour

- Adds mandatory authentication for all URLs (except few, e.g. /error)
- Adds login form
- Handles login error
- Creates a user and sets a default password
    - username: user
    - password: generated while starting the application
    
## Configure Authentication
- AuthenticationManager manages the authentication
- Use AuthenticationManagerBuilder to configure the authentication type
- Extend `WebSecurityConfigurerAdapter` class
- Override configure method
- setup the authentication type with corresponding details

### InMemory Authentication
- `AuthenticationManagerBuilder` with builder pattern helps to construct the `AuthenticationManager`
- Build with the username, password and roles (multiple users can be configured)