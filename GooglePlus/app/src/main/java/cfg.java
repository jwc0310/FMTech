import android.app.Activity;
import android.content.Intent;

final class cfg
  implements guf
{
  cfg(cff paramcff) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if ((paramInt == -1) && (paramIntent != null))
    {
      int i = paramIntent.getIntExtra("photo_picker_mode", this.a.aA.b);
      if (i != 3)
      {
        this.a.ar.a(i);
        if ((paramIntent.hasExtra("shareables")) || (paramIntent.getData() != null) || ((this.a.aE) && (!paramIntent.hasExtra("photo_picker_selected"))))
        {
          bp localbp = this.a.f();
          this.a.f().setResult(-1, paramIntent);
          localbp.finish();
        }
      }
    }
    else
    {
      return;
    }
    isq localisq = (isq)paramIntent.getParcelableExtra("photo_picker_selected");
    if (localisq != null)
    {
      aty localaty = this.a.aq;
      aud localaud = localaty.a;
      if (localisq == null) {
        throw new NullPointerException("Cannot set a null media selection");
      }
      localaud.b = localisq;
      localaud.c();
      localaty.a();
    }
    this.a.b(this.a.N);
    this.a.K();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfg
 * JD-Core Version:    0.7.0.1
 */