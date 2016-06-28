import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

final class hyt
  extends Filter
{
  hyt(hyn paramhyn) {}
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      localObject = new ArrayList();
      for (hyf localhyf : this.a.c) {
        if (localhyf.a.toLowerCase(Locale.getDefault()).contains(paramCharSequence)) {
          ((List)localObject).add(localhyf);
        }
      }
    }
    Object localObject = Arrays.asList(this.a.c);
    localFilterResults.values = localObject;
    localFilterResults.count = ((List)localObject).size();
    return localFilterResults;
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    this.a.d = ((List)paramFilterResults.values);
    if (paramFilterResults.count == 0)
    {
      this.a.notifyDataSetInvalidated();
      return;
    }
    this.a.notifyDataSetChanged();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyt
 * JD-Core Version:    0.7.0.1
 */