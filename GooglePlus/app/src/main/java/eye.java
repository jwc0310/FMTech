import java.io.IOException;

public class eye
  extends IOException
{
  private static final long serialVersionUID = -6947486886997889499L;
  
  public eye()
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.");
  }
  
  eye(int paramInt1, int paramInt2)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
  }
  
  public eye(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eye
 * JD-Core Version:    0.7.0.1
 */