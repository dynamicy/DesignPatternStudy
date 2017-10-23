public class SecureEmailDecorator extends EmailDecorator {
    private String content;

    public SecureEmailDecorator(IEmail iEmail) {
        originalEmail = iEmail;
    }

    @Override
    public String getContents() {
        content = encryptEmailContent(originalEmail.getContents());
        return content;
    }

    private String encryptEmailContent(String message) {
        String temp = new StringBuilder(message).reverse().toString();
        return temp;
    }
}