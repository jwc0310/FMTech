import android.view.View;
import com.google.android.apps.plus.views.PhotoTileView;

final class dck
  implements lpw
{
  dck(dcj paramdcj) {}
  
  public final void a(View paramView)
  {
    if ((paramView instanceof lxj)) {
      ((lxj)paramView).D_();
    }
    if ((paramView instanceof PhotoTileView))
    {
      PhotoTileView localPhotoTileView = (PhotoTileView)paramView;
      localPhotoTileView.setTag(null);
      localPhotoTileView.setOnClickListener(null);
      localPhotoTileView.setOnLongClickListener(null);
      localPhotoTileView.setClickable(false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dck
 * JD-Core Version:    0.7.0.1
 */