package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import efj;
import iim;
import iio;
import tp;
import tt;
import uo;
import uq;

public final class LicenseActivity
  extends tt
{
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.NS);
    iim localiim = (iim)getIntent().getParcelableExtra("license");
    e().a().a(localiim.a);
    e().a().b(true);
    e().a().c(true);
    e().a().a(null);
    TextView localTextView = (TextView)findViewById(efj.NP);
    String str = efj.a(this, localiim);
    if (str == null)
    {
      finish();
      return;
    }
    localTextView.setText(str);
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      finish();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    ScrollView localScrollView = (ScrollView)findViewById(efj.NO);
    localScrollView.post(new iio(this, paramBundle.getInt("scroll_pos"), localScrollView));
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    ScrollView localScrollView = (ScrollView)findViewById(efj.NO);
    TextView localTextView = (TextView)findViewById(efj.NP);
    int i = localTextView.getLayout().getLineForVertical(localScrollView.getScrollY());
    paramBundle.putInt("scroll_pos", localTextView.getLayout().getLineStart(i));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.licenses.LicenseActivity
 * JD-Core Version:    0.7.0.1
 */