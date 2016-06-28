import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Map;

public abstract class bzl
  extends mca
  implements TextView.OnEditorActionListener, cmf
{
  private byte[] Z;
  public int a = -1;
  private boolean aa;
  private CharSequence ab;
  private dme ac = new bzm(this);
  public String b;
  public Integer c;
  public MentionMultiAutoCompleteTextView d;
  
  public final void A()
  {
    efj.k(this.d);
    bp localbp = f();
    if (z())
    {
      localbp.showDialog(901235);
      return;
    }
    localbp.setResult(0);
    localbp.finish();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.tt, paramViewGroup, false);
    this.d = ((MentionMultiAutoCompleteTextView)localView.findViewById(aaw.ls));
    this.d.a(this, this.a, this.b, null);
    this.d.c = true;
    byte[] arrayOfByte;
    SpannableStringBuilder localSpannableStringBuilder;
    if (paramBundle == null)
    {
      arrayOfByte = this.Z;
      if (arrayOfByte != null) {
        break label142;
      }
      localSpannableStringBuilder = null;
      if (localSpannableStringBuilder != null) {
        break label155;
      }
      this.d.a("");
    }
    for (;;)
    {
      this.d.setSelection(this.d.getText().length());
      this.ab = this.d.getText().toString();
      this.d.addTextChangedListener(new bzn(this));
      this.d.setOnEditorActionListener(this);
      return localView;
      label142:
      localSpannableStringBuilder = lwh.a(ByteBuffer.wrap(arrayOfByte));
      break;
      label155:
      this.d.a(localSpannableStringBuilder);
    }
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    if ((this.c == null) || (this.c.intValue() != paramInt)) {}
    bp localbp;
    do
    {
      return;
      this.c = null;
      localbp = f();
    } while (localbp == null);
    localbp.dismissDialog(297895);
    if (paramdmx != null)
    {
      int i;
      String str1;
      if (paramdmx.c != 200)
      {
        i = 1;
        if (i == 0) {
          break label192;
        }
        if (!kdd.a(paramdmx.d, "INVALID_ACL_EXPANSION")) {
          break label179;
        }
        int j = aau.to;
        str1 = g().getString(j);
        if (!this.aa) {
          break label171;
        }
      }
      label171:
      for (int k = aau.tp;; k = aau.tq)
      {
        String str2 = g().getString(k);
        int m = aau.mf;
        lut locallut = lut.a(str1, str2, g().getString(m), null, 0, 0);
        locallut.n = this.n;
        locallut.p = 0;
        locallut.a(this.x, "StreamPostRestrictionsNotSupported");
        return;
        i = 0;
        break;
      }
      label179:
      Toast.makeText(localbp, x(), 0).show();
      return;
    }
    label192:
    localbp.finish();
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    Intent localIntent = paramActivity.getIntent();
    this.a = localIntent.getIntExtra("account_id", -1);
    this.b = localIntent.getStringExtra("activity_id");
    this.Z = localIntent.getByteArrayExtra(y());
    this.aa = f().getIntent().getBooleanExtra("is_square_post", false);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ab = paramBundle.getCharSequence("original_text");
      if (paramBundle.containsKey("request_id")) {
        this.c = Integer.valueOf(paramBundle.getInt("request_id"));
      }
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putCharSequence("original_text", this.ab);
    if (this.c != null) {
      paramBundle.putInt("request_id", this.c.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.ac);
    if (this.c != null)
    {
      int i = this.c.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        a(this.c.intValue(), EsService.a(this.c.intValue()));
      }
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.ac;
    EsService.d.remove(localdme);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramTextView == this.d) {}
    switch (paramInt)
    {
    default: 
      return false;
    }
    efj.k(paramTextView);
    if (v()) {
      w();
    }
    return true;
  }
  
  public void w()
  {
    efj.k(this.d);
    bp localbp = f();
    if (z())
    {
      localbp.showDialog(297895);
      return;
    }
    localbp.setResult(0);
    localbp.finish();
  }
  
  public abstract int x();
  
  public abstract String y();
  
  public final boolean z()
  {
    return !TextUtils.equals(this.d.getText(), this.ab);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzl
 * JD-Core Version:    0.7.0.1
 */