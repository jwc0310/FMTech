import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class deg
  extends gzf
{
  private final String a;
  private final int b;
  private final Intent c;
  
  public deg(Context paramContext, String paramString1, String paramString2, int paramInt, Intent paramIntent)
  {
    super(paramContext, paramString1);
    this.a = paramString2;
    this.b = paramInt;
    this.c = paramIntent;
  }
  
  protected final hae a()
  {
    long l = 0L;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.a);
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    List localList = jrf.a(this.e, this.b, localArrayList);
    if (!localList.isEmpty()) {
      l = ((ipn)localList.get(0)).a;
    }
    this.c.putExtra("picasa_photo_id", l);
    hae localhae = new hae(true);
    localhae.a().putParcelable("result_intent", this.c);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     deg
 * JD-Core Version:    0.7.0.1
 */