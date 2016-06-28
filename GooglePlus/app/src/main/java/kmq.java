import android.content.Context;
import android.os.Bundle;

public final class kmq
  extends gzf
{
  private final kog a;
  private final int b;
  
  public kmq(String paramString, kog paramkog, int paramInt)
  {
    super(paramString);
    this.a = paramkog;
    this.b = paramInt;
  }
  
  protected final hae a(Context paramContext)
  {
    long l = ((kht)mbb.a(paramContext, kht.class)).a(this.a, this.b);
    byte[] arrayOfByte = ((kmw)mbb.a(paramContext, kmw.class)).a(this.a);
    hae localhae = new hae(true);
    Bundle localBundle = localhae.a();
    localBundle.putLong("draft_id_extra", l);
    localBundle.putByteArray("draft_data_extra", arrayOfByte);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmq
 * JD-Core Version:    0.7.0.1
 */