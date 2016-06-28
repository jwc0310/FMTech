import android.content.Context;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;

final class hao
{
  final Context a;
  final int b;
  final itz c;
  final haq d;
  MediaRecordEntry e;
  
  hao(Context paramContext, int paramInt, haq paramhaq, iun paramiun, itg paramitg)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.d = paramhaq;
    hap localhap = new hap(this);
    mbb.a(paramContext, hbd.class);
    iub localiub = new iub(paramContext).a(paramInt);
    efj.e(localhap, "progressListener must be non-null");
    localiub.e = localhap;
    localiub.f = false;
    if (paramiun == null) {
      throw new NullPointerException();
    }
    localiub.g = ((iun)paramiun);
    localiub.h = paramitg;
    this.c = localiub.a();
    this.c.b = "uploadmediabackground";
  }
  
  public final void a()
  {
    try
    {
      this.c.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hao
 * JD-Core Version:    0.7.0.1
 */