import android.content.Intent;
import android.graphics.RectF;
import com.google.android.apps.plus.service.EsService;

final class cdr
  implements Runnable
{
  cdr(cdo paramcdo, cee paramcee) {}
  
  public final void run()
  {
    if (!this.b.i()) {
      return;
    }
    cdo localcdo = this.b;
    String str = Long.toString(this.a.e.longValue());
    RectF localRectF = this.a.c;
    int i = this.a.d;
    boolean bool = this.a.b;
    mbf localmbf = localcdo.bn;
    int j = localcdo.at.c();
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 711);
    localIntent.putExtra("account_id", j);
    localIntent.putExtra("photo_id", str);
    localIntent.putExtra("coordinates", localRectF);
    localIntent.putExtra("rotation", i);
    localIntent.putExtra("is_gallery_photo", bool);
    localcdo.ac = Integer.valueOf(EsService.a(localmbf, localIntent));
    localcdo.e(aau.te);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdr
 * JD-Core Version:    0.7.0.1
 */