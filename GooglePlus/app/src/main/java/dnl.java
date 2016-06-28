import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.apps.plus.service.SlideshowService;

public final class dnl
  extends AsyncTask<fj, Void, Object>
{
  dnl(SlideshowService paramSlideshowService) {}
  
  protected final void onPostExecute(Object paramObject)
  {
    if (paramObject != null)
    {
      SlideshowService localSlideshowService = this.a;
      localSlideshowService.c = (1 + localSlideshowService.c);
      Context localContext = localSlideshowService.getApplicationContext();
      jqb localjqb = (jqb)mbb.a(localContext, jqb.class);
      Bundle localBundle = new Bundle(localSlideshowService.b);
      Cursor localCursor;
      ipf localipf3;
      ipf localipf4;
      jqf localjqf3;
      label148:
      jqf localjqf4;
      if ((paramObject instanceof Cursor))
      {
        localCursor = (Cursor)paramObject;
        if (!localCursor.moveToPosition(localSlideshowService.c))
        {
          localSlideshowService.a();
          return;
        }
        if (localjqb.b())
        {
          if (!localSlideshowService.e) {
            break label237;
          }
          localipf3 = dch.a(localContext, localCursor);
          localBundle.putParcelable("photo_ref", localipf3);
          if (!localCursor.moveToNext()) {
            break label187;
          }
          localipf4 = dch.a(localContext, localCursor);
          int i1 = localSlideshowService.c;
          if (localipf3 != null) {
            break label193;
          }
          localjqf3 = null;
          localjqf4 = null;
          if (localipf4 != null) {
            break label215;
          }
          label156:
          localjqb.a(localBundle, i1, localjqf3, localjqf4);
        }
      }
      label187:
      label193:
      label215:
      label237:
      apz localapz;
      label318:
      label332:
      label362:
      do
      {
        do
        {
          localSlideshowService.b();
          localSlideshowService.a.sendEmptyMessageDelayed(1, 5000);
          return;
          localipf4 = null;
          break;
          localjqf3 = new jqf(localipf3.c, localipf3.e);
          break label148;
          localjqf4 = new jqf(localipf4.c, localipf4.e);
          break label156;
          ipf localipf1 = def.a(localContext, localCursor);
          if (localSlideshowService.b.containsKey("photo_id")) {
            localBundle.putString("photo_id", localCursor.getString(5));
          }
          if (localSlideshowService.b.containsKey("tile_id")) {
            localBundle.putString("tile_id", localCursor.getString(1));
          }
          ipf localipf2;
          int n;
          jqf localjqf1;
          jqf localjqf2;
          if (localCursor.moveToNext())
          {
            localipf2 = def.a(localSlideshowService, localCursor);
            n = localSlideshowService.c;
            if (localipf1 != null) {
              break label362;
            }
            localjqf1 = null;
            localjqf2 = null;
            if (localipf2 != null) {
              break label384;
            }
          }
          for (;;)
          {
            localjqb.a(localBundle, n, localjqf1, localjqf2);
            break;
            localipf2 = null;
            break label318;
            localjqf1 = new jqf(localipf1.c, localipf1.e);
            break label332;
            localjqf2 = new jqf(localipf2.c, localipf2.e);
          }
        } while (!(paramObject instanceof apz));
        localapz = (apz)paramObject;
        if (localSlideshowService.c < localapz.a.length) {}
        for (int i = 1; i == 0; i = 0)
        {
          localSlideshowService.a();
          return;
        }
      } while (!localjqb.b());
      label384:
      int j = localSlideshowService.c;
      long l = localapz.a[j].a;
      if (1 + localSlideshowService.c < localapz.a.length) {}
      for (int k = 1;; k = 0)
      {
        localBundle.putLong("all_photos_row_id", l);
        dnk localdnk = new dnk(localSlideshowService, localBundle, localContext, localSlideshowService.c, localjqb);
        Long[] arrayOfLong = new Long[2];
        arrayOfLong[0] = Long.valueOf(l);
        Long localLong = null;
        if (k != 0)
        {
          int m = 1 + localSlideshowService.c;
          localLong = Long.valueOf(localapz.a[m].a);
        }
        arrayOfLong[1] = localLong;
        localdnk.execute(arrayOfLong);
        break;
      }
    }
    if (dun.b()) {
      throw new IllegalStateException("Got a null cursor when trying to run slideshow.");
    }
    Log.e("SlideshowService", "Slideshow can't advance because provided cursor is null.");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnl
 * JD-Core Version:    0.7.0.1
 */