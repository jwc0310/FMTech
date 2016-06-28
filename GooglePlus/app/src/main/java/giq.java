import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;

public final class giq
  extends mby
  implements DialogInterface.OnClickListener, NumberPicker.OnValueChangeListener
{
  private NumberPicker Z;
  private gir aa;
  
  public static giq a(String paramString, int paramInt1, int paramInt2, int paramInt3, String[] paramArrayOfString)
  {
    giq localgiq = new giq();
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString);
    localBundle.putInt("current", paramInt1);
    localBundle.putInt("min", 0);
    localBundle.putInt("max", paramInt3);
    localBundle.putStringArray("displayedValues", paramArrayOfString);
    localgiq.f(localBundle);
    return localgiq;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    this.Z = new NumberPicker(this.ad);
    this.Z.setMinValue(localBundle.getInt("min"));
    this.Z.setMaxValue(localBundle.getInt("max"));
    this.Z.setValue(localBundle.getInt("current"));
    this.Z.setOnValueChangedListener(this);
    String[] arrayOfString = localBundle.getStringArray("displayedValues");
    int i = 1 + (this.Z.getMaxValue() - this.Z.getMinValue());
    if ((arrayOfString != null) && (arrayOfString.length == i)) {
      this.Z.setDisplayedValues(arrayOfString);
    }
    Resources localResources = g();
    localBuilder.setTitle(localBundle.getString("title")).setView(this.Z).setPositiveButton(localResources.getString(ehr.au), this).setNegativeButton(localResources.getString(ehr.at), this);
    return localBuilder.create();
  }
  
  public final void h(Bundle paramBundle)
  {
    this.aa = ((gir)this.ae.a(gir.class));
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1) {
      this.aa.a(this.D, this.Z.getValue());
    }
  }
  
  public final void onValueChange(NumberPicker paramNumberPicker, int paramInt1, int paramInt2)
  {
    this.m.putInt("current", paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     giq
 * JD-Core Version:    0.7.0.1
 */