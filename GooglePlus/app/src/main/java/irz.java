import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;

public final class irz
  implements AbsListView.OnScrollListener
{
  public irz(MediaPickerFragment paramMediaPickerFragment) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 1)) {
      this.a.a = -1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irz
 * JD-Core Version:    0.7.0.1
 */