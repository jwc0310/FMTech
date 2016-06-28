import android.content.Intent;
import java.util.ArrayList;

final class lbu
  implements guf
{
  lbu(lbt paramlbt) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if (paramInt != -1) {}
    ArrayList localArrayList;
    do
    {
      return;
      localArrayList = paramIntent.getParcelableArrayListExtra("shareables");
    } while ((localArrayList == null) || (localArrayList.isEmpty()));
    lbt locallbt = this.a;
    locallbt.Z = ((ipa)localArrayList.get(0)).e();
    Intent localIntent = locallbt.a.a(locallbt.d.c(), locallbt.Z);
    locallbt.c.a(dl.ah, localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbu
 * JD-Core Version:    0.7.0.1
 */