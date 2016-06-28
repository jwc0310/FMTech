import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.util.HashSet;
import java.util.Iterator;

public class dzd
  implements TextWatcher, TextView.OnEditorActionListener
{
  TextView a;
  public boolean b = true;
  public final HashSet<dzf> c = new HashSet();
  
  public dzd(View paramView)
  {
    this.a = ((TextView)paramView);
    if (this.a != null)
    {
      this.a.addTextChangedListener(this);
      this.a.setOnEditorActionListener(this);
      View localView1 = (View)this.a.getParent();
      if (localView1 != null)
      {
        View localView2 = localView1.findViewById(aaw.jn);
        if (localView2 != null) {
          localView2.setOnClickListener(new dze(this));
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.a.setHint(paramInt);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.a.setText(paramCharSequence);
    if (this.b) {
      this.a.requestFocus();
    }
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt == 6) || (paramInt == 3)) && (this.a == paramTextView))
    {
      onQueryTextSubmit(this.a.getText().toString());
      efj.k(this.a);
      return true;
    }
    return false;
  }
  
  public boolean onQueryTextChange(String paramString)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((dzf)localIterator.next()).a(paramString);
    }
    return false;
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
    return false;
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    onQueryTextChange(paramCharSequence.toString());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzd
 * JD-Core Version:    0.7.0.1
 */