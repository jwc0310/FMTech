import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dgj
  extends deo
{
  public dgj(Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    PhotoTileView localPhotoTileView = (PhotoTileView)this.u.inflate(efj.vS, paramViewGroup, false);
    localPhotoTileView.b = true;
    return localPhotoTileView;
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    PhotoTileView localPhotoTileView = (PhotoTileView)paramView;
    bvj localbvj = new bvj(paramCursor.getString(1));
    int i;
    ipm localipm2;
    label90:
    ipf localipf;
    if ((0x20 & paramCursor.getLong(4)) != 0L)
    {
      i = 1;
      if (paramCursor.isNull(2)) {
        break label165;
      }
      String str2 = paramCursor.getString(1);
      Context localContext2 = this.d;
      Uri localUri = Uri.fromFile(bvf.a(this.d, str2));
      if (i == 0) {
        break label157;
      }
      localipm2 = ipm.b;
      localipf = ipf.a(localContext2, localUri, localipm2);
    }
    for (;;)
    {
      localPhotoTileView.H = true;
      localPhotoTileView.invalidate();
      localPhotoTileView.c = false;
      localPhotoTileView.a(localipf);
      localPhotoTileView.a(localbvj);
      localPhotoTileView.setOnClickListener(this.w);
      localPhotoTileView.setOnLongClickListener(this.x);
      return;
      i = 0;
      break;
      label157:
      localipm2 = ipm.a;
      break label90;
      label165:
      if (!paramCursor.isNull(3))
      {
        Context localContext1 = this.d;
        String str1 = paramCursor.getString(3);
        if (i != 0) {}
        for (ipm localipm1 = ipm.b;; localipm1 = ipm.a)
        {
          localipf = ipf.a(localContext1, str1, localipm1);
          break;
        }
      }
      if (dun.b()) {
        throw new IllegalArgumentException("Trash entry must have remote url or local path");
      }
      localipf = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgj
 * JD-Core Version:    0.7.0.1
 */