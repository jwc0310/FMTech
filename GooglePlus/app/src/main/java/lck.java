import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;

public final class lck
  extends mby
  implements DialogInterface.OnClickListener
{
  final lck a(int paramInt, String paramString, SparseArray<String> paramSparseArray)
  {
    int i = paramSparseArray.size();
    String[] arrayOfString = new String[i];
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++)
    {
      arrayOfString[j] = ((String)paramSparseArray.valueAt(j));
      arrayOfInt[j] = paramSparseArray.keyAt(j);
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt("currentPositionTag", paramInt);
    localBundle.putString("currentElementDescriptionTag", paramString);
    localBundle.putStringArray("elementsTag", arrayOfString);
    localBundle.putIntArray("elementPositionsTag", arrayOfInt);
    f(localBundle);
    return this;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    Resources localResources = this.ad.getResources();
    un localun1 = new un(f());
    String[] arrayOfString = localBundle.getStringArray("elementsTag");
    int i = ev.y;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localBundle.getString("currentElementDescriptionTag");
    String str = localResources.getString(i, arrayOfObject);
    localun1.a.e = str;
    un localun2 = localun1.a(arrayOfString, this);
    int j = ev.a;
    localun2.b(g().getString(j), this);
    return localun1.a();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -2) {
      this.d.dismiss();
    }
    bk localbk;
    do
    {
      return;
      localbk = this.n;
    } while (!(localbk instanceof lcf));
    lcf locallcf = (lcf)localbk;
    Bundle localBundle = this.m;
    locallcf.a(localBundle.getInt("currentPositionTag"), localBundle.getIntArray("elementPositionsTag")[paramInt]);
    locallcf.v();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lck
 * JD-Core Version:    0.7.0.1
 */