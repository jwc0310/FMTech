import java.security.Provider;

public class gig
  extends Provider
{
  public gig()
  {
    super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
    put("SecureRandom.SHA1PRNG", gif.class.getName());
    put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gig
 * JD-Core Version:    0.7.0.1
 */