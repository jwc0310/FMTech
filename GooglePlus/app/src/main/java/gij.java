import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;

public final class gij
  extends mby
{
  public static gij a(Context paramContext, gim paramgim, String paramString)
  {
    la localla = paramgim.g();
    int[] arrayOfInt = new int[localla.size()];
    String[] arrayOfString = new String[1 + localla.size()];
    for (int i = 0; i < localla.size(); i++)
    {
      arrayOfInt[i] = ((Integer)localla.b[(i << 1)]).intValue();
      arrayOfString[i] = ((String)localla.b[(1 + (i << 1))]);
    }
    Resources localResources = paramContext.getResources();
    arrayOfString[localla.size()] = localResources.getString(ehr.as);
    gij localgij = new gij();
    Bundle localBundle = new Bundle();
    localBundle.putIntArray("idsTag", arrayOfInt);
    localBundle.putCharSequenceArray("actionsTag", arrayOfString);
    localBundle.putString("dialogIdTag", paramString);
    localgij.f(localBundle);
    return localgij;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    CharSequence[] arrayOfCharSequence = localBundle.getCharSequenceArray("actionsTag");
    localBuilder.setTitle(this.ad.getResources().getString(ehr.av)).setItems(arrayOfCharSequence, (DialogInterface.OnClickListener)this.ae.a(gil.class));
    return localBuilder.create();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gij
 * JD-Core Version:    0.7.0.1
 */