import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;

final class cjb
  implements mbo, mes, mfa, mfd
{
  HashMap<Integer, ArrayList<String>> a = new HashMap();
  osm[] b;
  SparseIntArray c = new SparseIntArray();
  hgg d;
  
  public cjb(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((hgg)parammbb.a(hgg.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.a = ((HashMap)paramBundle.getSerializable("map"));
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putSerializable("map", this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjb
 * JD-Core Version:    0.7.0.1
 */