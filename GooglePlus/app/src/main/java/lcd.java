import android.content.ClipData;
import android.graphics.Point;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ListView;

final class lcd
  implements View.OnLongClickListener
{
  lcd(lca paramlca, View paramView) {}
  
  public final boolean onLongClick(View paramView)
  {
    Point localPoint = new Point(0, 0);
    lce locallce = new lce(this.b, this.a, localPoint);
    this.a.setVisibility(4);
    this.b.c = this.b.a.getPositionForView(this.a);
    this.b.d = this.b.c;
    ClipData localClipData = ClipData.newPlainText("", "");
    lca.a(this.b, this.b.e);
    this.a.startDrag(localClipData, locallce, this.a, 0);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcd
 * JD-Core Version:    0.7.0.1
 */