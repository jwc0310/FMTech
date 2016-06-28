package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import efj;
import iip;
import java.util.ArrayList;
import tt;

public final class LicenseMenuActivity
  extends tt
{
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.NT);
    ArrayList localArrayList = efj.r(this);
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this, efj.NR, efj.NN, localArrayList);
    ListView localListView = (ListView)findViewById(efj.NQ);
    localListView.setAdapter(localArrayAdapter);
    localListView.setOnItemClickListener(new iip(this));
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
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.licenses.LicenseMenuActivity
 * JD-Core Version:    0.7.0.1
 */