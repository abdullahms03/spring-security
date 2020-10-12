Spring Security
---------------
---------------
## Authentication
Who are you?

#### Knowledge based
- Username, password

#### Possession based
- Phone/Text messages
- Access token

#### MFA
- combination of both

## Authorization
What do you want?

## Principal
The authenticated user - currently logged in user  
Once authenticated, the application establishes the `principal` and remembers it

## Authority (Granted Authority)
Fine grained permissions
Operations allowed
e.g. 
- do_checkout
- make_announcement
etc.,

## Role
Coarse grained permissions  
Roles hold group of authorities  
Roles can be assigned to user accordingly.


