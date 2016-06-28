import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;

public final class dcj
  extends deo
{
  private final String f;
  
  public dcj(Context paramContext, Cursor paramCursor, ColumnGridView paramColumnGridView, String paramString)
  {
    super(paramContext, null);
    this.f = paramString;
    dck localdck = new dck(this);
    paramColumnGridView.e.c = localdck;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.u.inflate(efj.vS, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    PhotoTileView localPhotoTileView = (PhotoTileView)paramView;
    ipf localipf = dch.a(paramView.getContext(), paramCursor);
    localPhotoTileView.s = 2;
    jpu localjpu = (jpu)this.t.b.a(new jpy(this.f), new jpw(localipf));
    if (localjpu == null) {
      localjpu = new jpu(this.f, this.f, localipf, 262144L, jrf.c.longValue());
    }
    localPhotoTileView.a(localipf, null, true);
    localPhotoTileView.a(localjpu);
    localPhotoTileView.H = true;
    localPhotoTileView.invalidate();
    localPhotoTileView.setOnClickListener(this.w);
    localPhotoTileView.setOnLongClickListener(this.x);
    paramView.setLayoutParams(new lyc(2, -3));
  }
  
  public final long getItemId(int paramInt)
  {
    if (paramInt == super.getCount()) {
      return -9223372036854775808L;
    }
    hra localhra = (hra)this.c;
    if ((localhra != null) && (localhra.moveToPosition(paramInt)))
    {
      if (localhra.getExtras().getBooleanArray("media_is_video")[localhra.b] != 0) {}
      for (ipm localipm = ipm.b; localipm == ipm.b; localipm = ipm.a) {
        return -localhra.getLong(0);
      }
      return localhra.getLong(0);
    }
    throw new RuntimeException();
  }
  
  public final int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcj
 * JD-Core Version:    0.7.0.1
 */