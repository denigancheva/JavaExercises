public class User {
    private String email;
    private String password;

    public User(String email, String password) throws InvalidEmailException, InvalidPasswordException
    {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail()
    {

        return this.email;

    }
    public void setEmail(String email) throws InvalidEmailException
    {
        if(email.contains("@"))
        {
            this.email=email;
        }
        else
        {
            throw new InvalidEmailException("The email should contain @ !");
        }
    }
    public void setPassword(String password) throws InvalidPasswordException
    {
        if(password.length()>=8)
        {
            this.password=password;
        }
        else
        {
            throw new InvalidPasswordException("Password should be at least 8 symbols! !");
        }
    }
    public String getPassword()
    {
        return this.password;
    }
    public String ShowUser()
    {
        return "Email: " + this.email + ", Password: " + this.password;
    }


}
