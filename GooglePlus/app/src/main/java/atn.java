import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import com.google.android.apps.plus.views.AlbumCoverView;

public final class atn
  implements atq
{
  final arl a;
  private final Rect b;
  private final int c;
  
  public atn(arl paramarl, int paramInt, Rect paramRect)
  {
    this.a = paramarl;
    this.c = 0;
    this.b = paramRect;
  }
  
  public final int a()
  {
    return this.c;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.sB, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        int i = paramViewGroup.getMeasuredWidth();
        if (this.b.width() != i)
        {
          Resources localResources = paramViewGroup.getContext().getResources();
          int j = localResources.getInteger(efj.sk);
          int k = i * 100 / j;
          int m = localResources.getDimensionPixelSize(efj.mj);
          if (m > 0) {
            k = Math.min(k, m);
          }
          this.b.set(0, 0, i, k);
        }
      }
      localView.setLayoutParams(new AbsListView.LayoutParams(this.b.width(), this.b.height()));
    }
    for (;;)
    {
      AlbumCoverView localAlbumCoverView = (AlbumCoverView)localView;
      if (this.a.c != null) {
        localAlbumCoverView.a(this.a.c);
      }
      localAlbumCoverView.a = this.a.a;
      localAlbumCoverView.requestLayout();
      localAlbumCoverView.invalidate();
      localAlbumCoverView.setVisibility(0);
      localView.setOnClickListener(new ato(this, (atp)mbb.a(localView.getContext(), atp.class)));
      return localView;
      localView = paramView;
    }
  }
  
  public final void a(atr paramatr)
  {
    paramatr.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     atn
 * JD-Core Version:    0.7.0.1
 */