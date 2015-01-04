public class ExternalEmailDecorator extends EmailDecorator
{
    private String content;

    public ExternalEmailDecorator(IEmail iEmail)
    {
        originalEmail = iEmail;
    }

    @Override
    public String getContents()
    {
        content = attachMessage(originalEmail.getContents());
        return content;
    }

    private String attachMessage(String message)
    {
        return  message + " attached!";
    }
}
