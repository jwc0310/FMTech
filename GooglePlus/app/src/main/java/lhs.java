import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.libraries.social.squares.stream.header.StreamCategoryPickerView;
import java.util.List;

public final class lhs
  implements AdapterView.OnItemSelectedListener
{
  public lhs(StreamCategoryPickerView paramStreamCategoryPickerView) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    lhr locallhr = (lhr)this.a.a.getItem(paramInt);
    this.a.b.a(paramInt, locallhr.b, locallhr.a);
    Context localContext = this.a.getContext();
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjo.l);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this.a.c)).b(localContext);
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhs
 * JD-Core Version:    0.7.0.1
 */