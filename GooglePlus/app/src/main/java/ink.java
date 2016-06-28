import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class ink
  extends lut
{
  private inl Z;
  
  public final Context ar_()
  {
    return new ContextThemeWrapper(f(), aaw.oQ);
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((inl)this.ae.a(inl.class));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.Z.a();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      this.Z.a(this.m.getBoolean("non_google_account"), this.m.getBoolean("shown_page_tos"));
      return;
    }
    this.Z.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ink
 * JD-Core Version:    0.7.0.1
 */