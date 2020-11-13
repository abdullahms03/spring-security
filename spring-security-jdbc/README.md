## Spring Security with JDBC

- Use Jdbc Authentication from `WebSecurityConfigurerAdapter`
- Configure the datasource
    - there is an option to use default schema with details hardcoded (not recommended for real applications)
- use `schema.sql` to define the database schema and `data.sql` to insert the actual data    