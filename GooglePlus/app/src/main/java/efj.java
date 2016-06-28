import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlertDialog.Builder;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.appwidget.AppWidgetManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Media;
import android.provider.MediaStore.Video.Thumbnails;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.text.Html;
import android.text.Html.TagHandler;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.google.android.apps.photos.phone.PhotosHomeActivity;
import com.google.android.apps.photos.phone.PhotosLauncherActivity;
import com.google.android.apps.plus.locations.HostFriendLocationsActivity;
import com.google.android.apps.plus.phone.AddToAlbumActivity;
import com.google.android.apps.plus.phone.CircleSettingsActivity;
import com.google.android.apps.plus.phone.CirclesMembershipActivity;
import com.google.android.apps.plus.phone.EditCommentActivity;
import com.google.android.apps.plus.phone.EventActivity;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.apps.plus.phone.HostAllAlbumsTileActivity;
import com.google.android.apps.plus.phone.HostEventInviteeListActivity;
import com.google.android.apps.plus.phone.HostLocalCollectionTileActivity;
import com.google.android.apps.plus.phone.HostPeopleActivity;
import com.google.android.apps.plus.phone.HostStreamOneUpActivity;
import com.google.android.apps.plus.phone.OneProfileActivity;
import com.google.android.apps.plus.phone.PeopleListActivity;
import com.google.android.apps.plus.phone.PhotoTilePickerActivity;
import com.google.android.apps.plus.phone.PhotoTileSearchActivity;
import com.google.android.apps.plus.phone.ProfileEditActivity;
import com.google.android.apps.plus.phone.StreamMiniShareActivity;
import com.google.android.apps.plus.phone.TopicStreamActivity;
import com.google.android.apps.plus.phone.UnifiedSearchActivity;
import com.google.android.apps.plus.phone.sharebox.PlusShareboxActivity;
import com.google.android.apps.plus.settings.MainSettingsPlusActivity;
import com.google.android.apps.plus.widget.locations.LocationsWidgetProvider;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.FilterChainNode;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.social.acl.PlusAclPickerActivity;
import com.google.android.libraries.social.gateway.GatewayActivity;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import com.google.android.libraries.social.squares.listitem.SquareInvitationView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

@Deprecated
public class efj
{
  public static final int A = 2130837528;
  public static final int AA = 2131493118;
  public static final int AB = 2131559020;
  public static final int AC = 2131559012;
  public static final int AD = 2131558903;
  public static final int AE = 2131558799;
  public static final int AF = 2131558973;
  public static final int AG = 2131558972;
  public static final int AH = 2131558976;
  public static final int AI = 2131559713;
  public static final int AJ = 2130969011;
  public static final int AK = 2131493411;
  public static final int AL = 2131493412;
  public static final int AM = 2130837648;
  public static final int AN = 2130837653;
  public static final int AO = 2130837799;
  public static final int AP = 2130838551;
  public static final int AQ = 2130838586;
  public static final int AR = 2130838673;
  public static final int AS = 2130968763;
  public static final int AT = 2130969086;
  public static final int AU = 2130969087;
  public static final int AV = 2130969089;
  public static final int AW = 2130969090;
  public static final int AX = 2130969095;
  public static final int AY = 2130969098;
  public static final int AZ = 2130969099;
  public static final int Aa = 2130968920;
  public static final int Ab = 2131756010;
  public static final int Ac = 2131756283;
  public static final int Ad = 2131756599;
  public static final int Ae = 2131756600;
  public static final int Af = 2131756650;
  public static final int Ag = 2131756682;
  public static final int Ah = 2131757416;
  public static final int Ai = 2131757622;
  public static final int Aj = 2131758082;
  public static final int Ak = 2131758083;
  public static final int Al = 2130838366;
  public static final int Am = 2130838367;
  public static final int An = 2130968935;
  public static final int Ao = 2130968941;
  public static final int Ap = 2130968949;
  public static final int Aq = 2131755708;
  public static final int Ar = 2131755709;
  public static final int As = 2131755710;
  public static final int At = 2131756570;
  public static final int Au = 2131756572;
  public static final int Av = 2131756573;
  public static final int Aw = 2131756595;
  public static final int Ax = 2131756596;
  public static final int Ay = 2131756597;
  public static final int Az = 2131427731;
  public static final int B = 2130837529;
  public static final int BA = 2131757860;
  public static final int BB = 2131757920;
  public static final int BC = 2131757955;
  public static final int BD = 2131758000;
  public static final int BE = 2131758001;
  public static final int BF = 2131758002;
  public static final int BG = 2131428037;
  public static final int BH = 2131558420;
  public static final int BI = 2131560030;
  public static final int BJ = 2131560032;
  public static final int BK = 2131560031;
  public static final int BL = 2131624012;
  public static final int BM = 2130969162;
  public static final int BN = 2131689544;
  public static final int BO = 2131689547;
  public static final int BP = 2130837728;
  public static final int BQ = 2130837729;
  public static final int BR = 2131755628;
  public static final int BS = 2131755629;
  public static final int BT = 2131755630;
  public static final int BU = 2131755631;
  public static final int BV = 2131755632;
  public static final int BW = 2131755633;
  public static final int BX = 2131755634;
  public static final int BY = 2131755636;
  public static final int BZ = 2131755637;
  public static final int Ba = 2131886101;
  public static final int Bb = 2131493762;
  public static final int Bc = 2131493763;
  public static final int Bd = 2131493764;
  public static final int Be = 2131493256;
  public static final int Bf = 2130837795;
  public static final int Bg = 2130838759;
  public static final int Bh = 2131689595;
  public static final int Bi = 2131755059;
  public static final int Bj = 2131755294;
  public static final int Bk = 2131755665;
  public static final int Bl = 2131755756;
  public static final int Bm = 2131755884;
  public static final int Bn = 2131755885;
  public static final int Bo = 2131756253;
  public static final int Bp = 2131756427;
  public static final int Bq = 2131756614;
  public static final int Br = 2131757549;
  public static final int Bs = 2131757752;
  public static final int Bt = 2131757771;
  public static final int Bu = 2131757799;
  public static final int Bv = 2131757832;
  public static final int Bw = 2131757838;
  public static final int Bx = 2131757843;
  public static final int By = 2131757851;
  public static final int Bz = 2131757856;
  public static final int C = 2130837530;
  public static final int CA = 2130838411;
  public static final int CB = 2130838412;
  public static final int CC = 2131820718;
  public static final int CD = 2131820814;
  public static final int CE = 2131820815;
  public static final int CF = 2131757542;
  public static final int CG = 2131558462;
  public static final int CH = 2130837763;
  public static final int CI = 2130838478;
  public static final int CJ = 2130838480;
  public static final int CK = 2131558784;
  public static final int CL = 2131558789;
  public static final int CM = 2131558803;
  public static final int CN = 2131558791;
  public static final int CO = 2131558807;
  public static final int CP = 2131558806;
  public static final int CQ = 2131558805;
  public static final int CR = 2131558804;
  public static final int CS = 2131558788;
  public static final int CT = 2131558809;
  public static final int CU = 2131558792;
  public static final int CV = 2131558810;
  public static final int CW = 2131558801;
  public static final int CX = 2131558808;
  public static final int CY = 2131755086;
  public static final int CZ = 2131755087;
  public static final int Ca = 2131755638;
  public static final int Cb = 2131755639;
  public static final int Cc = 2131755640;
  public static final int Cd = 2131755641;
  public static final int Ce = 2131755643;
  public static final int Cf = 2131755644;
  public static final int Cg = 2131755646;
  public static final int Ch = 2131755647;
  public static final int Ci = 2131755648;
  public static final int Cj = 2131755649;
  public static final int Ck = 2131755650;
  public static final int Cl = 2131755651;
  public static final int Cm = 2131755652;
  public static final int Cn = 2131755653;
  public static final int Co = 2131755654;
  public static final int Cp = 2131755655;
  public static final int Cq = 2131755656;
  public static final int Cr = 2131755657;
  public static ffa Cs;
  public static fje Ct;
  public static volatile boolean Cu = false;
  public static gem Cv;
  public static final int Cw = 2131427575;
  public static final int Cx = 2131427577;
  public static final int Cy = 2130837577;
  public static final int Cz = 2130838410;
  public static final int D = 2130837531;
  public static final int DA = 2130838515;
  public static final int DB = 2130838540;
  public static final int DC = 2130838552;
  public static final int DD = 2130838579;
  public static final int DE = 2130838596;
  public static final int DF = 2130838619;
  public static final int DG = 2130838639;
  public static final int DH = 2130968612;
  public static final int DI = 2130968655;
  public static final int DJ = 2130968656;
  public static final int DK = 2130968657;
  public static final int DL = 2130968990;
  public static final int DM = 2131689474;
  public static final int DN = 2131034123;
  public static final int DO = 2131034124;
  public static final int DP = 2131427344;
  public static final int DQ = 2131427734;
  public static final int DR = 2131427790;
  public static final int DS = 2131492933;
  public static final int DT = 2131492934;
  public static final int DU = 2131492935;
  public static final int DV = 2131492936;
  public static final int DW = 2131492937;
  public static final int DX = 2131492938;
  public static final int DY = 2131492941;
  public static final int DZ = 2131492942;
  public static final int Da = 2131755088;
  public static final int Db = 2131755089;
  public static final int Dc = 2131755090;
  public static final int Dd = 2131755094;
  public static final int De = 2130968602;
  public static final int Df = 2130968604;
  public static final int Dg = 2131755091;
  public static final int Dh = 2131755092;
  public static final int Di = 2131755093;
  public static final int Dj = 2130968606;
  public static final int Dk = 2131756501;
  public static final int Dl = 2131756502;
  public static final int Dm = 2131493648;
  public static final int Dn = 2130837568;
  public static final int Do = 2130837569;
  public static final int Dp = 2130837574;
  public static final int Dq = 2130837813;
  public static final int Dr = 2130837855;
  public static final int Ds = 2130837875;
  public static final int Dt = 2130837876;
  public static final int Du = 2130837893;
  public static final int Dv = 2130838042;
  public static final int Dw = 2130838140;
  public static final int Dx = 2130838148;
  public static final int Dy = 2130838239;
  public static final int Dz = 2130838510;
  public static final int E = 2130837532;
  public static final int EA = 2131493851;
  public static final int EB = 2131558843;
  public static final int EC = 2131558425;
  public static final int ED = 2131558432;
  public static final int EE = 2131559265;
  public static final int EF = 2131624013;
  public static final int EG = 2130968821;
  public static final int EH = 2130969167;
  public static final int EI = 2131755342;
  public static final int EJ = 2131755785;
  public static final int EK = 2131755786;
  public static final int EL = 2131493459;
  public static final int EM = 2131559264;
  public static final int EN = 2130968820;
  public static final int EO = 2130968911;
  public static final int EP = 2131492971;
  public static final int EQ = 2131492972;
  public static final int ER = 2130838537;
  public static final int ES = 2130838634;
  public static final int ET = 2130838637;
  public static final int EU = 2131558426;
  public static final int EV = 2131558427;
  public static final int EW = 2131558428;
  public static final int EX = 2131558429;
  public static final int EY = 2131558430;
  public static final int EZ = 2131558431;
  public static final int Ea = 2131492943;
  public static final int Eb = 2131492944;
  public static final int Ec = 2131492945;
  public static final int Ed = 2131492946;
  public static final int Ee = 2131492948;
  public static final int Ef = 2131492956;
  public static final int Eg = 2131492957;
  public static final int Eh = 2130838496;
  public static final int Ei = 2130838521;
  public static final int Ej = 2130838692;
  public static final int Ek = 2130838708;
  public static final int El = 2130968613;
  public static final int Em = 2130968618;
  public static final int En = 2130968622;
  public static final int Eo = 2131755096;
  public static final int Ep = 2131755097;
  public static final int Eq = 2131755098;
  public static final int Er = 2131755099;
  public static final int Es = 2131755123;
  public static final int Et = 2131755124;
  public static final int Eu = 2131755148;
  public static final int Ev = 2131755149;
  public static final int Ew = 2131755357;
  public static final int Ex = 2131756619;
  public static final int Ey = 2130969138;
  public static final int Ez = 2131493850;
  public static final int F = 2130837533;
  public static final int FA = 2131756217;
  public static final int FB = 2131756565;
  public static final int FC = 2131756575;
  public static final int FD = 2131756576;
  public static final int FE = 2131756577;
  public static final int FF = 2131756578;
  public static int FG = 0;
  public static int FH = 0;
  public static int FI = 0;
  public static int FJ = 0;
  public static Bitmap FK;
  public static Bitmap FL;
  public static Bitmap FM;
  public static Bitmap FN;
  public static Bitmap FO;
  public static Bitmap FP;
  public static Bitmap FQ;
  public static Bitmap FR;
  public static Bitmap FS;
  public static Bitmap FT;
  public static Bitmap FU;
  public static Bitmap FV;
  public static float FW = 0.0F;
  public static final int FX = 2131493018;
  public static final int FY = 2131493420;
  public static final int FZ = 2131493456;
  public static final int Fa = 2131820930;
  public static final int Fb = 2131820931;
  public static final int Fc = 2131820932;
  public static final int Fd = 2131820933;
  public static final int Fe = 2131558433;
  public static final int Ff = 2130838181;
  public static final int Fg = 2130838494;
  public static final int Fh = 2130838536;
  public static final int Fi = 2130838711;
  public static final int Fj = 2130838715;
  public static final int Fk = 2131558476;
  public static final int Fl = 2131558477;
  public static final int Fm = 2131558485;
  public static final int Fn = 2131558488;
  public static final int Fo = 2131558489;
  public static final int Fp = 2131689538;
  public static final int Fq = 2131755013;
  public static final int Fr = 2131755014;
  public static final int Fs = 2131755020;
  public static final int Ft = 2131755021;
  public static final int Fu = 2131756136;
  public static final int Fv = 2131756137;
  public static final int Fw = 2131756138;
  public static final int Fx = 2131756139;
  public static final int Fy = 2131756140;
  public static final int Fz = 2131756152;
  public static final int G = 2130837534;
  public static final int GA = 2131493096;
  public static final int GB = 2131493097;
  public static final int GC = 2131493098;
  public static final int GD = 2130838277;
  public static final int GE = 2130838278;
  public static final int GF = 2130838279;
  public static final int GG = 2130838282;
  public static final int GH = 2130838283;
  public static final int GI = 2130838514;
  public static final int GJ = 2130838559;
  public static final int GK = 2130838615;
  public static final int GL = 2130838616;
  public static final int GM = 2130838689;
  public static final int GN = 2130838757;
  public static final int GO = 2131689484;
  public static final int GP = 2131755372;
  public static final int GQ = 2131755373;
  public static final int GR = 2131755374;
  public static final int GS = 2131755670;
  public static final int GT = 2131493100;
  public static final int GU = 2131493101;
  public static final int GV = 2131493102;
  public static final int GW = 2131493103;
  public static final int GX = 2131493104;
  public static final int GY = 2131493105;
  public static final int GZ = 2131493106;
  public static final int Ga = 2131493757;
  public static final int Gb = 2131493938;
  public static final int Gc = 2131755253;
  public static final int Gd = 2131755254;
  public static final int Ge = 2131755255;
  public static final int Gf = 2131755256;
  public static final int Gg = 2131623940;
  public static final int Gh = 2131624001;
  public static final int Gi = 2131689564;
  public static final int Gj = 2131689574;
  public static final int Gk = 2131755284;
  public static final int Gl = 2131755614;
  public static final int Gm = 2131755615;
  public static final int Gn = 2131755623;
  public static final int Go = 2131755625;
  public static final int Gp = 2131757056;
  public static final int Gq = 2131757113;
  public static hge Gr;
  public static hge Gs;
  public static hge Gt;
  public static hge Gu;
  public static hge Gv;
  public static hge Gw;
  public static hge Gx;
  public static hge Gy;
  public static final int Gz = 2131493095;
  public static final int H = 2130837535;
  public static final int HA = 2131559060;
  public static final int HB = 2130968704;
  public static final int HC = 2130968705;
  public static final int HD = 2130968707;
  public static final int HE = 2131755491;
  public static final int HF = 2131755492;
  public static final int HG = 2131755493;
  public static final int HH = 2131755494;
  public static final int HI = 2131755495;
  public static final int HJ = 2131755496;
  public static final int HK = 2131755497;
  public static final int HL = 2131755498;
  public static final int HM = 2131755499;
  public static final int HN = 2131755500;
  public static final int HO = 2131755501;
  public static final int HP = 2131755502;
  public static final int HQ = 2131755503;
  public static final int HR = 2131755504;
  public static final int HS = 2131755505;
  public static final int HT = 2131755506;
  public static final int HU = 2131755507;
  public static final int HV = 2131755508;
  public static final int HW = 2131755509;
  public static final int HX = 2131755510;
  public static final int HY = 2131755511;
  public static final int HZ = 2131755592;
  public static final int Ha = 2131493107;
  public static final int Hb = 2131493108;
  public static final int Hc = 2131493109;
  public static final int Hd = 2131493110;
  public static final int He = 2130837851;
  public static final int Hf = 2130837874;
  public static final int Hg = 2130837890;
  public static final int Hh = 2130837892;
  public static final int Hi = 2130838133;
  public static final int Hj = 2130838137;
  public static final int Hk = 2130838139;
  public static final int Hl = 2130838328;
  public static final int Hm = 2130838333;
  public static final int Hn = 2131623945;
  public static final int Ho = 2130968678;
  public static final int Hp = 2131689486;
  public static final int Hq = 2131689519;
  public static final int Hr = 2131820700;
  public static final int Hs = 2131820701;
  public static final int Ht = 2131558553;
  public static final int Hu = 2131886085;
  public static final int Hv = 2131559063;
  public static final int Hw = 2131559062;
  public static final int Hx = 2131559057;
  public static final int Hy = 2131559059;
  public static final int Hz = 2131559058;
  public static final int I = 2130837536;
  public static final int IA = 2131493338;
  public static final int IB = 2131493339;
  public static final int IC = 2130968764;
  public static final int ID = 2130968781;
  public static final int IE = 2130968782;
  public static final int IF = 2131755814;
  public static final int IG = 2131756537;
  public static final int IH = 2131757318;
  public static final int II = 2131758156;
  public static final int IJ = 2131758238;
  public static final int IK = 2131493213;
  public static final int IL = 2131493214;
  public static final int IM = 2131493215;
  public static final int IN = 2131493216;
  public static final int IO = 2131493217;
  public static final int IP = 2131493218;
  public static final int IQ = 2131493219;
  public static final int IR = 2131493220;
  public static final int IS = 2131493320;
  public static final int IT = 2130838446;
  public static final int IU = 2131558446;
  public static final int IV = 2131558450;
  public static final int IW = 2131558452;
  public static final int IX = 2131558469;
  public static final int IY = 2131558614;
  public static final int IZ = 2131558659;
  public static final int Ia = 2131559065;
  public static final int Ib = 2131559064;
  public static final int Ic = 2131559066;
  public static final int Id = 2131559090;
  public static final int Ie = 2131559067;
  public static final int If = 2131559088;
  public static final int Ig = 2131559091;
  public static final int Ih = 2131755565;
  public static final int Ii = 2131755566;
  public static final int Ij = 2131755567;
  public static final int Ik = 2131755568;
  public static final int Il = 2131755576;
  public static final int Im = 2131755577;
  public static final int In = 2131755578;
  public static final int Io = 2131755579;
  public static final int Ip = 2131755580;
  public static final int Iq = 2131755581;
  public static final int Ir = 2131755582;
  public static final int Is = 2131755583;
  public static final int It = 2131755585;
  public static final int Iu = 2131755591;
  public static final int Iv = 2131755593;
  public static final int Iw = 2131755594;
  public static final int Ix = 2131755595;
  public static final int Iy = 2131755596;
  public static final int Iz = 2131427733;
  public static final int J = 2130837537;
  public static final int JA = 2131558827;
  public static final int JB = 2131558829;
  public static final int JC = 2131559032;
  public static final int JD = 2131559033;
  public static final int JE = 2131559034;
  public static final int JF = 2131559024;
  public static final int JG = 2131560160;
  public static final int JH = 2131559036;
  public static final int JI = 2131559043;
  public static final int JJ = 2131559044;
  public static final int JK = 2131559025;
  public static final int JL = 2131559056;
  public static final int JM = 2131559028;
  public static final int JN = 2131559030;
  public static final int JO = 2131559027;
  public static final int JP = 2131559055;
  public static final int JQ = 2131559035;
  public static final int JR = 2131559050;
  public static final int JS = 2131559053;
  public static final int JT = 2131559054;
  public static final int JU = 2131559029;
  public static final int JV = 2131559042;
  public static final int JW = 2131559040;
  public static final int JX = 2131559049;
  public static final int JY = 2131559052;
  public static final int JZ = 2131558546;
  public static final int Ja = 2131623953;
  public static final int Jb = 2131623954;
  public static final int Jc = 2131755519;
  public static final int Jd = 2131755540;
  public static final int Je = 2131755543;
  public static final int Jf = 2131756051;
  public static final int Jg = 2131756052;
  public static final int Jh = 2131757490;
  public static final int Ji = 2131493726;
  public static final int Jj = 2131493727;
  public static final int Jk = 2131558833;
  public static final int Jl = 2130968623;
  public static final int Jm = 2131755106;
  public static final int Jn = 2131755107;
  public static final int Jo = 2131756221;
  public static final int Jp = 2131756225;
  public static final int Jq = 2130968731;
  public static final int Jr = 2130968729;
  public static final int Js = 2130968730;
  public static final int Jt = 2130968890;
  public static final int Ju = 2131886087;
  public static final int Jv = 2131493773;
  public static final int Jw = 2131493774;
  public static final int Jx = 2131493775;
  public static final int Jy = 2131558830;
  public static final int Jz = 2131558828;
  public static final int K = 2130837538;
  public static final int KA = 2131757142;
  public static final int KB = 2131757143;
  public static final int KC = 2131757148;
  public static final int KD = 2131757149;
  public static final int KE = 2131757150;
  public static final int KF = 2131757151;
  public static final int KG = 2131757152;
  public static final int KH = 2131757153;
  public static final int KI = 2131757154;
  public static final int KJ = 2131757159;
  public static final int KK = 2131757166;
  public static final int KL = 2131757167;
  public static final int KM = 2131758111;
  public static final int KN = 2131758112;
  public static final int KO = 2131758113;
  public static final int KP = 2131758115;
  public static final int KQ = 2131758116;
  public static final int KR = 2131758117;
  public static final int KS = 2131493584;
  public static final int KT = 2131493896;
  public static final int KU = 2130968838;
  public static final int KV = 2130969003;
  public static final int KW = 2130969007;
  public static final int KX = 2131689524;
  public static final int KY = 2131755174;
  public static final int KZ = 2131755175;
  public static final int Ka = 2131886083;
  public static final int Kb = 2131559079;
  public static final int Kc = 2131559081;
  public static final int Kd = 2130968719;
  public static final int Ke = 2130968721;
  public static final int Kf = 2130968723;
  public static final int Kg = 2131493158;
  public static final int Kh = 2131493159;
  public static final int Ki = 2130968652;
  public static final int Kj = 2130968653;
  public static final int Kk = 2130968654;
  public static final int Kl = 2130968776;
  public static final int Km = 2131886081;
  public static final int Kn = 2131757135;
  public static final int Ko = 2131757136;
  public static final int Kp = 2131755761;
  public static final int Kq = 2131755762;
  public static final int Kr = 2131755763;
  public static final int Ks = 2131755764;
  public static final int Kt = 2131756040;
  public static final int Ku = 2131756041;
  public static final int Kv = 2131757130;
  public static final int Kw = 2131757131;
  public static final int Kx = 2131757138;
  public static final int Ky = 2131757140;
  public static final int Kz = 2131757141;
  public static final int L = 2130837539;
  public static final int LA = 2131758160;
  public static final int LB = 2131758161;
  public static final int LC = 2131758162;
  public static final int LD = 2131758163;
  public static final int LE = 2131758166;
  public static final int LF = 2131758171;
  public static final int LG = 2131689526;
  public static final int LH = 2131689527;
  public static final int LI = 2131689528;
  public static final int LJ = 2131755909;
  public static final int LK = 2131755955;
  public static final int LL = 2131755989;
  public static final int LM = 2131755990;
  public static final int LN = 2131756002;
  public static final int LO = 2131756169;
  public static final int LP = 2131758092;
  public static final int LQ = 2131758093;
  public static final int LR = 2131758107;
  public static final int LS = 2131758108;
  public static final int LT = 2131758239;
  public static String LU;
  public static String LV;
  public static String LW;
  public static java.text.DateFormat LX;
  public static java.text.DateFormat LY;
  public static java.text.DateFormat LZ;
  public static final int La = 2131756053;
  public static final int Lb = 2131756058;
  public static final int Lc = 2131756064;
  public static final int Ld = 2131756066;
  public static final int Le = 2131756068;
  public static final int Lf = 2131756070;
  public static final int Lg = 2131756077;
  public static final int Lh = 2131756080;
  public static final int Li = 2131756687;
  public static final int Lj = 2131756688;
  public static final int Lk = 2131756690;
  public static final int Ll = 2131755826;
  public static final int Lm = 2131755831;
  public static final int Ln = 2131756236;
  public static final int Lo = 2131756237;
  public static final int Lp = 2131756238;
  public static final int Lq = 2131758212;
  public static final int Lr = 2131559221;
  public static final int Ls = 2131559223;
  public static final int Lt = 2131559155;
  public static final int Lu = 2131757697;
  public static final int Lv = 2131757698;
  public static final int Lw = 2131757704;
  public static final int Lx = 2131757705;
  public static final int Ly = 2131757710;
  public static final int Lz = 2131757712;
  public static final int M = 2130837542;
  public static final int MA = 2131493945;
  public static final int MB = 2131493946;
  public static final int MC = 2131493947;
  public static final int MD = 2130838301;
  public static final int ME = 2130838302;
  public static final int MF = 2131558461;
  public static final int MG = 2131558463;
  public static final int MH = 2131558645;
  public static final int MI = 2131558656;
  public static final int MJ = 2131427567;
  public static final int MK = 2131427568;
  public static final int ML = 2131493542;
  public static final int MM = 2130968884;
  public static final int MN = 2131623978;
  public static final int MO = 2131623956;
  public static final int MP = 2131623957;
  public static final int MQ = 2131623958;
  public static final int MR = 2131623959;
  public static final int MS = 2131623965;
  public static final int MT = 2131623966;
  public static final int MU = 2131623967;
  public static final int MV = 2131623968;
  public static final int MW = 2131623969;
  public static final int MX = 2131624002;
  public static final int MY = 2131624003;
  public static final int MZ = 2131624004;
  public static long Ma = 0L;
  public static long Mb = 0L;
  public static long Mc = 0L;
  public static String Md;
  public static String Me;
  public static String Mf;
  public static String Mg;
  public static String Mh;
  public static final int Mi = 2131427359;
  public static final int Mj = 2131427360;
  public static final int Mk = 2131427450;
  public static final int Ml = 2131427517;
  public static final int Mm = 2131427518;
  public static final int Mn = 2131427566;
  public static final int Mo = 2131559248;
  public static final int Mp = 2131559240;
  public static final int Mq = 2131559242;
  public static final int Mr = 2131559241;
  public static final int Ms = 2131559247;
  public static final int Mt = 2131559243;
  public static final int Mu = 2131559244;
  public static final int Mv = 2131559246;
  public static final int Mw = 2130968811;
  public static final int Mx = 2130968812;
  public static final int My = 2130968813;
  public static final int Mz = 2131493944;
  public static final int N = 2130837553;
  public static final int NA = 2131756203;
  public static final int NB = 2131756205;
  public static final int NC = 2131756206;
  public static final int ND = 2131756208;
  public static final int NE = 2131756209;
  public static final int NF = 2131756210;
  public static final int NG = 2131756211;
  public static final int NH = 2131756212;
  public static final int NI = 2131756213;
  public static final int NJ = 2131558570;
  public static final int NK = 2131756240;
  public static final int NL = 2131756241;
  public static final int NM = 2131559161;
  public static final int NN = 2131559415;
  public static final int NO = 2131559416;
  public static final int NP = 2131559417;
  public static final int NQ = 2131559418;
  public static final int NR = 2130968885;
  public static final int NS = 2130968886;
  public static final int NT = 2130968887;
  public static final int NU = 2131493356;
  public static final int NV = 2131493357;
  public static final int NW = 2131493358;
  public static final int NX = 2131493359;
  public static final int NY = 2130837609;
  public static final int NZ = 2130837610;
  public static final int Na = 2131624005;
  public static final int Nb = 2131428096;
  public static final int Nc = 2130838675;
  public static final int Nd = 2130838676;
  public static final int Ne = 2130838683;
  public static final int Nf = 2130838684;
  public static final int Ng = 2131559404;
  public static final int Nh = 2131559405;
  public static final int Ni = 2131559406;
  public static final int Nj = 2131559407;
  public static final int Nk = 2131559408;
  public static final int Nl = 2131559399;
  public static final int Nm = 2131560281;
  public static final int Nn = 2131558668;
  public static final int No = 2131558669;
  public static final int Np = 2131560280;
  public static final int Nq = 2131559400;
  public static final int Nr = 2131559401;
  public static final int Ns = 2131559403;
  public static final int Nt = 2130968878;
  public static final int Nu = 2130968879;
  public static final int Nv = 2130968880;
  public static final int Nw = 2130968881;
  public static final int Nx = 2131886093;
  public static final int Ny = 2131689529;
  public static final int Nz = 2131689530;
  public static final int O = 2130837554;
  public static final int OA = 2131757702;
  public static final int OB = 2131757703;
  public static final int OC = 2131757706;
  public static final int OD = 2131757711;
  public static final int OE = 2131757713;
  public static final int OF = 2130838323;
  public static final int OG = 2130838324;
  public static final int OH = 2130838325;
  public static final int OI = 2130838326;
  public static final int OJ = 2130968902;
  public static final int OK = 2130968903;
  public static final int OL = 2130968985;
  public static final int OM = 2130969116;
  public static final int ON = 2131558548;
  public static final int OO = 2131755082;
  public static final int OP = 2131757133;
  public static final int OQ = 2130968603;
  public static final int OR = 2130968748;
  public static final int OS = 2131296260;
  public static final int OT = 2131296261;
  public static final int OU = 2131755250;
  public static final int OV = 2131755251;
  public static final int OW = 2131755252;
  public static final int OX = 2131755414;
  public static final int OY = 2131755415;
  public static final int OZ = 2131756164;
  public static final int Oa = 2130838305;
  public static final int Ob = 2130838386;
  public static final int Oc = 2130838387;
  public static final int Od = 2130968828;
  public static final int Oe = 2131886080;
  public static final int Of = 2131755891;
  public static final int Og = 2131755892;
  public static final int Oh = 2131755893;
  public static final int Oi = 2131756091;
  public static final int Oj = 2131756102;
  public static final int Ok = 2131756128;
  public static final int Ol = 2131756132;
  public static final int Om = 2131756133;
  public static final int On = 2131756266;
  public static final int Oo = 2131756267;
  public static final int Op = 2131756268;
  public static final int Oq = 2131756269;
  public static final int Or = 2131756270;
  public static final int Os = 2131756648;
  public static final int Ot = 2131758121;
  public static final int Ou = 2130968636;
  public static final int Ov = 2131755365;
  public static final int Ow = 2131756222;
  public static final int Ox = 2131756293;
  public static final int Oy = 2131756295;
  public static final int Oz = 2131820772;
  public static final int P = 2130837555;
  public static final int PA = 2131758224;
  public static final int PB = 2131493376;
  public static final int PC = 2131493721;
  public static final int PD = 2131755833;
  public static final int PE = 2131758087;
  public static final int PF = 2131820748;
  public static final int PG = 2131428072;
  public static final int PH = 2131559450;
  public static final int PI = 2131559447;
  public static final int PJ = 2131559448;
  public static final int PK = 2131559449;
  public static final int PL = 2131558559;
  public static final int PM = 2131558560;
  public static final int PN = 2131558571;
  public static final int PO = 2131558572;
  public static final int PP = 2131558573;
  public static final int PQ = 2131558574;
  public static final int PR = 2131558590;
  public static final int PS = 2131558591;
  public static final int PT = 2130968908;
  public static final int PU = 2130968909;
  public static final int PV = 2130968910;
  public static itd[] PW;
  public static int PX = 0;
  public static final int PY = 2131493463;
  public static final int PZ = 2131755289;
  public static final int Pa = 2131756226;
  public static final int Pb = 2131756227;
  public static final int Pc = 2131756228;
  public static final int Pd = 2131756229;
  public static final int Pe = 2131756230;
  public static final int Pf = 2131756231;
  public static final int Pg = 2131756232;
  public static final int Ph = 2131756233;
  public static final int Pi = 2131756297;
  public static final int Pj = 2131756298;
  public static final int Pk = 2131756299;
  public static final int Pl = 2131756300;
  public static final int Pm = 2131756510;
  public static final int Pn = 2131756653;
  public static final int Po = 2131758007;
  public static final int Pp = 2131758008;
  public static final int Pq = 2131758138;
  public static final int Pr = 2131758178;
  public static final int Ps = 2131758179;
  public static final int Pt = 2131758217;
  public static final int Pu = 2131758218;
  public static final int Pv = 2131758219;
  public static final int Pw = 2131758220;
  public static final int Px = 2131758221;
  public static final int Py = 2131758222;
  public static final int Pz = 2131758223;
  public static final int Q = 2130837556;
  public static final int QA = 2131755611;
  public static final int QB = 2131756465;
  public static final int QC = 2131756466;
  public static final int QD = 2131756569;
  public static final int QE = 2131757715;
  public static final int QF = 2131559334;
  public static final int QG = 2131559335;
  public static final int QH = 2131558471;
  public static final int QI = 2131558472;
  public static final int QJ = 2130968840;
  public static final int QK = 2131559409;
  public static final int QL = 2130968882;
  public static final int QM = 2131886095;
  public static final int QN = 2131623984;
  public static final int QO = 2130968953;
  public static final int QP = 2130968956;
  public static final int QQ = 2130968960;
  public static final int QR = 2130968962;
  public static final int QS = 2131689569;
  public static final int QT = 2131757178;
  public static final int QU = 2131757179;
  public static final int QV = 2131757180;
  public static final int QW = 2131757182;
  public static final int QX = 2131757183;
  public static final int QY = 2131757185;
  public static final int QZ = 2131757186;
  public static File Qa;
  public static final int Qb = 2130968919;
  public static final int Qc = 2130968921;
  public static final int Qd = 2130969105;
  public static final int Qe = 2130969106;
  public static final int Qf = 2131886098;
  public static final int Qg = 2131689573;
  public static final int Qh = 2131756571;
  public static final int Qi = 2131756662;
  public static final int Qj = 2131756663;
  public static final int Qk = 2131756664;
  public static final int Ql = 2131756665;
  public static final int Qm = 2131756666;
  public static final int Qn = 2131756667;
  public static final int Qo = 2131756668;
  public static final int Qp = 2131756669;
  public static final int Qq = 2131559354;
  public static final int Qr = 2131559351;
  public static final int Qs = 2131559353;
  public static final int Qt = 2131559352;
  public static final int Qu = 2130968845;
  public static final int Qv = 2130968846;
  public static final int Qw = 2130968847;
  public static final int Qx = 2130968848;
  public static final int Qy = 2131493523;
  public static final int Qz = 2131493524;
  public static final int R = 2130837557;
  public static final int RA = 2131757252;
  public static final int RB = 2131757275;
  public static final int RC = 2131757277;
  public static final int RD = 2131757362;
  public static final int RE = 2131757372;
  public static final int RF = 2131757373;
  public static final int RG = 2131757376;
  public static final int RH = 2131757377;
  public static final int RI = 2131757378;
  public static final int RJ = 2131757379;
  public static final int RK = 2131757380;
  public static final int RL = 2131757381;
  public static final int RM = 2131757382;
  public static final int RN = 2131757383;
  public static final int RO = 2131757384;
  public static final int RP = 2131757385;
  public static final int RQ = 2131757387;
  public static final int RR = 2131757392;
  public static final int RS = 2131757398;
  public static final int RT = 2131757400;
  public static final int RU = 2131757292;
  public static final int RV = 2131757293;
  public static final int RW = 2131757294;
  public static final int RX = 2131757295;
  public static final int RY = 2131757296;
  public static final int RZ = 2131757297;
  public static final int Ra = 2131757187;
  public static final int Rb = 2131757189;
  public static final int Rc = 2131757192;
  public static final int Rd = 2131757193;
  public static final int Re = 2131757194;
  public static final int Rf = 2131757195;
  public static final int Rg = 2131757197;
  public static final int Rh = 2131757198;
  public static final int Ri = 2131757199;
  public static final int Rj = 2131757200;
  public static final int Rk = 2131757202;
  public static final int Rl = 2131757203;
  public static final int Rm = 2131757206;
  public static final int Rn = 2131757208;
  public static final int Ro = 2131757221;
  public static final int Rp = 2131757224;
  public static final int Rq = 2131757229;
  public static final int Rr = 2131757234;
  public static final int Rs = 2131757239;
  public static final int Rt = 2131757240;
  public static final int Ru = 2131757241;
  public static final int Rv = 2131757243;
  public static final int Rw = 2131757244;
  public static final int Rx = 2131757248;
  public static final int Ry = 2131757250;
  public static final int Rz = 2131757251;
  public static final int S = 2130837558;
  public static final int SA = 2131558819;
  public static final int SB = 2130968615;
  public static final int SC = 2131559017;
  public static final int SD = 2131559019;
  public static final int SE = 2131559018;
  public static final int SF = 2130968688;
  public static final int SG = 2131755410;
  public static final int SH = 2131755820;
  public static final int SI = 2131755821;
  public static final int SJ = 2130838566;
  public static final int SK = 2130968679;
  public static final int SL = 2130969012;
  public static final int SM = 2131756490;
  public static final int SN = 2131493114;
  public static final int SO = 2131493116;
  public static final int SP = 2131493117;
  public static final int SQ = 2131493192;
  public static final int SR = 2131493193;
  public static final int SS = 2131493194;
  public static final int ST = 2131493195;
  public static final int SU = 2131493196;
  public static final int SV = 2131493197;
  public static final int SW = 2131493198;
  public static final int SX = 2131493199;
  public static final int SY = 2131493200;
  public static final int SZ = 2131493201;
  public static final int Sa = 2131757298;
  public static final int Sb = 2131757299;
  public static final int Sc = 2131559147;
  public static final int Sd = 2131558798;
  public static final int Se = 2131559145;
  public static final int Sf = 2131559146;
  public static final int Sg = 2131755743;
  public static final int Sh = 2131427335;
  public static final int Si = 2131427336;
  public static final int Sj = 2131427337;
  public static final int Sk = 2131427339;
  public static final int Sl = 2131427342;
  public static final int Sm = 2131427350;
  public static final int Sn = 2131427351;
  public static final int So = 2131493723;
  public static final int Sp = 2131493725;
  public static final int Sq = 2131493728;
  public static final int Sr = 2131493780;
  public static final int Ss = 2131493781;
  public static final int St = 2130838241;
  public static final int Su = 2130838513;
  public static final int Sv = 2130838516;
  public static final int Sw = 2130838518;
  public static final int Sx = 2130838556;
  public static final int Sy = 2130838642;
  public static final int Sz = 2131558818;
  public static final int T = 2130837559;
  public static final int TA = 2131493660;
  public static final int TB = 2131493661;
  public static final int TC = 2131493662;
  public static final int TD = 2131493667;
  public static final int TE = 2130838434;
  public static final int TF = 2130838435;
  public static final int TG = 2130838436;
  public static final int TH = 2130838439;
  public static final int TI = 2130838500;
  public static final int TJ = 2131623985;
  public static final int TK = 2131623987;
  public static final int TL = 2130969055;
  public static final int TM = 2130969056;
  public static final int TN = 2131689566;
  public static final int TO = 2131689567;
  public static final int TP = 2131689568;
  public static final int TQ = 2130969101;
  public static final int TR = 2130969102;
  public static final int TS = 2131757443;
  public static final int TT = 2131757444;
  public static final int TU = 2131757351;
  public static final int TV = 2131493713;
  public static final int TW = 2130969092;
  public static final int TX = 2130969093;
  public static final int TY = 2130969094;
  public static final int TZ = 2131886102;
  public static final int Ta = 2131493202;
  public static final int Tb = 2131493961;
  public static final int Tc = 2131558524;
  public static final int Td = 2131689485;
  public static final int Te = 2131689488;
  public static final int Tf = 2131757010;
  public static final int Tg = 2131757011;
  public static final int Th = 2131493652;
  public static final int Ti = 2131493664;
  public static final int Tj = 2131493665;
  public static final int Tk = 2131493666;
  public static final int Tl = 2130838432;
  public static final int Tm = 2130838636;
  public static final int Tn = 2130969050;
  public static final int To = 2130969051;
  public static final int Tp = 2130969053;
  public static final int Tq = 2130969054;
  public static final int Tr = 2130969057;
  public static final int Ts = 2131689565;
  public static final int Tt = 2131493651;
  public static final int Tu = 2131493653;
  public static final int Tv = 2131493655;
  public static final int Tw = 2131493656;
  public static final int Tx = 2131493657;
  public static final int Ty = 2131493658;
  public static final int Tz = 2131493659;
  public static final int U = 2130837560;
  public static final int UA = 2131493785;
  public static final int UB = 2131493790;
  public static final int UC = 2131493791;
  public static final int UD = 2131493793;
  public static final int UE = 2131493794;
  public static final int UF = 2131493795;
  public static final int UG = 2131493796;
  public static final int UH = 2131493797;
  public static final int UI = 2131493800;
  public static final int UJ = 2131493801;
  public static final int UK = 2131493802;
  public static final int UL = 2131624000;
  public static final int UM = 2130968620;
  public static final int UN = 2130969120;
  public static final int UO = 2130969121;
  public static final int UP = 2130969123;
  public static final int UQ = 2130969124;
  public static final int UR = 2130969125;
  public static final int US = 2130969130;
  public static final int UT = 2131886103;
  public static final int UU = 2131689540;
  public static final int UV = 2131427466;
  public static final int UW = 2131428010;
  public static final int UX = 2131493271;
  public static final int UY = 2131493272;
  public static final int UZ = 2130968766;
  public static final int Ua = 2131757285;
  public static final int Ub = 2131757363;
  public static final int Uc = 2131757365;
  public static final int Ud = 2131757439;
  public static final int Ue = 2131755280;
  public static final int Uf = 2131756498;
  public static final int Ug = 2131758127;
  public static final int Uh = 2131758144;
  public static final int Ui = 2130772408;
  public static final int Uj = 2130772410;
  public static final int Uk = 2130772411;
  public static final int Ul = 2130772403;
  public static final int Um = 2130772404;
  public static final int Un = 2130772406;
  public static final int Uo = 2130772412;
  public static final int Up = 2130772415;
  public static final int Uq = 2131428059;
  public static final int Ur = 2131756390;
  public static final int Us = 2131756393;
  public static final int Ut = 2131757137;
  public static final int Uu = 2131757145;
  public static final int Uv = 2131757146;
  public static final int Uw = 2131034151;
  public static final int Ux = 2131034153;
  public static final int Uy = 2131493783;
  public static final int Uz = 2131493784;
  public static final int V = 2130837562;
  public static final int VA = 2130838523;
  public static final int VB = 2130838524;
  public static final int VC = 2130838612;
  public static final int VD = 2130838613;
  public static final int VE = 2130838628;
  public static final int VF = 2130838629;
  public static final int VG = 2130838656;
  public static final int VH = 2130838657;
  public static final int VI = 2130838658;
  public static final int VJ = 2130838659;
  public static final int VK = 2130838660;
  public static final int VL = 2130838661;
  public static final int VM = 2130838662;
  public static final int VN = 2130968674;
  public static final int VO = 2130968675;
  public static final int VP = 2130968739;
  public static final int VQ = 2130969135;
  public static final int VR = 2130969165;
  public static final int VS = 2131886082;
  public static final int VT = 2131886109;
  public static final int VU = 2131493815;
  public static final int VV = 2131493819;
  public static final int VW = 2131493820;
  public static final int VX = 2131493821;
  public static final int VY = 2131493822;
  public static final int VZ = 2131493823;
  public static final int Va = 2130968768;
  public static final int Vb = 2130968769;
  public static final int Vc = 2131689518;
  public static final int Vd = 2131755834;
  public static final int Ve = 2131755835;
  public static final int Vf = 2131755836;
  public static final int Vg = 2131755837;
  public static final int Vh = 2131755838;
  public static final int Vi = 2131755839;
  public static final int Vj = 2131755841;
  public static final int Vk = 2131755842;
  public static final int Vl = 2131755843;
  public static final int Vm = 2131755844;
  public static final int Vn = 2131755847;
  public static final int Vo = 2131559922;
  public static final int Vp = 2131559921;
  public static final int Vq = 2131559923;
  public static final int Vr = 2130969109;
  public static final int Vs = 2131756247;
  public static final int Vt = 2131757571;
  public static final int Vu = 2131820845;
  public static final int Vv = 2131558603;
  public static final int Vw = 2131558604;
  public static final int Vx = 2130837716;
  public static final int Vy = 2130837773;
  public static final int Vz = 2130838099;
  public static final int W = 2130837563;
  public static final int WA = 2131757545;
  public static final int WB = 2131757546;
  public static final int WC = 2131757767;
  public static final int WD = 2131493223;
  public static final int WE = 2131886088;
  public static final int WF = 2131755736;
  public static final int WG = 2131755737;
  public static final int WH = 2131755747;
  public static final int WI = 2131755748;
  public static final int WJ = 2131757870;
  public static final int WK = 2131757871;
  public static final int WL = 2131757873;
  public static final int WM = 2131757877;
  public static final int WN = 2131757878;
  public static final int WO = 2131757883;
  public static final int WP = 2131757884;
  public static final int WQ = 2131757885;
  public static final int WR = 2131757886;
  public static final int WS = 2131757887;
  public static final int WT = 2131757888;
  public static final int WU = 2131757889;
  public static final int WV = 2131757890;
  public static final int WW = 2131886105;
  public static final int WX = 2131886106;
  public static final int WY = 2131821156;
  public static final int WZ = 2131757786;
  public static final int Wa = 2131493824;
  public static final int Wb = 2131493825;
  public static final int Wc = 2131493827;
  public static final int Wd = 2131493828;
  public static final int We = 2130838570;
  public static final int Wf = 2130838572;
  public static final int Wg = 2130838752;
  public static final int Wh = 2130838761;
  public static final int Wi = 2131689593;
  public static final int Wj = 2131689594;
  public static final int Wk = 2131757551;
  public static final int Wl = 2131757553;
  public static final int Wm = 2131757554;
  public static final int Wn = 2131757556;
  public static final int Wo = 2131757557;
  public static final int Wp = 2131757558;
  public static final int Wq = 2131757731;
  public static final int Wr = 2131757732;
  public static final int Ws = 2131757733;
  public static final int Wt = 2131758084;
  public static SparseIntArray Wu;
  public static final int Wv = 2131559281;
  public static final int Ww = 2131559981;
  public static final int Wx = 2131757735;
  public static final int Wy = 2131757736;
  public static final int Wz = 2131757543;
  public static final int X = 2130837564;
  public static final int XA = 2130968665;
  public static final int XB = 2130838543;
  public static final int XC = 2131560013;
  public static final int XD = 2131559121;
  public static final int XE = 2131560012;
  public static final int XF = 2131560011;
  public static final int XG = 2131560014;
  public static final int XH = 2131559141;
  public static final int XI = 2131559140;
  public static final int XJ = 2131559139;
  public static final int XK = 2131559989;
  public static final int XL = 2131493846;
  public static final int XM = 2130838336;
  public static final int XN = 2130838553;
  public static final int XO = 2131560028;
  public static final int XP = 2131560000;
  public static final int XQ = 2131559999;
  public static final int XR = 2131560003;
  public static final int XS = 2131560001;
  public static final int XT = 2131560002;
  public static final int XU = 2131558606;
  public static final int XV = 2131558607;
  public static final int XW = 2131558608;
  public static final int XX = 2131558609;
  public static final int XY = 2131558610;
  public static final int XZ = 2130968745;
  public static final int Xa = 2131757787;
  public static final int Xb = 2131757788;
  public static final int Xc = 2131757789;
  public static final int Xd = 2131757790;
  public static final int Xe = 2131757791;
  public static final int Xf = 2131757792;
  public static final int Xg = 2131757794;
  public static final int Xh = 2131757795;
  public static final int Xi = 2131757796;
  public static final int Xj = 2130968765;
  public static final int Xk = 2130968818;
  public static final int Xl = 2130969141;
  public static final int Xm = 2130969143;
  public static final int Xn = 2130969160;
  public static final int Xo = 2131886107;
  public static final int Xp = 2131821160;
  public static final int Xq = 2130969150;
  public static final int Xr = 2130969151;
  public static final int Xs = 2130969152;
  public static final int Xt = 2130969155;
  public static final int Xu = 2131886108;
  public static final int Xv = 2131755364;
  public static final int Xw = 2131558922;
  public static final int Xx = 2131558921;
  public static final int Xy = 2131558924;
  public static final int Xz = 2131558923;
  public static final int Y = 2130837565;
  public static final int YA = 2131757531;
  public static final int YB = 2131757575;
  public static final int YC = 2131559568;
  public static final int YD = 2131558797;
  public static final int YE = 2130969139;
  public static final int YF = 2131296269;
  public static final int YG = 2131296270;
  public static final int YH = 2131559295;
  public static final int YI = 2131560022;
  public static final int YJ = 2131560025;
  public static final int YK = 2131560023;
  public static final int YL = 2131560026;
  public static final int YM = 2131560024;
  public static final int YN = 2130969158;
  public static final int YO = 2131558598;
  public static final int YP = 2131558599;
  public static final int YQ = 2131689493;
  public static final int YR = 2131756677;
  public static final int YS = 2131756678;
  public static final int YT = 2131756689;
  public static final int YU = 2130837644;
  public static final int YV = 2131492960;
  public static final int YW = 2130838527;
  public static final int YX = 2130838530;
  public static final int YY = 2130838648;
  public static final int YZ = 2130838650;
  public static final int Ya = 2130968893;
  public static final int Yb = 2130969145;
  public static final int Yc = 2130969159;
  public static final int Yd = 2131559485;
  public static final int Ye = 2130968929;
  public static final int Yf = 2131821148;
  public static final int Yg = 2131757998;
  public static final int Yh = 2131757999;
  public static final int Yi = 2131757267;
  public static final int Yj = 2131493729;
  public static final int Yk = 2131493730;
  public static final int Yl = 2131755147;
  public static final int Ym = 2130969156;
  public static final int Yn = 2131493077;
  public static final int Yo = 2131493777;
  public static final int Yp = 2131493778;
  public static final int Yq = 2131493838;
  public static final int Yr = 2131493837;
  public static final int Ys = 2130838595;
  public static final int Yt = 2130969157;
  public static final int Yu = 2131757759;
  public static final int Yv = 2131428018;
  public static final int Yw = 2131624007;
  public static final int Yx = 2131689596;
  public static final int Yy = 2131756651;
  public static final int Yz = 2131757115;
  public static final int Z = 2130837566;
  public static final int ZA = 2131558946;
  public static final int ZB = 2131558947;
  public static final int ZC = 2131558948;
  public static final int ZD = 2131558944;
  public static final int ZE = 2131558945;
  public static final int ZF = 2130968670;
  public static final int ZG = 2130968671;
  public static final int ZH = 2130837650;
  public static final int ZI = 2130837801;
  public static final int ZJ = 2130838686;
  public static final int ZK = 2130838690;
  public static final int ZL = 2130838741;
  public static final int ZM = 2130838754;
  public static final int ZN = 2130838758;
  public static final int ZO = 2130968651;
  public static final int ZP = 2130968762;
  public static final int ZQ = 2130968790;
  public static final int ZR = 2131230760;
  public static final int ZS = 2131493410;
  public static final int ZT = 2131492965;
  public static final int ZU = 2131492966;
  public static final int ZV = 2131558615;
  public static final int ZW = 2131427523;
  public static final int ZX = 2131427524;
  public static final int ZY = 2131427525;
  public static final int ZZ = 2131427526;
  public static lte Za;
  public static final int Zb = 2131560283;
  public static final int Zc = 2131559726;
  public static final int Zd = 2131560054;
  public static final int Ze = 2131560055;
  public static final int Zf = 2131560050;
  public static final int Zg = 2131560051;
  public static final int Zh = 2131560052;
  public static final int Zi = 2131560056;
  public static final int Zj = 2131560053;
  public static final int Zk = 2131886110;
  public static final int Zl = 2131757144;
  public static final int Zm = 2131757160;
  public static final int Zn = 2131757161;
  public static final int Zo = 2131427999;
  public static final int Zp = 2131493084;
  public static final int Zq = 2131493085;
  public static final int Zr = 2131493228;
  public static final int Zs = 2131493737;
  public static final int Zt = 2131493906;
  public static final int Zu = 2130968737;
  public static final int Zv = 2131689548;
  public static final int Zw = 2131493054;
  public static final int Zx = 2131493063;
  public static final int Zy = 2131493065;
  public static final int Zz = 2131558943;
  public static Field a;
  public static final int aA = 2131558771;
  public static final int aB = 2131558777;
  public static final int aC = 2131558772;
  public static final int aD = 2131558773;
  public static final int aE = 2131558774;
  public static final int aF = 2131558778;
  public static final int aG = 2131558758;
  public static final int aH = 2131558605;
  public static final int aI = 2131558776;
  public static final int aJ = 2131558752;
  public static final int aK = 2131558745;
  public static final int aL = 2131558748;
  public static final int aM = 2131558747;
  public static final int aN = 2131623938;
  public static final int aO = 2130968577;
  public static final int aP = 2130968580;
  public static final int aQ = 2130968581;
  public static final int aR = 2130968583;
  public static final int aS = 2130968584;
  public static final int aT = 2130968585;
  public static final int aU = 2130968587;
  public static final int aV = 2130968588;
  public static final int aW = 2130968589;
  public static final int aX = 2130968590;
  public static final int aY = 2130968591;
  public static final int aZ = 2130968592;
  public static final int aa = 2130837567;
  public static final int aaA = 2131493019;
  public static final int aaB = 2131493020;
  public static final int aaC = 2131493021;
  public static final int aaD = 2131493022;
  public static final int aaE = 2131493023;
  public static final int aaF = 2131493024;
  public static final int aaG = 2131034136;
  public static final int aaH = 2131559398;
  public static final int aaI = 2130968877;
  public static final int aaJ = 2131558602;
  public static final int aaK = 2131559224;
  public static final int aaL = 2130968792;
  public static final int aaM = 2131757592;
  public static Integer aaN;
  public static Integer aaO;
  public static Integer aaP;
  public static Integer aaQ;
  public static final int aaR = 2130838526;
  public static final int aaS = 2131558662;
  public static final int aaT = 2131558663;
  public static final int aaU = 2131558664;
  public static final int aaV = 2131558665;
  public static final int aaW = 2131758177;
  public static final int aaX = 2131755220;
  public static final int aaY = 2131757511;
  public static final int aaZ = 2131757512;
  public static final int aaa = 2131427527;
  public static final int aab = 2131427528;
  public static final int aac = 2131427529;
  public static final int aad = 2131558544;
  public static final int aae = 2131757510;
  public static final int aaf = 2131493892;
  public static final int aag = 2131493895;
  public static final int aah = 2130838730;
  public static final int aai = 2130838731;
  public static final int aaj = 2130838732;
  public static final int aak = 2131558653;
  public static final int aal = 2131758090;
  public static final int aam = 2131689543;
  public static final int aan = 2131689545;
  public static final int aao = 2131689546;
  public static final int aap = 2131689583;
  public static final int aaq = 2131689584;
  public static final int aar = 2131689585;
  public static final int aas = 2131689586;
  public static final int aat = 2131689587;
  public static final int aau = 2131689588;
  public static final int aav = 2131689589;
  public static final int aaw = 2131689590;
  public static final int aax = 2131757124;
  public static Drawable aay;
  public static Html.TagHandler aaz;
  public static final int ab = 2131558765;
  public static final int aba = 2131758167;
  public static Method abb;
  public static Thread abc;
  public static Handler abd;
  public static String abe;
  public static final int ac = 2131558421;
  public static final int ad = 2131558764;
  public static final int ae = 2131558737;
  public static final int af = 2131558736;
  public static final int ag = 2131558766;
  public static final int ah = 2131558424;
  public static final int ai = 2131558761;
  public static final int aj = 2131558738;
  public static final int ak = 2131558739;
  public static final int al = 2131558749;
  public static final int am = 2131558755;
  public static final int an = 2131558750;
  public static final int ao = 2131558754;
  public static final int ap = 2131558753;
  public static final int aq = 2131558763;
  public static final int ar = 2131558742;
  public static final int as = 2131558767;
  public static final int at = 2131558740;
  public static final int au = 2131558744;
  public static final int av = 2131558741;
  public static final int aw = 2131558743;
  public static final int ax = 2131558751;
  public static final int ay = 2131558770;
  public static final int az = 2131558775;
  public static boolean b = false;
  public static final int bA = 2131756480;
  public static final int bB = 2131756482;
  public static final int bC = 2131756483;
  public static final int bD = 2131756484;
  public static final int bE = 2131756487;
  public static final int bF = 2131756488;
  public static final int bG = 2131821111;
  public static final int bH = 2131821112;
  public static final int bI = 2131034137;
  public static final int bJ = 2131034138;
  public static final int bK = 2131034139;
  public static final int bL = 2131034140;
  public static final int bM = 2131034142;
  public static final int bN = 2131034145;
  public static final int bO = 2131034148;
  public static final int bP = 2131427519;
  public static final int bQ = 2131427534;
  public static final int bR = 2131427612;
  public static final int bS = 2131428078;
  public static final int bT = 2131428079;
  public static final int bU = 2131493321;
  public static final int bV = 2131493323;
  public static final int bW = 2131493324;
  public static final int bX = 2131493326;
  public static final int bY = 2131493327;
  public static final int bZ = 2131493328;
  public static final int ba = 2130968593;
  public static final int bb = 2130968595;
  public static final int bc = 2130968596;
  public static final int bd = 2130968597;
  public static final int be = 2130968598;
  public static final int bf = 2130968599;
  public static final int bg = 2131755025;
  public static final int bh = 2131755028;
  public static final int bi = 2131755029;
  public static final int bj = 2131755036;
  public static final int bk = 2131755037;
  public static final int bl = 2131820658;
  public static final int bm = 2131821013;
  public static final int bn = 2131821018;
  public static final int bo = 2131427417;
  public static final int bp = 2131427418;
  public static final int bq = 2131493086;
  public static final int br = 2131820695;
  public static final int bs = 2130771970;
  public static final int bt = 2130771971;
  public static final int bu = 2130771974;
  public static final int bv = 2130771976;
  public static final int bw = 2130771977;
  public static final int bx = 2130968916;
  public static final int by = 2130968917;
  public static final int bz = 2130968918;
  public static Field c;
  public static final int cA = 2130837912;
  public static final int cB = 2130837913;
  public static final int cC = 2130837914;
  public static final int cD = 2130837915;
  public static final int cE = 2130837916;
  public static final int cF = 2130837917;
  public static final int cG = 2130837918;
  public static final int cH = 2130837919;
  public static final int cI = 2130837920;
  public static final int cJ = 2130837921;
  public static final int cK = 2130837922;
  public static final int cL = 2130837923;
  public static final int cM = 2130837924;
  public static final int cN = 2130837925;
  public static final int cO = 2130837926;
  public static final int cP = 2130837927;
  public static final int cQ = 2130837928;
  public static final int cR = 2130837929;
  public static final int cS = 2130837930;
  public static final int cT = 2130837931;
  public static final int cU = 2130837932;
  public static final int cV = 2130837933;
  public static final int cW = 2130837934;
  public static final int cX = 2130837935;
  public static final int cY = 2130837936;
  public static final int cZ = 2130837937;
  public static final int ca = 2131493329;
  public static final int cb = 2131493389;
  public static final int cc = 2131493391;
  public static final int cd = 2131493414;
  public static final int ce = 2131493415;
  public static final int cf = 2131493416;
  public static final int cg = 2131493417;
  public static final int ch = 2131493445;
  public static final int ci = 2131493671;
  public static final int cj = 2131493672;
  public static final int ck = 2131493941;
  public static final int cl = 2130837897;
  public static final int cm = 2130837898;
  public static final int cn = 2130837899;
  public static final int co = 2130837900;
  public static final int cp = 2130837901;
  public static final int cq = 2130837902;
  public static final int cr = 2130837903;
  public static final int cs = 2130837904;
  public static final int ct = 2130837905;
  public static final int cu = 2130837906;
  public static final int cv = 2130837907;
  public static final int cw = 2130837908;
  public static final int cx = 2130837909;
  public static final int cy = 2130837910;
  public static final int cz = 2130837911;
  public static boolean d = false;
  public static final int dA = 2130837965;
  public static final int dB = 2130837966;
  public static final int dC = 2130837967;
  public static final int dD = 2130837968;
  public static final int dE = 2130837969;
  public static final int dF = 2130837970;
  public static final int dG = 2130837971;
  public static final int dH = 2130837972;
  public static final int dI = 2130837973;
  public static final int dJ = 2130837974;
  public static final int dK = 2130837975;
  public static final int dL = 2130837976;
  public static final int dM = 2130837977;
  public static final int dN = 2130837978;
  public static final int dO = 2130837979;
  public static final int dP = 2130837980;
  public static final int dQ = 2130837981;
  public static final int dR = 2130837982;
  public static final int dS = 2130837983;
  public static final int dT = 2130837984;
  public static final int dU = 2130837985;
  public static final int dV = 2130837986;
  public static final int dW = 2130837987;
  public static final int dX = 2130837988;
  public static final int dY = 2130837989;
  public static final int dZ = 2130837990;
  public static final int da = 2130837938;
  public static final int db = 2130837939;
  public static final int dc = 2130837940;
  public static final int dd = 2130837941;
  public static final int de = 2130837942;
  public static final int df = 2130837943;
  public static final int dg = 2130837944;
  public static final int dh = 2130837945;
  public static final int di = 2130837946;
  public static final int dj = 2130837947;
  public static final int dk = 2130837948;
  public static final int dl = 2130837949;
  public static final int dm = 2130837950;
  public static final int dn = 2130837951;
  public static final int jdField_do = 2130837952;
  public static final int dp = 2130837953;
  public static final int dq = 2130837954;
  public static final int dr = 2130837955;
  public static final int ds = 2130837956;
  public static final int dt = 2130837957;
  public static final int du = 2130837959;
  public static final int dv = 2130837960;
  public static final int dw = 2130837961;
  public static final int dx = 2130837962;
  public static final int dy = 2130837963;
  public static final int dz = 2130837964;
  public static Method e;
  public static final int eA = 2130838018;
  public static final int eB = 2130838019;
  public static final int eC = 2130838020;
  public static final int eD = 2130838021;
  public static final int eE = 2130838022;
  public static final int eF = 2130838023;
  public static final int eG = 2130838024;
  public static final int eH = 2130838025;
  public static final int eI = 2130838026;
  public static final int eJ = 2130838027;
  public static final int eK = 2130838028;
  public static final int eL = 2130838029;
  public static final int eM = 2130838030;
  public static final int eN = 2130838031;
  public static final int eO = 2130838032;
  public static final int eP = 2130838188;
  public static final int eQ = 2130838189;
  public static final int eR = 2130838190;
  public static final int eS = 2130838191;
  public static final int eT = 2130838192;
  public static final int eU = 2130838193;
  public static final int eV = 2130838195;
  public static final int eW = 2130838196;
  public static final int eX = 2130838197;
  public static final int eY = 2130838198;
  public static final int eZ = 2130838199;
  public static final int ea = 2130837991;
  public static final int eb = 2130837992;
  public static final int ec = 2130837993;
  public static final int ed = 2130837994;
  public static final int ee = 2130837995;
  public static final int ef = 2130837996;
  public static final int eg = 2130837997;
  public static final int eh = 2130837998;
  public static final int ei = 2130837999;
  public static final int ej = 2130838000;
  public static final int ek = 2130838001;
  public static final int el = 2130838002;
  public static final int em = 2130838003;
  public static final int en = 2130838004;
  public static final int eo = 2130838005;
  public static final int ep = 2130838006;
  public static final int eq = 2130838007;
  public static final int er = 2130838008;
  public static final int es = 2130838009;
  public static final int et = 2130838010;
  public static final int eu = 2130838011;
  public static final int ev = 2130838012;
  public static final int ew = 2130838013;
  public static final int ex = 2130838014;
  public static final int ey = 2130838015;
  public static final int ez = 2130838016;
  public static final int f = 2131361792;
  public static final int fA = 2131558841;
  public static final int fB = 2131559272;
  public static final int fC = 2131559133;
  public static final int fD = 2131559257;
  public static final int fE = 2131559259;
  public static final int fF = 2131559823;
  public static final int fG = 2131559320;
  public static final int fH = 2131559252;
  public static final int fI = 2131559135;
  public static final int fJ = 2131558840;
  public static final int fK = 2131558839;
  public static final int fL = 2131559324;
  public static final int fM = 2131559258;
  public static final int fN = 2131559822;
  public static final int fO = 2131559255;
  public static final int fP = 2131559260;
  public static final int fQ = 2131559136;
  public static final int fR = 2131559322;
  public static final int fS = 2131559319;
  public static final int fT = 2131559251;
  public static final int fU = 2131559250;
  public static final int fV = 2131559321;
  public static final int fW = 2131559821;
  public static final int fX = 2131559820;
  public static final int fY = 2131559819;
  public static final int fZ = 2131559318;
  public static final int fa = 2130838200;
  public static final int fb = 2130838201;
  public static final int fc = 2130838205;
  public static final int fd = 2130838206;
  public static final int fe = 2130838208;
  public static final int ff = 2130838209;
  public static final int fg = 2130838211;
  public static final int fh = 2130838212;
  public static final int fi = 2130838215;
  public static final int fj = 2130838222;
  public static final int fk = 2130838223;
  public static final int fl = 2130838225;
  public static final int fm = 2130838229;
  public static final int fn = 2130838230;
  public static final int fo = 2130838232;
  public static final int fp = 2130838341;
  public static final int fq = 2131560285;
  public static final int fr = 2131560287;
  public static final int fs = 2131560288;
  public static final int ft = 2131560289;
  public static final int fu = 2131560286;
  public static final int fv = 2131560290;
  public static final int fw = 2131558842;
  public static final int fx = 2131559134;
  public static final int fy = 2131558838;
  public static final int fz = 2131558837;
  public static final int g = 2131361793;
  public static final int gA = 2131756746;
  public static final int gB = 2131756747;
  public static final int gC = 2131756749;
  public static final int gD = 2131756750;
  public static final int gE = 2131756751;
  public static final int gF = 2131756752;
  public static final int gG = 2131756753;
  public static final int gH = 2131756754;
  public static final int gI = 2131756755;
  public static final int gJ = 2131756756;
  public static final int gK = 2131756759;
  public static final int gL = 2131756760;
  public static final int gM = 2131756761;
  public static final int gN = 2131756766;
  public static final int gO = 2131756767;
  public static final int gP = 2131756768;
  public static final int gQ = 2131756769;
  public static final int gR = 2131756770;
  public static final int gS = 2131756771;
  public static final int gT = 2131756776;
  public static final int gU = 2131756778;
  public static final int gV = 2131756779;
  public static final int gW = 2131756780;
  public static final int gX = 2131756781;
  public static final int gY = 2131756782;
  public static final int gZ = 2131756783;
  public static final int ga = 2131559323;
  public static final int gb = 2131559138;
  public static final int gc = 2131559253;
  public static final int gd = 2131559137;
  public static final int ge = 2131559254;
  public static final int gf = 2131623960;
  public static final int gg = 2130968631;
  public static final int gh = 2130968633;
  public static final int gi = 2130968747;
  public static final int gj = 2130968815;
  public static final int gk = 2130968816;
  public static final int gl = 2130968837;
  public static final int gm = 2130969027;
  public static final int gn = 2130969070;
  public static final int go = 2130969071;
  public static final int gp = 2130969118;
  public static final int gq = 2131886099;
  public static final int gr = 2131756731;
  public static final int gs = 2131756732;
  public static final int gt = 2131756733;
  public static final int gu = 2131756740;
  public static final int gv = 2131756741;
  public static final int gw = 2131756742;
  public static final int gx = 2131756743;
  public static final int gy = 2131756744;
  public static final int gz = 2131756745;
  public static final int h = 2131361796;
  public static final int hA = 2131756819;
  public static final int hB = 2131756820;
  public static final int hC = 2131756821;
  public static final int hD = 2131756822;
  public static final int hE = 2131756823;
  public static final int hF = 2131756824;
  public static final int hG = 2131756825;
  public static final int hH = 2131756826;
  public static final int hI = 2131756827;
  public static final int hJ = 2131756829;
  public static final int hK = 2131756830;
  public static final int hL = 2131756831;
  public static final int hM = 2131756832;
  public static final int hN = 2131756833;
  public static final int hO = 2131756834;
  public static final int hP = 2131756835;
  public static final int hQ = 2131756836;
  public static final int hR = 2131756837;
  public static final int hS = 2131756839;
  public static final int hT = 2131756840;
  public static final int hU = 2131756841;
  public static final int hV = 2131756842;
  public static final int hW = 2131756843;
  public static final int hX = 2131756844;
  public static final int hY = 2131756846;
  public static final int hZ = 2131756847;
  public static final int ha = 2131756784;
  public static final int hb = 2131756785;
  public static final int hc = 2131756786;
  public static final int hd = 2131756787;
  public static final int he = 2131756788;
  public static final int hf = 2131756789;
  public static final int hg = 2131756790;
  public static final int hh = 2131756791;
  public static final int hi = 2131756792;
  public static final int hj = 2131756795;
  public static final int hk = 2131756796;
  public static final int hl = 2131756797;
  public static final int hm = 2131756798;
  public static final int hn = 2131756799;
  public static final int ho = 2131756800;
  public static final int hp = 2131756801;
  public static final int hq = 2131756802;
  public static final int hr = 2131756805;
  public static final int hs = 2131756806;
  public static final int ht = 2131756808;
  public static final int hu = 2131756809;
  public static final int hv = 2131756810;
  public static final int hw = 2131756811;
  public static final int hx = 2131756812;
  public static final int hy = 2131756817;
  public static final int hz = 2131756818;
  public static final int i = 2131361798;
  public static final int iA = 2131756884;
  public static final int iB = 2131820791;
  public static final int iC = 2131034122;
  public static final int iD = 2131034125;
  public static final int iE = 2131034126;
  public static final int iF = 2131034132;
  public static final int iG = 2131034133;
  public static final int iH = 2131034134;
  public static final int iI = 2131034135;
  public static final int iJ = 2131034143;
  public static final int iK = 2131034144;
  public static final int iL = 2131296256;
  public static final int iM = 2131296257;
  public static final int iN = 2131296258;
  public static final int iO = 2131296259;
  public static final int iP = 2131296262;
  public static final int iQ = 2131296263;
  public static final int iR = 2131296264;
  public static final int iS = 2131296265;
  public static final int iT = 2131296266;
  public static final int iU = 2131296267;
  public static final int iV = 2131296268;
  public static final int iW = 2131296271;
  public static final int iX = 2131296272;
  public static final int iY = 2131296273;
  public static final int iZ = 2131296274;
  public static final int ia = 2131756848;
  public static final int ib = 2131756849;
  public static final int ic = 2131756850;
  public static final int id = 2131756852;
  public static final int ie = 2131756853;
  public static final int jdField_if = 2131756855;
  public static final int ig = 2131756856;
  public static final int ih = 2131756860;
  public static final int ii = 2131756861;
  public static final int ij = 2131756862;
  public static final int ik = 2131756863;
  public static final int il = 2131756864;
  public static final int im = 2131756866;
  public static final int in = 2131756867;
  public static final int io = 2131756868;
  public static final int ip = 2131756870;
  public static final int iq = 2131756872;
  public static final int ir = 2131756873;
  public static final int is = 2131756874;
  public static final int it = 2131756875;
  public static final int iu = 2131756876;
  public static final int iv = 2131756877;
  public static final int iw = 2131756878;
  public static final int ix = 2131756879;
  public static final int iy = 2131756882;
  public static final int iz = 2131756883;
  public static final int j = 2131427328;
  public static final int jA = 2131427469;
  public static final int jB = 2131427470;
  public static final int jC = 2131427486;
  public static final int jD = 2131427515;
  public static final int jE = 2131427535;
  public static final int jF = 2131427536;
  public static final int jG = 2131427556;
  public static final int jH = 2131427583;
  public static final int jI = 2131427584;
  public static final int jJ = 2131427585;
  public static final int jK = 2131427588;
  public static final int jL = 2131427589;
  public static final int jM = 2131427590;
  public static final int jN = 2131427594;
  public static final int jO = 2131427595;
  public static final int jP = 2131427596;
  public static final int jQ = 2131427597;
  public static final int jR = 2131427600;
  public static final int jS = 2131427601;
  public static final int jT = 2131428115;
  public static final int jU = 2131427625;
  public static final int jV = 2131427653;
  public static final int jW = 2131427657;
  public static final int jX = 2131427747;
  public static final int jY = 2131427762;
  public static final int jZ = 2131427764;
  public static final int ja = 2130772401;
  public static final int jb = 2131361802;
  public static final int jc = 2131361803;
  public static final int jd = 2131361806;
  public static final int je = 2131361807;
  public static final int jf = 2131361808;
  public static final int jg = 2131361809;
  public static final int jh = 2131427353;
  public static final int ji = 2131427368;
  public static final int jj = 2131427369;
  public static final int jk = 2131427370;
  public static final int jl = 2131427371;
  public static final int jm = 2131427372;
  public static final int jn = 2131427373;
  public static final int jo = 2131427374;
  public static final int jp = 2131427376;
  public static final int jq = 2131427381;
  public static final int jr = 2131427382;
  public static final int js = 2131427383;
  public static final int jt = 2131427384;
  public static final int ju = 2131427409;
  public static final int jv = 2131427410;
  public static final int jw = 2131427411;
  public static final int jx = 2131427412;
  public static final int jy = 2131427446;
  public static final int jz = 2131427468;
  public static final int k = 2131492872;
  public static final int kA = 2131492989;
  public static final int kB = 2131492993;
  public static final int kC = 2131492994;
  public static final int kD = 2131492995;
  public static final int kE = 2131492996;
  public static final int kF = 2131492997;
  public static final int kG = 2131492998;
  public static final int kH = 2131492999;
  public static final int kI = 2131493000;
  public static final int kJ = 2131493001;
  public static final int kK = 2131493002;
  public static final int kL = 2131493003;
  public static final int kM = 2131493004;
  public static final int kN = 2131493006;
  public static final int kO = 2131493011;
  public static final int kP = 2131493026;
  public static final int kQ = 2131493027;
  public static final int kR = 2131493028;
  public static final int kS = 2131493069;
  public static final int kT = 2131493070;
  public static final int kU = 2131493071;
  public static final int kV = 2131493072;
  public static final int kW = 2131493073;
  public static final int kX = 2131493074;
  public static final int kY = 2131493099;
  public static final int kZ = 2131493111;
  public static final int ka = 2131427786;
  public static final int kb = 2131427788;
  public static final int kc = 2131427792;
  public static final int kd = 2131427793;
  public static final int ke = 2131427820;
  public static final int kf = 2131427822;
  public static final int kg = 2131427961;
  public static final int kh = 2131427966;
  public static final int ki = 2131428009;
  public static final int kj = 2131428014;
  public static final int kk = 2131428015;
  public static final int kl = 2131428019;
  public static final int km = 2131428048;
  public static final int kn = 2131428062;
  public static final int ko = 2131428063;
  public static final int kp = 2131428067;
  public static final int kq = 2131428069;
  public static final int kr = 2131428074;
  public static final int ks = 2131428094;
  public static final int kt = 2131492961;
  public static final int ku = 2131492983;
  public static final int kv = 2131492984;
  public static final int kw = 2131492985;
  public static final int kx = 2131492986;
  public static final int ky = 2131492987;
  public static final int kz = 2131492988;
  public static final int l = 2131492873;
  public static final int lA = 2131493296;
  public static final int lB = 2131493297;
  public static final int lC = 2131493298;
  public static final int lD = 2131493299;
  public static final int lE = 2131493300;
  public static final int lF = 2131493301;
  public static final int lG = 2131493302;
  public static final int lH = 2131493303;
  public static final int lI = 2131493304;
  public static final int lJ = 2131493305;
  public static final int lK = 2131493306;
  public static final int lL = 2131493307;
  public static final int lM = 2131493308;
  public static final int lN = 2131493309;
  public static final int lO = 2131493315;
  public static final int lP = 2131493316;
  public static final int lQ = 2131493317;
  public static final int lR = 2131493318;
  public static final int lS = 2131493319;
  public static final int lT = 2131493335;
  public static final int lU = 2131493337;
  public static final int lV = 2131493344;
  public static final int lW = 2131493351;
  public static final int lX = 2131493352;
  public static final int lY = 2131493353;
  public static final int lZ = 2131493354;
  public static final int la = 2131493112;
  public static final int lb = 2131493113;
  public static final int lc = 2131493119;
  public static final int ld = 2131493120;
  public static final int le = 2131493121;
  public static final int lf = 2131493122;
  public static final int lg = 2131493123;
  public static final int lh = 2131493124;
  public static final int li = 2131493125;
  public static final int lj = 2131493279;
  public static final int lk = 2131493280;
  public static final int ll = 2131493281;
  public static final int lm = 2131493282;
  public static final int ln = 2131493283;
  public static final int lo = 2131493284;
  public static final int lp = 2131493285;
  public static final int lq = 2131493286;
  public static final int lr = 2131493287;
  public static final int ls = 2131493288;
  public static final int lt = 2131493289;
  public static final int lu = 2131493290;
  public static final int lv = 2131493291;
  public static final int lw = 2131493292;
  public static final int lx = 2131493293;
  public static final int ly = 2131493294;
  public static final int lz = 2131493295;
  public static final int m = 2131492884;
  public static final int mA = 2131493581;
  public static final int mB = 2131493582;
  public static final int mC = 2131493583;
  public static final int mD = 2131493585;
  public static final int mE = 2131493588;
  public static final int mF = 2131493589;
  public static final int mG = 2131493593;
  public static final int mH = 2131493598;
  public static final int mI = 2131493599;
  public static final int mJ = 2131493600;
  public static final int mK = 2131493601;
  public static final int mL = 2131493602;
  public static final int mM = 2131493603;
  public static final int mN = 2131493604;
  public static final int mO = 2131493605;
  public static final int mP = 2131493606;
  public static final int mQ = 2131493607;
  public static final int mR = 2131493608;
  public static final int mS = 2131493609;
  public static final int mT = 2131493610;
  public static final int mU = 2131493611;
  public static final int mV = 2131493612;
  public static final int mW = 2131493613;
  public static final int mX = 2131493620;
  public static final int mY = 2131493621;
  public static final int mZ = 2131493622;
  public static final int ma = 2131493361;
  public static final int mb = 2131493363;
  public static final int mc = 2131493380;
  public static final int md = 2131493385;
  public static final int me = 2131493403;
  public static final int mf = 2131493404;
  public static final int mg = 2131493413;
  public static final int mh = 2131493439;
  public static final int mi = 2131493447;
  public static final int mj = 2131493448;
  public static final int mk = 2131493462;
  public static final int ml = 2131493464;
  public static final int mm = 2131493465;
  public static final int mn = 2131493466;
  public static final int mo = 2131493467;
  public static final int mp = 2131493468;
  public static final int mq = 2131493469;
  public static final int mr = 2131493472;
  public static final int ms = 2131493473;
  public static final int mt = 2131493497;
  public static final int mu = 2131493498;
  public static final int mv = 2131493500;
  public static final int mw = 2131493501;
  public static final int mx = 2131493507;
  public static final int my = 2131493510;
  public static final int mz = 2131493525;
  public static final int n = 2131492895;
  public static final int nA = 2131493747;
  public static final int nB = 2131493772;
  public static final int nC = 2131493804;
  public static final int nD = 2131493848;
  public static final int nE = 2131493849;
  public static final int nF = 2131493862;
  public static final int nG = 2131493863;
  public static final int nH = 2131493864;
  public static final int nI = 2131493865;
  public static final int nJ = 2131493899;
  public static final int nK = 2131493900;
  public static final int nL = 2131493901;
  public static final int nM = 2131493903;
  public static final int nN = 2131493914;
  public static final int nO = 2131493915;
  public static final int nP = 2131493916;
  public static final int nQ = 2131493917;
  public static final int nR = 2131493918;
  public static final int nS = 2131493919;
  public static final int nT = 2131493920;
  public static final int nU = 2131493921;
  public static final int nV = 2131493922;
  public static final int nW = 2131493923;
  public static final int nX = 2131493924;
  public static final int nY = 2131493925;
  public static final int nZ = 2131493926;
  public static final int na = 2131493623;
  public static final int nb = 2131493624;
  public static final int nc = 2131493625;
  public static final int nd = 2131493626;
  public static final int ne = 2131493640;
  public static final int nf = 2131493641;
  public static final int ng = 2131493643;
  public static final int nh = 2131493644;
  public static final int ni = 2131493646;
  public static final int nj = 2131493682;
  public static final int nk = 2131493694;
  public static final int nl = 2131493695;
  public static final int nm = 2131493697;
  public static final int nn = 2131493698;
  public static final int no = 2131493699;
  public static final int np = 2131493700;
  public static final int nq = 2131493701;
  public static final int nr = 2131493703;
  public static final int ns = 2131493715;
  public static final int nt = 2131493716;
  public static final int nu = 2131493717;
  public static final int nv = 2131493718;
  public static final int nw = 2131493719;
  public static final int nx = 2131493720;
  public static final int ny = 2131493734;
  public static final int nz = 2131493739;
  public static final int o = 2131492896;
  public static final int oA = 2130837637;
  public static final int oB = 2130837638;
  public static final int oC = 2130837643;
  public static final int oD = 2130837647;
  public static final int oE = 2130837649;
  public static final int oF = 2130837680;
  public static final int oG = 2130837681;
  public static final int oH = 2130837683;
  public static final int oI = 2130837684;
  public static final int oJ = 2130837687;
  public static final int oK = 2130837690;
  public static final int oL = 2130837691;
  public static final int oM = 2130837692;
  public static final int oN = 2130837693;
  public static final int oO = 2130837695;
  public static final int oP = 2130837696;
  public static final int oQ = 2130837700;
  public static final int oR = 2130837704;
  public static final int oS = 2130837705;
  public static final int oT = 2130837706;
  public static final int oU = 2130837762;
  public static final int oV = 2130837775;
  public static final int oW = 2130837778;
  public static final int oX = 2130837787;
  public static final int oY = 2130837790;
  public static final int oZ = 2130837806;
  public static final int oa = 2131493927;
  public static final int ob = 2131493930;
  public static final int oc = 2131493931;
  public static final int od = 2131493932;
  public static final int oe = 2131493933;
  public static final int of = 2131493934;
  public static final int og = 2131493935;
  public static final int oh = 2131493936;
  public static final int oi = 2131493937;
  public static final int oj = 2131493955;
  public static final int ok = 2131493956;
  public static final int ol = 2131493958;
  public static final int om = 2131493959;
  public static final int on = 2131493976;
  public static final int oo = 2130837578;
  public static final int op = 2130837580;
  public static final int oq = 2130837585;
  public static final int or = 2130837589;
  public static final int os = 2130837605;
  public static final int ot = 2130837606;
  public static final int ou = 2130837616;
  public static final int ov = 2130837617;
  public static final int ow = 2130837619;
  public static final int ox = 2130837621;
  public static final int oy = 2130837630;
  public static final int oz = 2130837636;
  public static final int p = 2131492904;
  public static final int pA = 2130838097;
  public static final int pB = 2130838100;
  public static final int pC = 2130838103;
  public static final int pD = 2130838123;
  public static final int pE = 2130838134;
  public static final int pF = 2130838135;
  public static final int pG = 2130838138;
  public static final int pH = 2130838144;
  public static final int pI = 2130838147;
  public static final int pJ = 2130838149;
  public static final int pK = 2130838158;
  public static final int pL = 2130838159;
  public static final int pM = 2130838160;
  public static final int pN = 2130838161;
  public static final int pO = 2130838162;
  public static final int pP = 2130838163;
  public static final int pQ = 2130838164;
  public static final int pR = 2130838165;
  public static final int pS = 2130838166;
  public static final int pT = 2130838167;
  public static final int pU = 2130838168;
  public static final int pV = 2130838169;
  public static final int pW = 2130838174;
  public static final int pX = 2130838175;
  public static final int pY = 2130838176;
  public static final int pZ = 2130838177;
  public static final int pa = 2130837807;
  public static final int pb = 2130837811;
  public static final int pc = 2130837812;
  public static final int pd = 2130837824;
  public static final int pe = 2130837825;
  public static final int pf = 2130837828;
  public static final int pg = 2130837831;
  public static final int ph = 2130837849;
  public static final int pi = 2130837853;
  public static final int pj = 2130837859;
  public static final int pk = 2130837860;
  public static final int pl = 2130837862;
  public static final int pm = 2130837865;
  public static final int pn = 2130837866;
  public static final int po = 2130837873;
  public static final int pp = 2130837888;
  public static final int pq = 2130837891;
  public static final int pr = 2130837894;
  public static final int ps = 2130837895;
  public static final int pt = 2130838036;
  public static final int pu = 2130838038;
  public static final int pv = 2130838048;
  public static final int pw = 2130838049;
  public static final int px = 2130838050;
  public static final int py = 2130838051;
  public static final int pz = 2130838086;
  public static final int q = 2130837506;
  public static final int qA = 2130838269;
  public static final int qB = 2130838270;
  public static final int qC = 2130838271;
  public static final int qD = 2130838280;
  public static final int qE = 2130838287;
  public static final int qF = 2130838292;
  public static final int qG = 2130838293;
  public static final int qH = 2130838307;
  public static final int qI = 2130838312;
  public static final int qJ = 2130838313;
  public static final int qK = 2130838317;
  public static final int qL = 2130838327;
  public static final int qM = 2130838330;
  public static final int qN = 2130838331;
  public static final int qO = 2130838344;
  public static final int qP = 2130838345;
  public static final int qQ = 2130838347;
  public static final int qR = 2130838348;
  public static final int qS = 2130838349;
  public static final int qT = 2130838369;
  public static final int qU = 2130838371;
  public static final int qV = 2130838388;
  public static final int qW = 2130838389;
  public static final int qX = 2130838392;
  public static final int qY = 2130838393;
  public static final int qZ = 2130838395;
  public static final int qa = 2130838178;
  public static final int qb = 2130838180;
  public static final int qc = 2130838182;
  public static final int qd = 2130838183;
  public static final int qe = 2130838184;
  public static final int qf = 2130838235;
  public static final int qg = 2130838240;
  public static final int qh = 2130838247;
  public static final int qi = 2130838249;
  public static final int qj = 2130838250;
  public static final int qk = 2130838252;
  public static final int ql = 2130838253;
  public static final int qm = 2130838254;
  public static final int qn = 2130838255;
  public static final int qo = 2130838257;
  public static final int qp = 2130838258;
  public static final int qq = 2130838259;
  public static final int qr = 2130838260;
  public static final int qs = 2130838261;
  public static final int qt = 2130838262;
  public static final int qu = 2130838263;
  public static final int qv = 2130838264;
  public static final int qw = 2130838265;
  public static final int qx = 2130838266;
  public static final int qy = 2130838267;
  public static final int qz = 2130838268;
  public static final int r = 2130837508;
  public static final int rA = 2130838548;
  public static final int rB = 2130838549;
  public static final int rC = 2130838555;
  public static final int rD = 2130838565;
  public static final int rE = 2130838576;
  public static final int rF = 2130838582;
  public static final int rG = 2130838592;
  public static final int rH = 2130838598;
  public static final int rI = 2130838599;
  public static final int rJ = 2130838603;
  public static final int rK = 2130838605;
  public static final int rL = 2130838618;
  public static final int rM = 2130838621;
  public static final int rN = 2130838622;
  public static final int rO = 2130838623;
  public static final int rP = 2130838625;
  public static final int rQ = 2130838627;
  public static final int rR = 2130838630;
  public static final int rS = 2130838638;
  public static final int rT = 2130838641;
  public static final int rU = 2130838643;
  public static final int rV = 2130838649;
  public static final int rW = 2130838652;
  public static final int rX = 2130838653;
  public static final int rY = 2130838654;
  public static final int rZ = 2130838665;
  public static final int ra = 2130838397;
  public static final int rb = 2130838398;
  public static final int rc = 2130838400;
  public static final int rd = 2130838402;
  public static final int re = 2130838404;
  public static final int rf = 2130838415;
  public static final int rg = 2130838417;
  public static final int rh = 2130838418;
  public static final int ri = 2130838421;
  public static final int rj = 2130838422;
  public static final int rk = 2130838430;
  public static final int rl = 2130838461;
  public static final int rm = 2130838472;
  public static final int rn = 2130838482;
  public static final int ro = 2130838483;
  public static final int rp = 2130838502;
  public static final int rq = 2130838507;
  public static final int rr = 2130838512;
  public static final int rs = 2130838517;
  public static final int rt = 2130838531;
  public static final int ru = 2130838532;
  public static final int rv = 2130838533;
  public static final int rw = 2130838534;
  public static final int rx = 2130838542;
  public static final int ry = 2130838545;
  public static final int rz = 2130838546;
  public static final int s = 2130837509;
  public static final int sA = 2130968640;
  public static final int sB = 2130968641;
  public static final int sC = 2130968642;
  public static final int sD = 2130968643;
  public static final int sE = 2130968644;
  public static final int sF = 2130968645;
  public static final int sG = 2130968646;
  public static final int sH = 2130968647;
  public static final int sI = 2130968648;
  public static final int sJ = 2130968649;
  public static final int sK = 2130968650;
  public static final int sL = 2130968658;
  public static final int sM = 2130968659;
  public static final int sN = 2130968660;
  public static final int sO = 2130968662;
  public static final int sP = 2130968663;
  public static final int sQ = 2130968664;
  public static final int sR = 2130968666;
  public static final int sS = 2130968667;
  public static final int sT = 2130968669;
  public static final int sU = 2130968673;
  public static final int sV = 2130968676;
  public static final int sW = 2130968677;
  public static final int sX = 2130968680;
  public static final int sY = 2130968681;
  public static final int sZ = 2130968683;
  public static final int sa = 2130838672;
  public static final int sb = 2130838677;
  public static final int sc = 2130838678;
  public static final int sd = 2130838681;
  public static final int se = 2130838712;
  public static final int sf = 2130838713;
  public static final int sg = 2130838714;
  public static final int sh = 2130838716;
  public static final int si = 2130838736;
  public static final int sj = 2130838755;
  public static final int sk = 2131623939;
  public static final int sl = 2131623962;
  public static final int sm = 2131623979;
  public static final int sn = 2131623983;
  public static final int so = 2131624014;
  public static final int sp = 2130968576;
  public static final int sq = 2130968605;
  public static final int sr = 2130968608;
  public static final int ss = 2130968609;
  public static final int st = 2130968610;
  public static final int su = 2130968625;
  public static final int sv = 2130968628;
  public static final int sw = 2130968634;
  public static final int sx = 2130968637;
  public static final int sy = 2130968638;
  public static final int sz = 2130968639;
  public static final int t = 2130837512;
  public static final int tA = 2130968799;
  public static final int tB = 2130968800;
  public static final int tC = 2130968801;
  public static final int tD = 2130968802;
  public static final int tE = 2130968803;
  public static final int tF = 2130968804;
  public static final int tG = 2130968805;
  public static final int tH = 2130968806;
  public static final int tI = 2130968807;
  public static final int tJ = 2130968808;
  public static final int tK = 2130968809;
  public static final int tL = 2130968817;
  public static final int tM = 2130968823;
  public static final int tN = 2130968824;
  public static final int tO = 2130968826;
  public static final int tP = 2130968836;
  public static final int tQ = 2130968849;
  public static final int tR = 2130968850;
  public static final int tS = 2130968851;
  public static final int tT = 2130968852;
  public static final int tU = 2130968853;
  public static final int tV = 2130968854;
  public static final int tW = 2130968855;
  public static final int tX = 2130968856;
  public static final int tY = 2130968858;
  public static final int tZ = 2130968859;
  public static final int ta = 2130968684;
  public static final int tb = 2130968686;
  public static final int tc = 2130968687;
  public static final int td = 2130968689;
  public static final int te = 2130968690;
  public static final int tf = 2130968691;
  public static final int tg = 2130968735;
  public static final int th = 2130968736;
  public static final int ti = 2130968741;
  public static final int tj = 2130968742;
  public static final int tk = 2130968746;
  public static final int tl = 2130968750;
  public static final int tm = 2130968751;
  public static final int tn = 2130968770;
  public static final int to = 2130968771;
  public static final int tp = 2130968772;
  public static final int tq = 2130968773;
  public static final int tr = 2130968774;
  public static final int ts = 2130968778;
  public static final int tt = 2130968779;
  public static final int tu = 2130968780;
  public static final int tv = 2130968787;
  public static final int tw = 2130968795;
  public static final int tx = 2130968796;
  public static final int ty = 2130968797;
  public static final int tz = 2130968798;
  public static final int u = 2130837513;
  public static final int uA = 2130968900;
  public static final int uB = 2130968904;
  public static final int uC = 2130968905;
  public static final int uD = 2130968906;
  public static final int uE = 2130968907;
  public static final int uF = 2130968914;
  public static final int uG = 2130968915;
  public static final int uH = 2130968922;
  public static final int uI = 2130968923;
  public static final int uJ = 2130968924;
  public static final int uK = 2130968925;
  public static final int uL = 2130968926;
  public static final int uM = 2130968927;
  public static final int uN = 2130968928;
  public static final int uO = 2130968932;
  public static final int uP = 2130968942;
  public static final int uQ = 2130968950;
  public static final int uR = 2130968951;
  public static final int uS = 2130968952;
  public static final int uT = 2130968954;
  public static final int uU = 2130968955;
  public static final int uV = 2130968958;
  public static final int uW = 2130968959;
  public static final int uX = 2130968961;
  public static final int uY = 2130968963;
  public static final int uZ = 2130968964;
  public static final int ua = 2130968860;
  public static final int ub = 2130968861;
  public static final int uc = 2130968863;
  public static final int ud = 2130968864;
  public static final int ue = 2130968865;
  public static final int uf = 2130968866;
  public static final int ug = 2130968867;
  public static final int uh = 2130968868;
  public static final int ui = 2130968869;
  public static final int uj = 2130968870;
  public static final int uk = 2130968871;
  public static final int ul = 2130968872;
  public static final int um = 2130968873;
  public static final int un = 2130968874;
  public static final int uo = 2130968875;
  public static final int up = 2130968876;
  public static final int uq = 2130968888;
  public static final int ur = 2130968889;
  public static final int us = 2130968891;
  public static final int ut = 2130968892;
  public static final int uu = 2130968894;
  public static final int uv = 2130968895;
  public static final int uw = 2130968896;
  public static final int ux = 2130968897;
  public static final int uy = 2130968898;
  public static final int uz = 2130968899;
  public static final int v = 2130837514;
  public static final int vA = 2130969002;
  public static final int vB = 2130969006;
  public static final int vC = 2130969009;
  public static final int vD = 2130969020;
  public static final int vE = 2130969021;
  public static final int vF = 2130969022;
  public static final int vG = 2130969023;
  public static final int vH = 2130969024;
  public static final int vI = 2130969025;
  public static final int vJ = 2130969026;
  public static final int vK = 2130969028;
  public static final int vL = 2130969030;
  public static final int vM = 2130969031;
  public static final int vN = 2130969032;
  public static final int vO = 2130969033;
  public static final int vP = 2130969034;
  public static final int vQ = 2130969035;
  public static final int vR = 2130969036;
  public static final int vS = 2130969037;
  public static final int vT = 2130969038;
  public static final int vU = 2130969039;
  public static final int vV = 2130969042;
  public static final int vW = 2130969044;
  public static final int vX = 2130969045;
  public static final int vY = 2130969046;
  public static final int vZ = 2130969048;
  public static final int va = 2130968965;
  public static final int vb = 2130968966;
  public static final int vc = 2130968967;
  public static final int vd = 2130968968;
  public static final int ve = 2130968970;
  public static final int vf = 2130968971;
  public static final int vg = 2130968972;
  public static final int vh = 2130968973;
  public static final int vi = 2130968974;
  public static final int vj = 2130968975;
  public static final int vk = 2130968976;
  public static final int vl = 2130968977;
  public static final int vm = 2130968978;
  public static final int vn = 2130968980;
  public static final int vo = 2130968986;
  public static final int vp = 2130968989;
  public static final int vq = 2130968991;
  public static final int vr = 2130968992;
  public static final int vs = 2130968993;
  public static final int vt = 2130968994;
  public static final int vu = 2130968995;
  public static final int vv = 2130968996;
  public static final int vw = 2130968997;
  public static final int vx = 2130968998;
  public static final int vy = 2130969000;
  public static final int vz = 2130969001;
  public static final int w = 2130837521;
  public static final int wA = 2130969173;
  public static final int wB = 2130969177;
  public static final int wC = 2130969179;
  public static final int wD = 2130969180;
  public static final int wE = 2130969181;
  public static final int wF = 2130969182;
  public static final int wG = 2130969183;
  public static final int wH = 2130969186;
  public static final int wI = 2130969187;
  public static final int wJ = 2130969189;
  public static final int wK = 2130969190;
  public static final int wL = 2130969191;
  public static final int wM = 2130969195;
  public static final int wN = 2130969197;
  public static final int wO = 2130969198;
  public static final int wP = 2130969199;
  public static final int wQ = 2131886084;
  public static final int wR = 2131886090;
  public static final int wS = 2131886091;
  public static final int wT = 2131886092;
  public static final int wU = 2131886096;
  public static final int wV = 2131886097;
  public static final int wW = 2131886100;
  public static final int wX = 2130903042;
  public static final int wY = 2130903043;
  public static final int wZ = 2131689472;
  public static final int wa = 2130969072;
  public static final int wb = 2130969074;
  public static final int wc = 2130969075;
  public static final int wd = 2130969076;
  public static final int we = 2130969077;
  public static final int wf = 2130969078;
  public static final int wg = 2130969079;
  public static final int wh = 2130969080;
  public static final int wi = 2130969081;
  public static final int wj = 2130969082;
  public static final int wk = 2130969083;
  public static final int wl = 2130969084;
  public static final int wm = 2130969085;
  public static final int wn = 2130969112;
  public static final int wo = 2130969119;
  public static final int wp = 2130969122;
  public static final int wq = 2130969131;
  public static final int wr = 2130969132;
  public static final int ws = 2130969133;
  public static final int wt = 2130969134;
  public static final int wu = 2130969149;
  public static final int wv = 2130969163;
  public static final int ww = 2130969164;
  public static final int wx = 2130969168;
  public static final int wy = 2130969171;
  public static final int wz = 2130969172;
  public static final int x = 2130837522;
  public static final int xA = 2131689534;
  public static final int xB = 2131689535;
  public static final int xC = 2131689536;
  public static final int xD = 2131689537;
  public static final int xE = 2131689539;
  public static final int xF = 2131689541;
  public static final int xG = 2131689542;
  public static final int xH = 2131689550;
  public static final int xI = 2131689551;
  public static final int xJ = 2131689552;
  public static final int xK = 2131689553;
  public static final int xL = 2131689554;
  public static final int xM = 2131689555;
  public static final int xN = 2131689556;
  public static final int xO = 2131689557;
  public static final int xP = 2131689558;
  public static final int xQ = 2131689559;
  public static final int xR = 2131689560;
  public static final int xS = 2131689561;
  public static final int xT = 2131689562;
  public static final int xU = 2131689563;
  public static final int xV = 2131689570;
  public static final int xW = 2131689571;
  public static final int xX = 2131689572;
  public static final int xY = 2131689576;
  public static final int xZ = 2131689577;
  public static final int xa = 2131689473;
  public static final int xb = 2131689475;
  public static final int xc = 2131689476;
  public static final int xd = 2131689477;
  public static final int xe = 2131689479;
  public static final int xf = 2131689480;
  public static final int xg = 2131689481;
  public static final int xh = 2131689482;
  public static final int xi = 2131689483;
  public static final int xj = 2131689487;
  public static final int xk = 2131689491;
  public static final int xl = 2131689492;
  public static final int xm = 2131689494;
  public static final int xn = 2131689495;
  public static final int xo = 2131689496;
  public static final int xp = 2131689504;
  public static final int xq = 2131689512;
  public static final int xr = 2131689514;
  public static final int xs = 2131689515;
  public static final int xt = 2131689520;
  public static final int xu = 2131689521;
  public static final int xv = 2131689522;
  public static final int xw = 2131689523;
  public static final int xx = 2131689525;
  public static final int xy = 2131689532;
  public static final int xz = 2131689533;
  public static final int y = 2130837523;
  public static final int yA = 2131820974;
  public static final int yB = 2131820976;
  public static final int yC = 2131820978;
  public static final int yD = 2131820980;
  public static final int yE = 2131820981;
  public static final int yF = 2131820983;
  public static final int yG = 2131820984;
  public static final int yH = 2131820985;
  public static final int yI = 2131820986;
  public static final int yJ = 2131820992;
  public static final int yK = 2131820993;
  public static final int yL = 2131820994;
  public static final int yM = 2131820996;
  public static final int yN = 2131820997;
  public static final int yO = 2131820999;
  public static final int yP = 2131821000;
  public static final int yQ = 2131821008;
  public static final int yR = 2131821046;
  public static final int yS = 2131821052;
  public static final int yT = 2131821054;
  public static final int yU = 2131821082;
  public static final int yV = 2131821083;
  public static final int yW = 2131821087;
  public static final int yX = 2131821162;
  public static final int yY = 2131560276;
  public static final int yZ = 2131558844;
  public static final int ya = 2131689578;
  public static final int yb = 2131689579;
  public static final int yc = 2131689581;
  public static final int yd = 2131689582;
  public static final int ye = 2131689591;
  public static final int yf = 2131689601;
  public static final int yg = 2131689603;
  public static final int yh = 2131820696;
  public static final int yi = 2131820731;
  public static final int yj = 2131820821;
  public static final int yk = 2131820822;
  public static final int yl = 2131820823;
  public static final int ym = 2131820864;
  public static final int yn = 2131820954;
  public static final int yo = 2131820955;
  public static final int yp = 2131820956;
  public static final int yq = 2131820957;
  public static final int yr = 2131820958;
  public static final int ys = 2131820959;
  public static final int yt = 2131820961;
  public static final int yu = 2131820962;
  public static final int yv = 2131820964;
  public static final int yw = 2131820965;
  public static final int yx = 2131820968;
  public static final int yy = 2131820970;
  public static final int yz = 2131820973;
  public static final int z = 2130837527;
  public static final int zA = 2131560239;
  public static final int zB = 2131560091;
  public static final int zC = 2131821080;
  public static final int zD = 2131034113;
  public static final int zE = 2131034118;
  public static final int zF = 2131427756;
  public static final int zG = 2131757636;
  public static final int zH = 2131427552;
  public static final int zI = 2131427553;
  public static final int zJ = 2130838462;
  public static final int zK = 2130838568;
  public static final int zL = 2130838604;
  public static final int zM = 2130838610;
  public static final int zN = 2130838614;
  public static final int zO = 2130838651;
  public static final int zP = 2131558932;
  public static final int zQ = 2131558939;
  public static final int zR = 2131558933;
  public static final int zS = 2131558940;
  public static final int zT = 2131558931;
  public static final int zU = 2131558938;
  public static final int zV = 2131558934;
  public static final int zW = 2131558936;
  public static final int zX = 2131558935;
  public static final int zY = 2131558937;
  public static final int zZ = 2130968668;
  public static final int za = 2130968635;
  public static String zb;
  public static long zc = 0L;
  public static final int zd = 2131558402;
  public static final int ze = 2131560207;
  public static final int zf = 2131558437;
  public static final int zg = 2131559047;
  public static final int zh = 2131559046;
  public static final int zi = 2131559045;
  public static final int zj = 2131558438;
  public static final int zk = 2131558439;
  public static final int zl = 2131558440;
  public static final int zm = 2131558441;
  public static final int zn = 2131558443;
  public static final int zo = 2131559076;
  public static final int zp = 2131559096;
  public static final int zq = 2131559375;
  public static final int zr = 2131560205;
  public static final int zs = 2131560204;
  public static final int zt = 2131559249;
  public static final int zu = 2131558812;
  public static final int zv = 2131560190;
  public static final int zw = 2131559077;
  public static final int zx = 2131558545;
  public static final int zy = 2131560271;
  public static final int zz = 2131559459;
  public final g abf;
  public final ComponentName abg;
  public final Intent abh;
  public final Bundle abi;
  
  public efj() {}
  
  public efj(Intent paramIntent, Bundle paramBundle)
  {
    this.abh = paramIntent;
    this.abi = paramBundle;
  }
  
  public efj(g paramg, ComponentName paramComponentName)
  {
    this.abf = paramg;
    this.abg = paramComponentName;
  }
  
  public static int A(Context paramContext)
  {
    int i1 = paramContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (i1 > 0) {
      return paramContext.getResources().getDimensionPixelSize(i1);
    }
    return 0;
  }
  
  public static String A(Context paramContext, int paramInt)
  {
    String str = ((hyi)mbb.a(paramContext, hyi.class)).a(kwi.b, paramInt);
    if (str == null) {
      str = "1A27E40D";
    }
    return str;
  }
  
  public static String A(String paramString)
  {
    return "https://www.youtube.com/watch?v=" + paramString;
  }
  
  /* Error */
  public static android.text.TextPaint B(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: new 5670	android/text/TextPaint
    //   3: dup
    //   4: invokespecial 5671	android/text/TextPaint:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: iconst_1
    //   10: invokevirtual 5675	android/text/TextPaint:setAntiAlias	(Z)V
    //   13: aload_0
    //   14: iload_1
    //   15: getstatic 5680	lua:i	[I
    //   18: invokevirtual 5684	android/content/Context:obtainStyledAttributes	(I[I)Landroid/content/res/TypedArray;
    //   21: astore_3
    //   22: aload_2
    //   23: aload_3
    //   24: getstatic 5686	lua:m	I
    //   27: iconst_0
    //   28: invokevirtual 5691	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   31: i2f
    //   32: invokevirtual 5695	android/text/TextPaint:setTextSize	(F)V
    //   35: aload_2
    //   36: aload_3
    //   37: getstatic 5697	lua:l	I
    //   40: ldc_w 5698
    //   43: invokevirtual 5701	android/content/res/TypedArray:getColor	(II)I
    //   46: putfield 5704	android/text/TextPaint:linkColor	I
    //   49: aload_2
    //   50: aload_3
    //   51: getstatic 5706	lua:k	I
    //   54: ldc_w 5698
    //   57: invokevirtual 5701	android/content/res/TypedArray:getColor	(II)I
    //   60: invokevirtual 5710	android/text/TextPaint:setColor	(I)V
    //   63: aload_3
    //   64: getstatic 5712	lua:j	I
    //   67: invokevirtual 5716	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   70: astore 5
    //   72: aload_3
    //   73: getstatic 5718	lua:o	I
    //   76: iconst_m1
    //   77: invokevirtual 5721	android/content/res/TypedArray:getInt	(II)I
    //   80: istore 6
    //   82: aload_3
    //   83: getstatic 5723	lua:n	I
    //   86: iconst_m1
    //   87: invokevirtual 5721	android/content/res/TypedArray:getInt	(II)I
    //   90: istore 7
    //   92: aload 5
    //   94: ifnull +30 -> 124
    //   97: aload 5
    //   99: iload 7
    //   101: invokestatic 5729	android/graphics/Typeface:create	(Ljava/lang/String;I)Landroid/graphics/Typeface;
    //   104: astore 8
    //   106: aload 8
    //   108: ifnull +16 -> 124
    //   111: aload_2
    //   112: aload 8
    //   114: invokevirtual 5733	android/text/TextPaint:setTypeface	(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    //   117: pop
    //   118: aload_3
    //   119: invokevirtual 5736	android/content/res/TypedArray:recycle	()V
    //   122: aload_2
    //   123: areturn
    //   124: iload 6
    //   126: tableswitch	default:+26 -> 152, 1:+34->160, 2:+51->177, 3:+42->168
    //   153: lload 108
    //   155: astore 8
    //   157: goto -46 -> 111
    //   160: getstatic 5743	android/graphics/Typeface:DEFAULT_BOLD	Landroid/graphics/Typeface;
    //   163: astore 8
    //   165: goto -54 -> 111
    //   168: iconst_3
    //   169: invokestatic 5747	android/graphics/Typeface:defaultFromStyle	(I)Landroid/graphics/Typeface;
    //   172: astore 8
    //   174: goto -63 -> 111
    //   177: iconst_2
    //   178: invokestatic 5747	android/graphics/Typeface:defaultFromStyle	(I)Landroid/graphics/Typeface;
    //   181: astore 9
    //   183: aload 9
    //   185: astore 8
    //   187: goto -76 -> 111
    //   190: astore 4
    //   192: aload_3
    //   193: invokevirtual 5736	android/content/res/TypedArray:recycle	()V
    //   196: aload 4
    //   198: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	paramContext	Context
    //   0	199	1	paramInt	int
    //   7	116	2	localTextPaint	android.text.TextPaint
    //   21	172	3	localTypedArray	TypedArray
    //   190	7	4	localObject1	Object
    //   70	28	5	str	String
    //   80	45	6	i1	int
    //   90	10	7	i2	int
    //   104	82	8	localObject2	Object
    //   181	3	9	localTypeface	android.graphics.Typeface
    // Exception table:
    //   from	to	target	type
    //   22	92	190	finally
    //   97	106	190	finally
    //   111	118	190	finally
    //   152	157	190	finally
    //   160	165	190	finally
    //   168	174	190	finally
    //   177	183	190	finally
  }
  
  public static String B(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 23)) {
      paramString = paramString.substring(0, 23);
    }
    return paramString;
  }
  
  public static boolean B(Context paramContext)
  {
    if (paramContext != null)
    {
      AccessibilityManager localAccessibilityManager = (AccessibilityManager)paramContext.getSystemService("accessibility");
      return po.a.a(localAccessibilityManager);
    }
    return false;
  }
  
  public static String C(String paramString)
  {
    long l1 = 1125899906842597L;
    int i1 = paramString.length();
    for (;;)
    {
      i1--;
      if (i1 < 0) {
        break;
      }
      l1 = l1 * 31L + paramString.charAt(i1);
    }
    return Long.toHexString(0xFFFFFFFF & l1);
  }
  
  public static boolean C(Context paramContext)
  {
    return (Build.VERSION.SDK_INT >= 16) && (B(paramContext));
  }
  
  public static long D(String paramString)
  {
    if (paramString == null) {
      return 0L;
    }
    return a(Long.valueOf(paramString));
  }
  
  public static boolean D(Context paramContext)
  {
    int i1 = Build.VERSION.SDK_INT;
    boolean bool = false;
    ContentResolver localContentResolver;
    if (i1 >= 21) {
      localContentResolver = paramContext.getContentResolver();
    }
    try
    {
      int i2 = Settings.Secure.getInt(localContentResolver, "high_text_contrast_enabled");
      bool = false;
      if (i2 != 0) {
        bool = true;
      }
      return bool;
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException) {}
    return false;
  }
  
  public static int E(Context paramContext)
  {
    try
    {
      if (aaN == null) {
        I(paramContext);
      }
      int i1 = aaN.intValue();
      return i1;
    }
    finally {}
  }
  
  public static String E(String paramString)
  {
    String str1;
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.startsWith("http:")) && (!paramString.startsWith("https:")))
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0) {
        break label51;
      }
    }
    label51:
    for (String str2 = "https:".concat(str1);; str2 = new String("https:"))
    {
      paramString = str2;
      return paramString;
    }
  }
  
  public static int F(Context paramContext)
  {
    try
    {
      if (aaO == null) {
        I(paramContext);
      }
      int i1 = aaO.intValue();
      return i1;
    }
    finally {}
  }
  
  public static String F(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    if (i1 < paramString.length())
    {
      char c1 = paramString.charAt(i1);
      if (i1 == 0) {
        localStringBuffer.append(Character.toLowerCase(c1));
      }
      for (;;)
      {
        i1++;
        break;
        if (Character.isUpperCase(c1)) {
          localStringBuffer.append('_').append(Character.toLowerCase(c1));
        } else {
          localStringBuffer.append(c1);
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static int G(Context paramContext)
  {
    try
    {
      if (aaP == null) {
        I(paramContext);
      }
      int i1 = aaP.intValue();
      return i1;
    }
    finally {}
  }
  
  public static String G(String paramString)
  {
    if ((!paramString.startsWith("http")) && (paramString.length() > 200)) {
      paramString = String.valueOf(paramString.substring(0, 200)).concat("[...]");
    }
    int i1 = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i1);
    int i2 = 0;
    if (i2 < i1)
    {
      char c1 = paramString.charAt(i2);
      if ((c1 >= ' ') && (c1 <= '~') && (c1 != '"') && (c1 != '\'')) {
        localStringBuilder.append(c1);
      }
      for (;;)
      {
        i2++;
        break;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(c1);
        localStringBuilder.append(String.format("\\u%04x", arrayOfObject));
      }
    }
    return localStringBuilder.toString();
  }
  
  public static int H(Context paramContext)
  {
    try
    {
      if (aaQ == null) {
        I(paramContext);
      }
      int i1 = aaQ.intValue();
      return i1;
    }
    finally {}
  }
  
  public static String H(String paramString)
  {
    if (paramString.startsWith("cr_")) {
      return paramString;
    }
    boolean bool = paramString.startsWith("cr.");
    int i1 = 0;
    if (bool) {
      i1 = 3;
    }
    return "cr_" + paramString.substring(i1, paramString.length());
  }
  
  /* Error */
  public static void I(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: iconst_0
    //   4: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   7: putstatic 5820	efj:aaN	Ljava/lang/Integer;
    //   10: iconst_0
    //   11: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   14: putstatic 5851	efj:aaO	Ljava/lang/Integer;
    //   17: iconst_0
    //   18: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: putstatic 5870	efj:aaP	Ljava/lang/Integer;
    //   24: iconst_0
    //   25: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: putstatic 5890	efj:aaQ	Ljava/lang/Integer;
    //   31: aload_0
    //   32: invokevirtual 5902	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   35: aload_0
    //   36: invokevirtual 5905	android/content/Context:getPackageName	()Ljava/lang/String;
    //   39: iconst_0
    //   40: invokevirtual 5911	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   43: astore 4
    //   45: aload 4
    //   47: getfield 5916	android/content/pm/PackageInfo:versionCode	I
    //   50: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: putstatic 5820	efj:aaN	Ljava/lang/Integer;
    //   56: aload 4
    //   58: getfield 5919	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   61: astore 5
    //   63: aload 5
    //   65: ifnull +14 -> 79
    //   68: ldc_w 5921
    //   71: aload 5
    //   73: invokevirtual 5925	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   76: ifeq +34 -> 110
    //   79: ldc_w 5926
    //   82: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   85: putstatic 5851	efj:aaO	Ljava/lang/Integer;
    //   88: ldc_w 5926
    //   91: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   94: putstatic 5870	efj:aaP	Ljava/lang/Integer;
    //   97: ldc_w 5926
    //   100: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   103: putstatic 5890	efj:aaQ	Ljava/lang/Integer;
    //   106: ldc 2
    //   108: monitorexit
    //   109: return
    //   110: aload 5
    //   112: ldc_w 5928
    //   115: invokevirtual 5932	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   118: astore 6
    //   120: aload 6
    //   122: arraylength
    //   123: ifle +16 -> 139
    //   126: aload 6
    //   128: iconst_0
    //   129: aaload
    //   130: invokestatic 5936	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   133: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   136: putstatic 5851	efj:aaO	Ljava/lang/Integer;
    //   139: aload 6
    //   141: arraylength
    //   142: iconst_1
    //   143: if_icmple +16 -> 159
    //   146: aload 6
    //   148: iconst_1
    //   149: aaload
    //   150: invokestatic 5936	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   153: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   156: putstatic 5870	efj:aaP	Ljava/lang/Integer;
    //   159: aload 6
    //   161: arraylength
    //   162: iconst_2
    //   163: if_icmple -57 -> 106
    //   166: aload 6
    //   168: iconst_2
    //   169: aaload
    //   170: invokestatic 5936	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   173: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   176: putstatic 5890	efj:aaQ	Ljava/lang/Integer;
    //   179: goto -73 -> 106
    //   182: astore_3
    //   183: goto -77 -> 106
    //   186: astore_1
    //   187: ldc 2
    //   189: monitorexit
    //   190: aload_1
    //   191: athrow
    //   192: astore_2
    //   193: goto -87 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	paramContext	Context
    //   186	5	1	localObject	Object
    //   192	1	2	localNumberFormatException	NumberFormatException
    //   182	1	3	localNameNotFoundException	PackageManager.NameNotFoundException
    //   43	14	4	localPackageInfo	PackageInfo
    //   61	50	5	str	String
    //   118	49	6	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   31	63	182	android/content/pm/PackageManager$NameNotFoundException
    //   68	79	182	android/content/pm/PackageManager$NameNotFoundException
    //   79	106	182	android/content/pm/PackageManager$NameNotFoundException
    //   110	139	182	android/content/pm/PackageManager$NameNotFoundException
    //   139	159	182	android/content/pm/PackageManager$NameNotFoundException
    //   159	179	182	android/content/pm/PackageManager$NameNotFoundException
    //   3	31	186	finally
    //   31	63	186	finally
    //   68	79	186	finally
    //   79	106	186	finally
    //   110	139	186	finally
    //   139	159	186	finally
    //   159	179	186	finally
    //   31	63	192	java/lang/NumberFormatException
    //   68	79	192	java/lang/NumberFormatException
    //   79	106	192	java/lang/NumberFormatException
    //   110	139	192	java/lang/NumberFormatException
    //   139	159	192	java/lang/NumberFormatException
    //   159	179	192	java/lang/NumberFormatException
  }
  
  public static boolean J(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }
  
  public static DisplayMetrics K(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static boolean L(Context paramContext)
  {
    return (0x4 & paramContext.getResources().getConfiguration().screenLayout) != 0;
  }
  
  @TargetApi(11)
  public static int M(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (Build.VERSION.SDK_INT >= 11) {
      try
      {
        if ((0x100000 & paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0).flags) != 0)
        {
          int i1 = localActivityManager.getLargeMemoryClass();
          return i1;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        throw new RuntimeException(localNameNotFoundException);
      }
    }
    return localActivityManager.getMemoryClass();
  }
  
  public static pde N(Context paramContext)
  {
    return ((ozz)((oyv)paramContext.getApplicationContext()).a()).j();
  }
  
  public static PackageInfo O(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramContext.getApplicationContext().getPackageName(), 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new AssertionError("Failed to retrieve own package info");
    }
  }
  
  public static String P(Context paramContext)
  {
    if (abe != null) {
      return abe;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
    ResolveInfo localResolveInfo1 = localPackageManager.resolveActivity(localIntent1, 0);
    if (localResolveInfo1 != null) {}
    for (String str = localResolveInfo1.activityInfo.packageName;; str = null)
    {
      List localList = localPackageManager.queryIntentActivities(localIntent1, 0);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ResolveInfo localResolveInfo2 = (ResolveInfo)localIterator.next();
        Intent localIntent2 = new Intent();
        localIntent2.setAction("android.support.customtabs.action.CustomTabsService");
        localIntent2.setPackage(localResolveInfo2.activityInfo.packageName);
        if (localPackageManager.resolveService(localIntent2, 0) != null) {
          localArrayList.add(localResolveInfo2.activityInfo.packageName);
        }
      }
      if (localArrayList.isEmpty()) {
        abe = null;
      }
      for (;;)
      {
        return abe;
        if (localArrayList.size() == 1) {
          abe = (String)localArrayList.get(0);
        } else if ((!TextUtils.isEmpty(str)) && (!c(paramContext, localIntent1)) && (localArrayList.contains(str))) {
          abe = str;
        } else if (localArrayList.contains("com.android.chrome")) {
          abe = "com.android.chrome";
        } else if (localArrayList.contains("com.chrome.beta")) {
          abe = "com.chrome.beta";
        } else if (localArrayList.contains("com.chrome.dev")) {
          abe = "com.chrome.dev";
        } else if (localArrayList.contains("com.google.android.apps.chrome")) {
          abe = "com.google.android.apps.chrome";
        }
      }
    }
  }
  
  public static byte a(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      if (paramBoolean.booleanValue()) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
  
  public static double a(Double paramDouble)
  {
    if (paramDouble == null) {
      return 0.0D;
    }
    return paramDouble.doubleValue();
  }
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat2 > paramFloat3) {
      throw new IllegalArgumentException("min cannot be greater than max.");
    }
    return Math.max(paramFloat2, Math.min(paramFloat1, paramFloat3));
  }
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (float)Math.sqrt((paramFloat3 - paramFloat1) * (paramFloat3 - paramFloat1) + (paramFloat4 - paramFloat2) * (paramFloat4 - paramFloat2));
  }
  
  public static float a(DisplayMetrics paramDisplayMetrics)
  {
    return Math.min(paramDisplayMetrics.widthPixels / paramDisplayMetrics.density, paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
  }
  
  public static float a(ghd paramghd, float paramFloat1, float paramFloat2)
  {
    float f1 = paramFloat1 * paramghd.a + paramFloat2 * paramghd.b + paramghd.c;
    return (float)Math.sqrt(f1 * f1 / (paramghd.a * paramghd.a + paramghd.b * paramghd.b));
  }
  
  public static int a(float paramFloat)
  {
    switch (Math.round(paramFloat % 360.0F / 90.0F))
    {
    default: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 3;
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    int i1 = Color.alpha(paramInt2);
    int i2 = Color.alpha(paramInt1);
    int i3 = 255 - (255 - i1) * (255 - i2) / 255;
    return Color.argb(i3, a(Color.red(paramInt1), i2, Color.red(paramInt2), i1, i3), a(Color.green(paramInt1), i2, Color.green(paramInt2), i1, i3), a(Color.blue(paramInt1), i2, Color.blue(paramInt2), i1, i3));
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 > paramInt3) {
      throw new IllegalArgumentException("min cannot be greater than max.");
    }
    return Math.max(paramInt2, Math.min(paramInt1, paramInt3));
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      return 0;
    }
    return (paramInt2 * (paramInt1 * 255) + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255);
  }
  
  public static int a(long paramLong, int paramInt)
  {
    return (int)(paramLong ^ paramLong >>> 32) + paramInt * 31;
  }
  
  public static int a(agr paramagr, afs paramafs, View paramView1, View paramView2, agh paramagh, boolean paramBoolean)
  {
    if ((paramagh.l() == 0) || (paramagr.a() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return 1 + Math.abs(((agi)paramView1.getLayoutParams()).c.c() - ((agi)paramView2.getLayoutParams()).c.c());
    }
    int i1 = paramafs.b(paramView2) - paramafs.a(paramView1);
    return Math.min(paramafs.e(), i1);
  }
  
  public static int a(agr paramagr, afs paramafs, View paramView1, View paramView2, agh paramagh, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramagh.l() == 0) || (paramagr.a() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    int i1 = Math.min(((agi)paramView1.getLayoutParams()).c.c(), ((agi)paramView2.getLayoutParams()).c.c());
    int i2 = Math.max(((agi)paramView1.getLayoutParams()).c.c(), ((agi)paramView2.getLayoutParams()).c.c());
    if (paramBoolean2) {}
    for (int i3 = Math.max(0, -1 + (paramagr.a() - i2)); !paramBoolean1; i3 = Math.max(0, i1)) {
      return i3;
    }
    int i4 = Math.abs(paramafs.b(paramView2) - paramafs.a(paramView1));
    int i5 = 1 + Math.abs(((agi)paramView1.getLayoutParams()).c.c() - ((agi)paramView2.getLayoutParams()).c.c());
    return Math.round(i4 / i5 * i3 + (paramafs.b() - paramafs.a(paramView1)));
  }
  
  public static int a(ContentResolver paramContentResolver, String paramString1, Account paramAccount, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("_sync_account=?");
    localStringBuilder.append(" AND _sync_account_type=?");
    localStringBuilder.append(" AND feed=?");
    localStringBuilder.append(" AND authority=?");
    Uri localUri = dnm.a;
    String str = localStringBuilder.toString();
    String[] arrayOfString = new String[4];
    arrayOfString[0] = paramAccount.name;
    arrayOfString[1] = paramAccount.type;
    arrayOfString[2] = paramString1;
    arrayOfString[3] = paramString2;
    return paramContentResolver.delete(localUri, str, arrayOfString);
  }
  
  public static int a(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true)) {
      return localTypedValue.resourceId;
    }
    return 0;
  }
  
  public static int a(Context paramContext, List<String> paramList)
  {
    l();
    ArrayList localArrayList = new ArrayList();
    for (int i1 = -1 + paramList.size(); i1 >= 0; i1--)
    {
      Uri localUri = Uri.parse((String)paramList.get(i1));
      if ((mfq.b(localUri)) && (b(localUri) != null)) {
        localArrayList.add(localUri);
      }
    }
    List localList = Collections.unmodifiableList(localArrayList);
    b(paramContext, localList);
    return d(paramContext, localList);
  }
  
  public static int a(SQLiteDatabase paramSQLiteDatabase, nej paramnej)
  {
    nei[] arrayOfnei1 = paramnej.a;
    int i1 = 0;
    if (arrayOfnei1 != null)
    {
      nei[] arrayOfnei2 = paramnej.a;
      int i2 = arrayOfnei2.length;
      int i3 = 0;
      while (i3 < i2)
      {
        nei localnei = arrayOfnei2[i3];
        int i4 = i1 + 1;
        a(paramSQLiteDatabase, localnei, null);
        i3++;
        i1 = i4;
      }
    }
    return i1;
  }
  
  public static int a(Parcel paramParcel)
  {
    int i1 = paramParcel.readInt();
    int i2 = a(paramParcel, i1);
    int i3 = paramParcel.dataPosition();
    if ((0xFFFF & i1) != 20293) {
      throw new bm("Expected object header. Got 0x" + Integer.toHexString(i1), paramParcel);
    }
    int i4 = i3 + i2;
    if ((i4 < i3) || (i4 > paramParcel.dataSize())) {
      throw new bm("Size read is invalid start=" + i3 + " end=" + i4, paramParcel);
    }
    return i4;
  }
  
  public static int a(Parcel paramParcel, int paramInt)
  {
    if ((paramInt & 0xFFFF0000) != -65536) {
      return 0xFFFF & paramInt >> 16;
    }
    return paramParcel.readInt();
  }
  
  public static int a(RecyclerView paramRecyclerView, String paramString)
  {
    for (int i1 = 0; i1 < paramRecyclerView.g.a(); i1++)
    {
      View localView = paramRecyclerView.getChildAt(i1);
      if ((localView instanceof SpaceListItemView))
      {
        if (((SpaceListItemView)localView).l.equals(paramString)) {
          return paramRecyclerView.c(localView);
        }
      }
      else if (((localView instanceof SquareInvitationView)) && (((SquareInvitationView)localView).g.equals(paramString))) {
        return paramRecyclerView.c(localView);
      }
    }
    return -1;
  }
  
  public static int a(gnb paramgnb)
  {
    if ((paramgnb == null) || (paramgnb.b())) {
      return aau.tw;
    }
    jgs[] arrayOfjgs = paramgnb.c;
    if ((arrayOfjgs != null) && (arrayOfjgs.length == 1)) {}
    switch (arrayOfjgs[0].c)
    {
    default: 
      return aau.tt;
    case 5: 
      return aau.ty;
    case 7: 
      return aau.tv;
    case 8: 
      return aau.tu;
    case 9: 
      return aau.tx;
    }
    return aau.tw;
  }
  
  public static int a(InputStream paramInputStream)
  {
    hxp localhxp = new hxp();
    try
    {
      localhxp.a(paramInputStream);
      int i1 = hxp.f;
      hya localhya = localhxp.a(i1, localhxp.d(i1));
      int[] arrayOfInt1;
      if ((localhya != null) && (localhya.g != null) && ((localhya.g instanceof long[])))
      {
        long[] arrayOfLong = (long[])localhya.g;
        int[] arrayOfInt2 = new int[arrayOfLong.length];
        for (int i2 = 0; i2 < arrayOfLong.length; i2++) {
          arrayOfInt2[i2] = ((int)arrayOfLong[i2]);
        }
        arrayOfInt1 = arrayOfInt2;
        if ((arrayOfInt1 != null) && (arrayOfInt1.length > 0)) {
          break label129;
        }
      }
      label129:
      for (Integer localInteger = null;; localInteger = Integer.valueOf(arrayOfInt1[0]))
      {
        if (localInteger != null) {
          break label141;
        }
        return 0;
        arrayOfInt1 = null;
        break;
      }
      label141:
      return hxp.a(localInteger.shortValue());
    }
    catch (IOException localIOException) {}
    return 0;
  }
  
  public static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = paramCharSequence.length();
    int i2 = 0;
    int i3 = paramInt1 + paramInt2;
    while ((i2 < i1) && (i2 + paramInt1 < i3))
    {
      int i14 = paramCharSequence.charAt(i2);
      if (i14 >= 128) {
        break;
      }
      paramArrayOfByte[(paramInt1 + i2)] = ((byte)i14);
      i2++;
    }
    if (i2 == i1) {
      return paramInt1 + i1;
    }
    int i4 = paramInt1 + i2;
    if (i2 < i1)
    {
      int i5 = paramCharSequence.charAt(i2);
      int i10;
      if ((i5 < 128) && (i4 < i3))
      {
        i10 = i4 + 1;
        paramArrayOfByte[i4] = ((byte)i5);
      }
      for (;;)
      {
        i2++;
        i4 = i10;
        break;
        if ((i5 < 2048) && (i4 <= i3 - 2))
        {
          int i13 = i4 + 1;
          paramArrayOfByte[i4] = ((byte)(0x3C0 | i5 >>> 6));
          i10 = i13 + 1;
          paramArrayOfByte[i13] = ((byte)(0x80 | i5 & 0x3F));
        }
        else if (((i5 < 55296) || (57343 < i5)) && (i4 <= i3 - 3))
        {
          int i11 = i4 + 1;
          paramArrayOfByte[i4] = ((byte)(0x1E0 | i5 >>> 12));
          int i12 = i11 + 1;
          paramArrayOfByte[i11] = ((byte)(0x80 | 0x3F & i5 >>> 6));
          i10 = i12 + 1;
          paramArrayOfByte[i12] = ((byte)(0x80 | i5 & 0x3F));
        }
        else
        {
          if (i4 > i3 - 4) {
            break label446;
          }
          char c1;
          if (i2 + 1 != paramCharSequence.length())
          {
            i2++;
            c1 = paramCharSequence.charAt(i2);
            if (Character.isSurrogatePair(i5, c1)) {}
          }
          else
          {
            throw new pzt(i2 - 1, i1);
          }
          int i6 = Character.toCodePoint(i5, c1);
          int i7 = i4 + 1;
          paramArrayOfByte[i4] = ((byte)(0xF0 | i6 >>> 18));
          int i8 = i7 + 1;
          paramArrayOfByte[i7] = ((byte)(0x80 | 0x3F & i6 >>> 12));
          int i9 = i8 + 1;
          paramArrayOfByte[i8] = ((byte)(0x80 | 0x3F & i6 >>> 6));
          i10 = i9 + 1;
          paramArrayOfByte[i9] = ((byte)(0x80 | i6 & 0x3F));
        }
      }
      label446:
      if ((55296 <= i5) && (i5 <= 57343) && ((i2 + 1 == paramCharSequence.length()) || (!Character.isSurrogatePair(i5, paramCharSequence.charAt(i2 + 1))))) {
        throw new pzt(i2, i1);
      }
      throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + i5 + " at index " + i4);
    }
    return i4;
  }
  
  public static int a(Integer paramInteger)
  {
    if (paramInteger == null) {
      return 0;
    }
    return paramInteger.intValue();
  }
  
  public static int a(Object paramObject, int paramInt)
  {
    if (paramObject == null) {}
    for (int i1 = 0;; i1 = paramObject.hashCode()) {
      return i1 + paramInt * 31;
    }
  }
  
  public static int a(ndy paramndy)
  {
    if ((paramndy.e != null) && (paramndy.e.b != null) && (paramndy.e.b.a != null))
    {
      omf localomf = paramndy.e.b.a[0];
      if ((localomf != null) && (localomf.b != null) && (localomf.b.b != null)) {
        return localomf.b.b.c;
      }
    }
    return -1;
  }
  
  public static int a(nxl paramnxl)
  {
    int i1 = 2;
    if ((paramnxl == null) || (paramnxl.b != i1) || (paramnxl.f == null)) {
      i1 = 0;
    }
    do
    {
      return i1;
      if ((paramnxl.f.a != 1) || (paramnxl.f.b == null)) {
        return 1;
      }
    } while (paramnxl.f.b.d == null);
    if (paramnxl.f.b.c == 1) {
      return 4;
    }
    return 3;
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayOfByte[(paramInt1 - 1)];
    switch (paramInt2 - paramInt1)
    {
    default: 
      throw new AssertionError();
    case 0: 
      if (i1 <= -12) {
        break;
      }
    }
    int i2;
    int i3;
    do
    {
      int i4;
      do
      {
        return -1;
        return i1;
        i4 = paramArrayOfByte[paramInt1];
      } while ((i1 > -12) || (i4 > -65));
      return i1 ^ i4 << 8;
      i2 = paramArrayOfByte[paramInt1];
      i3 = paramArrayOfByte[(paramInt1 + 1)];
    } while ((i1 > -12) || (i2 > -65) || (i3 > -65));
    return i1 ^ i2 << 8 ^ i3 << 16;
  }
  
  public static long a(ContentResolver paramContentResolver, Uri paramUri)
  {
    long l1 = a(paramContentResolver, paramUri, "datetaken", 0L);
    if (l1 > 0L) {
      if (l1 < 100000000000L) {}
    }
    do
    {
      do
      {
        do
        {
          return l1;
          return l1 * 1000L;
          l1 = a(paramContentResolver, paramUri, "date_added", 0L);
          if (l1 <= 0L) {
            break;
          }
        } while (l1 >= 100000000000L);
        return l1 * 1000L;
        l1 = a(paramContentResolver, paramUri, "date_modified", 0L);
        if (l1 <= 0L) {
          break;
        }
      } while (l1 >= 100000000000L);
      return l1 * 1000L;
      l1 = System.currentTimeMillis();
    } while (l1 >= 100000000000L);
    return l1 * 1000L;
  }
  
  /* Error */
  public static long a(ContentResolver paramContentResolver, Uri paramUri, String paramString, long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 5749	java/lang/String
    //   4: dup
    //   5: iconst_0
    //   6: aload_2
    //   7: aastore
    //   8: astore 5
    //   10: aload_0
    //   11: aload_1
    //   12: aload 5
    //   14: aconst_null
    //   15: aconst_null
    //   16: aconst_null
    //   17: invokevirtual 6542	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   20: astore 10
    //   22: aload 10
    //   24: astore 7
    //   26: aload 7
    //   28: ifnull +42 -> 70
    //   31: aload 7
    //   33: invokeinterface 6547 1 0
    //   38: ifeq +32 -> 70
    //   41: aload 7
    //   43: iconst_0
    //   44: invokeinterface 6551 2 0
    //   49: lstore 14
    //   51: lload 14
    //   53: lstore 11
    //   55: aload 7
    //   57: ifnull +10 -> 67
    //   60: aload 7
    //   62: invokeinterface 6554 1 0
    //   67: lload 11
    //   69: lreturn
    //   70: lconst_0
    //   71: lstore 11
    //   73: goto -18 -> 55
    //   76: astore 8
    //   78: aconst_null
    //   79: astore 9
    //   81: aload 9
    //   83: ifnull +10 -> 93
    //   86: aload 9
    //   88: invokeinterface 6554 1 0
    //   93: lconst_0
    //   94: lreturn
    //   95: astore 6
    //   97: aconst_null
    //   98: astore 7
    //   100: aload 7
    //   102: ifnull +10 -> 112
    //   105: aload 7
    //   107: invokeinterface 6554 1 0
    //   112: aload 6
    //   114: athrow
    //   115: astore 6
    //   117: goto -17 -> 100
    //   120: astore 13
    //   122: aload 7
    //   124: astore 9
    //   126: goto -45 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	paramContentResolver	ContentResolver
    //   0	129	1	paramUri	Uri
    //   0	129	2	paramString	String
    //   0	129	3	paramLong	long
    //   8	5	5	arrayOfString	String[]
    //   95	18	6	localObject1	Object
    //   115	1	6	localObject2	Object
    //   24	99	7	localCursor1	Cursor
    //   76	1	8	localException1	Exception
    //   79	46	9	localCursor2	Cursor
    //   20	3	10	localCursor3	Cursor
    //   53	19	11	l1	long
    //   120	1	13	localException2	Exception
    //   49	3	14	l2	long
    // Exception table:
    //   from	to	target	type
    //   10	22	76	java/lang/Exception
    //   10	22	95	finally
    //   31	51	115	finally
    //   31	51	120	java/lang/Exception
  }
  
  public static long a(File paramFile)
  {
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile, "r");
    try
    {
      long l1 = a(localRandomAccessFile, a(localRandomAccessFile));
      return l1;
    }
    finally
    {
      localRandomAccessFile.close();
    }
  }
  
  public static long a(RandomAccessFile paramRandomAccessFile, kbd paramkbd)
  {
    CRC32 localCRC32 = new CRC32();
    long l1 = paramkbd.b;
    paramRandomAccessFile.seek(paramkbd.a);
    int i1 = (int)Math.min(16384L, l1);
    byte[] arrayOfByte = new byte[16384];
    for (int i2 = paramRandomAccessFile.read(arrayOfByte, 0, i1); i2 != -1; i2 = paramRandomAccessFile.read(arrayOfByte, 0, (int)Math.min(16384L, l1)))
    {
      localCRC32.update(arrayOfByte, 0, i2);
      l1 -= i2;
      if (l1 == 0L) {
        break;
      }
    }
    return localCRC32.getValue();
  }
  
  public static long a(Long paramLong)
  {
    if (paramLong == null) {
      return 0L;
    }
    return paramLong.longValue();
  }
  
  public static Notification.Action a(ea paramea)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(paramea.a(), paramea.b(), paramea.c()).addExtras(paramea.d());
    ew[] arrayOfew = paramea.e();
    if (arrayOfew != null)
    {
      RemoteInput[] arrayOfRemoteInput = a(arrayOfew);
      int i1 = arrayOfRemoteInput.length;
      for (int i2 = 0; i2 < i1; i2++) {
        localBuilder.addRemoteInput(arrayOfRemoteInput[i2]);
      }
    }
    return localBuilder.build();
  }
  
  public static ContentValues a(ContentValues paramContentValues, Map<String, String> paramMap)
  {
    ContentValues localContentValues = new ContentValues(paramContentValues.size());
    Iterator localIterator = paramContentValues.valueSet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)paramMap.get(localEntry.getKey());
      if (str != null)
      {
        Object localObject = localEntry.getValue();
        if (localObject == null) {
          localContentValues.putNull(str);
        } else if ((localObject instanceof String)) {
          localContentValues.put(str, (String)localObject);
        } else if ((localObject instanceof Integer)) {
          localContentValues.put(str, (Integer)localObject);
        } else if ((localObject instanceof Long)) {
          localContentValues.put(str, (Long)localObject);
        } else if ((localObject instanceof Short)) {
          localContentValues.put(str, (Short)localObject);
        } else if ((localObject instanceof Double)) {
          localContentValues.put(str, (Double)localObject);
        } else if ((localObject instanceof Float)) {
          localContentValues.put(str, (Float)localObject);
        } else if ((localObject instanceof Boolean)) {
          localContentValues.put(str, (Boolean)localObject);
        } else if ((localObject instanceof Byte)) {
          localContentValues.put(str, (Byte)localObject);
        } else if ((localObject instanceof byte[])) {
          localContentValues.put(str, (byte[])localObject);
        } else {
          localContentValues.put(str, localObject.toString());
        }
      }
    }
    return localContentValues;
  }
  
  public static ContentValues a(ndy paramndy, ndz paramndz, String paramString1, String paramString2, String paramString3)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("cxn_id", paramndy.a.a);
    localContentValues.put("cxn_name", paramndy.b);
    localContentValues.put("tagline", paramndy.c);
    localContentValues.put("nickname", paramndy.g);
    ndx localndx = paramndy.d;
    if (localndx != null)
    {
      if ((localndx.b != null) && (localndx.b.a != null) && (localndx.b.b != null) && (localndx.b.c != null)) {
        localContentValues.put("color", Integer.valueOf(Color.rgb(localndx.b.a.intValue(), localndx.b.b.intValue(), localndx.b.c.intValue())));
      }
      if (!TextUtils.isEmpty(localndx.a)) {
        localContentValues.put("cover_photo_url", localndx.a);
      }
    }
    localContentValues.put("owner_gaia_id", paramString1);
    localContentValues.put("owner_display_name", paramString2);
    localContentValues.put("owner_photo_url", paramString3);
    int i1 = a(paramndy);
    if (i1 != -1) {
      localContentValues.put("sharing_target_group_type", Integer.valueOf(i1));
    }
    if (paramndz != null)
    {
      localContentValues.put("follow_count", paramndz.b);
      localContentValues.put("post_count", paramndz.a);
    }
    if (paramndy.f != null)
    {
      localContentValues.put("visibility_type", Integer.valueOf(paramndy.f.a));
      localContentValues.put("domain_name", paramndy.f.b);
    }
    if (paramndy.e != null)
    {
      localContentValues.put("auto_follow_state", Integer.valueOf(paramndy.e.a));
      if (paramndy.e.b != null) {
        localContentValues.put("sharing_roster", ome.a(paramndy.e.b));
      }
      if (paramndy.e.c == null) {}
    }
    try
    {
      localContentValues.put("abuse_info", hmu.a(new hmu(paramndy.e.c)));
      return localContentValues;
    }
    catch (IOException localIOException) {}
    return localContentValues;
  }
  
  public static ContentValues a(nei paramnei, Cursor paramCursor)
  {
    if ((paramnei == null) || (paramnei.c == null))
    {
      localContentValues = new ContentValues();
      return localContentValues;
    }
    ContentValues localContentValues = a(paramnei.b, paramnei.e, paramnei.c.a, paramnei.c.b, paramnei.c.c);
    localContentValues.put("follow_state", Integer.valueOf(paramnei.d));
    localContentValues.put("subscribe_state", Integer.valueOf(paramnei.f));
    if ((paramnei.g != null) && (!localContentValues.containsKey("auto_follow_state"))) {
      localContentValues.put("auto_follow_state", Integer.valueOf(0));
    }
    for (int i1 = -1 + paramnei.g.length;; i1--) {
      if (i1 >= 0)
      {
        if (TextUtils.equals(paramnei.c.a, paramnei.g[i1])) {
          localContentValues.put("auto_follow_state", Integer.valueOf(1));
        }
      }
      else
      {
        if ((paramCursor == null) || (!paramCursor.moveToFirst())) {
          break;
        }
        localContentValues.put("last_used_timestamp", Integer.valueOf(paramCursor.getInt(paramCursor.getColumnIndexOrThrow("last_used_timestamp"))));
        a(paramCursor, localContentValues);
        return localContentValues;
      }
    }
  }
  
  public static ContentValues a(rcj paramrcj)
  {
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("cxn_id", paramrcj.a.a);
    localContentValues.put("cxn_payload", rcj.a(paramrcj));
    return localContentValues;
  }
  
  public static Context a(Context paramContext)
  {
    boolean bool = true;
    TypedValue localTypedValue = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(bs, localTypedValue, bool)) && (localTypedValue.data != 0)) {
      if (!bool) {
        break label55;
      }
    }
    label55:
    for (int i1 = bH;; i1 = bG)
    {
      return new ContextThemeWrapper(paramContext, i1);
      bool = false;
      break;
    }
  }
  
  public static Intent a()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(524288);
    localIntent.setData(Uri.parse("market://details?id=com.google.android.talk"));
    return localIntent;
  }
  
  public static Intent a(Activity paramActivity, int paramInt1, int paramInt2, gnb paramgnb)
  {
    if (paramgnb.c()) {}
    for (gnb localgnb = null;; localgnb = paramgnb) {
      return a(paramActivity, paramInt1, paramActivity.getString(paramInt2), localgnb, 5, false, true, true, false);
    }
  }
  
  public static Intent a(Context paramContext, int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent(paramContext, PhotosHomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("destination", 1);
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("photo_picker_mode", 0);
    localIntent.putExtra("starting_tab_index", 4);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("people_view_type", 19);
    localIntent.putExtra("category_id", paramInt2);
    localIntent.putExtra("category_name", paramString);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Intent localIntent = new Intent(paramContext, ProfileEditActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("profile_edit_view_type", 0);
    localIntent.putExtra("profile_edit_mode", paramInt2);
    if (paramArrayOfByte1 != null)
    {
      localIntent.putExtra("profile_edit_items_proto", paramArrayOfByte1);
      localIntent.putExtra("profile_edit_roster_proto", paramArrayOfByte2);
    }
    localIntent.putExtra("profile_data_id", paramInt2);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, bti parambti, String paramString)
  {
    Intent localIntent = new Intent(paramContext, AddToAlbumActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("gaia_id", paramString);
    localIntent.putExtra("media_resolver", parambti);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, gnb paramgnb, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt3)
  {
    gnv localgnv = new gnv(paramContext);
    if (paramgnb != null)
    {
      if ((paramgnb.d.length > 0) || (paramgnb.e.length > 0)) {
        localgnv.a(null, PlusAclPickerActivity.a(paramgnb));
      }
    }
    else
    {
      localgnv.a.putExtra("acl.PlusAclPickerActivity.RESTRICT_TO_DOMAIN", paramBoolean4);
      localgnv.a.putExtra("account_id", paramInt1);
      if (paramBoolean5) {
        break label176;
      }
    }
    label176:
    for (boolean bool = true;; bool = false)
    {
      localgnv.a.putExtra("acl.PlusAclPickerActivity.DISABLE_DOMAIN_RESTRICTION_TOGGLE", bool);
      localgnv.a.putExtra("circle_usage_type", paramInt2);
      localgnv.a.putExtra("acl.PlusAclPickerActivity.ALLOW_EMPTY_AUDIENCE", paramBoolean3);
      localgnv.a.putExtra("acl.PlusAclPickerActivity.FILTER_NULL_GAIA_IDS", paramBoolean2);
      localgnv.a.putExtra("acl.PlusAclPickerActivity.INCLUDE_PLUS_PAGES", paramBoolean1);
      localgnv.a(paramInt3);
      return localgnv.a;
      localgnv.a(paramgnb.d(), PlusAclPickerActivity.a(paramgnb));
      break;
    }
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Integer paramInteger, int paramInt5, int paramInt6)
  {
    Intent localIntent = new Intent(paramContext, HostAllAlbumsTileActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("photo_picker_crop_mode", paramInt3);
    localIntent.putExtra("view_id", paramString);
    localIntent.putExtra("external", false);
    localIntent.putExtra("filter", 1);
    localIntent.putExtra("photo_min_height", paramInt6);
    localIntent.putExtra("photo_min_width", paramInt5);
    localIntent.putExtra("photo_picker_mode", 1);
    localIntent.putExtra("finish_on_back", true);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4, int paramInt3, String paramString5, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, EventActivity.class);
    if (paramBoolean) {
      localIntent.setAction("android.intent.action.VIEW");
    }
    localIntent.putExtra("event_id", paramString1);
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("owner_id", paramString2);
    localIntent.putExtra("invitation_token", paramString3);
    localIntent.putExtra("auth_key", paramString5);
    localIntent.putExtra("notif_type", paramInt2);
    localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramString4);
    localIntent.putExtra("rsvp", paramInt3);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString, int paramInt2, boolean paramBoolean1, int paramInt3, Integer paramInteger, boolean paramBoolean2, int paramInt4, int paramInt5)
  {
    Intent localIntent = new Intent(paramContext, PhotoTilePickerActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("photo_picker_crop_mode", paramInt2);
    localIntent.putExtra("view_id", paramString);
    localIntent.putExtra("external", paramBoolean1);
    localIntent.putExtra("filter", paramInt3);
    localIntent.putExtra("take_photo", paramBoolean2);
    localIntent.putExtra("photo_min_height", paramInt5);
    localIntent.putExtra("photo_min_width", paramInt4);
    localIntent.putExtra("photo_picker_mode", 1);
    if (paramInteger != null) {
      localIntent.putExtra("destination", paramInteger);
    }
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString, gnb paramgnb, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    return a(paramContext, paramInt1, paramgnb, paramInt2, paramBoolean2, paramBoolean4, false, false, true, 2);
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("people_view_type", 6);
    localIntent.putExtra("circle_id", paramString1);
    localIntent.putExtra("circle_name", paramString2);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    Intent localIntent = new Intent(paramContext, HostStreamOneUpActivity.class);
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("activity_id", paramString1);
    localIntent.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", true);
    if (paramString2 != null) {
      localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramString2);
    }
    localIntent.putExtra("com.google.android.libraries.social.notifications.updated_version", paramLong);
    localIntent.putExtra("notif_category", paramInt2);
    localIntent.putExtra("refresh", true);
    localIntent.putExtra("enable_comment_action", paramBoolean2);
    localIntent.putExtra("profile_picture_springboard", true);
    if ((paramInt3 == 2) || (paramInt3 == 3) || (paramInt3 == 15)) {
      localIntent.putExtra("scroll_to_last_comment", true);
    }
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, int paramInt3, String paramString4, boolean paramBoolean, int paramInt4)
  {
    Intent localIntent = a(paramContext, paramInt1, paramString1, 0, paramString2, paramString3, null, paramInt3, paramString4, paramBoolean);
    localIntent.putExtra("external_action", paramInt2);
    localIntent.addFlags(67108864);
    localIntent.putExtra("destination", paramInt4);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, OneProfileActivity.class);
    if (paramBoolean) {
      localIntent.setAction("android.intent.action.VIEW");
    }
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("person_id", paramString1);
    localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramString2);
    localIntent.putExtra("profile_view_type", paramInt2);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString1, String paramString2, Spanned paramSpanned, Long paramLong, String paramString3, String paramString4, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, EditCommentActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("activity_id", paramString1);
    localIntent.putExtra("comment_id", paramString2);
    localIntent.putExtra("comment", lwh.a(paramSpanned));
    localIntent.putExtra("is_square_post", paramBoolean);
    if (paramLong != null) {
      localIntent.putExtra("photo_id", paramLong);
    }
    if (paramString3 != null) {
      localIntent.putExtra("gaia_id", paramString3);
    }
    if (paramString4 != null) {
      localIntent.putExtra("tile_id", paramString4);
    }
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent(paramContext, HostEventInviteeListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("event_id", paramString1);
    localIntent.putExtra("owner_id", paramString3);
    localIntent.putExtra("auth_key", paramString2);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Intent localIntent = k(paramContext, paramInt);
    localIntent.setAction("android.intent.action.SEND_MULTIPLE");
    localIntent.putExtra("target_media_id", paramString1);
    localIntent.putExtra("target_album_id", paramString2);
    localIntent.putExtra("album_owner_id", paramString3);
    localIntent.putExtra("cluster_id", paramString4);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Integer paramInteger, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, CirclesMembershipActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("person_id", paramString1);
    localIntent.putExtra("display_name", paramString2);
    localIntent.putExtra("suggestion_id", paramString3);
    localIntent.putExtra("activity_id", paramString4);
    localIntent.putExtra("empty_selection_allowed", paramBoolean);
    localIntent.putExtra("promo_type", paramInteger);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    String str1 = String.valueOf(paramString1);
    if (str1.length() != 0) {}
    for (String str2 = "g:".concat(str1);; str2 = new String("g:")) {
      return a(paramContext, paramInt, str2, paramString2, 0, paramBoolean);
    }
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, CircleSettingsActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("circle_id", paramString);
    localIntent.putExtra("is_following_circle", paramBoolean);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, gnb paramgnb, byte[] paramArrayOfByte)
  {
    Intent localIntent = new Intent(paramContext, PlusShareboxActivity.class).setAction("android.intent.action.SEND").putExtra("account_id", paramInt).putExtra("activity_id", paramString).putExtra("is_limited_sharing", paramBoolean1);
    if (paramBoolean2) {
      localIntent.putExtra("restrict_to_domain", paramBoolean2);
    }
    localIntent.putExtra("disable_location", true);
    if (paramgnb != null) {
      localIntent.putExtra("extra_acl", paramgnb);
    }
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString, boolean paramBoolean1, byte[] paramArrayOfByte, boolean paramBoolean2)
  {
    Intent localIntent = new Intent(paramContext, HostStreamOneUpActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("activity_id", paramString);
    localIntent.putExtra("refresh", false);
    localIntent.putExtra("restrict_to_domain", paramBoolean1);
    localIntent.putExtra("promoted_post_data", paramArrayOfByte);
    localIntent.putExtra("auto_launch_acl_view_dialog", paramBoolean2);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, ArrayList<? extends jpx> paramArrayList, gnb paramgnb)
  {
    Intent localIntent = k(paramContext, paramInt);
    localIntent.setAction("android.intent.action.SEND_MULTIPLE");
    if ((paramArrayList != null) && (!paramArrayList.isEmpty())) {
      localIntent.putExtra("android.intent.extra.STREAM", paramArrayList);
    }
    localIntent.putExtra("is_internal", true);
    if (paramgnb != null) {
      localIntent.putExtra("extra_acl", paramgnb);
    }
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, byte[] paramArrayOfByte, Intent paramIntent)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("circle_actor_data", paramArrayOfByte);
    localIntent.putExtra("people_view_type", 15);
    localIntent.putExtra("destination_intent", paramIntent);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, int paramInt, byte[] paramArrayOfByte, String paramString)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("circle_actor_data", paramArrayOfByte);
    localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramString);
    localIntent.putExtra("people_view_type", 12);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, ivg paramivg, int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setComponent(new ComponentName(paramContext, "com.google.android.apps.moviemaker.MovieMakerActivity"));
    localIntent.putExtra("cluster_id", paramivg);
    localIntent.putExtra("source_id", paramInt1);
    localIntent.putExtra("source_name", paramString);
    localIntent.putExtra("account_id", paramInt2);
    localIntent.putExtra("force_download_and_analysis", paramBoolean);
    return localIntent;
  }
  
  public static Intent a(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setType(paramString);
    if (!a(paramContext, localIntent)) {
      return null;
    }
    localIntent.putExtra("account_name", str);
    localIntent.putExtra("start_video", paramBoolean);
    localIntent.putExtra("auto_join_call_policy", "never");
    return localIntent;
  }
  
  public static Intent a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (paramBoolean) {}
    for (String str = "stream_interactive_post";; str = "stream") {
      return duk.a(localPackageManager, paramString1, paramString2, str);
    }
  }
  
  public static Cursor a(Context paramContext, int paramInt, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return jdd.a(paramContext).a(paramInt).getReadableDatabase().query("notifications", paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
  }
  
  public static Bitmap a(ContentResolver paramContentResolver, Uri paramUri, int paramInt)
  {
    localInputStream = null;
    if (paramInt > 0) {
      try
      {
        Point localPoint = b(paramContentResolver, paramUri);
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        for (localOptions.inSampleSize = 1;; localOptions.inSampleSize <<= 1)
        {
          int i1 = localPoint.x * localPoint.y;
          localInputStream = null;
          if (i1 <= paramInt) {
            break;
          }
          localPoint.x /= 2;
          localPoint.y /= 2;
        }
        try
        {
          localInputStream.close();
          throw localObject;
          localOptions = null;
          localInputStream = paramContentResolver.openInputStream(paramUri);
          Bitmap localBitmap = a(paramContentResolver, paramUri, a(localInputStream, null, localOptions));
          if (localInputStream != null) {}
          try
          {
            localInputStream.close();
            return localBitmap;
          }
          catch (IOException localIOException1)
          {
            return localBitmap;
          }
        }
        catch (IOException localIOException2)
        {
          break label98;
        }
      }
      finally
      {
        if (localInputStream == null) {}
      }
    }
  }
  
  /* Error */
  public static Bitmap a(ContentResolver paramContentResolver, Uri paramUri, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: iconst_1
    //   4: istore 5
    //   6: iload_2
    //   7: iload_3
    //   8: imul
    //   9: istore 6
    //   11: iload 6
    //   13: i2d
    //   14: dstore 7
    //   16: iload 5
    //   18: i2d
    //   19: dstore 9
    //   21: dload 7
    //   23: dload 9
    //   25: ldc2_w 7263
    //   28: invokestatic 7268	java/lang/Math:pow	(DD)D
    //   31: ddiv
    //   32: ldc2_w 7269
    //   35: dcmpl
    //   36: ifle +9 -> 45
    //   39: iinc 5 1
    //   42: goto -31 -> 11
    //   45: iload 5
    //   47: iconst_1
    //   48: isub
    //   49: istore 13
    //   51: new 7238	android/graphics/BitmapFactory$Options
    //   54: dup
    //   55: invokespecial 7239	android/graphics/BitmapFactory$Options:<init>	()V
    //   58: astore 14
    //   60: aload 14
    //   62: iload 13
    //   64: putfield 7242	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   67: aload_0
    //   68: aload_1
    //   69: invokevirtual 7255	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   72: astore 4
    //   74: aload 4
    //   76: aconst_null
    //   77: aload 14
    //   79: invokestatic 7275	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   82: astore 15
    //   84: ldc2_w 7269
    //   87: iload_3
    //   88: i2d
    //   89: iload_2
    //   90: i2d
    //   91: ddiv
    //   92: dmul
    //   93: invokestatic 6154	java/lang/Math:sqrt	(D)D
    //   96: dstore 16
    //   98: dload 16
    //   100: iload_3
    //   101: i2d
    //   102: ddiv
    //   103: iload_2
    //   104: i2d
    //   105: dmul
    //   106: dstore 18
    //   108: aload 15
    //   110: dload 18
    //   112: d2i
    //   113: dload 16
    //   115: d2i
    //   116: iconst_1
    //   117: invokestatic 7281	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   120: astore 20
    //   122: aload 15
    //   124: invokevirtual 7282	android/graphics/Bitmap:recycle	()V
    //   127: ldc_w 7284
    //   130: iconst_4
    //   131: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   134: ifeq +61 -> 195
    //   137: new 5654	java/lang/StringBuilder
    //   140: dup
    //   141: bipush 104
    //   143: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   146: ldc_w 7292
    //   149: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: iload_2
    //   153: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   156: ldc_w 7294
    //   159: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: iload_3
    //   163: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   166: ldc_w 7296
    //   169: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: dload 18
    //   174: invokevirtual 7299	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   177: ldc_w 7294
    //   180: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: dload 16
    //   185: invokevirtual 7299	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   188: ldc_w 7301
    //   191: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload 4
    //   197: ifnull +8 -> 205
    //   200: aload 4
    //   202: invokevirtual 7251	java/io/InputStream:close	()V
    //   205: aload 20
    //   207: areturn
    //   208: astore 11
    //   210: aload 4
    //   212: ifnull +8 -> 220
    //   215: aload 4
    //   217: invokevirtual 7251	java/io/InputStream:close	()V
    //   220: aload 11
    //   222: athrow
    //   223: astore 21
    //   225: aload 20
    //   227: areturn
    //   228: astore 12
    //   230: goto -10 -> 220
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	paramContentResolver	ContentResolver
    //   0	233	1	paramUri	Uri
    //   0	233	2	paramInt1	int
    //   0	233	3	paramInt2	int
    //   1	215	4	localInputStream	InputStream
    //   4	45	5	i1	int
    //   9	3	6	i2	int
    //   14	8	7	d1	double
    //   19	5	9	d2	double
    //   208	13	11	localObject	Object
    //   228	1	12	localIOException1	IOException
    //   49	14	13	i3	int
    //   58	20	14	localOptions	BitmapFactory.Options
    //   82	41	15	localBitmap1	Bitmap
    //   96	88	16	d3	double
    //   106	67	18	d4	double
    //   120	106	20	localBitmap2	Bitmap
    //   223	1	21	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   21	39	208	finally
    //   51	195	208	finally
    //   200	205	223	java/io/IOException
    //   215	220	228	java/io/IOException
  }
  
  @TargetApi(11)
  public static Bitmap a(ContentResolver paramContentResolver, Uri paramUri, int paramInt, Bitmap paramBitmap)
  {
    InputStream localInputStream = null;
    try
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inSampleSize = paramInt;
      localInputStream = null;
      if (paramInt == 1)
      {
        int i1 = Build.VERSION.SDK_INT;
        localInputStream = null;
        if (i1 >= 11) {
          localOptions.inBitmap = paramBitmap;
        }
      }
      localInputStream = paramContentResolver.openInputStream(paramUri);
      Bitmap localBitmap = a(localInputStream, null, localOptions);
      return localBitmap;
    }
    finally
    {
      if (localInputStream != null) {
        localInputStream.close();
      }
    }
  }
  
  public static Bitmap a(ContentResolver paramContentResolver, Uri paramUri, Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      int i1 = c(paramContentResolver, paramUri);
      if (i1 != 0) {
        paramBitmap = d(paramBitmap, i1);
      }
    }
    return paramBitmap;
  }
  
  /* Error */
  public static Bitmap a(Context paramContext, Uri paramUri, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: new 7314	android/media/MediaMetadataRetriever
    //   3: dup
    //   4: invokespecial 7315	android/media/MediaMetadataRetriever:<init>	()V
    //   7: astore 4
    //   9: aload 4
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual 7319	android/media/MediaMetadataRetriever:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   16: aload 4
    //   18: ldc2_w 7320
    //   21: invokevirtual 7325	android/media/MediaMetadataRetriever:getFrameAtTime	(J)Landroid/graphics/Bitmap;
    //   24: astore 12
    //   26: aload 12
    //   28: astore 9
    //   30: aload 4
    //   32: invokevirtual 7328	android/media/MediaMetadataRetriever:release	()V
    //   35: aload 9
    //   37: ifnonnull +57 -> 94
    //   40: aconst_null
    //   41: areturn
    //   42: astore 10
    //   44: aload 4
    //   46: invokevirtual 7328	android/media/MediaMetadataRetriever:release	()V
    //   49: aconst_null
    //   50: astore 9
    //   52: goto -17 -> 35
    //   55: astore 11
    //   57: aconst_null
    //   58: astore 9
    //   60: goto -25 -> 35
    //   63: astore 7
    //   65: aload 4
    //   67: invokevirtual 7328	android/media/MediaMetadataRetriever:release	()V
    //   70: aconst_null
    //   71: astore 9
    //   73: goto -38 -> 35
    //   76: astore 8
    //   78: aconst_null
    //   79: astore 9
    //   81: goto -46 -> 35
    //   84: astore 5
    //   86: aload 4
    //   88: invokevirtual 7328	android/media/MediaMetadataRetriever:release	()V
    //   91: aload 5
    //   93: athrow
    //   94: aload 9
    //   96: iload_2
    //   97: iload_3
    //   98: iconst_2
    //   99: invokestatic 7334	android/media/ThumbnailUtils:extractThumbnail	(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
    //   102: areturn
    //   103: astore 13
    //   105: goto -70 -> 35
    //   108: astore 6
    //   110: goto -19 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	paramContext	Context
    //   0	113	1	paramUri	Uri
    //   0	113	2	paramInt1	int
    //   0	113	3	paramInt2	int
    //   7	80	4	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
    //   84	8	5	localObject	Object
    //   108	1	6	localRuntimeException1	RuntimeException
    //   63	1	7	localRuntimeException2	RuntimeException
    //   76	1	8	localRuntimeException3	RuntimeException
    //   28	67	9	localBitmap1	Bitmap
    //   42	1	10	localIllegalArgumentException	IllegalArgumentException
    //   55	1	11	localRuntimeException4	RuntimeException
    //   24	3	12	localBitmap2	Bitmap
    //   103	1	13	localRuntimeException5	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   9	26	42	java/lang/IllegalArgumentException
    //   44	49	55	java/lang/RuntimeException
    //   9	26	63	java/lang/RuntimeException
    //   65	70	76	java/lang/RuntimeException
    //   9	26	84	finally
    //   30	35	103	java/lang/RuntimeException
    //   86	91	108	java/lang/RuntimeException
  }
  
  @TargetApi(11)
  public static Bitmap a(Context paramContext, Uri paramUri, Bitmap paramBitmap)
  {
    int i1 = -1;
    if (paramUri == null) {}
    while (!c(paramUri)) {
      return null;
    }
    ContentResolver localContentResolver = paramContext.getContentResolver();
    long l1 = ContentUris.parseId(paramUri);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    String str1;
    Bitmap localBitmap;
    if (Build.VERSION.SDK_INT >= 19)
    {
      if ((paramBitmap != null) && (paramBitmap.getWidth() == 512) && (paramBitmap.getHeight() == 384)) {
        localOptions.inBitmap = paramBitmap;
      }
    }
    else
    {
      str1 = mfq.b(localContentResolver, paramUri);
      if (!mfq.b(str1)) {
        break label198;
      }
      localBitmap = MediaStore.Images.Thumbnails.getThumbnail(localContentResolver, l1, 1, localOptions);
    }
    for (;;)
    {
      return localBitmap;
      if (!Log.isLoggable("MediaStoreUtil", 3)) {
        break;
      }
      boolean bool;
      if (paramBitmap == null)
      {
        bool = true;
        label122:
        if (paramBitmap == null) {
          break label192;
        }
      }
      label192:
      for (int i2 = paramBitmap.getWidth();; i2 = i1)
      {
        if (paramBitmap != null) {
          i1 = paramBitmap.getHeight();
        }
        new StringBuilder(117).append("getMediaStoreThumbnail: got null or bitmap with invalid dimensions null? ").append(bool).append(" width: ").append(i2).append(" height: ").append(i1);
        break;
        bool = false;
        break label122;
      }
      label198:
      if (mfq.c(str1))
      {
        localBitmap = MediaStore.Video.Thumbnails.getThumbnail(localContentResolver, l1, 1, localOptions);
      }
      else
      {
        if (Log.isLoggable("MediaStoreUtil", 5))
        {
          String str2 = String.valueOf(paramUri);
          new StringBuilder(42 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("getThumbnail: unrecognized mimeType=").append(str1).append(", uri=").append(str2);
        }
        localBitmap = null;
      }
    }
  }
  
  public static Bitmap a(Context paramContext, List<Bitmap> paramList, int paramInt1, int paramInt2)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return null;
    }
    int i1 = paramList.size();
    Bitmap localBitmap1 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap1);
    Paint localPaint = new Paint();
    localPaint.setColor(-16777216);
    localPaint.setStrokeWidth(4.0F);
    if (i1 == 1) {
      return a((Bitmap)paramList.get(0), paramInt1, paramInt2);
    }
    if (i1 == 2)
    {
      Bitmap localBitmap5 = a((Bitmap)paramList.get(0), paramInt1 / 2, paramInt2);
      Bitmap localBitmap6 = a((Bitmap)paramList.get(1), paramInt1 / 2, paramInt2);
      localCanvas.drawBitmap(localBitmap5, 0.0F, 0.0F, localPaint);
      localCanvas.drawBitmap(localBitmap6, paramInt1 / 2, 0.0F, localPaint);
      localCanvas.drawLine(paramInt1 / 2, 0.0F, paramInt1 / 2, paramInt2, localPaint);
    }
    for (;;)
    {
      return localBitmap1;
      if (i1 >= 3)
      {
        int i2 = paramInt1 / 3;
        int i3 = paramInt2 / 2;
        Bitmap localBitmap2 = a((Bitmap)paramList.get(0), paramInt1 - i2, paramInt2);
        Bitmap localBitmap3 = a((Bitmap)paramList.get(1), i2, i3);
        Bitmap localBitmap4 = a((Bitmap)paramList.get(2), i2, i3);
        localCanvas.drawBitmap(localBitmap2, 0.0F, 0.0F, localPaint);
        localCanvas.drawBitmap(localBitmap3, paramInt1 - i2, 0.0F, localPaint);
        localCanvas.drawBitmap(localBitmap4, paramInt1 - i2, i3, localPaint);
        localCanvas.drawLine(paramInt1 - i2, 0.0F, paramInt1 - i2, paramInt2, localPaint);
        localCanvas.drawLine(paramInt1 - i2, i3, paramInt1, i3, localPaint);
      }
    }
  }
  
  public static Bitmap a(Resources paramResources, int paramInt)
  {
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeResource(paramResources, paramInt);
      return localBitmap;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      Log.e("ImageUtils", "ImageUtils#decodeResource(Resources, int) threw an OOME", localOutOfMemoryError);
    }
    return null;
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    if (paramBitmap != null)
    {
      float f1 = paramBitmap.getWidth();
      float f2 = paramBitmap.getHeight();
      int i2;
      int i1;
      if (f1 / f2 > paramFloat1 / paramFloat2)
      {
        i2 = (int)(f1 * paramFloat2 / f2);
        i1 = (int)paramFloat2;
      }
      for (;;)
      {
        Bitmap localBitmap = Bitmap.createScaledBitmap(paramBitmap, i2, i1, true);
        float f3 = localBitmap.getWidth() - paramFloat1;
        float f4 = localBitmap.getHeight() - paramFloat2;
        return Bitmap.createBitmap(localBitmap, (int)(f3 / 2.0F), (int)(f4 / 2.0F), (int)paramFloat1, (int)paramFloat2);
        i1 = (int)(f2 * paramFloat1 / f1);
        i2 = (int)paramFloat1;
      }
    }
    return null;
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    int i1 = 0;
    if (paramBitmap == null) {
      return null;
    }
    int i2 = paramBitmap.getWidth();
    int i3 = paramBitmap.getHeight();
    int i6;
    int i8;
    int i7;
    if (i2 << 1 >= i3)
    {
      i6 = (int)Math.ceil(i3 / 2.0D);
      i8 = (i2 - i6) / 2;
      i7 = i3;
    }
    for (;;)
    {
      Matrix localMatrix = null;
      if (i7 != paramInt)
      {
        localMatrix = new Matrix();
        float f1 = paramInt / i3;
        localMatrix.postScale(f1, f1, 0.0F, 0.0F);
      }
      return Bitmap.createBitmap(paramBitmap, i8, i1, i6, i7, localMatrix, true);
      int i4 = i2 << 1;
      int i5 = (i3 - i4) / 2;
      i6 = i2;
      i7 = i4;
      i1 = i5;
      i3 = i4;
      i8 = 0;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    int i1 = paramBitmap.getWidth();
    int i2 = paramBitmap.getHeight();
    if ((i1 == paramInt) && (i2 == paramInt)) {
      return paramBitmap;
    }
    float f1 = paramInt / Math.min(i1, i2);
    Bitmap.Config localConfig = paramBitmap.getConfig();
    if (localConfig == null) {
      localConfig = Bitmap.Config.ARGB_8888;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, localConfig);
    int i3 = Math.round(f1 * paramBitmap.getWidth());
    int i4 = Math.round(f1 * paramBitmap.getHeight());
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.translate((paramInt - i3) / 2.0F, (paramInt - i4) / 2.0F);
    localCanvas.scale(f1, f1);
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, new Paint(6));
    paramBitmap.recycle();
    return localBitmap;
  }
  
  public static Bitmap a(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeStream(paramInputStream, null, paramOptions);
      return localBitmap;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      Log.e("MediaStoreUtil", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", localOutOfMemoryError);
    }
    return null;
  }
  
  public static Bitmap a(List<Bitmap> paramList, int paramInt)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return null;
    }
    if (paramList.size() == 1) {
      return (Bitmap)paramList.get(0);
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    localPaint.setColor(-16777216);
    localPaint.setStrokeWidth(2.0F);
    a(localCanvas, paramList, paramInt, localPaint, localPaint);
    return localBitmap;
  }
  
  public static Bitmap a(List<Bitmap> paramList, int paramInt, Paint paramPaint)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    a(localCanvas, paramList, paramInt, paramPaint, null);
    lwe.a(localCanvas);
    return localBitmap;
  }
  
  public static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    }
    do
    {
      return null;
      return PorterDuff.Mode.SRC_OVER;
      return PorterDuff.Mode.SRC_IN;
      return PorterDuff.Mode.SRC_ATOP;
      return PorterDuff.Mode.MULTIPLY;
      return PorterDuff.Mode.SCREEN;
    } while (Build.VERSION.SDK_INT < 11);
    return PorterDuff.Mode.valueOf("ADD");
  }
  
  public static Rect a(View paramView)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    localRect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
    return localRect;
  }
  
  public static Rect a(Window paramWindow, Resources paramResources)
  {
    if ((paramWindow == null) || (paramWindow.peekDecorView() == null)) {
      return new Rect();
    }
    int i1 = paramResources.getDimensionPixelOffset(aau.xp);
    int i2 = paramResources.getDimensionPixelOffset(aau.xr);
    int i3 = paramResources.getDimensionPixelSize(aau.xq) / 2;
    int i4 = i3 + i1;
    int i5 = i2 + i3;
    View localView = paramWindow.peekDecorView();
    Rect localRect = new Rect(0, 0, localView.getWidth(), localView.getHeight());
    localRect.inset(i4, i5);
    return localRect;
  }
  
  @TargetApi(21)
  public static Drawable a(Drawable paramDrawable1, ColorStateList paramColorStateList, Drawable paramDrawable2)
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i1 = 1;; i1 = 0)
    {
      if ((i1 != 0) && (paramColorStateList != null)) {
        paramDrawable2 = new RippleDrawable(paramColorStateList, paramDrawable1, null);
      }
      return paramDrawable2;
    }
  }
  
  public static Uri.Builder a(Context paramContext, Uri.Builder paramBuilder)
  {
    String str1;
    try
    {
      paramBuilder.appendQueryParameter("version", String.valueOf(paramContext.getPackageManager().getPackageInfo(paramContext.getApplicationInfo().packageName, 0).versionCode));
      return paramBuilder;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (!Log.isLoggable("HelpUrl", 6)) {}
      str1 = String.valueOf(paramContext.getApplicationInfo().packageName);
      if (str1.length() == 0) {}
    }
    for (String str2 = "Error finding package ".concat(str1);; str2 = new String("Error finding package "))
    {
      Log.e("HelpUrl", str2);
      return paramBuilder;
    }
  }
  
  public static Uri a(ContentResolver paramContentResolver, ContentValues paramContentValues, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        localUri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        return paramContentResolver.insert(localUri3, paramContentValues);
      }
      catch (Exception localException1)
      {
        Uri localUri3;
        if (!paramBoolean) {
          continue;
        }
        try
        {
          localUri2 = MediaStore.Video.Media.INTERNAL_CONTENT_URI;
          return paramContentResolver.insert(localUri2, paramContentValues);
        }
        catch (Exception localException2)
        {
          Uri localUri2;
          if (!paramBoolean) {
            break label70;
          }
          for (;;)
          {
            try
            {
              localUri1 = itf.a;
              return paramContentResolver.insert(localUri1, paramContentValues);
            }
            catch (Exception localException3)
            {
              Uri localUri1;
              Log.e("MediaStoreOperations", "Failed to save image", localException3);
            }
            localUri1 = itf.b;
          }
        }
        localUri2 = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        continue;
      }
      localUri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }
    label70:
    return null;
  }
  
  public static Uri a(ContentResolver paramContentResolver, String paramString1, Account paramAccount, String paramString2, String paramString3)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("feed", paramString1);
    localContentValues.put("_sync_account", paramAccount.name);
    localContentValues.put("_sync_account_type", paramAccount.type);
    localContentValues.put("authority", paramString2);
    localContentValues.put("service", paramString3);
    return paramContentResolver.insert(dnm.a, localContentValues);
  }
  
  public static Uri a(Context paramContext, String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      throw new IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty");
    }
    Uri.Builder localBuilder = Uri.parse(j(paramString2)).buildUpon();
    localBuilder.appendQueryParameter("p", paramString1);
    return a(paramContext, localBuilder).build();
  }
  
  public static <T extends Parcelable> T a(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    Parcelable localParcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i1 + i2);
    return localParcelable;
  }
  
  public static <T extends Parcelable> T a(byte[] paramArrayOfByte, ClassLoader paramClassLoader)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    Parcelable localParcelable = localParcel.readParcelable(paramClassLoader);
    localParcel.recycle();
    return localParcelable;
  }
  
  public static SpannableStringBuilder a(qoq paramqoq)
  {
    if (Gt == null) {
      Gt = new hfz();
    }
    return a(paramqoq, Gt, f(), e());
  }
  
  public static SpannableStringBuilder a(qoq paramqoq, hge paramhge1, hge paramhge2, hge paramhge3)
  {
    return a(paramqoq, paramhge1, paramhge2, paramhge3, c(), d(), g());
  }
  
  public static SpannableStringBuilder a(qoq paramqoq, hge paramhge1, hge paramhge2, hge paramhge3, hge paramhge4, hge paramhge5, hge paramhge6)
  {
    if (paramqoq == null)
    {
      localSpannableStringBuilder = null;
      return localSpannableStringBuilder;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i1 = 0;
    int i2 = paramqoq.a.length;
    label29:
    qop localqop;
    int i3;
    if (i1 < i2)
    {
      localqop = paramqoq.a[i1];
      i3 = localSpannableStringBuilder.length();
      if ((localqop.a != 2) || (localqop.d == null) || (paramhge1 == null)) {
        break label117;
      }
      paramhge1.a(localSpannableStringBuilder, i3, localqop);
    }
    for (;;)
    {
      if ((localqop.c != null) && (paramhge6 != null)) {
        paramhge6.a(localSpannableStringBuilder, i3, localqop);
      }
      i1++;
      break label29;
      break;
      label117:
      if ((localqop.a == 3) && (paramhge2 != null)) {
        paramhge2.a(localSpannableStringBuilder, i3, localqop);
      } else if ((localqop.a == 4) && (localqop.f != null) && (!TextUtils.isEmpty(localqop.f.a)) && (paramhge3 != null)) {
        paramhge3.a(localSpannableStringBuilder, i3, localqop);
      } else if ((localqop.a == 1) && (paramhge4 != null)) {
        paramhge4.a(localSpannableStringBuilder, i3, localqop);
      } else if (paramhge5 != null) {
        paramhge5.a(localSpannableStringBuilder, i3, localqop);
      }
    }
  }
  
  public static Menu a(Context paramContext, hb paramhb)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return new yd(paramContext, paramhb);
    }
    throw new UnsupportedOperationException();
  }
  
  public static MenuItem a(Context paramContext, hc paramhc)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return new xv(paramContext, paramhc);
    }
    if (Build.VERSION.SDK_INT >= 14) {
      return new xq(paramContext, paramhc);
    }
    throw new UnsupportedOperationException();
  }
  
  public static View a(ViewParent paramViewParent)
  {
    for (ViewParent localViewParent = paramViewParent;; localViewParent = localViewParent.getParent())
    {
      if ((localViewParent instanceof View)) {
        return (View)localViewParent;
      }
      if (localViewParent == null) {
        break;
      }
    }
    return null;
  }
  
  public static ViewGroup a(Context paramContext, String paramString, long paramLong)
  {
    lll locallll = ((lln)mbb.a(paramContext, lln.class)).a(paramString);
    if (locallll != null)
    {
      ViewGroup localViewGroup = locallll.a(paramContext, paramString, paramLong);
      if (localViewGroup != null) {
        return localViewGroup;
      }
    }
    Log.e("StreamCardFactory", 93 + String.valueOf(paramString).length() + "Unsupported activityId (" + paramString + ") and flags (" + paramLong + ") pair; returning render error card.");
    return new lpb(paramContext);
  }
  
  public static Toast a(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    int i1 = paramContext.getResources().getDimensionPixelOffset(Zr);
    Toast localToast = Toast.makeText(paramContext, paramCharSequence, paramInt);
    int i2 = i1 + localToast.getYOffset();
    localToast.setGravity(localToast.getGravity(), localToast.getXOffset(), i2);
    return localToast;
  }
  
  public static cjt a(int paramInt, String paramString1, String paramString2, gnb paramgnb)
  {
    int i1 = 0;
    if (Log.isLoggable(paramString1, 3))
    {
      int i2 = Math.max(0, paramgnb.a - paramgnb.b.length);
      new StringBuilder(25).append("Hidden count: ").append(i2);
      int i3 = paramgnb.b.length;
      new StringBuilder(27).append("Audience users: ").append(i3);
      jjd[] arrayOfjjd = paramgnb.b;
      int i4 = arrayOfjjd.length;
      if (i1 < i4)
      {
        String str = String.valueOf(arrayOfjjd[i1].b);
        if (str.length() != 0) {
          "Users: ".concat(str);
        }
        for (;;)
        {
          i1++;
          break;
          new String("Users: ");
        }
      }
    }
    cjt localcjt = new cjt();
    Bundle localBundle = new Bundle();
    localBundle.putInt("account_id", paramInt);
    localBundle.putParcelable("audience", paramgnb);
    localBundle.putString("people_list_title", paramString2);
    localcjt.f(localBundle);
    return localcjt;
  }
  
  public static <T extends SafeParcelable> T a(Intent paramIntent, String paramString, Parcelable.Creator<T> paramCreator)
  {
    byte[] arrayOfByte = paramIntent.getByteArrayExtra(paramString);
    if (arrayOfByte == null) {
      return null;
    }
    a(paramCreator);
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
    localParcel.setDataPosition(0);
    SafeParcelable localSafeParcelable = (SafeParcelable)paramCreator.createFromParcel(localParcel);
    localParcel.recycle();
    return localSafeParcelable;
  }
  
  public static FilterChain a(oih paramoih, Bitmap paramBitmap)
  {
    int i1 = 1;
    qmg localqmg = paramoih.a;
    if (localqmg == null)
    {
      localFilterChain = null;
      return localFilterChain;
    }
    FilterChain localFilterChain = new FilterChain();
    int i2 = paramBitmap.getWidth();
    int i3 = paramBitmap.getHeight();
    RectF localRectF = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
    if (localqmg.d != -2147483648) {
      switch (localqmg.d)
      {
      default: 
        i1 = 0;
        label98:
        if (i1 == 0) {
          return null;
        }
        break;
      }
    }
    for (int i4 = localqmg.d;; i4 = 0)
    {
      if (localqmg.c != null)
      {
        if (localqmg.c.a == null)
        {
          i1 = 0;
          break label98;
        }
        if ((localqmg.c.a.a.floatValue() < 0.0F) || (localqmg.c.a.c.floatValue() > 1.0F) || (localqmg.c.a.b.floatValue() < 0.0F) || (localqmg.c.a.d.floatValue() > 1.0F))
        {
          i1 = 0;
          break label98;
        }
        localRectF.set(localqmg.c.a.a.floatValue(), localqmg.c.a.b.floatValue(), localqmg.c.a.c.floatValue(), localqmg.c.a.d.floatValue());
      }
      int i5;
      if (localqmg.c != null) {
        if (localqmg.c.b == 2) {
          i5 = 2;
        }
      }
      for (;;)
      {
        localFilterChain.a(localRectF, 0.0F, i5, i4, i2, i3);
        break label98;
        if (localqmg.c.b == i1)
        {
          i5 = i1;
          continue;
          if (localqmg.a == null) {
            break;
          }
          qml[] arrayOfqml = localqmg.a;
          int i6 = arrayOfqml.length;
          int i7 = 0;
          label344:
          qml localqml;
          if (i7 < i6)
          {
            localqml = arrayOfqml[i7];
            if (!gfj.a(localqml)) {
              break label403;
            }
            if (!localFilterChain.a()) {
              localFilterChain.h.add(0, new FilterChainNode(localFilterChain.g));
            }
          }
          for (;;)
          {
            i7++;
            break label344;
            break;
            label403:
            if (!gfj.b(localqml))
            {
              FilterParameter localFilterParameter = a(localqml, localFilterChain, paramBitmap);
              if (localFilterParameter == null) {
                return null;
              }
              if (localFilterParameter.getFilterType() != 20) {
                localFilterChain.a(localFilterParameter);
              }
            }
          }
        }
        i5 = 0;
      }
    }
  }
  
  public static FilterParameter a(qml paramqml, FilterChain paramFilterChain, Bitmap paramBitmap)
  {
    if (paramqml.b(qlw.a) != null)
    {
      qlw localqlw = (qlw)paramqml.b(qlw.a);
      if ((localqlw.e == null) || (localqlw.d == null) || (localqlw.b == null) || (localqlw.c == null)) {
        return null;
      }
      FilterParameter localFilterParameter20 = Cv.a(100);
      localFilterParameter20.a(3, localqlw.e.intValue());
      localFilterParameter20.a(2, Math.round(100.0F * localqlw.d.floatValue()));
      localFilterParameter20.a(0, Math.round(100.0F * localqlw.c.floatValue()));
      localFilterParameter20.a(12, Math.round(100.0F * localqlw.b.floatValue()));
      return localFilterParameter20;
    }
    if (paramqml.b(qlx.a) != null)
    {
      qlx localqlx = (qlx)paramqml.b(qlx.a);
      if ((localqlx.b == null) || (localqlx.c == null) || (localqlx.d == null) || (localqlx.e == null)) {
        return null;
      }
      FilterParameter localFilterParameter19 = Cv.a(7);
      int i11 = Float.valueOf(localFilterParameter19.c(241)).intValue();
      localFilterParameter19.a(241, Integer.valueOf(a(localqlx.d.intValue(), 0, i11)));
      localFilterParameter19.a(0, Math.round(100.0F * localqlx.b.floatValue()));
      localFilterParameter19.a(1, Math.round(100.0F * localqlx.c.floatValue()));
      localFilterParameter19.a(14, Math.round(100.0F * localqlx.e.floatValue()));
      return localFilterParameter19;
    }
    if (paramqml.b(qly.a) != null)
    {
      qly localqly = (qly)paramqml.b(qly.a);
      if (localqly.e == null) {
        return null;
      }
      if ((localqly.e.a == null) || (localqly.e.b == null)) {
        return null;
      }
      if ((localqly.b == null) || (localqly.c == null) || (localqly.d == null) || (localqly.f == null) || (localqly.g == null) || (localqly.h == null) || (localqly.i == null) || (localqly.j == null)) {
        return null;
      }
      FilterParameter localFilterParameter18 = Cv.a(107);
      localFilterParameter18.a(24, localqly.e.a.floatValue());
      localFilterParameter18.a(25, localqly.e.b.floatValue());
      localFilterParameter18.a(17, Math.round(100.0F * localqly.j.floatValue()));
      localFilterParameter18.a(19, Math.round(100.0F * localqly.b.floatValue()));
      localFilterParameter18.a(202, Math.max(2, Math.round(100.0F * localqly.h.floatValue())));
      localFilterParameter18.a(203, Math.max(2, Math.round(100.0F * localqly.i.floatValue())));
      localFilterParameter18.a(18, Math.round(localqly.f.floatValue()));
      localFilterParameter18.a(6, Math.round(100.0F * localqly.c.floatValue()));
      localFilterParameter18.a(204, localqly.g.intValue());
      localFilterParameter18.a(3, localqly.d.intValue());
      return localFilterParameter18;
    }
    if (paramqml.b(qlz.a) != null)
    {
      qlz localqlz = (qlz)paramqml.b(qlz.a);
      FilterParameter localFilterParameter16 = Cv.a(22);
      if (localqlz.b != null)
      {
        qma[] arrayOfqma = localqlz.b;
        int i9 = arrayOfqma.length;
        int i10 = 0;
        if (i10 < i9)
        {
          qma localqma = arrayOfqma[i10];
          FilterParameter localFilterParameter17 = Cv.a(402);
          if (localFilterParameter17 == null) {
            return null;
          }
          if (localqma == null) {
            return null;
          }
          if (localqma.a == null) {
            return null;
          }
          localFilterParameter17.setParameterBuffer(913, localqma.a);
          localFilterParameter17.a(901, localqma.b.intValue());
          localFilterParameter17.a(911, localqma.c.intValue());
          localFilterParameter17.a(912, localqma.d.floatValue());
          localFilterParameter17.a(915, localqma.e.floatValue());
          if (localqma.f.booleanValue()) {}
          for (float f4 = 1.0F;; f4 = 0.0F)
          {
            localFilterParameter17.a(916, f4);
            localFilterParameter17.a(921, localqma.g.floatValue());
            localFilterParameter16.addSubParameters(localFilterParameter17);
            i10++;
            break;
          }
        }
      }
      return localFilterParameter16;
    }
    if (paramqml.b(qmb.a) != null)
    {
      qmb localqmb = (qmb)paramqml.b(qmb.a);
      if ((localqmb.b == null) || (localqmb.c == null) || (localqmb.d == null) || (localqmb.e == null) || (localqmb.f == null) || (localqmb.f.a == null) || (localqmb.f.b == null) || (localqmb.g == null)) {
        return null;
      }
      FilterParameter localFilterParameter15 = Cv.a(11);
      if (localqmb.b.intValue() > 0) {}
      for (float f3 = 1.0F;; f3 = 0.0F)
      {
        localFilterParameter15.a(12, f3);
        localFilterParameter15.a(24, Math.round(65535.0F * localqmb.f.a.floatValue()));
        localFilterParameter15.a(25, Math.round(65535.0F * localqmb.f.b.floatValue()));
        localFilterParameter15.a(4, Math.round(100.0F * localqmb.g.floatValue()));
        localFilterParameter15.a(22, Math.round(100.0F * localqmb.d.floatValue()));
        localFilterParameter15.a(23, Math.round(100.0F * localqmb.e.floatValue()));
        localFilterParameter15.a(19, Math.round(100.0F * localqmb.c.floatValue()));
        return localFilterParameter15;
      }
    }
    if (paramqml.b(qmc.a) != null)
    {
      qmc localqmc = (qmc)paramqml.b(qmc.a);
      if ((localqmc.b == null) || (localqmc.c == null) || (localqmc.d == null)) {
        return null;
      }
      FilterParameter localFilterParameter14 = Cv.a(114);
      localFilterParameter14.a(18, localqmc.b.floatValue());
      localFilterParameter14.a(50, Math.round(1000.0F * localqmc.c.floatValue()));
      localFilterParameter14.a(51, Math.round(1000.0F * localqmc.d.floatValue()));
      return localFilterParameter14;
    }
    if (paramqml.b(qme.a) != null)
    {
      qme localqme = (qme)paramqml.b(qme.a);
      if ((localqme.b == null) || (localqme.c == null)) {
        return null;
      }
      FilterParameter localFilterParameter13 = Cv.a(13);
      localFilterParameter13.a(15, Math.round(100.0F * localqme.b.floatValue()));
      localFilterParameter13.a(16, Math.round(100.0F * localqme.c.floatValue()));
      return localFilterParameter13;
    }
    if (paramqml.b(qmf.a) != null)
    {
      qmf localqmf = (qmf)paramqml.b(qmf.a);
      if ((localqmf.d == null) || (localqmf.c == null) || (localqmf.b == null)) {
        return null;
      }
      FilterParameter localFilterParameter12 = Cv.a(9);
      localFilterParameter12.a(3, localqmf.d.intValue());
      localFilterParameter12.a(2, Math.round(100.0F * localqmf.c.floatValue()));
      localFilterParameter12.a(12, Math.round(100.0F * localqmf.b.floatValue()));
      return localFilterParameter12;
    }
    if (paramqml.b(qmj.a) != null)
    {
      qmj localqmj = (qmj)paramqml.b(qmj.a);
      if ((localqmj.b == null) || (localqmj.c == null) || (localqmj.d == null) || (localqmj.e == null) || (localqmj.f == null) || (localqmj.g == null)) {
        return null;
      }
      FilterParameter localFilterParameter11 = Cv.a(200);
      localFilterParameter11.a(3, localqmj.b.intValue());
      localFilterParameter11.a(9, Math.round(100.0F * localqmj.c.floatValue()));
      localFilterParameter11.a(6, Math.round(100.0F * localqmj.d.floatValue()));
      localFilterParameter11.a(0, Math.round(100.0F * localqmj.f.floatValue()));
      localFilterParameter11.a(2, Math.round(100.0F * localqmj.g.floatValue()));
      localFilterParameter11.a(19, Math.round(100.0F * localqmj.e.floatValue()));
      return localFilterParameter11;
    }
    if (paramqml.b(qmm.a) != null)
    {
      qmm localqmm = (qmm)paramqml.b(qmm.a);
      if ((localqmm.b == null) || (localqmm.c == null) || (localqmm.d == null) || (localqmm.e == null)) {
        return null;
      }
      FilterParameter localFilterParameter10 = Cv.a(17);
      localFilterParameter10.a(224, 0.0F);
      localFilterParameter10.a(223, localqmm.b.intValue());
      localFilterParameter10.a(9, localqmm.d.intValue());
      localFilterParameter10.a(103, 0.0F);
      localFilterParameter10.a(113, 0.0F);
      localFilterParameter10.a(221, Math.round(100.0F * localqmm.c.floatValue()));
      localFilterParameter10.a(105, localqmm.e.intValue());
      return localFilterParameter10;
    }
    if (paramqml.b(qmn.a) != null)
    {
      qmn localqmn = (qmn)paramqml.b(qmn.a);
      if ((localqmn.b == null) || (localqmn.c == null) || (localqmn.d == null)) {
        return null;
      }
      FilterParameter localFilterParameter9 = Cv.a(208);
      localFilterParameter9.a(3, localqmn.c.intValue());
      localFilterParameter9.a(9, Math.round(100.0F * localqmn.d.floatValue()));
      localFilterParameter9.a(14, Math.round(100.0F * localqmn.b.floatValue()));
      return localFilterParameter9;
    }
    if (paramqml.b(qmo.a) != null)
    {
      qmo localqmo = (qmo)paramqml.b(qmo.a);
      if ((localqmo.b == null) || (localqmo.c == null) || (localqmo.d == null) || (localqmo.e == null) || (localqmo.f == null) || (localqmo.g == null)) {
        return null;
      }
      FilterParameter localFilterParameter8 = Cv.a(207);
      localFilterParameter8.a(3, localqmo.f.intValue());
      localFilterParameter8.a(9, Math.round(100.0F * localqmo.g.floatValue()));
      localFilterParameter8.a(35, Math.round(100.0F * localqmo.b.floatValue()));
      localFilterParameter8.a(14, Math.round(100.0F * localqmo.c.floatValue()));
      localFilterParameter8.a(0, Math.round(100.0F * localqmo.d.floatValue()));
      localFilterParameter8.a(1, Math.round(100.0F * localqmo.e.floatValue()));
      return localFilterParameter8;
    }
    if (paramqml.b(qmq.a) != null)
    {
      qmq localqmq = (qmq)paramqml.b(qmq.a);
      if ((localqmq.b == null) || (localqmq.c == null) || (localqmq.d == null) || (localqmq.e == null) || (localqmq.f == null) || (localqmq.g == null) || (localqmq.h == null) || (localqmq.i == null) || (localqmq.j == null) || (localqmq.k == null) || (localqmq.l == null) || (localqmq.m == null) || (localqmq.n == null)) {
        return null;
      }
      FilterParameter localFilterParameter7 = Cv.a(16);
      localFilterParameter7.a(3, Math.round(localqmq.k.floatValue()));
      localFilterParameter7.a(9, Math.round(100.0F * localqmq.n.floatValue()));
      localFilterParameter7.a(0, Math.round(100.0F * localqmq.b.floatValue()));
      localFilterParameter7.a(1, Math.round(100.0F * localqmq.c.floatValue()));
      localFilterParameter7.a(2, Math.round(100.0F * localqmq.d.floatValue()));
      localFilterParameter7.a(19, Math.round(100.0F * localqmq.e.floatValue()));
      localFilterParameter7.a(6, Math.round(100.0F * localqmq.f.floatValue()));
      localFilterParameter7.a(232, Math.round(100.0F * localqmq.g.floatValue()));
      localFilterParameter7.a(233, Math.round(100.0F * localqmq.h.floatValue()));
      localFilterParameter7.a(102, localqmq.i.intValue());
      localFilterParameter7.a(105, localqmq.j.intValue());
      localFilterParameter7.a(235, Math.round(localqmq.m.floatValue()));
      localFilterParameter7.a(234, Math.round(localqmq.l.floatValue()));
      return localFilterParameter7;
    }
    if (paramqml.b(qmr.a) != null)
    {
      qmr localqmr = (qmr)paramqml.b(qmr.a);
      if (localqmr.b == null) {
        return Cv.a(3);
      }
      if (localqmr.b.length > 8) {
        return null;
      }
      FilterParameter localFilterParameter5 = Cv.a(3);
      for (qms localqms : localqmr.b)
      {
        if ((localqms.b == null) || (localqms.c == null) || (localqms.d == null) || (localqms.e == null) || (localqms.e.a == null) || (localqms.e.b == null) || (localqms.f == null) || (localqms.e.a.floatValue() < 0.0F) || (localqms.e.a.floatValue() > 1.0F) || (localqms.e.b.floatValue() < 0.0F) || (localqms.e.b.floatValue() > 1.0F)) {
          return null;
        }
        FilterParameter localFilterParameter6 = Cv.a(300);
        localFilterParameter6.a(202, 0.0F);
        localFilterParameter6.a(203, 0.0F);
        localFilterParameter6.a(0, Math.round(100.0F * localqms.b.floatValue()));
        localFilterParameter6.a(1, Math.round(100.0F * localqms.c.floatValue()));
        localFilterParameter6.a(2, Math.round(100.0F * localqms.d.floatValue()));
        localFilterParameter6.a(501, localqms.e.a.floatValue());
        localFilterParameter6.a(502, localqms.e.b.floatValue());
        int i7 = Math.round(localqms.e.a.floatValue() * paramBitmap.getWidth());
        if (i7 >= paramBitmap.getWidth()) {
          i7 = -1 + paramBitmap.getWidth();
        }
        int i8 = Math.round(localqms.e.b.floatValue() * paramBitmap.getHeight());
        if (i8 >= paramBitmap.getHeight()) {
          i8 = -1 + paramBitmap.getHeight();
        }
        localFilterParameter6.a(201, 0xFFFFFF & paramBitmap.getPixel(i7, i8));
        localFilterParameter6.a(4, a(Math.round(100.0F * localqms.f.floatValue()), 1, 100));
        localFilterParameter5.addSubParameters(localFilterParameter6);
      }
      return localFilterParameter5;
    }
    if (paramqml.b(qmt.a) != null)
    {
      qmt localqmt = (qmt)paramqml.b(qmt.a);
      int i1 = paramBitmap.getWidth();
      int i2 = paramBitmap.getHeight();
      if (localqmt.c == null) {
        return null;
      }
      if (localqmt.c.a == null) {
        return null;
      }
      if ((localqmt.c.a.a == null) || (localqmt.c.a.b == null) || (localqmt.c.a.c == null) || (localqmt.c.a.d == null)) {
        return null;
      }
      if (localqmt.b == null) {
        return null;
      }
      int i4;
      if (localqmt.c.b == 2) {
        i4 = 2;
      }
      for (;;)
      {
        float f2 = a(localqmt.b.floatValue(), -45.0F, 45.0F);
        paramFilterChain.a(new RectF(localqmt.c.a.a.floatValue(), localqmt.c.a.b.floatValue(), localqmt.c.a.c.floatValue(), localqmt.c.a.d.floatValue()), f2, i4, paramFilterChain.getPostRotation(), i1, i2);
        return Cv.a(20);
        int i3 = localqmt.c.b;
        i4 = 0;
        if (i3 == 1) {
          i4 = 1;
        }
      }
    }
    if (paramqml.b(qmu.a) != null)
    {
      qmu localqmu = (qmu)paramqml.b(qmu.a);
      if (localqmu.d == null) {
        return null;
      }
      if ((localqmu.d.a == null) || (localqmu.d.b == null)) {
        return null;
      }
      if ((localqmu.b == null) || (localqmu.c == null) || (localqmu.e == null) || (localqmu.f == null) || (localqmu.g == null) || (localqmu.h == null) || (localqmu.i == null) || (localqmu.j == null) || (localqmu.k == null)) {
        return null;
      }
      FilterParameter localFilterParameter4 = Cv.a(14);
      localFilterParameter4.a(24, Math.round(65535.0F * localqmu.d.a.floatValue()));
      localFilterParameter4.a(25, Math.round(65535.0F * localqmu.d.b.floatValue()));
      localFilterParameter4.a(17, Math.round(100.0F * localqmu.b.floatValue()));
      localFilterParameter4.a(0, Math.round(100.0F * localqmu.c.floatValue()));
      localFilterParameter4.a(1, Math.round(100.0F * localqmu.e.floatValue()));
      localFilterParameter4.a(201, Math.max(2, Math.round(100.0F * localqmu.f.floatValue())));
      localFilterParameter4.a(202, Math.max(2, Math.round(100.0F * localqmu.g.floatValue())));
      localFilterParameter4.a(18, Math.round(1000000.0F * localqmu.h.floatValue()));
      localFilterParameter4.a(2, Math.round(100.0F * localqmu.i.floatValue()));
      localFilterParameter4.a(19, Math.round(100.0F * localqmu.j.floatValue()));
      localFilterParameter4.a(3, localqmu.k.intValue());
      return localFilterParameter4;
    }
    if (paramqml.b(qmv.a) != null)
    {
      qmv localqmv = (qmv)paramqml.b(qmv.a);
      if ((localqmv.b == null) || (localqmv.c == null) || (localqmv.d == null) || (localqmv.e == null) || (localqmv.f == null)) {
        return null;
      }
      FilterParameter localFilterParameter3 = Cv.a(53);
      localFilterParameter3.a(26, Math.round(100.0F * localqmv.b.floatValue()));
      localFilterParameter3.a(27, Math.round(100.0F * localqmv.c.floatValue()));
      localFilterParameter3.a(28, Math.round(100.0F * localqmv.d.floatValue()));
      localFilterParameter3.a(29, Math.round(100.0F * localqmv.e.floatValue()));
      localFilterParameter3.a(30, Math.round(100.0F * localqmv.f.floatValue()));
      return localFilterParameter3;
    }
    if (paramqml.b(qmw.a) != null)
    {
      qmw localqmw = (qmw)paramqml.b(qmw.a);
      if ((localqmw.b == null) || (localqmw.c == null) || (localqmw.d == null) || (localqmw.e == null) || (localqmw.f == null)) {
        return null;
      }
      FilterParameter localFilterParameter2 = Cv.a(4);
      localFilterParameter2.a(0, Math.round(100.0F * localqmw.b.floatValue()));
      localFilterParameter2.a(1, Math.round(100.0F * localqmw.c.floatValue()));
      localFilterParameter2.a(2, Math.round(100.0F * localqmw.d.floatValue()));
      localFilterParameter2.a(20, Math.round(100.0F * localqmw.e.floatValue()));
      localFilterParameter2.a(11, Math.round(100.0F * localqmw.f.floatValue()));
      return localFilterParameter2;
    }
    if (paramqml.b(qna.a) != null)
    {
      qna localqna = (qna)paramqml.b(qna.a);
      if ((localqna.b == null) || (localqna.c == null) || (localqna.d == null) || (localqna.e == null) || (localqna.f == null) || (localqna.g == null)) {
        return null;
      }
      boolean bool = localqna.e.intValue() < 0.0F;
      float f1 = 0.0F;
      if (bool) {
        f1 = 0.5F;
      }
      FilterParameter localFilterParameter1 = Cv.a(202);
      localFilterParameter1.a(800, localqna.b.intValue());
      localFilterParameter1.a(9, Math.round(100.0F * localqna.c.floatValue()));
      localFilterParameter1.a(6, Math.round(100.0F * localqna.d.floatValue()));
      localFilterParameter1.a(0, Math.round(100.0F * localqna.f.floatValue()));
      localFilterParameter1.a(2, Math.round(100.0F * localqna.g.floatValue()));
      localFilterParameter1.a(19, Math.round(f1 * 100.0F));
      return localFilterParameter1;
    }
    return null;
  }
  
  public static fek a(LatLng paramLatLng)
  {
    try
    {
      fek localfek = new fek(((ffa)b(Cs, "CameraUpdateFactory is not initialized")).a(paramLatLng));
      return localfek;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public static fek a(LatLng paramLatLng, float paramFloat)
  {
    try
    {
      fek localfek = new fek(((ffa)b(Cs, "CameraUpdateFactory is not initialized")).a(paramLatLng, paramFloat));
      return localfek;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public static fiu a(Bitmap paramBitmap)
  {
    try
    {
      fiu localfiu = new fiu(((fje)b(Ct, "IBitmapDescriptorFactory is not initialized")).a(paramBitmap));
      return localfiu;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  /* Error */
  public static gnb a(Context paramContext, int paramInt, ome paramome, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: ldc_w 8178
    //   10: invokestatic 5641	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   13: checkcast 8178	jiw
    //   16: astore 4
    //   18: new 6067	java/util/ArrayList
    //   21: dup
    //   22: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   25: astore 5
    //   27: new 6067	java/util/ArrayList
    //   30: dup
    //   31: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   34: astore 6
    //   36: new 6067	java/util/ArrayList
    //   39: dup
    //   40: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   43: astore 7
    //   45: new 8180	android/util/SparseArray
    //   48: dup
    //   49: invokespecial 8181	android/util/SparseArray:<init>	()V
    //   52: astore 8
    //   54: new 8183	java/util/HashMap
    //   57: dup
    //   58: invokespecial 8184	java/util/HashMap:<init>	()V
    //   61: astore 9
    //   63: aconst_null
    //   64: astore 10
    //   66: aload 4
    //   68: iload_1
    //   69: iconst_5
    //   70: invokeinterface 8187 3 0
    //   75: astore 16
    //   77: aload 16
    //   79: astore 12
    //   81: aload 12
    //   83: invokeinterface 8190 1 0
    //   88: ifne +22 -> 110
    //   91: ldc_w 8192
    //   94: ldc_w 8194
    //   97: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   100: pop
    //   101: aload 12
    //   103: invokeinterface 6554 1 0
    //   108: aconst_null
    //   109: areturn
    //   110: aload 12
    //   112: iconst_m1
    //   113: invokeinterface 8198 2 0
    //   118: pop
    //   119: aload 12
    //   121: invokeinterface 6547 1 0
    //   126: ifeq +91 -> 217
    //   129: aload 12
    //   131: iconst_1
    //   132: invokeinterface 8199 2 0
    //   137: astore 60
    //   139: aload 12
    //   141: iconst_4
    //   142: invokeinterface 6839 2 0
    //   147: istore 61
    //   149: aload 12
    //   151: bipush 6
    //   153: invokeinterface 6839 2 0
    //   158: istore 62
    //   160: iload 61
    //   162: iconst_1
    //   163: if_icmpeq +12 -> 175
    //   166: aload 8
    //   168: iload 61
    //   170: aload 60
    //   172: invokevirtual 8201	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   175: aload 9
    //   177: aload 60
    //   179: iload 62
    //   181: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: invokevirtual 8203	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: goto -69 -> 119
    //   191: astore 17
    //   193: ldc_w 8192
    //   196: ldc_w 8194
    //   199: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   202: pop
    //   203: aload 12
    //   205: ifnull +10 -> 215
    //   208: aload 12
    //   210: invokeinterface 6554 1 0
    //   215: aconst_null
    //   216: areturn
    //   217: aload 12
    //   219: invokeinterface 6554 1 0
    //   224: aload_2
    //   225: getfield 8206	ome:c	[Lomm;
    //   228: ifnull +1128 -> 1356
    //   231: aload_2
    //   232: getfield 6480	ome:a	[Lomf;
    //   235: ifnull +1121 -> 1356
    //   238: aload_2
    //   239: getfield 6480	ome:a	[Lomf;
    //   242: astore 19
    //   244: aload 19
    //   246: arraylength
    //   247: istore 20
    //   249: iconst_0
    //   250: istore 21
    //   252: iload 21
    //   254: iload 20
    //   256: if_icmpge +1100 -> 1356
    //   259: aload 19
    //   261: iload 21
    //   263: aaload
    //   264: astore 22
    //   266: aload 22
    //   268: ifnull +258 -> 526
    //   271: aload 22
    //   273: getfield 6485	omf:b	Lomk;
    //   276: ifnull +250 -> 526
    //   279: aload 22
    //   281: getfield 6485	omf:b	Lomk;
    //   284: getfield 8209	omk:a	[Lomn;
    //   287: ifnull +239 -> 526
    //   290: iload_3
    //   291: ifne +28 -> 319
    //   294: aload 22
    //   296: getfield 8212	omf:a	Lomj;
    //   299: ifnull +227 -> 526
    //   302: aload 22
    //   304: getfield 8212	omf:a	Lomj;
    //   307: getfield 8215	omj:a	Ljava/lang/String;
    //   310: ldc_w 8217
    //   313: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   316: ifeq +210 -> 526
    //   319: iconst_1
    //   320: istore 23
    //   322: iload 23
    //   324: ifeq +1026 -> 1350
    //   327: aload 22
    //   329: getfield 6485	omf:b	Lomk;
    //   332: getfield 6490	omk:b	Lomn;
    //   335: ifnull +1067 -> 1402
    //   338: aload 22
    //   340: getfield 6485	omf:b	Lomk;
    //   343: getfield 6490	omk:b	Lomn;
    //   346: getfield 6493	omn:c	I
    //   349: iconst_2
    //   350: if_icmpne +1052 -> 1402
    //   353: iconst_1
    //   354: istore 24
    //   356: aload 22
    //   358: getfield 6485	omf:b	Lomk;
    //   361: getfield 8209	omk:a	[Lomn;
    //   364: astore 25
    //   366: aload 25
    //   368: arraylength
    //   369: istore 26
    //   371: iconst_0
    //   372: istore 27
    //   374: iload 27
    //   376: iload 26
    //   378: if_icmpge +972 -> 1350
    //   381: aload 25
    //   383: iload 27
    //   385: aaload
    //   386: astore 28
    //   388: aload_2
    //   389: getfield 8206	ome:c	[Lomm;
    //   392: astore 29
    //   394: aload 29
    //   396: arraylength
    //   397: istore 30
    //   399: iconst_0
    //   400: istore 31
    //   402: iconst_0
    //   403: istore 32
    //   405: iload 31
    //   407: iload 30
    //   409: if_icmpge +84 -> 493
    //   412: aload 29
    //   414: iload 31
    //   416: aaload
    //   417: astore 33
    //   419: aload 33
    //   421: getfield 8221	omm:a	Lomn;
    //   424: astore 34
    //   426: aload 34
    //   428: getfield 8222	omn:b	Ljava/lang/String;
    //   431: aload 28
    //   433: getfield 8222	omn:b	Ljava/lang/String;
    //   436: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   439: ifne +93 -> 532
    //   442: iconst_0
    //   443: istore 35
    //   445: iload 35
    //   447: ifeq +891 -> 1338
    //   450: aload 33
    //   452: getfield 8223	omm:b	Ljava/lang/String;
    //   455: astore 36
    //   457: aload 33
    //   459: getfield 8221	omm:a	Lomn;
    //   462: astore 37
    //   464: aload 37
    //   466: ifnonnull +453 -> 919
    //   469: ldc_w 8192
    //   472: bipush 6
    //   474: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   477: ifeq +13 -> 490
    //   480: ldc_w 8192
    //   483: ldc_w 8225
    //   486: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   489: pop
    //   490: iconst_1
    //   491: istore 32
    //   493: iload 32
    //   495: ifne +849 -> 1344
    //   498: new 6137	java/lang/IllegalArgumentException
    //   501: dup
    //   502: ldc_w 8227
    //   505: invokespecial 6140	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   508: athrow
    //   509: astore 14
    //   511: aload 10
    //   513: ifnull +10 -> 523
    //   516: aload 10
    //   518: invokeinterface 6554 1 0
    //   523: aload 14
    //   525: athrow
    //   526: iconst_0
    //   527: istore 23
    //   529: goto -207 -> 322
    //   532: aload 34
    //   534: getfield 6493	omn:c	I
    //   537: aload 28
    //   539: getfield 6493	omn:c	I
    //   542: if_icmpeq +9 -> 551
    //   545: iconst_0
    //   546: istore 35
    //   548: goto -103 -> 445
    //   551: aload 34
    //   553: getfield 8230	omn:e	Lole;
    //   556: ifnull +39 -> 595
    //   559: aload 28
    //   561: getfield 8230	omn:e	Lole;
    //   564: ifnull +31 -> 595
    //   567: aload 34
    //   569: getfield 8230	omn:e	Lole;
    //   572: getfield 8233	ole:a	Ljava/lang/String;
    //   575: aload 28
    //   577: getfield 8230	omn:e	Lole;
    //   580: getfield 8233	ole:a	Ljava/lang/String;
    //   583: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   586: ifne +9 -> 595
    //   589: iconst_0
    //   590: istore 35
    //   592: goto -147 -> 445
    //   595: aload 34
    //   597: getfield 8236	omn:d	Lomo;
    //   600: ifnull +39 -> 639
    //   603: aload 28
    //   605: getfield 8236	omn:d	Lomo;
    //   608: ifnull +31 -> 639
    //   611: aload 34
    //   613: getfield 8236	omn:d	Lomo;
    //   616: getfield 8239	omo:a	Ljava/lang/String;
    //   619: aload 28
    //   621: getfield 8236	omn:d	Lomo;
    //   624: getfield 8239	omo:a	Ljava/lang/String;
    //   627: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   630: ifne +9 -> 639
    //   633: iconst_0
    //   634: istore 35
    //   636: goto -191 -> 445
    //   639: aload 34
    //   641: getfield 8242	omn:a	Lorm;
    //   644: astore 57
    //   646: aload 28
    //   648: getfield 8242	omn:a	Lorm;
    //   651: astore 58
    //   653: aload 57
    //   655: ifnonnull +8 -> 663
    //   658: aload 58
    //   660: ifnull +159 -> 819
    //   663: aload 57
    //   665: ifnull +8 -> 673
    //   668: aload 58
    //   670: ifnonnull +17 -> 687
    //   673: iconst_0
    //   674: istore 59
    //   676: iload 59
    //   678: ifne +147 -> 825
    //   681: iconst_0
    //   682: istore 35
    //   684: goto -239 -> 445
    //   687: aload 57
    //   689: getfield 8245	orm:b	Ljava/lang/String;
    //   692: aload 58
    //   694: getfield 8245	orm:b	Ljava/lang/String;
    //   697: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   700: ifne +9 -> 709
    //   703: iconst_0
    //   704: istore 59
    //   706: goto -30 -> 676
    //   709: aload 57
    //   711: getfield 8246	orm:a	Ljava/lang/String;
    //   714: aload 58
    //   716: getfield 8246	orm:a	Ljava/lang/String;
    //   719: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   722: ifne +9 -> 731
    //   725: iconst_0
    //   726: istore 59
    //   728: goto -52 -> 676
    //   731: aload 57
    //   733: getfield 8247	orm:c	Ljava/lang/String;
    //   736: aload 58
    //   738: getfield 8247	orm:c	Ljava/lang/String;
    //   741: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   744: ifne +9 -> 753
    //   747: iconst_0
    //   748: istore 59
    //   750: goto -74 -> 676
    //   753: aload 57
    //   755: getfield 8249	orm:d	Ljava/lang/String;
    //   758: aload 58
    //   760: getfield 8249	orm:d	Ljava/lang/String;
    //   763: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   766: ifne +9 -> 775
    //   769: iconst_0
    //   770: istore 59
    //   772: goto -96 -> 676
    //   775: aload 57
    //   777: getfield 8251	orm:f	Ljava/lang/String;
    //   780: aload 58
    //   782: getfield 8251	orm:f	Ljava/lang/String;
    //   785: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   788: ifne +9 -> 797
    //   791: iconst_0
    //   792: istore 59
    //   794: goto -118 -> 676
    //   797: aload 57
    //   799: getfield 8253	orm:e	Ljava/lang/String;
    //   802: aload 58
    //   804: getfield 8253	orm:e	Ljava/lang/String;
    //   807: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   810: ifne +9 -> 819
    //   813: iconst_0
    //   814: istore 59
    //   816: goto -140 -> 676
    //   819: iconst_1
    //   820: istore 59
    //   822: goto -146 -> 676
    //   825: aload 34
    //   827: getfield 8256	omn:f	Lomw;
    //   830: ifnull +39 -> 869
    //   833: aload 28
    //   835: getfield 8256	omn:f	Lomw;
    //   838: ifnull +31 -> 869
    //   841: aload 34
    //   843: getfield 8256	omn:f	Lomw;
    //   846: getfield 8259	omw:b	Ljava/lang/String;
    //   849: aload 28
    //   851: getfield 8256	omn:f	Lomw;
    //   854: getfield 8259	omw:b	Ljava/lang/String;
    //   857: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   860: ifne +9 -> 869
    //   863: iconst_0
    //   864: istore 35
    //   866: goto -421 -> 445
    //   869: aload 34
    //   871: getfield 8256	omn:f	Lomw;
    //   874: ifnull +39 -> 913
    //   877: aload 28
    //   879: getfield 8256	omn:f	Lomw;
    //   882: ifnull +31 -> 913
    //   885: aload 34
    //   887: getfield 8256	omn:f	Lomw;
    //   890: getfield 8260	omw:a	Ljava/lang/String;
    //   893: aload 28
    //   895: getfield 8256	omn:f	Lomw;
    //   898: getfield 8260	omw:a	Ljava/lang/String;
    //   901: invokestatic 6829	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   904: ifne +9 -> 913
    //   907: iconst_0
    //   908: istore 35
    //   910: goto -465 -> 445
    //   913: iconst_1
    //   914: istore 35
    //   916: goto -471 -> 445
    //   919: aload 37
    //   921: getfield 6493	omn:c	I
    //   924: ldc_w 7818
    //   927: if_icmpne +11 -> 938
    //   930: aload 37
    //   932: getfield 8222	omn:b	Ljava/lang/String;
    //   935: ifnull +154 -> 1089
    //   938: aload 37
    //   940: getfield 6493	omn:c	I
    //   943: ldc_w 7818
    //   946: if_icmpeq +74 -> 1020
    //   949: aload 37
    //   951: getfield 6493	omn:c	I
    //   954: invokestatic 8262	efj:k	(I)I
    //   957: istore 43
    //   959: aload 8
    //   961: iload 43
    //   963: invokevirtual 8263	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   966: checkcast 5749	java/lang/String
    //   969: astore 44
    //   971: aload 44
    //   973: ifnonnull +418 -> 1391
    //   976: ldc_w 8192
    //   979: bipush 6
    //   981: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   984: ifeq -494 -> 490
    //   987: ldc_w 8192
    //   990: new 5654	java/lang/StringBuilder
    //   993: dup
    //   994: bipush 41
    //   996: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   999: ldc_w 8265
    //   1002: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1005: iload 43
    //   1007: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1010: invokevirtual 5667	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1013: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1016: pop
    //   1017: goto -527 -> 490
    //   1020: aload 37
    //   1022: getfield 8222	omn:b	Ljava/lang/String;
    //   1025: invokestatic 8267	efj:q	(Ljava/lang/String;)Ljava/lang/String;
    //   1028: astore 38
    //   1030: iconst_1
    //   1031: istore 39
    //   1033: aload 38
    //   1035: astore 40
    //   1037: aload 9
    //   1039: aload 40
    //   1041: invokevirtual 8268	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1044: checkcast 5825	java/lang/Integer
    //   1047: astore 41
    //   1049: aload 41
    //   1051: ifnonnull +9 -> 1060
    //   1054: iconst_0
    //   1055: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1058: astore 41
    //   1060: aload 6
    //   1062: new 6390	jgs
    //   1065: dup
    //   1066: aload 40
    //   1068: iload 39
    //   1070: aload 36
    //   1072: aload 41
    //   1074: invokevirtual 5828	java/lang/Integer:intValue	()I
    //   1077: invokespecial 8271	jgs:<init>	(Ljava/lang/String;ILjava/lang/String;I)V
    //   1080: invokeinterface 6098 2 0
    //   1085: pop
    //   1086: goto -596 -> 490
    //   1089: aload 37
    //   1091: getfield 8242	omn:a	Lorm;
    //   1094: ifnull +128 -> 1222
    //   1097: aload 37
    //   1099: getfield 8242	omn:a	Lorm;
    //   1102: astore 50
    //   1104: aload 50
    //   1106: getfield 8246	orm:a	Ljava/lang/String;
    //   1109: astore 51
    //   1111: aload 51
    //   1113: invokestatic 5834	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1116: ifeq +10 -> 1126
    //   1119: aload 33
    //   1121: getfield 8272	omm:c	Ljava/lang/String;
    //   1124: astore 51
    //   1126: aload 50
    //   1128: getfield 8247	orm:c	Ljava/lang/String;
    //   1131: ifnonnull +11 -> 1142
    //   1134: aload 50
    //   1136: getfield 8246	orm:a	Ljava/lang/String;
    //   1139: ifnull +59 -> 1198
    //   1142: aload 50
    //   1144: getfield 8247	orm:c	Ljava/lang/String;
    //   1147: astore 52
    //   1149: aload 36
    //   1151: ifnonnull +40 -> 1191
    //   1154: aload 50
    //   1156: getfield 8247	orm:c	Ljava/lang/String;
    //   1159: astore 53
    //   1161: aload 5
    //   1163: new 7764	jjd
    //   1166: dup
    //   1167: aload 52
    //   1169: aload 53
    //   1171: aload 51
    //   1173: aload 33
    //   1175: getfield 8273	omm:d	Ljava/lang/String;
    //   1178: iconst_0
    //   1179: invokespecial 8276	jjd:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   1182: invokeinterface 6098 2 0
    //   1187: pop
    //   1188: goto -698 -> 490
    //   1191: aload 36
    //   1193: astore 53
    //   1195: goto -34 -> 1161
    //   1198: ldc_w 8192
    //   1201: bipush 6
    //   1203: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1206: ifeq -716 -> 490
    //   1209: ldc_w 8192
    //   1212: ldc_w 8278
    //   1215: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1218: pop
    //   1219: goto -729 -> 490
    //   1222: aload 37
    //   1224: getfield 8256	omn:f	Lomw;
    //   1227: ifnull +87 -> 1314
    //   1230: aload 37
    //   1232: getfield 8256	omn:f	Lomw;
    //   1235: astore 47
    //   1237: aload_0
    //   1238: ldc_w 8280
    //   1241: invokestatic 5641	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   1244: checkcast 8280	hhh
    //   1247: aload 47
    //   1249: getfield 8259	omw:b	Ljava/lang/String;
    //   1252: invokeinterface 8282 2 0
    //   1257: ifeq +33 -> 1290
    //   1260: aload 7
    //   1262: new 8284	hps
    //   1265: dup
    //   1266: aload 47
    //   1268: getfield 8260	omw:a	Ljava/lang/String;
    //   1271: aload 33
    //   1273: getfield 8223	omm:b	Ljava/lang/String;
    //   1276: iload 24
    //   1278: invokespecial 8287	hps:<init>	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   1281: invokeinterface 6098 2 0
    //   1286: pop
    //   1287: goto -797 -> 490
    //   1290: ldc_w 8192
    //   1293: bipush 6
    //   1295: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1298: ifeq -808 -> 490
    //   1301: ldc_w 8192
    //   1304: ldc_w 8289
    //   1307: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1310: pop
    //   1311: goto -821 -> 490
    //   1314: ldc_w 8192
    //   1317: bipush 6
    //   1319: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1322: ifeq -832 -> 490
    //   1325: ldc_w 8192
    //   1328: ldc_w 8289
    //   1331: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1334: pop
    //   1335: goto -845 -> 490
    //   1338: iinc 31 1
    //   1341: goto -939 -> 402
    //   1344: iinc 27 1
    //   1347: goto -973 -> 374
    //   1350: iinc 21 1
    //   1353: goto -1101 -> 252
    //   1356: new 6380	gnb
    //   1359: dup
    //   1360: aload 5
    //   1362: aload 6
    //   1364: aload 7
    //   1366: invokespecial 8292	gnb:<init>	(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    //   1369: areturn
    //   1370: astore 13
    //   1372: aload 12
    //   1374: astore 10
    //   1376: aload 13
    //   1378: astore 14
    //   1380: goto -869 -> 511
    //   1383: astore 11
    //   1385: aconst_null
    //   1386: astore 12
    //   1388: goto -1195 -> 193
    //   1391: iload 43
    //   1393: istore 39
    //   1395: aload 44
    //   1397: astore 40
    //   1399: goto -362 -> 1037
    //   1402: iconst_0
    //   1403: istore 24
    //   1405: goto -1049 -> 356
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1408	0	paramContext	Context
    //   0	1408	1	paramInt	int
    //   0	1408	2	paramome	ome
    //   0	1408	3	paramBoolean	boolean
    //   16	51	4	localjiw	jiw
    //   25	1336	5	localArrayList1	ArrayList
    //   34	1329	6	localArrayList2	ArrayList
    //   43	1322	7	localArrayList3	ArrayList
    //   52	908	8	localSparseArray	SparseArray
    //   61	977	9	localHashMap	HashMap
    //   64	1311	10	localObject1	Object
    //   1383	1	11	localException1	Exception
    //   79	1308	12	localCursor1	Cursor
    //   1370	7	13	localObject2	Object
    //   509	15	14	localObject3	Object
    //   1378	1	14	localObject4	Object
    //   75	3	16	localCursor2	Cursor
    //   191	1	17	localException2	Exception
    //   242	18	19	arrayOfomf	omf[]
    //   247	10	20	i1	int
    //   250	1101	21	i2	int
    //   264	93	22	localomf	omf
    //   320	208	23	i3	int
    //   354	1050	24	bool	boolean
    //   364	18	25	arrayOfomn	omn[]
    //   369	10	26	i4	int
    //   372	973	27	i5	int
    //   386	508	28	localomn1	omn
    //   392	21	29	arrayOfomm	omm[]
    //   397	13	30	i6	int
    //   400	939	31	i7	int
    //   403	91	32	i8	int
    //   417	855	33	localomm	omm
    //   424	462	34	localomn2	omn
    //   443	472	35	i9	int
    //   455	737	36	str1	String
    //   462	769	37	localomn3	omn
    //   1028	6	38	str2	String
    //   1031	363	39	i10	int
    //   1035	363	40	str3	String
    //   1047	26	41	localInteger	Integer
    //   957	435	43	i11	int
    //   969	427	44	str4	String
    //   1235	32	47	localomw	omw
    //   1102	53	50	localorm1	orm
    //   1109	63	51	str5	String
    //   1147	21	52	str6	String
    //   1159	35	53	str7	String
    //   644	154	57	localorm2	orm
    //   651	152	58	localorm3	orm
    //   674	147	59	i12	int
    //   137	41	60	str8	String
    //   147	22	61	i13	int
    //   158	22	62	i14	int
    // Exception table:
    //   from	to	target	type
    //   81	101	191	java/lang/Exception
    //   110	119	191	java/lang/Exception
    //   119	160	191	java/lang/Exception
    //   166	175	191	java/lang/Exception
    //   175	188	191	java/lang/Exception
    //   66	77	509	finally
    //   81	101	1370	finally
    //   110	119	1370	finally
    //   119	160	1370	finally
    //   166	175	1370	finally
    //   175	188	1370	finally
    //   193	203	1370	finally
    //   66	77	1383	java/lang/Exception
  }
  
  public static gxq a(View paramView, gxq paramgxq)
  {
    if ((paramView instanceof gxs))
    {
      String str = String.valueOf(paramView.getClass().getName());
      throw new IllegalArgumentException(123 + String.valueOf(str).length() + str + " implements VisualElementProvider; this metadata should be added to the result of VisualElementProvider.getVisualElement().");
    }
    paramView.setTag(Fe, paramgxq);
    return paramgxq;
  }
  
  public static hdx a(String paramString, llt paramllt)
  {
    int i1 = paramllt.a;
    hea[] arrayOfhea = new hea[i1];
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfhea[i2] = a(paramString, paramllt.f[i2]);
    }
    return new hdx(paramString, paramllt.b, paramllt.c, paramllt.d, paramllt.e, arrayOfhea);
  }
  
  public static hea a(String paramString, llx paramllx)
  {
    int i1;
    switch (lof.a[paramllx.m.ordinal()])
    {
    default: 
      i1 = heb.a;
    }
    for (;;)
    {
      return new hea(paramString, paramllx.a, paramllx.b, paramllx.c, paramllx.d, paramllx.e, paramllx.f, paramllx.g, paramllx.h, paramllx.i, paramllx.j, i1);
      i1 = heb.b;
      continue;
      i1 = heb.c;
      continue;
      i1 = heb.d;
    }
  }
  
  public static Boolean a(byte paramByte)
  {
    switch (paramByte)
    {
    default: 
      return null;
    case 1: 
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }
  
  public static <T extends CharSequence> T a(T paramT, Object paramObject)
  {
    if (TextUtils.isEmpty(paramT)) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
    return paramT;
  }
  
  public static Integer a(kxg paramkxg)
  {
    switch (lfu.a[paramkxg.ordinal()])
    {
    default: 
      return null;
    case 1: 
      return Integer.valueOf(3);
    case 2: 
      return Integer.valueOf(2);
    case 3: 
      return Integer.valueOf(0);
    case 4: 
      return Integer.valueOf(20);
    case 5: 
      return Integer.valueOf(5);
    }
    return Integer.valueOf(21);
  }
  
  public static <T> T a(T paramT)
  {
    if (paramT == null) {
      throw new NullPointerException("null reference");
    }
    return paramT;
  }
  
  public static <T> T a(Object paramObject, Class<T> paramClass)
  {
    d(paramObject instanceof oyv, "Given component holder does not implement ComponentHolder");
    return paramClass.cast(((oyv)paramObject).a());
  }
  
  /* Error */
  public static <V> V a(java.util.concurrent.Future<V> paramFuture)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokeinterface 8404 1 0
    //   8: astore 4
    //   10: iload_1
    //   11: ifeq +9 -> 20
    //   14: invokestatic 8410	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   17: invokevirtual 8413	java/lang/Thread:interrupt	()V
    //   20: aload 4
    //   22: areturn
    //   23: astore_3
    //   24: iconst_1
    //   25: istore_1
    //   26: goto -24 -> 2
    //   29: astore_2
    //   30: iload_1
    //   31: ifeq +9 -> 40
    //   34: invokestatic 8410	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   37: invokevirtual 8413	java/lang/Thread:interrupt	()V
    //   40: aload_2
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	paramFuture	java.util.concurrent.Future<V>
    //   1	30	1	i1	int
    //   29	12	2	localObject1	Object
    //   23	1	3	localInterruptedException	java.lang.InterruptedException
    //   8	13	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	23	java/lang/InterruptedException
    //   2	10	29	finally
  }
  
  public static String a(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramString;
      arrayOfObject2[1] = Integer.valueOf(paramInt1);
      return b("%s (%s) must not be negative", arrayOfObject2);
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException(26 + "negative size: " + paramInt2);
    }
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    return b("%s (%s) must be less than size (%s)", arrayOfObject1);
  }
  
  public static String a(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(paramLong / 1000.0D);
    return String.format("%.3f seconds", arrayOfObject);
  }
  
  /* Error */
  public static String a(ContentResolver paramContentResolver, Uri paramUri, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 5749	java/lang/String
    //   4: dup
    //   5: iconst_0
    //   6: aload_2
    //   7: aastore
    //   8: astore_3
    //   9: aload_0
    //   10: aload_1
    //   11: aload_3
    //   12: aconst_null
    //   13: aconst_null
    //   14: aconst_null
    //   15: invokevirtual 6542	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   18: astore 8
    //   20: aload 8
    //   22: astore 5
    //   24: aload 5
    //   26: ifnull +42 -> 68
    //   29: aload 5
    //   31: invokeinterface 6547 1 0
    //   36: ifeq +32 -> 68
    //   39: aload 5
    //   41: iconst_0
    //   42: invokeinterface 8199 2 0
    //   47: astore 11
    //   49: aload 11
    //   51: astore 9
    //   53: aload 5
    //   55: ifnull +10 -> 65
    //   58: aload 5
    //   60: invokeinterface 6554 1 0
    //   65: aload 9
    //   67: areturn
    //   68: aconst_null
    //   69: astore 9
    //   71: goto -18 -> 53
    //   74: astore 6
    //   76: aconst_null
    //   77: astore 7
    //   79: aload 7
    //   81: ifnull +10 -> 91
    //   84: aload 7
    //   86: invokeinterface 6554 1 0
    //   91: aconst_null
    //   92: areturn
    //   93: astore 4
    //   95: aconst_null
    //   96: astore 5
    //   98: aload 5
    //   100: ifnull +10 -> 110
    //   103: aload 5
    //   105: invokeinterface 6554 1 0
    //   110: aload 4
    //   112: athrow
    //   113: astore 4
    //   115: goto -17 -> 98
    //   118: astore 10
    //   120: aload 5
    //   122: astore 7
    //   124: goto -45 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	paramContentResolver	ContentResolver
    //   0	127	1	paramUri	Uri
    //   0	127	2	paramString	String
    //   8	4	3	arrayOfString	String[]
    //   93	18	4	localObject1	Object
    //   113	1	4	localObject2	Object
    //   22	99	5	localCursor1	Cursor
    //   74	1	6	localException1	Exception
    //   77	46	7	localCursor2	Cursor
    //   18	3	8	localCursor3	Cursor
    //   51	19	9	str1	String
    //   118	1	10	localException2	Exception
    //   47	3	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   9	20	74	java/lang/Exception
    //   9	20	93	finally
    //   29	49	113	finally
    //   29	49	118	java/lang/Exception
  }
  
  public static String a(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    Object localObject1 = null;
    Cursor localCursor;
    if (paramString != null)
    {
      SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getReadableDatabase();
      String[] arrayOfString1 = { "continuation_token" };
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = a(paramString, paramInt2);
      localCursor = localSQLiteDatabase.query("search", arrayOfString1, "search_key=?", arrayOfString2, null, null, null, null);
    }
    try
    {
      if (localCursor.moveToFirst())
      {
        String str = localCursor.getString(0);
        localObject1 = str;
        return localObject1;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String a(Context paramContext, int paramInt, orn paramorn, ors[] paramArrayOfors)
  {
    Resources localResources2;
    Object localObject1;
    Object localObject2;
    int i5;
    Object localObject3;
    int i8;
    label68:
    String str;
    if (paramInt > 0)
    {
      localResources2 = paramContext.getResources();
      if (paramArrayOfors != null)
      {
        int i3 = paramArrayOfors.length;
        int i4 = 0;
        localObject1 = null;
        localObject2 = null;
        i5 = 0;
        if (i4 < i3)
        {
          localObject3 = paramArrayOfors[i4].b.a;
          if (TextUtils.isEmpty((CharSequence)localObject3)) {
            break label396;
          }
          if (i5 == 0) {}
          for (;;)
          {
            i8 = i5 + 1;
            i4++;
            i5 = i8;
            localObject2 = localObject3;
            break;
            if (i5 != 1) {
              break label389;
            }
            localObject1 = localObject3;
            localObject3 = localObject2;
          }
        }
        if ((i5 == 0) || ((i5 == 1) && (paramInt > 1)))
        {
          int i6 = YQ;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(paramInt);
          str = localResources2.getQuantityString(i6, paramInt, arrayOfObject3);
        }
      }
    }
    for (;;)
    {
      if (str == null)
      {
        if (paramorn == null) {
          break label387;
        }
        if (!TextUtils.isEmpty(paramorn.n)) {
          str = paramorn.n;
        }
      }
      else
      {
        return str;
        int i7 = YS;
        Object[] arrayOfObject4 = new Object[6];
        arrayOfObject4[0] = "COUNT";
        arrayOfObject4[1] = Integer.valueOf(paramInt);
        arrayOfObject4[2] = "PERSON1";
        arrayOfObject4[3] = localObject2;
        arrayOfObject4[4] = "PERSON2";
        arrayOfObject4[5] = localObject1;
        str = a(paramContext, i7, arrayOfObject4);
        continue;
        int i2 = YQ;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(paramInt);
        str = localResources2.getQuantityString(i2, paramInt, arrayOfObject2);
        continue;
      }
      if (!TextUtils.isEmpty(paramorn.l))
      {
        if (!TextUtils.isEmpty(paramorn.m))
        {
          Resources localResources1 = paramContext.getResources();
          int i1 = YT;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = paramorn.m;
          arrayOfObject1[1] = paramorn.l;
          return localResources1.getString(i1, arrayOfObject1);
        }
        return paramorn.l;
      }
      if (!TextUtils.isEmpty(paramorn.m)) {
        return paramorn.m;
      }
      if (!TextUtils.isEmpty(paramorn.k)) {
        return paramorn.k;
      }
      if (!TextUtils.isEmpty(paramorn.j)) {
        return paramorn.j;
      }
      label387:
      return null;
      label389:
      localObject3 = localObject2;
      break;
      label396:
      localObject3 = localObject2;
      i8 = i5;
      break label68;
      str = null;
    }
  }
  
  public static String a(Context paramContext, int paramInt, Object... paramVarArgs)
  {
    return rfb.a(Locale.getDefault(), paramContext.getResources().getString(paramInt), paramVarArgs);
  }
  
  public static String a(Context paramContext, long paramLong)
  {
    if ((System.currentTimeMillis() - paramLong) / 60000L >= 60L) {
      return paramContext.getString(aau.jw);
    }
    return android.text.format.DateFormat.getTimeFormat(paramContext).format(new Date(paramLong));
  }
  
  public static String a(Context paramContext, long paramLong, String paramString, boolean paramBoolean1, TimeZone paramTimeZone, boolean paramBoolean2)
  {
    Date localDate = new Date(paramLong);
    p(paramContext);
    q(paramContext);
    String str6;
    if ((paramLong > Ma) && (paramLong < 86400000L + Ma)) {
      str6 = LU;
    }
    label333:
    for (String str1 = str6;; str1 = null)
    {
      if ((paramTimeZone == null) && (!TextUtils.isEmpty(paramString)))
      {
        paramTimeZone = hxk.a(paramString);
        if (!hxk.a(paramString, paramTimeZone.getID())) {
          paramTimeZone = null;
        }
      }
      if (str1 != null)
      {
        if (paramBoolean1) {}
        for (String str5 = Me;; str5 = Md)
        {
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = str1;
          arrayOfObject2[1] = a(LZ, localDate, paramTimeZone);
          return String.format(str5, arrayOfObject2);
          if ((paramLong > Mb) && (paramLong < 86400000L + Mb))
          {
            str6 = LV;
            break;
          }
          if ((paramLong > Mc) && (paramLong < 86400000L + Mc))
          {
            str6 = LW;
            break;
          }
          if (!paramBoolean2) {
            break label333;
          }
          Calendar localCalendar = Calendar.getInstance();
          if (paramString != null) {
            localCalendar.setTimeZone(hxk.a(paramString));
          }
          localCalendar.setTimeInMillis(paramLong);
          if (Build.VERSION.SDK_INT < 9)
          {
            str6 = null;
            break;
          }
          str6 = localCalendar.getDisplayName(7, 2, Locale.getDefault());
          break;
        }
      }
      String str2 = Mh;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = a(LX, localDate, paramTimeZone);
      arrayOfObject1[1] = a(LZ, localDate, paramTimeZone);
      String str3 = String.format(str2, arrayOfObject1);
      if (paramBoolean1) {}
      for (String str4 = Mf;; str4 = Mg) {
        return String.format(str4, new Object[] { str3 });
      }
    }
  }
  
  public static String a(Context paramContext, long paramLong, TimeZone paramTimeZone)
  {
    p(paramContext);
    Date localDate = new Date(paramLong);
    synchronized (LY)
    {
      TimeZone localTimeZone = LY.getTimeZone();
      LY.setTimeZone(paramTimeZone);
      String str = LY.format(localDate);
      LY.setTimeZone(localTimeZone);
      return str;
    }
  }
  
  public static String a(Context paramContext, Cursor paramCursor)
  {
    Resources localResources = paramContext.getResources();
    int i1 = aau.lm;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(paramCursor.getLong(5));
    arrayOfObject[1] = Integer.valueOf(paramCursor.getInt(11));
    arrayOfObject[2] = Long.valueOf(paramCursor.getLong(5) - paramCursor.getInt(11));
    return localResources.getString(i1, arrayOfObject);
  }
  
  public static String a(Context paramContext, iim paramiim)
  {
    Resources localResources = paramContext.getApplicationContext().getResources();
    String str1 = localResources.getResourcePackageName(NM);
    InputStream localInputStream = localResources.openRawResource(localResources.getIdentifier(paramiim.b, "raw", str1));
    Scanner localScanner = new Scanner(localInputStream, "UTF-8").useDelimiter("\\A");
    if (localScanner.hasNext()) {}
    for (String str2 = localScanner.next();; str2 = "") {
      try
      {
        localInputStream.close();
        return str2;
      }
      catch (IOException localIOException)
      {
        String str3 = String.valueOf(paramiim);
        Log.e("Licenses", 33 + String.valueOf(str3).length() + "Failed to close license text for " + str3);
      }
    }
    return str2;
  }
  
  public static String a(Context paramContext, itd paramitd, long paramLong)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Uri localUri = paramitd.b();
    String[] arrayOfString1 = paramitd.g();
    String str1 = paramitd.a();
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramLong);
    Cursor localCursor = localContentResolver.query(localUri, arrayOfString1, str1, arrayOfString2, null);
    if (localCursor != null) {}
    try
    {
      if (localCursor.moveToFirst())
      {
        String str3 = localCursor.getString(0);
        str2 = str3;
        return str2;
      }
      String str2 = null;
      return null;
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    String str1 = ((kcf)mbb.a(paramContext, kcf.class)).a(paramString1);
    String str2;
    Uri.Builder localBuilder;
    label112:
    kcf localkcf;
    if ((!str1.startsWith("http")) && (!str1.startsWith("//")))
    {
      String str9 = String.valueOf(str1);
      if (str9.length() != 0) {
        str1 = "//".concat(str9);
      }
    }
    else
    {
      Uri localUri = Uri.parse(str1);
      str2 = localUri.getPath();
      localBuilder = localUri.buildUpon();
      localBuilder.scheme("https");
      if (!paramBoolean1) {
        break label163;
      }
      localBuilder.path("batch");
      localkcf = (kcf)mbb.b(paramContext, kcf.class);
      if ((localkcf != null) && (localkcf.c())) {
        break label299;
      }
    }
    label163:
    label299:
    String str3;
    label258:
    do
    {
      return localBuilder.build().toString();
      str1 = new String("//");
      break;
      String str7;
      if (paramBoolean2)
      {
        str7 = String.valueOf(str2);
        if (str7.length() == 0) {
          break label258;
        }
      }
      for (String str8 = "/upload".concat(str7);; str8 = new String("/upload"))
      {
        localBuilder.path(str8);
        if (paramBundle == null) {
          break;
        }
        Iterator localIterator = paramBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str6 = (String)localIterator.next();
          localBuilder.appendQueryParameter(str6, paramBundle.getString(str6));
        }
      }
      if (paramString2.startsWith("/")) {
        paramString2 = paramString2.substring(1);
      }
      localBuilder.appendEncodedPath(paramString2);
      break label112;
      str3 = localkcf.d();
    } while (TextUtils.isEmpty(str3));
    String str4 = localkcf.e();
    for (;;)
    {
      try
      {
        if (!Pattern.compile(str4, 2).matcher(paramString2).find()) {
          break;
        }
        if (!str3.startsWith("email:")) {
          break label412;
        }
        localBuilder.appendQueryParameter("trace", str3);
        if (TextUtils.isEmpty(localkcf.a())) {
          break;
        }
        localBuilder.appendQueryParameter("trace.deb", localkcf.a());
      }
      catch (PatternSyntaxException localPatternSyntaxException)
      {
        Log.e("ApiaryUrls", "Invalid tracing path", localPatternSyntaxException);
      }
      break;
      label412:
      String str5 = String.valueOf(str3);
      if (str5.length() != 0) {
        str3 = "token:".concat(str5);
      } else {
        str3 = new String("token:");
      }
    }
  }
  
  public static String a(Context paramContext, qdc paramqdc, boolean paramBoolean1, TimeZone paramTimeZone, boolean paramBoolean2)
  {
    return a(paramContext, paramqdc.b.longValue(), paramqdc.c, paramBoolean1, paramTimeZone, paramBoolean2);
  }
  
  public static String a(Cursor paramCursor)
  {
    long l1 = paramCursor.getLong(2);
    String str = String.valueOf(android.text.format.DateFormat.format("MM-dd hh:mm:ss", new Date(l1)));
    long l2 = l1 % 1000L;
    return 21 + String.valueOf(str).length() + str + "." + l2;
  }
  
  public static String a(SQLiteDatabase paramSQLiteDatabase, okn paramokn)
  {
    ojf localojf;
    String str5;
    if (paramokn.b(okm.a) != null)
    {
      localojf = ((okm)paramokn.b(okm.a)).b;
      str5 = jrf.a(3, new String[] { jrf.a(null, localojf.g.b, localojf.k.c, 3) });
    }
    try
    {
      String[] arrayOfString3 = new String[3];
      arrayOfString3[0] = str5;
      arrayOfString3[1] = localojf.g.b;
      arrayOfString3[2] = localojf.d;
      String str6 = DatabaseUtils.stringForQuery(paramSQLiteDatabase, "SELECT tile_id FROM all_tiles WHERE view_id = ?  AND owner_id = ?  AND photo_id = ?  AND media_attr & 512 == 0", arrayOfString3);
      return str6;
    }
    catch (SQLiteDoneException localSQLiteDoneException3)
    {
      oif localoif;
      String str3;
      break label295;
    }
    if (paramokn.b(okl.a) != null)
    {
      localoif = ((okl)paramokn.b(okl.a)).b;
      str3 = jrf.a(3, new String[] { jrf.a(null, localoif.e, localoif.b, 3) });
    }
    try
    {
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = str3;
      arrayOfString2[1] = localoif.e;
      String str4 = DatabaseUtils.stringForQuery(paramSQLiteDatabase, "SELECT tile_id FROM all_tiles WHERE view_id = ?  AND owner_id = ?  AND photo_id IS NULL  AND media_attr & 512 == 0", arrayOfString2);
      return str4;
    }
    catch (SQLiteDoneException localSQLiteDoneException2)
    {
      oir localoir;
      String str1;
      break label295;
    }
    if (paramokn.b(okk.a) != null)
    {
      localoir = ((okk)paramokn.b(okk.a)).b;
      str1 = jrf.a(3, new String[] { jrf.a(null, localoir.e.b, localoir.c, 3) });
    }
    try
    {
      String[] arrayOfString1 = new String[2];
      arrayOfString1[0] = str1;
      arrayOfString1[1] = localoir.e.b;
      String str2 = DatabaseUtils.stringForQuery(paramSQLiteDatabase, "SELECT tile_id FROM all_tiles WHERE view_id = ?  AND owner_id = ?  AND photo_id IS NULL  AND media_attr & 512 == 0", arrayOfString1);
      return str2;
    }
    catch (SQLiteDoneException localSQLiteDoneException1) {}
    throw new IllegalArgumentException("Tile must be a known type");
    label295:
    return null;
  }
  
  public static String a(Uri paramUri, String paramString1, String paramString2)
  {
    if (!mfq.b(paramUri)) {
      throw new IllegalArgumentException("Only media store uris are handled");
    }
    if (mfq.c(paramUri)) {
      return m(paramString1);
    }
    return m(paramString2);
  }
  
  public static String a(coq paramcoq)
  {
    String str1 = String.valueOf("~promo:");
    String str2 = String.valueOf(paramcoq.i);
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public static <T extends eyk> String a(T paramT)
  {
    if (paramT == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      a(null, paramT, new StringBuffer(), localStringBuffer);
      return localStringBuffer.toString();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return "Error printing proto: " + localIllegalAccessException.getMessage();
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return "Error printing proto: " + localInvocationTargetException.getMessage();
    }
  }
  
  public static String a(fzk paramfzk)
  {
    switch (paramfzk.e())
    {
    case 0: 
    default: 
      String str2 = String.valueOf(paramfzk.b());
      if (str2.length() != 0) {
        return "x.".concat(str2);
      }
      break;
    case -1: 
      String str1 = String.valueOf(paramfzk.b());
      if (str1.length() != 0) {
        return "f.".concat(str1);
      }
      return new String("f.");
    case 1: 
      return "0";
    case 2: 
      return "v.domain";
    case 3: 
      return "1c";
    case 4: 
      return "1f";
    }
    return new String("x.");
  }
  
  public static String a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return null;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramCharSequence, 0, Math.min(4000, paramCharSequence.length()));
    Linkify.addLinks(localSpannableStringBuilder, 1);
    URLSpan[] arrayOfURLSpan = (URLSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), URLSpan.class);
    if (arrayOfURLSpan.length > 0) {
      return arrayOfURLSpan[0].getURL();
    }
    return null;
  }
  
  public static String a(String paramString, int paramInt)
  {
    String str = String.valueOf("com.google.android.apps.plus.search_key-");
    return 12 + String.valueOf(str).length() + String.valueOf(paramString).length() + str + paramString + "-" + paramInt;
  }
  
  public static String a(String paramString, int paramInt, long paramLong)
  {
    return 34 + String.valueOf(paramString).length() + "~" + paramString + "~" + paramInt + "~" + paramLong;
  }
  
  public static String a(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
    return paramString;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    return String.format(Locale.US, "case when %1$s > %2$s then %1$s else %2$s end", new Object[] { paramString1, paramString2 });
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    boolean bool3;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      boolean bool1 = c("type", paramString1);
      boolean bool2 = c("subtype", paramString2);
      bool3 = c("ID", paramString3);
      if ((!bool1) && (!bool2)) {
        break label155;
      }
      localStringBuilder.append("~typeprefix~");
      if (bool1) {
        localStringBuilder.append(paramString1);
      }
      localStringBuilder.append("~");
      if (bool2) {
        localStringBuilder.append(paramString2);
      }
      localStringBuilder.append("~");
      if (bool3) {
        localStringBuilder.append(paramString3);
      }
    }
    for (;;)
    {
      return mfx.b(localStringBuilder);
      localStringBuilder = new StringBuilder(256);
      break;
      label155:
      if (bool3) {
        localStringBuilder.append(paramString3);
      }
    }
  }
  
  public static String a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, int paramInt, String paramString5)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((!TextUtils.isEmpty(paramString2)) && (paramString2.startsWith("f."))) {
      paramString2 = paramString2.substring(2);
    }
    localStringBuilder.append(paramString2);
    localStringBuilder.append('|');
    localStringBuilder.append(paramString1);
    localStringBuilder.append('|');
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      localStringBuilder.append(i1);
      localStringBuilder.append('|');
      localStringBuilder.append(paramString3);
      localStringBuilder.append('|');
      localStringBuilder.append(paramString4);
      localStringBuilder.append('|');
      localStringBuilder.append(paramInt);
      localStringBuilder.append('|');
      localStringBuilder.append(paramString5);
      return localStringBuilder.toString();
    }
  }
  
  public static String a(java.text.DateFormat paramDateFormat, Date paramDate, TimeZone paramTimeZone)
  {
    TimeZone localTimeZone = paramDateFormat.getTimeZone();
    if (paramTimeZone != null) {
      paramDateFormat.setTimeZone(paramTimeZone);
    }
    String str = paramDateFormat.format(paramDate);
    paramDateFormat.setTimeZone(localTimeZone);
    return str;
  }
  
  public static String a(ArrayList<String> paramArrayList)
  {
    if (paramArrayList.isEmpty()) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!TextUtils.isEmpty(str))
      {
        localStringBuilder.append(str);
        localStringBuilder.append('|');
      }
    }
    if (!TextUtils.isEmpty(localStringBuilder)) {
      localStringBuilder.setLength(-1 + localStringBuilder.length());
    }
    return localStringBuilder.toString();
  }
  
  public static String a(llx paramllx)
  {
    return jrf.a(3, new String[] { jrf.a(null, paramllx.f, paramllx.g, "ALBUM") });
  }
  
  public static String a(orm paramorm)
  {
    if (paramorm == null) {}
    do
    {
      return null;
      if (!TextUtils.isEmpty(paramorm.c))
      {
        String str3 = String.valueOf(paramorm.c);
        if (str3.length() != 0) {
          return "g:".concat(str3);
        }
        return new String("g:");
      }
      if (!TextUtils.isEmpty(paramorm.a))
      {
        String str2 = String.valueOf(paramorm.a);
        if (str2.length() != 0) {
          return "e:".concat(str2);
        }
        return new String("e:");
      }
    } while (TextUtils.isEmpty(paramorm.d));
    String str1 = String.valueOf(paramorm.d);
    if (str1.length() != 0) {
      return "p:".concat(str1);
    }
    return new String("p:");
  }
  
  public static <T extends qat> String a(T paramT)
  {
    if (paramT == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      b(null, paramT, new StringBuffer(), localStringBuffer);
      return localStringBuffer.toString();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      String str2 = String.valueOf(localIllegalAccessException.getMessage());
      if (str2.length() != 0) {
        return "Error printing proto: ".concat(str2);
      }
      return new String("Error printing proto: ");
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      String str1 = String.valueOf(localInvocationTargetException.getMessage());
      if (str1.length() != 0) {
        return "Error printing proto: ".concat(str1);
      }
    }
    return new String("Error printing proto: ");
  }
  
  public static String a(Object... paramVarArgs)
  {
    int i1 = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramVarArgs.length % 2 == 0) {}
    for (int i2 = 1; i2 == 0; i2 = 0) {
      throw new IllegalArgumentException();
    }
    String str = "";
    while (i1 < paramVarArgs.length)
    {
      localStringBuilder.append(str);
      localStringBuilder.append(paramVarArgs[i1]);
      localStringBuilder.append("=");
      localStringBuilder.append(paramVarArgs[(i1 + 1)]);
      str = ", ";
      i1 += 2;
    }
    return localStringBuilder.toString();
  }
  
  public static ByteBuffer a(File paramFile, boolean paramBoolean)
  {
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile.getPath(), "rw");
    try
    {
      FileChannel localFileChannel = localRandomAccessFile.getChannel();
      MappedByteBuffer localMappedByteBuffer = localFileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, localFileChannel.size());
      if (paramBoolean) {
        paramFile.setLastModified(System.currentTimeMillis());
      }
      ByteBuffer localByteBuffer = (ByteBuffer)localMappedByteBuffer.position(0);
      return localByteBuffer;
    }
    finally
    {
      localRandomAccessFile.close();
    }
  }
  
  public static ArrayList<jgs> a(Context paramContext, int paramInt, ArrayList<String> paramArrayList)
  {
    List localList = ((jiw)mbb.a(paramContext, jiw.class)).a(paramInt, jgx.a);
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = c(localList);
    int i1 = paramArrayList.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      String str1 = (String)paramArrayList.get(i2);
      String str2 = (String)localHashMap.get(str1);
      if (!TextUtils.isEmpty(str2)) {
        localArrayList.add(new jgs(str1, 0, str2, 0));
      }
    }
    return localArrayList;
  }
  
  /* Error */
  public static List<gnb> a(Context paramContext, int paramInt, qwr[] paramArrayOfqwr)
  {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: istore_3
    //   3: aload_2
    //   4: ifnonnull +9 -> 13
    //   7: iload_3
    //   8: ifne +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: aload_0
    //   14: ldc_w 8178
    //   17: invokestatic 5641	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   20: checkcast 8178	jiw
    //   23: astore 4
    //   25: new 8180	android/util/SparseArray
    //   28: dup
    //   29: invokespecial 8181	android/util/SparseArray:<init>	()V
    //   32: astore 5
    //   34: new 8183	java/util/HashMap
    //   37: dup
    //   38: invokespecial 8184	java/util/HashMap:<init>	()V
    //   41: astore 6
    //   43: aconst_null
    //   44: astore 7
    //   46: aload 4
    //   48: iload_1
    //   49: iconst_5
    //   50: invokeinterface 8187 3 0
    //   55: astore 13
    //   57: aload 13
    //   59: astore 9
    //   61: aload 9
    //   63: invokeinterface 8190 1 0
    //   68: ifne +22 -> 90
    //   71: ldc_w 8192
    //   74: ldc_w 8194
    //   77: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   80: pop
    //   81: aload 9
    //   83: invokeinterface 6554 1 0
    //   88: aconst_null
    //   89: areturn
    //   90: aload 9
    //   92: iconst_m1
    //   93: invokeinterface 8198 2 0
    //   98: pop
    //   99: aload 9
    //   101: invokeinterface 6547 1 0
    //   106: ifeq +91 -> 197
    //   109: aload 9
    //   111: iconst_1
    //   112: invokeinterface 8199 2 0
    //   117: astore 54
    //   119: aload 9
    //   121: iconst_4
    //   122: invokeinterface 6839 2 0
    //   127: istore 55
    //   129: aload 9
    //   131: bipush 6
    //   133: invokeinterface 6839 2 0
    //   138: istore 56
    //   140: iload 55
    //   142: iconst_1
    //   143: if_icmpeq +12 -> 155
    //   146: aload 5
    //   148: iload 55
    //   150: aload 54
    //   152: invokevirtual 8201	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   155: aload 6
    //   157: aload 54
    //   159: iload 56
    //   161: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: invokevirtual 8203	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   167: pop
    //   168: goto -69 -> 99
    //   171: astore 14
    //   173: ldc_w 8192
    //   176: ldc_w 8194
    //   179: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   182: pop
    //   183: aload 9
    //   185: ifnull +10 -> 195
    //   188: aload 9
    //   190: invokeinterface 6554 1 0
    //   195: aconst_null
    //   196: areturn
    //   197: aload 9
    //   199: invokeinterface 6554 1 0
    //   204: new 6067	java/util/ArrayList
    //   207: dup
    //   208: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   211: astore 16
    //   213: iconst_0
    //   214: istore 17
    //   216: iload 17
    //   218: iconst_5
    //   219: if_icmpge +732 -> 951
    //   222: iload 17
    //   224: iload_3
    //   225: if_icmpge +726 -> 951
    //   228: aload_2
    //   229: iload 17
    //   231: aaload
    //   232: ifnull +713 -> 945
    //   235: new 6067	java/util/ArrayList
    //   238: dup
    //   239: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   242: astore 18
    //   244: new 6067	java/util/ArrayList
    //   247: dup
    //   248: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   251: astore 19
    //   253: new 6067	java/util/ArrayList
    //   256: dup
    //   257: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   260: astore 20
    //   262: new 6067	java/util/ArrayList
    //   265: dup
    //   266: invokespecial 6068	java/util/ArrayList:<init>	()V
    //   269: astore 21
    //   271: aload_2
    //   272: iload 17
    //   274: aaload
    //   275: getfield 9003	qwr:a	Lome;
    //   278: astore 22
    //   280: aload 22
    //   282: ifnull +663 -> 945
    //   285: aload 22
    //   287: getfield 8206	ome:c	[Lomm;
    //   290: ifnull +588 -> 878
    //   293: aload 22
    //   295: getfield 8206	ome:c	[Lomm;
    //   298: astore 26
    //   300: aload 26
    //   302: arraylength
    //   303: istore 27
    //   305: iconst_0
    //   306: istore 28
    //   308: iload 28
    //   310: iload 27
    //   312: if_icmpge +566 -> 878
    //   315: aload 26
    //   317: iload 28
    //   319: aaload
    //   320: astore 29
    //   322: aload_2
    //   323: iload 17
    //   325: aaload
    //   326: getfield 9005	qwr:b	Ljava/lang/Boolean;
    //   329: invokevirtual 6127	java/lang/Boolean:booleanValue	()Z
    //   332: istore 30
    //   334: iconst_0
    //   335: istore 31
    //   337: iload 30
    //   339: ifeq +6 -> 345
    //   342: iconst_1
    //   343: istore 31
    //   345: aload 29
    //   347: getfield 8223	omm:b	Ljava/lang/String;
    //   350: astore 32
    //   352: aload 29
    //   354: getfield 8221	omm:a	Lomn;
    //   357: astore 33
    //   359: aload 33
    //   361: ifnonnull +47 -> 408
    //   364: ldc_w 8192
    //   367: bipush 6
    //   369: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   372: ifeq +13 -> 385
    //   375: ldc_w 8192
    //   378: ldc_w 8225
    //   381: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   384: pop
    //   385: iinc 28 1
    //   388: goto -80 -> 308
    //   391: astore 11
    //   393: aload 7
    //   395: ifnull +10 -> 405
    //   398: aload 7
    //   400: invokeinterface 6554 1 0
    //   405: aload 11
    //   407: athrow
    //   408: aload 33
    //   410: getfield 6493	omn:c	I
    //   413: ldc_w 7818
    //   416: if_icmpne +11 -> 427
    //   419: aload 33
    //   421: getfield 8222	omn:b	Ljava/lang/String;
    //   424: ifnull +154 -> 578
    //   427: aload 33
    //   429: getfield 6493	omn:c	I
    //   432: ldc_w 7818
    //   435: if_icmpeq +74 -> 509
    //   438: aload 33
    //   440: getfield 6493	omn:c	I
    //   443: invokestatic 8262	efj:k	(I)I
    //   446: istore 39
    //   448: aload 5
    //   450: iload 39
    //   452: invokevirtual 8263	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   455: checkcast 5749	java/lang/String
    //   458: astore 40
    //   460: aload 40
    //   462: ifnonnull +513 -> 975
    //   465: ldc_w 8192
    //   468: bipush 6
    //   470: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   473: ifeq -88 -> 385
    //   476: ldc_w 8192
    //   479: new 5654	java/lang/StringBuilder
    //   482: dup
    //   483: bipush 41
    //   485: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   488: ldc_w 8265
    //   491: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   494: iload 39
    //   496: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   499: invokevirtual 5667	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   502: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   505: pop
    //   506: goto -121 -> 385
    //   509: aload 33
    //   511: getfield 8222	omn:b	Ljava/lang/String;
    //   514: invokestatic 8267	efj:q	(Ljava/lang/String;)Ljava/lang/String;
    //   517: astore 34
    //   519: iconst_1
    //   520: istore 35
    //   522: aload 34
    //   524: astore 36
    //   526: aload 6
    //   528: aload 36
    //   530: invokevirtual 8268	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   533: checkcast 5825	java/lang/Integer
    //   536: astore 37
    //   538: aload 37
    //   540: ifnonnull +9 -> 549
    //   543: iconst_0
    //   544: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   547: astore 37
    //   549: aload 19
    //   551: new 6390	jgs
    //   554: dup
    //   555: aload 36
    //   557: iload 35
    //   559: aload 32
    //   561: aload 37
    //   563: invokevirtual 5828	java/lang/Integer:intValue	()I
    //   566: invokespecial 8271	jgs:<init>	(Ljava/lang/String;ILjava/lang/String;I)V
    //   569: invokeinterface 6098 2 0
    //   574: pop
    //   575: goto -190 -> 385
    //   578: aload 33
    //   580: getfield 8242	omn:a	Lorm;
    //   583: ifnull +128 -> 711
    //   586: aload 33
    //   588: getfield 8242	omn:a	Lorm;
    //   591: astore 47
    //   593: aload 47
    //   595: getfield 8246	orm:a	Ljava/lang/String;
    //   598: astore 48
    //   600: aload 48
    //   602: invokestatic 5834	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   605: ifeq +10 -> 615
    //   608: aload 29
    //   610: getfield 8272	omm:c	Ljava/lang/String;
    //   613: astore 48
    //   615: aload 47
    //   617: getfield 8247	orm:c	Ljava/lang/String;
    //   620: ifnonnull +11 -> 631
    //   623: aload 47
    //   625: getfield 8246	orm:a	Ljava/lang/String;
    //   628: ifnull +59 -> 687
    //   631: aload 47
    //   633: getfield 8247	orm:c	Ljava/lang/String;
    //   636: astore 49
    //   638: aload 32
    //   640: ifnonnull +40 -> 680
    //   643: aload 47
    //   645: getfield 8247	orm:c	Ljava/lang/String;
    //   648: astore 50
    //   650: aload 18
    //   652: new 7764	jjd
    //   655: dup
    //   656: aload 49
    //   658: aload 50
    //   660: aload 48
    //   662: aload 29
    //   664: getfield 8273	omm:d	Ljava/lang/String;
    //   667: iconst_0
    //   668: invokespecial 8276	jjd:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   671: invokeinterface 6098 2 0
    //   676: pop
    //   677: goto -292 -> 385
    //   680: aload 32
    //   682: astore 50
    //   684: goto -34 -> 650
    //   687: ldc_w 8192
    //   690: bipush 6
    //   692: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   695: ifeq -310 -> 385
    //   698: ldc_w 8192
    //   701: ldc_w 8278
    //   704: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   707: pop
    //   708: goto -323 -> 385
    //   711: aload 33
    //   713: getfield 8256	omn:f	Lomw;
    //   716: ifnull +87 -> 803
    //   719: aload 33
    //   721: getfield 8256	omn:f	Lomw;
    //   724: astore 44
    //   726: aload_0
    //   727: ldc_w 8280
    //   730: invokestatic 5641	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   733: checkcast 8280	hhh
    //   736: aload 44
    //   738: getfield 8259	omw:b	Ljava/lang/String;
    //   741: invokeinterface 8282 2 0
    //   746: ifeq +33 -> 779
    //   749: aload 20
    //   751: new 8284	hps
    //   754: dup
    //   755: aload 44
    //   757: getfield 8260	omw:a	Ljava/lang/String;
    //   760: aload 29
    //   762: getfield 8223	omm:b	Ljava/lang/String;
    //   765: iload 31
    //   767: invokespecial 8287	hps:<init>	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   770: invokeinterface 6098 2 0
    //   775: pop
    //   776: goto -391 -> 385
    //   779: ldc_w 8192
    //   782: bipush 6
    //   784: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   787: ifeq -402 -> 385
    //   790: ldc_w 8192
    //   793: ldc_w 8289
    //   796: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   799: pop
    //   800: goto -415 -> 385
    //   803: aload 33
    //   805: getfield 8236	omn:d	Lomo;
    //   808: ifnull +46 -> 854
    //   811: aload 21
    //   813: new 9007	lhp
    //   816: dup
    //   817: aload 33
    //   819: getfield 8236	omn:d	Lomo;
    //   822: getfield 8239	omo:a	Ljava/lang/String;
    //   825: aload 29
    //   827: getfield 8223	omm:b	Ljava/lang/String;
    //   830: aload 29
    //   832: getfield 9008	omm:e	Ljava/lang/String;
    //   835: aload 29
    //   837: getfield 9008	omm:e	Ljava/lang/String;
    //   840: iload 31
    //   842: invokespecial 9009	lhp:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   845: invokeinterface 6098 2 0
    //   850: pop
    //   851: goto -466 -> 385
    //   854: ldc_w 8192
    //   857: bipush 6
    //   859: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   862: ifeq -477 -> 385
    //   865: ldc_w 8192
    //   868: ldc_w 8289
    //   871: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   874: pop
    //   875: goto -490 -> 385
    //   878: iconst_0
    //   879: istore 23
    //   881: aload 19
    //   883: invokeinterface 6074 1 0
    //   888: astore 24
    //   890: aload 24
    //   892: invokeinterface 6079 1 0
    //   897: ifeq +24 -> 921
    //   900: iload 23
    //   902: aload 24
    //   904: invokeinterface 6082 1 0
    //   909: checkcast 6390	jgs
    //   912: getfield 9010	jgs:d	I
    //   915: iadd
    //   916: istore 23
    //   918: goto -28 -> 890
    //   921: aload 16
    //   923: new 6380	gnb
    //   926: dup
    //   927: aconst_null
    //   928: aload 19
    //   930: aload 21
    //   932: aload 20
    //   934: iload 23
    //   936: invokespecial 9013	gnb:<init>	(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V
    //   939: invokeinterface 6098 2 0
    //   944: pop
    //   945: iinc 17 1
    //   948: goto -732 -> 216
    //   951: aload 16
    //   953: areturn
    //   954: astore 10
    //   956: aload 9
    //   958: astore 7
    //   960: aload 10
    //   962: astore 11
    //   964: goto -571 -> 393
    //   967: astore 8
    //   969: aconst_null
    //   970: astore 9
    //   972: goto -799 -> 173
    //   975: iload 39
    //   977: istore 35
    //   979: aload 40
    //   981: astore 36
    //   983: goto -457 -> 526
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	986	0	paramContext	Context
    //   0	986	1	paramInt	int
    //   0	986	2	paramArrayOfqwr	qwr[]
    //   2	224	3	i1	int
    //   23	24	4	localjiw	jiw
    //   32	417	5	localSparseArray	SparseArray
    //   41	486	6	localHashMap	HashMap
    //   44	915	7	localObject1	Object
    //   967	1	8	localException1	Exception
    //   59	912	9	localCursor1	Cursor
    //   954	7	10	localObject2	Object
    //   391	15	11	localObject3	Object
    //   962	1	11	localObject4	Object
    //   55	3	13	localCursor2	Cursor
    //   171	1	14	localException2	Exception
    //   211	741	16	localArrayList1	ArrayList
    //   214	732	17	i2	int
    //   242	409	18	localArrayList2	ArrayList
    //   251	678	19	localArrayList3	ArrayList
    //   260	673	20	localArrayList4	ArrayList
    //   269	662	21	localArrayList5	ArrayList
    //   278	16	22	localome	ome
    //   879	56	23	i3	int
    //   888	15	24	localIterator	Iterator
    //   298	18	26	arrayOfomm	omm[]
    //   303	10	27	i4	int
    //   306	80	28	i5	int
    //   320	516	29	localomm	omm
    //   332	6	30	bool1	boolean
    //   335	506	31	bool2	boolean
    //   350	331	32	str1	String
    //   357	461	33	localomn	omn
    //   517	6	34	str2	String
    //   520	458	35	i6	int
    //   524	458	36	str3	String
    //   536	26	37	localInteger	Integer
    //   446	530	39	i7	int
    //   458	522	40	str4	String
    //   724	32	44	localomw	omw
    //   591	53	47	localorm	orm
    //   598	63	48	str5	String
    //   636	21	49	str6	String
    //   648	35	50	str7	String
    //   117	41	54	str8	String
    //   127	22	55	i8	int
    //   138	22	56	i9	int
    // Exception table:
    //   from	to	target	type
    //   61	81	171	java/lang/Exception
    //   90	99	171	java/lang/Exception
    //   99	140	171	java/lang/Exception
    //   146	155	171	java/lang/Exception
    //   155	168	171	java/lang/Exception
    //   46	57	391	finally
    //   61	81	954	finally
    //   90	99	954	finally
    //   99	140	954	finally
    //   146	155	954	finally
    //   155	168	954	finally
    //   173	183	954	finally
    //   46	57	967	java/lang/Exception
  }
  
  public static List<isy> a(Context paramContext, itd paramitd, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      try
      {
        Cursor localCursor2 = paramContext.getContentResolver().query(paramitd.b(), paramitd.e(), paramitd.d(), new String[] { paramString }, null);
        localCursor1 = localCursor2;
        if (localCursor1 == null) {}
      }
      finally
      {
        Cursor localCursor1 = null;
        continue;
      }
      try
      {
        if (localCursor1.moveToNext())
        {
          int i1 = localCursor1.getInt(0);
          Uri.Builder localBuilder = paramitd.b().buildUpon();
          localBuilder.appendPath(String.valueOf(i1));
          localArrayList.add(new isy(paramitd, i1, localBuilder.build()));
        }
      }
      finally
      {
        if (localCursor1 != null) {
          localCursor1.close();
        }
      }
    }
    return localArrayList;
  }
  
  public static Executor a(Executor paramExecutor, pgp<?> parampgp)
  {
    if (paramExecutor == null) {
      throw new NullPointerException();
    }
    if (parampgp == null) {
      throw new NullPointerException();
    }
    if (paramExecutor == pii.a) {
      return paramExecutor;
    }
    return new pig(paramExecutor, parampgp);
  }
  
  public static jdb a(Context paramContext, int paramInt, String paramString, String[] paramArrayOfString)
  {
    return new jdb(a(paramContext, paramInt, jdg.a, paramString, paramArrayOfString, "sort_version DESC"));
  }
  
  public static jdb a(Context paramContext, int paramInt, Collection<String> paramCollection)
  {
    return a(paramContext, paramInt, (String[])paramCollection.toArray(new String[paramCollection.size()]));
  }
  
  public static jdb a(Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    return a(paramContext, paramInt, b("key", paramArrayOfString.length), paramArrayOfString);
  }
  
  public static kbd a(RandomAccessFile paramRandomAccessFile)
  {
    long l1 = 0L;
    long l2 = paramRandomAccessFile.length() - 22L;
    if (l2 < l1) {
      throw new ZipException("File too short to be a zip file: " + paramRandomAccessFile.length());
    }
    long l3 = l2 - 65536L;
    if (l3 < l1) {}
    for (;;)
    {
      int i1 = Integer.reverseBytes(101010256);
      long l4 = l2;
      do
      {
        paramRandomAccessFile.seek(l4);
        if (paramRandomAccessFile.readInt() == i1) {
          break;
        }
        l4 -= 1L;
      } while (l4 >= l1);
      throw new ZipException("End Of Central Directory signature not found");
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      kbd localkbd = new kbd();
      localkbd.b = (0xFFFFFFFF & Integer.reverseBytes(paramRandomAccessFile.readInt()));
      localkbd.a = (0xFFFFFFFF & Integer.reverseBytes(paramRandomAccessFile.readInt()));
      return localkbd;
      l1 = l3;
    }
  }
  
  public static kbw a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    if (jrf.n(paramString2))
    {
      String str = jrf.d(paramString2);
      return new bkv(paramContext, paramInt, paramString1, jrf.a(3, new String[] { jrf.a(null, paramString1, str, "ALBUM") }), str, paramString4, 0, false);
    }
    return new bhx(paramContext, paramInt, paramString2, paramString3, paramString4, false);
  }
  
  public static kbw a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Must specify non-null cluster ID");
    }
    String[] arrayOfString = paramString1.split(":", 2);
    if (arrayOfString[0].equals("best"))
    {
      if (Log.isLoggable("EsTileData", 3))
      {
        String str5 = String.valueOf(paramString1);
        if (str5.length() == 0) {
          break label83;
        }
        "[GET_REFRESH_OP] best photos op; cluster: ".concat(str5);
      }
      for (;;)
      {
        return new bjq(paramContext, paramInt, null, paramString2);
        label83:
        new String("[GET_REFRESH_OP] best photos op; cluster: ");
      }
    }
    if (arrayOfString[0].equals("trash"))
    {
      if (Log.isLoggable("EsTileData", 3))
      {
        String str4 = String.valueOf(paramString1);
        if (str4.length() == 0) {
          break label156;
        }
        "[GET_REFRESH_OP] trash photos op; cluster: ".concat(str4);
      }
      for (;;)
      {
        return new bmj(paramContext, paramInt, paramString2, paramBoolean);
        label156:
        new String("[GET_REFRESH_OP] trash photos op; cluster: ");
      }
    }
    if (arrayOfString[0].equals("all"))
    {
      if (Log.isLoggable("EsTileData", 3))
      {
        String str3 = String.valueOf(paramString1);
        if (str3.length() == 0) {
          break label227;
        }
        "[GET_REFRESH_OP] all photos op; cluster: ".concat(str3);
      }
      for (;;)
      {
        return new bhr(paramContext, paramInt, paramString2);
        label227:
        new String("[GET_REFRESH_OP] all photos op; cluster: ");
      }
    }
    if (arrayOfString[0].equals("album"))
    {
      if (Log.isLoggable("EsTileData", 3))
      {
        String str2 = String.valueOf(paramString1);
        if (str2.length() == 0) {
          break label303;
        }
        "[GET_REFRESH_OP] collection op; cluster: ".concat(str2);
      }
      for (;;)
      {
        return new bhx(paramContext, paramInt, paramString1, paramString3, paramString2, paramBoolean);
        label303:
        new String("[GET_REFRESH_OP] collection op; cluster: ");
      }
    }
    if (Log.isLoggable("EsTileData", 3))
    {
      String str1 = String.valueOf(arrayOfString[0]);
      new StringBuilder(47 + String.valueOf(str1).length() + String.valueOf(paramString1).length()).append("[GET_REFRESH_OP] no op found; view: ").append(str1).append(", cluster: ").append(paramString1);
    }
    return null;
  }
  
  public static knq a(Bundle paramBundle, knw paramknw)
  {
    if (paramBundle == null) {
      throw new NullPointerException("Content deep-link metadata must not be null.");
    }
    if (Log.isLoggable("ApiaryActivityFactory", 3)) {
      paramBundle.toString();
    }
    knq localknq = new knq();
    try
    {
      localknq.b = paramBundle;
      localknq.b();
      if (paramknw != null) {
        localknq.c = paramknw;
      }
      return localknq;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public static knq a(oln paramoln)
  {
    if (paramoln == null) {
      throw new NullPointerException("");
    }
    if (Log.isLoggable("ApiaryActivityFactory", 3)) {
      paramoln.toString();
    }
    if (!paramoln.a.booleanValue()) {
      return null;
    }
    if ((paramoln.b == null) || (paramoln.b.length == 0)) {
      throw new IllegalArgumentException("Media layout must be specified");
    }
    Object localObject;
    switch (paramoln.b[0].a)
    {
    default: 
      return null;
    case 1: 
      localObject = new kns();
    }
    for (;;)
    {
      try
      {
        ((knq)localObject).a = paramoln;
        ((knq)localObject).b();
        return localObject;
      }
      catch (IOException localIOException) {}
      localObject = new knv();
      continue;
      localObject = new knu();
      continue;
      localObject = new knu();
      continue;
      localObject = new knt();
    }
    return null;
  }
  
  public static mhu a(kcg paramkcg, Context paramContext)
  {
    mhu localmhu = new mhu();
    if (paramkcg.b != null) {
      localmhu.a = paramkcg.b;
    }
    hpy localhpy;
    if (paramContext != null)
    {
      localhpy = (hpy)mbb.b(paramContext, hpy.class);
      if (localhpy == null) {}
    }
    for (String str = localhpy.a();; str = null)
    {
      localmhu.b = str;
      return localmhu;
    }
  }
  
  public static nvv a(nvv[] paramArrayOfnvv)
  {
    if (paramArrayOfnvv == null) {}
    for (;;)
    {
      return null;
      int i1 = paramArrayOfnvv.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        nvv localnvv = paramArrayOfnvv[i2];
        if ((localnvv.b != null) && (localnvv.c != null))
        {
          if (TextUtils.isEmpty(localnvv.f)) {
            localnvv.f = null;
          }
          return localnvv;
        }
      }
    }
  }
  
  public static oih a(byte[] paramArrayOfByte)
  {
    try
    {
      oih localoih = (oih)qat.b(new oih(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localoih;
    }
    catch (qas localqas)
    {
      Log.e("ProtoPacker", "Failed to deserialize EditInfo.", localqas);
    }
    return null;
  }
  
  public static okn a(SQLiteDatabase paramSQLiteDatabase, hea paramhea, oir paramoir)
  {
    boolean bool1 = true;
    if ((paramhea == null) || (paramhea.f == 0L) || (paramhea.d == null) || (paramhea.c == null))
    {
      Log.e("EsTileData", "Invalid DbEmbedMedia object; cannot insert into the database");
      return null;
    }
    ojv localojv = new ojv();
    localojv.b = paramhea.d;
    ojd localojd = new ojd();
    if (paramhea.h != 0) {
      localojd.c = Integer.valueOf(paramhea.h);
    }
    if (paramhea.g != 0) {
      localojd.b = Integer.valueOf(paramhea.g);
    }
    if (paramhea.c != null) {
      localojd.a = E(paramhea.c);
    }
    ojf localojf = new ojf();
    localojf.k = paramoir;
    localojf.d = String.valueOf(paramhea.f);
    localojf.a = localojd;
    localojf.g = localojv;
    localojf.c = paramhea.b;
    boolean bool2;
    if (paramhea.i == heb.d)
    {
      bool2 = bool1;
      localojf.L = Boolean.valueOf(bool2);
      if (paramhea.i != heb.c) {
        break label324;
      }
    }
    for (;;)
    {
      localojf.A = Boolean.valueOf(bool1);
      if (paramhea.i == heb.b) {
        localojf.l = new ojx();
      }
      okm localokm = new okm();
      localokm.b = localojf;
      okn localokn = new okn();
      localokn.j = 4;
      localokn.a(okm.a, localokm);
      localokn.e = localojd;
      String str = a(paramSQLiteDatabase, localokn);
      if (str == null) {
        str = jrf.a(localokn);
      }
      localokn.a = str;
      return localokn;
      bool2 = false;
      break;
      label324:
      bool1 = false;
    }
  }
  
  public static okn a(String paramString, long paramLong)
  {
    okn localokn = new okn();
    localokn.a = "~more";
    localokn.j = 101;
    localokn.b = Long.toString(paramLong);
    localokn.e = null;
    localokn.d = jrf.a(3, new String[] { paramString });
    return localokn;
  }
  
  public static omk a(gnb paramgnb1, gnb paramgnb2)
  {
    omn[] arrayOfomn1 = c(paramgnb1);
    omn[] arrayOfomn2 = c(paramgnb2);
    if (arrayOfomn2.length > 1) {
      throw new IllegalArgumentException("restrictAudience");
    }
    omk localomk = new omk();
    localomk.a = arrayOfomn1;
    if (arrayOfomn2.length == 1) {}
    for (omn localomn = arrayOfomn2[0];; localomn = null)
    {
      localomk.b = localomn;
      return localomk;
    }
  }
  
  public static pej a(aip paramaip, View paramView)
  {
    List localList = (List)paramView.getTag(pek.a);
    if (localList == null) {
      localList = Collections.emptyList();
    }
    pej localpej1 = pej.b;
    Iterator localIterator = localList.iterator();
    pej localpej2 = localpej1;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        pej localpej3 = ((pei)localIterator.next()).a(paramaip);
        if (localpej3 == null) {
          throw new NullPointerException();
        }
        localpej2 = (pej)localpej3;
        if (localpej2 != pej.a) {}
      }
      else
      {
        return localpej2;
      }
      if (localpej2 != pej.b) {
        paramaip = localpej2.c;
      }
    }
  }
  
  public static <I, O> pic<O> a(pic<I> parampic, Callable<O> paramCallable, Executor paramExecutor)
  {
    pid localpid = new pid(paramCallable);
    parampic.a(localpid, paramExecutor);
    localpid.a(new ova(localpid, parampic), pii.a);
    return localpid;
  }
  
  public static pif a(ScheduledExecutorService paramScheduledExecutorService)
  {
    if ((paramScheduledExecutorService instanceof pif)) {
      return (pif)paramScheduledExecutorService;
    }
    return new pik(paramScheduledExecutorService);
  }
  
  public static <T extends pzd> T a(Bundle paramBundle, String paramString, T paramT, pxz parampxz)
  {
    try
    {
      pzd localpzd = ((owu)paramBundle.getParcelable(paramString)).a(paramT.n(), parampxz);
      return localpzd;
    }
    catch (pyw localpyw)
    {
      throw new RuntimeException(localpyw);
    }
  }
  
  public static <T extends pzd> T a(byte[] paramArrayOfByte, T paramT, pxz parampxz)
  {
    try
    {
      pzd localpzd = paramT.l().a(paramArrayOfByte, parampxz).f();
      return localpzd;
    }
    catch (pyw localpyw)
    {
      throw new RuntimeException(localpyw);
    }
  }
  
  public static qml a(FilterParameter paramFilterParameter)
  {
    int i1 = 1;
    switch (paramFilterParameter.getFilterType())
    {
    case 18: 
    default: 
      return null;
    case 7: 
      qlx localqlx = new qlx();
      localqlx.d = Integer.valueOf(paramFilterParameter.getParameterInteger(241));
      localqlx.b = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      localqlx.c = Float.valueOf(paramFilterParameter.getParameterInteger(i1) / 100.0F);
      localqlx.e = Float.valueOf(paramFilterParameter.getParameterInteger(14) / 100.0F);
      qml localqml18 = new qml();
      localqml18.a(qlx.a, localqlx);
      return localqml18;
    case 107: 
      qly localqly = new qly();
      localqly.e = new qmz();
      localqly.b = Float.valueOf(paramFilterParameter.getParameterInteger(19) / 100.0F);
      localqly.j = Float.valueOf(paramFilterParameter.getParameterInteger(17) / 100.0F);
      localqly.c = Float.valueOf(paramFilterParameter.getParameterInteger(6) / 100.0F);
      localqly.e.a = Float.valueOf(paramFilterParameter.getParameterFloat(24));
      localqly.e.b = Float.valueOf(paramFilterParameter.getParameterFloat(25));
      localqly.h = Float.valueOf(paramFilterParameter.getParameterInteger(202) / 100.0F);
      localqly.i = Float.valueOf(paramFilterParameter.getParameterInteger(203) / 100.0F);
      localqly.d = Integer.valueOf(paramFilterParameter.getParameterInteger(3));
      localqly.g = Integer.valueOf(paramFilterParameter.getParameterInteger(204));
      localqly.f = Float.valueOf(paramFilterParameter.getParameterFloat(18));
      qml localqml17 = new qml();
      localqml17.a(qly.a, localqly);
      return localqml17;
    case 22: 
      if (paramFilterParameter.getFilterType() != 22) {
        return null;
      }
      qlz localqlz = new qlz();
      localqlz.b = new qma[paramFilterParameter.getSubParameters().size()];
      Iterator localIterator = paramFilterParameter.getSubParameters().iterator();
      int i5 = 0;
      if (localIterator.hasNext())
      {
        FilterParameter localFilterParameter2 = (FilterParameter)localIterator.next();
        if (localFilterParameter2.getFilterType() != 402) {
          return null;
        }
        qma localqma = new qma();
        localqma.a = new byte[localFilterParameter2.getParameterBuffer(913).length];
        System.arraycopy(localFilterParameter2.getParameterBuffer(913), 0, localqma.a, 0, localqma.a.length);
        localqma.b = Integer.valueOf(localFilterParameter2.getParameterInteger(901));
        localqma.c = Integer.valueOf(localFilterParameter2.getParameterInteger(911));
        localqma.d = Float.valueOf(localFilterParameter2.getParameterFloat(912));
        localqma.e = Float.valueOf(localFilterParameter2.getParameterFloat(915));
        if (localFilterParameter2.getParameterInteger(916) != 0) {}
        int i7;
        for (int i6 = i1;; i7 = 0)
        {
          localqma.f = Boolean.valueOf(i6);
          localqma.g = Float.valueOf(localFilterParameter2.getParameterFloat(921));
          qma[] arrayOfqma = localqlz.b;
          int i8 = i5 + 1;
          arrayOfqma[i5] = localqma;
          i5 = i8;
          break;
        }
      }
      qml localqml16 = new qml();
      localqml16.a(qlz.a, localqlz);
      return localqml16;
    case 11: 
      qmb localqmb = new qmb();
      if (paramFilterParameter.getParameterInteger(12) > 0) {}
      for (;;)
      {
        localqmb.b = Integer.valueOf(i1);
        localqmb.f = new qmz();
        localqmb.f.a = Float.valueOf(paramFilterParameter.getParameterInteger(24) / 65535.0F);
        localqmb.f.b = Float.valueOf(paramFilterParameter.getParameterInteger(25) / 65535.0F);
        localqmb.g = Float.valueOf(paramFilterParameter.getParameterInteger(4) / 100.0F);
        localqmb.d = Float.valueOf(paramFilterParameter.getParameterInteger(22) / 100.0F);
        localqmb.e = Float.valueOf(paramFilterParameter.getParameterInteger(23) / 100.0F);
        localqmb.c = Float.valueOf(paramFilterParameter.getParameterInteger(19) / 100.0F);
        qml localqml15 = new qml();
        localqml15.a(qmb.a, localqmb);
        return localqml15;
        i1 = 0;
      }
    case 114: 
      qmc localqmc = new qmc();
      localqmc.b = Float.valueOf(paramFilterParameter.getParameterFloat(18));
      localqmc.c = Float.valueOf(paramFilterParameter.getParameterInteger(50) / 1000.0F);
      localqmc.d = Float.valueOf(paramFilterParameter.getParameterInteger(51) / 1000.0F);
      qml localqml14 = new qml();
      localqml14.a(qmc.a, localqmc);
      return localqml14;
    case 13: 
      qme localqme = new qme();
      localqme.b = Float.valueOf(paramFilterParameter.getParameterInteger(15) / 100.0F);
      localqme.c = Float.valueOf(paramFilterParameter.getParameterInteger(16) / 100.0F);
      qml localqml13 = new qml();
      localqml13.a(qme.a, localqme);
      return localqml13;
    case 9: 
      qmf localqmf = new qmf();
      localqmf.d = Integer.valueOf(paramFilterParameter.getParameterInteger(3));
      localqmf.c = Float.valueOf(paramFilterParameter.getParameterInteger(2) / 100.0F);
      localqmf.b = Float.valueOf(paramFilterParameter.getParameterInteger(12) / 100.0F);
      qml localqml12 = new qml();
      localqml12.a(qmf.a, localqmf);
      return localqml12;
    case 200: 
      qmj localqmj = new qmj();
      localqmj.b = Integer.valueOf(paramFilterParameter.getParameterInteger(3));
      localqmj.c = Float.valueOf(paramFilterParameter.getParameterInteger(9) / 100.0F);
      localqmj.d = Float.valueOf(paramFilterParameter.getParameterInteger(6) / 100.0F);
      localqmj.e = Float.valueOf(paramFilterParameter.getParameterInteger(19) / 100.0F);
      localqmj.f = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      localqmj.g = Float.valueOf(paramFilterParameter.getParameterInteger(2) / 100.0F);
      qml localqml11 = new qml();
      localqml11.a(qmj.a, localqmj);
      return localqml11;
    case 17: 
      qmm localqmm = new qmm();
      localqmm.b = Integer.valueOf(paramFilterParameter.getParameterInteger(223));
      if (paramFilterParameter.getParameterInteger(9) > 0) {}
      for (;;)
      {
        localqmm.d = Integer.valueOf(i1);
        localqmm.c = Float.valueOf(paramFilterParameter.getParameterInteger(221) / 100.0F);
        localqmm.e = Integer.valueOf(paramFilterParameter.getParameterInteger(105));
        qml localqml10 = new qml();
        localqml10.a(qmm.a, localqmm);
        return localqml10;
        i1 = 0;
      }
    case 100: 
      qlw localqlw = new qlw();
      localqlw.e = Integer.valueOf(paramFilterParameter.getParameterInteger(3));
      localqlw.d = Float.valueOf(paramFilterParameter.getParameterInteger(2) / 100.0F);
      localqlw.b = Float.valueOf(paramFilterParameter.getParameterInteger(12) / 100.0F);
      localqlw.c = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      qml localqml9 = new qml();
      localqml9.a(qlw.a, localqlw);
      return localqml9;
    case 208: 
      qmn localqmn = new qmn();
      localqmn.c = Integer.valueOf(paramFilterParameter.getParameterInteger(3));
      localqmn.d = Float.valueOf(paramFilterParameter.getParameterInteger(9) / 100.0F);
      localqmn.b = Float.valueOf(paramFilterParameter.getParameterInteger(14) / 100.0F);
      qml localqml8 = new qml();
      localqml8.a(qmn.a, localqmn);
      return localqml8;
    case 207: 
      qmo localqmo = new qmo();
      localqmo.f = Integer.valueOf(paramFilterParameter.getParameterInteger(3));
      localqmo.g = Float.valueOf(paramFilterParameter.getParameterInteger(9) / 100.0F);
      localqmo.d = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      localqmo.e = Float.valueOf(paramFilterParameter.getParameterInteger(i1) / 100.0F);
      localqmo.b = Float.valueOf(paramFilterParameter.getParameterInteger(35) / 100.0F);
      localqmo.c = Float.valueOf(paramFilterParameter.getParameterInteger(14) / 100.0F);
      qml localqml7 = new qml();
      localqml7.a(qmo.a, localqmo);
      return localqml7;
    case 16: 
      qmq localqmq = new qmq();
      localqmq.k = Float.valueOf(paramFilterParameter.getParameterFloat(3));
      localqmq.n = Float.valueOf(paramFilterParameter.getParameterInteger(9) / 100.0F);
      localqmq.b = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      localqmq.c = Float.valueOf(paramFilterParameter.getParameterInteger(i1) / 100.0F);
      localqmq.d = Float.valueOf(paramFilterParameter.getParameterInteger(2) / 100.0F);
      localqmq.e = Float.valueOf(paramFilterParameter.getParameterInteger(19) / 100.0F);
      localqmq.f = Float.valueOf(paramFilterParameter.getParameterInteger(6) / 100.0F);
      localqmq.g = Float.valueOf(paramFilterParameter.getParameterInteger(232) / 100.0F);
      localqmq.h = Float.valueOf(paramFilterParameter.getParameterInteger(233) / 100.0F);
      localqmq.i = Integer.valueOf(paramFilterParameter.getParameterInteger(102));
      localqmq.j = Integer.valueOf(paramFilterParameter.getParameterInteger(105));
      localqmq.l = Float.valueOf(paramFilterParameter.getParameterFloat(234));
      localqmq.m = Float.valueOf(paramFilterParameter.getParameterFloat(235));
      qml localqml6 = new qml();
      localqml6.a(qmq.a, localqmq);
      return localqml6;
    case 14: 
      qmu localqmu = new qmu();
      localqmu.d = new qmz();
      localqmu.d.a = Float.valueOf(paramFilterParameter.getParameterInteger(24) / 65535.0F);
      localqmu.d.b = Float.valueOf(paramFilterParameter.getParameterInteger(25) / 65535.0F);
      localqmu.b = Float.valueOf(paramFilterParameter.getParameterInteger(17) / 100.0F);
      localqmu.c = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      localqmu.e = Float.valueOf(paramFilterParameter.getParameterInteger(i1) / 100.0F);
      localqmu.i = Float.valueOf(paramFilterParameter.getParameterInteger(2) / 100.0F);
      localqmu.f = Float.valueOf(paramFilterParameter.getParameterInteger(201) / 100.0F);
      localqmu.g = Float.valueOf(paramFilterParameter.getParameterInteger(202) / 100.0F);
      localqmu.h = Float.valueOf(1.0E-006F * paramFilterParameter.getParameterInteger(18));
      localqmu.j = Float.valueOf(paramFilterParameter.getParameterInteger(19) / 100.0F);
      localqmu.k = Integer.valueOf(paramFilterParameter.getParameterInteger(3));
      qml localqml5 = new qml();
      localqml5.a(qmu.a, localqmu);
      return localqml5;
    case 53: 
      qmv localqmv = new qmv();
      localqmv.b = Float.valueOf(paramFilterParameter.getParameterInteger(26) / 100.0F);
      localqmv.c = Float.valueOf(paramFilterParameter.getParameterInteger(27) / 100.0F);
      localqmv.d = Float.valueOf(paramFilterParameter.getParameterInteger(28) / 100.0F);
      localqmv.e = Float.valueOf(paramFilterParameter.getParameterInteger(29) / 100.0F);
      localqmv.f = Float.valueOf(paramFilterParameter.getParameterInteger(30) / 100.0F);
      qml localqml4 = new qml();
      localqml4.a(qmv.a, localqmv);
      return localqml4;
    case 4: 
      qmw localqmw = new qmw();
      localqmw.b = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      localqmw.c = Float.valueOf(paramFilterParameter.getParameterInteger(i1) / 100.0F);
      localqmw.d = Float.valueOf(paramFilterParameter.getParameterInteger(2) / 100.0F);
      localqmw.e = Float.valueOf(paramFilterParameter.getParameterInteger(20) / 100.0F);
      localqmw.f = Float.valueOf(paramFilterParameter.getParameterInteger(11) / 100.0F);
      qml localqml3 = new qml();
      localqml3.a(qmw.a, localqmw);
      return localqml3;
    case 202: 
      qna localqna = new qna();
      localqna.b = Integer.valueOf(paramFilterParameter.getParameterInteger(800));
      localqna.c = Float.valueOf(paramFilterParameter.getParameterInteger(9) / 100.0F);
      localqna.d = Float.valueOf(paramFilterParameter.getParameterInteger(6) / 100.0F);
      if (paramFilterParameter.getParameterInteger(19) == 0.0F) {
        i1 = 0;
      }
      localqna.e = Integer.valueOf(i1);
      localqna.f = Float.valueOf(paramFilterParameter.getParameterInteger(0) / 100.0F);
      localqna.g = Float.valueOf(paramFilterParameter.getParameterInteger(2) / 100.0F);
      qml localqml2 = new qml();
      localqml2.a(qna.a, localqna);
      return localqml2;
    }
    qmr localqmr = new qmr();
    int i2 = paramFilterParameter.getSubParameters().size();
    localqmr.b = new qms[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      localqmr.b[i3] = new qms();
      FilterParameter localFilterParameter1 = (FilterParameter)paramFilterParameter.getSubParameters().get(i3);
      localqmr.b[i3].b = Float.valueOf(localFilterParameter1.getParameterInteger(0) / 100.0F);
      localqmr.b[i3].c = Float.valueOf(localFilterParameter1.getParameterInteger(i1) / 100.0F);
      localqmr.b[i3].d = Float.valueOf(localFilterParameter1.getParameterInteger(2) / 100.0F);
      localqmr.b[i3].e = new qmz();
      localqmr.b[i3].e.a = Float.valueOf(localFilterParameter1.getParameterFloat(501));
      localqmr.b[i3].e.b = Float.valueOf(localFilterParameter1.getParameterFloat(502));
      int i4 = localFilterParameter1.getParameterInteger(4);
      localqmr.b[i3].f = Float.valueOf(i4 / 100.0F);
    }
    qml localqml1 = new qml();
    localqml1.a(qmr.a, localqmr);
    return localqml1;
  }
  
  public static rcj a(Cursor paramCursor, int paramInt)
  {
    if (!paramCursor.moveToPosition(paramInt)) {
      return null;
    }
    int i1 = paramCursor.getColumnIndexOrThrow("cxn_payload");
    rcj localrcj = new rcj();
    hqv.a(localrcj, paramCursor.getBlob(i1));
    return localrcj;
  }
  
  public static void a(int paramInt, String paramString1, String paramString2)
  {
    if (!Log.isLoggable(paramString1, paramInt)) {
      return;
    }
    b(paramInt, paramString1, paramString2);
  }
  
  public static void a(Activity paramActivity)
  {
    int i1 = 1;
    if (paramActivity == null) {
      return;
    }
    int i2 = paramActivity.getWindowManager().getDefaultDisplay().getRotation();
    switch (paramActivity.getResources().getConfiguration().orientation)
    {
    default: 
      i1 = -1;
    }
    while (i1 != -1)
    {
      paramActivity.setRequestedOrientation(i1);
      return;
      if ((i2 != 0) && (i2 != 3))
      {
        i1 = 9;
        continue;
        if ((i2 == 0) || (i2 == i1)) {
          i1 = 0;
        } else {
          i1 = 8;
        }
      }
    }
  }
  
  public static void a(Notification.Builder paramBuilder, ea paramea)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(paramea.a(), paramea.b(), paramea.c());
    if (paramea.e() != null)
    {
      RemoteInput[] arrayOfRemoteInput = a(paramea.e());
      int i1 = arrayOfRemoteInput.length;
      for (int i2 = 0; i2 < i1; i2++) {
        localBuilder.addRemoteInput(arrayOfRemoteInput[i2]);
      }
    }
    if (paramea.d() != null) {
      localBuilder.addExtras(paramea.d());
    }
    paramBuilder.addAction(localBuilder.build());
  }
  
  public static void a(Context paramContext, int paramInt, gnb paramgnb)
  {
    gnb localgnb1 = d(paramgnb);
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    Cursor localCursor = localSQLiteDatabase.query("account_status", new String[] { "audience_history" }, null, null, null, null, null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        byte[] arrayOfByte1 = localCursor.getBlob(0);
        localObject2 = null;
        if (arrayOfByte1 != null)
        {
          ArrayList localArrayList1 = gnl.b(arrayOfByte1);
          localObject2 = localArrayList1;
        }
      }
      localCursor.close();
      if (localObject2 == null) {
        localObject2 = new ArrayList();
      }
      ArrayList localArrayList2 = new ArrayList();
      if (a(paramContext, localgnb1, gnd.class)) {
        localArrayList2.add(localgnb1);
      }
      int i1 = ((ArrayList)localObject2).size();
      for (int i2 = 0; (i2 < i1) && (localArrayList2.size() < 5); i2++)
      {
        gnb localgnb2 = (gnb)((ArrayList)localObject2).get(i2);
        if ((!gnb.a(localgnb1, localgnb2)) && (a(paramContext, localgnb2, gnd.class))) {
          localArrayList2.add(localgnb2);
        }
      }
      try
      {
        byte[] arrayOfByte2 = gnl.a(localArrayList2);
        ContentValues localContentValues = new ContentValues(1);
        localContentValues.put("audience_history", arrayOfByte2);
        localSQLiteDatabase.update("account_status", localContentValues, null, null);
        return;
      }
      catch (IOException localIOException)
      {
        a(6, "AclDataUtils", "Error saving audience history");
      }
    }
    finally
    {
      localCursor.close();
      new ArrayList();
    }
  }
  
  public static void a(Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase;
    if (paramString1 != null)
    {
      localSQLiteDatabase = bqj.a(paramContext, paramInt1).getWritableDatabase();
      localSQLiteDatabase.beginTransaction();
    }
    try
    {
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("search_key", a(paramString1, paramInt2));
      localContentValues.put("continuation_token", paramString2);
      localSQLiteDatabase.insertWithOnConflict("search", null, localContentValues, 5);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("com.google.android.apps.plus.widget.LocationsWidgetUtils", 0).edit();
    String str1 = String.valueOf("accountGaiaId_");
    String str2 = 11 + String.valueOf(str1).length() + str1 + paramInt;
    if (paramString1 == null) {
      paramString1 = "";
    }
    localEditor.putString(str2, paramString1);
    String str3 = String.valueOf("circleId_");
    String str4 = 11 + String.valueOf(str3).length() + str3 + paramInt;
    if (paramString2 == null) {
      paramString2 = "";
    }
    localEditor.putString(str4, paramString2);
    String str5 = String.valueOf("gaiaId_");
    String str6 = 11 + String.valueOf(str5).length() + str5 + paramInt;
    if (paramString3 == null) {
      paramString3 = "";
    }
    localEditor.putString(str6, paramString3);
    String str7 = String.valueOf("hasMulti_");
    localEditor.putBoolean(11 + String.valueOf(str7).length() + str7 + paramInt, paramBoolean);
    localEditor.apply();
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    try
    {
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("payload", paramArrayOfByte);
      localSQLiteDatabase.update("activities", localContentValues, "activity_id=?", new String[] { paramString });
      localSQLiteDatabase.setTransactionSuccessful();
      lmp.a(paramContext, paramString);
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public static void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    l();
    hcw.a(paramContext, System.currentTimeMillis());
    hbj.b(paramContext, paramInt, paramBoolean);
  }
  
  public static void a(Context paramContext, int paramInt, boolean paramBoolean, gya paramgya)
  {
    gxx localgxx;
    gxw localgxw;
    if (paramgya != null)
    {
      localgxx = (gxx)mbb.a(paramContext, gxx.class);
      localgxw = new gxw(paramContext, paramInt);
      if (!paramBoolean) {
        break label59;
      }
    }
    label59:
    for (gxz localgxz = gxz.g;; localgxz = gxz.h)
    {
      localgxw.c = localgxz;
      localgxw.d = paramgya;
      localgxx.a(localgxw);
      return;
    }
  }
  
  public static void a(Context paramContext, Account paramAccount, String paramString1, String paramString2, String paramString3)
  {
    int i1;
    if ((ContentResolver.getMasterSyncAutomatically()) && (ContentResolver.getSyncAutomatically(paramAccount, paramString1)))
    {
      i1 = 1;
      if (i1 == 0) {
        break label143;
      }
      if (!b(paramContext, paramAccount, paramString1, paramString2, paramString3)) {
        if (Log.isLoggable("PhotoSyncService", 3))
        {
          String str2 = String.valueOf(paramString2);
          if (str2.length() == 0) {
            break label129;
          }
          "  --> Subscribe to feed: ".concat(str2);
        }
      }
    }
    for (;;)
    {
      a(paramContext.getContentResolver(), paramString2, paramAccount, paramString1, paramString3);
      String[] arrayOfString = new String[3];
      arrayOfString[0] = "com.google.plus.photos";
      arrayOfString[1] = paramAccount.type;
      arrayOfString[2] = paramString2;
      paramContext.getContentResolver().delete(dnm.a, "authority = ? AND _sync_account_type = ? AND feed = ?", arrayOfString);
      return;
      i1 = 0;
      break;
      label129:
      new String("  --> Subscribe to feed: ");
    }
    label143:
    if (Log.isLoggable("PhotoSyncService", 3))
    {
      String str1 = String.valueOf(paramString2);
      if (str1.length() == 0) {
        break label188;
      }
      "  --> Unsubscribe feed: ".concat(str1);
    }
    for (;;)
    {
      a(paramContext.getContentResolver(), paramString2, paramAccount, paramString1);
      return;
      label188:
      new String("  --> Unsubscribe feed: ");
    }
  }
  
  public static void a(Context paramContext, ComponentName paramComponentName, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Intent localIntent = new Intent();
      localIntent.setComponent(paramComponentName);
      if (localIntent.resolveActivityInfo(paramContext.getPackageManager(), 0) == null)
      {
        String str = String.valueOf(paramComponentName.getClassName());
        if (str.length() != 0)
        {
          "Tried to disable a component that does not exist: ".concat(str);
          return;
        }
        new String("Tried to disable a component that does not exist: ");
        return;
      }
    }
    paramContext.getPackageManager().setComponentEnabledSetting(paramComponentName, 2, 1);
  }
  
  /* Error */
  public static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 9631
    //   4: ldc_w 9633
    //   7: aconst_null
    //   8: invokevirtual 9636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   11: pop
    //   12: ldc_w 9638
    //   15: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   18: astore 4
    //   20: iconst_5
    //   21: iconst_1
    //   22: anewarray 5749	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc_w 9640
    //   30: aastore
    //   31: invokestatic 8782	jrf:a	(I[Ljava/lang/String;)Ljava/lang/String;
    //   34: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   37: astore 5
    //   39: ldc_w 6996
    //   42: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   45: astore 6
    //   47: iconst_5
    //   48: iconst_1
    //   49: anewarray 5749	java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: ldc_w 9642
    //   57: aastore
    //   58: invokestatic 8782	jrf:a	(I[Ljava/lang/String;)Ljava/lang/String;
    //   61: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   64: astore 7
    //   66: ldc_w 6996
    //   69: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   72: astore 8
    //   74: iconst_5
    //   75: iconst_1
    //   76: anewarray 5749	java/lang/String
    //   79: dup
    //   80: iconst_0
    //   81: ldc_w 9644
    //   84: aastore
    //   85: invokestatic 8782	jrf:a	(I[Ljava/lang/String;)Ljava/lang/String;
    //   88: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   91: astore 9
    //   93: aload_1
    //   94: ldc_w 9631
    //   97: new 5654	java/lang/StringBuilder
    //   100: dup
    //   101: bipush 23
    //   103: aload 4
    //   105: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   108: invokevirtual 5753	java/lang/String:length	()I
    //   111: iadd
    //   112: aload 5
    //   114: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokevirtual 5753	java/lang/String:length	()I
    //   120: iadd
    //   121: aload 6
    //   123: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   126: invokevirtual 5753	java/lang/String:length	()I
    //   129: iadd
    //   130: aload 7
    //   132: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   135: invokevirtual 5753	java/lang/String:length	()I
    //   138: iadd
    //   139: aload 8
    //   141: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   144: invokevirtual 5753	java/lang/String:length	()I
    //   147: iadd
    //   148: aload 9
    //   150: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   153: invokevirtual 5753	java/lang/String:length	()I
    //   156: iadd
    //   157: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   160: aload 4
    //   162: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload 5
    //   167: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: ldc_w 9646
    //   173: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: aload 6
    //   178: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: ldc_w 9648
    //   184: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: aload 7
    //   189: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: ldc_w 9646
    //   195: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: aload 8
    //   200: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: ldc_w 9648
    //   206: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: aload 9
    //   211: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: ldc_w 9650
    //   217: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: invokevirtual 5667	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   223: aconst_null
    //   224: invokevirtual 9636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   227: pop
    //   228: aload_1
    //   229: ldc_w 9631
    //   232: ldc_w 9652
    //   235: aconst_null
    //   236: invokevirtual 9636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   239: pop
    //   240: ldc_w 9654
    //   243: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   246: astore 12
    //   248: aload_0
    //   249: iload_2
    //   250: invokestatic 9656	jrf:a	(Landroid/content/Context;I)Ljava/lang/String;
    //   253: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   256: astore 13
    //   258: ldc_w 8910
    //   261: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   264: astore 14
    //   266: ldc_w 9658
    //   269: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   272: astore 15
    //   274: aload_1
    //   275: ldc_w 9631
    //   278: new 5654	java/lang/StringBuilder
    //   281: dup
    //   282: bipush 27
    //   284: aload 12
    //   286: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   289: invokevirtual 5753	java/lang/String:length	()I
    //   292: iadd
    //   293: aload 13
    //   295: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   298: invokevirtual 5753	java/lang/String:length	()I
    //   301: iadd
    //   302: aload 14
    //   304: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   307: invokevirtual 5753	java/lang/String:length	()I
    //   310: iadd
    //   311: aload 15
    //   313: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   316: invokevirtual 5753	java/lang/String:length	()I
    //   319: iadd
    //   320: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   323: aload 12
    //   325: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload 13
    //   330: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: ldc_w 9646
    //   336: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: aload 14
    //   341: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: ldc_w 9660
    //   347: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: ldc_w 9662
    //   353: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: aload 15
    //   358: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: invokevirtual 5667	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   364: aconst_null
    //   365: invokevirtual 9636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   368: pop
    //   369: aload_0
    //   370: ldc_w 9664
    //   373: invokestatic 5641	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   376: checkcast 9664	jaq
    //   379: invokeinterface 9666 1 0
    //   384: ifne +252 -> 636
    //   387: new 9668	java/util/HashSet
    //   390: dup
    //   391: invokespecial 9669	java/util/HashSet:<init>	()V
    //   394: astore 17
    //   396: aload_1
    //   397: ldc_w 9671
    //   400: aconst_null
    //   401: invokevirtual 9675	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   404: astore 18
    //   406: aload 18
    //   408: invokeinterface 6547 1 0
    //   413: ifeq +34 -> 447
    //   416: aload 17
    //   418: aload 18
    //   420: iconst_0
    //   421: invokeinterface 8199 2 0
    //   426: invokeinterface 9676 2 0
    //   431: pop
    //   432: goto -26 -> 406
    //   435: astore 19
    //   437: aload 18
    //   439: invokeinterface 6554 1 0
    //   444: aload 19
    //   446: athrow
    //   447: aload 18
    //   449: invokeinterface 6554 1 0
    //   454: aload_1
    //   455: ldc_w 9678
    //   458: iconst_1
    //   459: anewarray 5749	java/lang/String
    //   462: dup
    //   463: iconst_0
    //   464: ldc_w 9065
    //   467: aastore
    //   468: ldc_w 9680
    //   471: aconst_null
    //   472: aconst_null
    //   473: aconst_null
    //   474: aconst_null
    //   475: invokevirtual 7232	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   478: astore 20
    //   480: aload 20
    //   482: invokeinterface 6547 1 0
    //   487: ifeq +46 -> 533
    //   490: aload 17
    //   492: bipush 6
    //   494: iconst_1
    //   495: anewarray 5749	java/lang/String
    //   498: dup
    //   499: iconst_0
    //   500: aload 20
    //   502: iconst_0
    //   503: invokeinterface 8199 2 0
    //   508: aastore
    //   509: invokestatic 8782	jrf:a	(I[Ljava/lang/String;)Ljava/lang/String;
    //   512: invokeinterface 9683 2 0
    //   517: pop
    //   518: goto -38 -> 480
    //   521: astore 21
    //   523: aload 20
    //   525: invokeinterface 6554 1 0
    //   530: aload 21
    //   532: athrow
    //   533: aload 20
    //   535: invokeinterface 6554 1 0
    //   540: aload 17
    //   542: invokeinterface 9684 1 0
    //   547: ifle +89 -> 636
    //   550: new 5853	java/lang/StringBuffer
    //   553: dup
    //   554: invokespecial 5854	java/lang/StringBuffer:<init>	()V
    //   557: astore 22
    //   559: aload 22
    //   561: ldc_w 9686
    //   564: invokevirtual 9689	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   567: pop
    //   568: bipush 254
    //   570: aload 17
    //   572: invokeinterface 9684 1 0
    //   577: iadd
    //   578: istore 24
    //   580: iload 24
    //   582: iflt +18 -> 600
    //   585: aload 22
    //   587: ldc_w 9691
    //   590: invokevirtual 9689	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   593: pop
    //   594: iinc 24 255
    //   597: goto -17 -> 580
    //   600: aload 22
    //   602: ldc_w 9693
    //   605: invokevirtual 9689	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   608: pop
    //   609: aload_1
    //   610: ldc_w 9631
    //   613: aload 22
    //   615: invokevirtual 5868	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   618: aload 17
    //   620: iconst_0
    //   621: anewarray 5749	java/lang/String
    //   624: invokeinterface 9694 2 0
    //   629: checkcast 9060	[Ljava/lang/String;
    //   632: invokevirtual 9636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   635: pop
    //   636: new 9668	java/util/HashSet
    //   639: dup
    //   640: invokespecial 9669	java/util/HashSet:<init>	()V
    //   643: astore 27
    //   645: aload_1
    //   646: ldc_w 9696
    //   649: aconst_null
    //   650: invokevirtual 9675	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   653: astore 28
    //   655: aload 28
    //   657: invokeinterface 6547 1 0
    //   662: ifeq +34 -> 696
    //   665: aload 27
    //   667: aload 28
    //   669: iconst_0
    //   670: invokeinterface 8199 2 0
    //   675: invokeinterface 9676 2 0
    //   680: pop
    //   681: goto -26 -> 655
    //   684: astore 29
    //   686: aload 28
    //   688: invokeinterface 6554 1 0
    //   693: aload 29
    //   695: athrow
    //   696: aload 28
    //   698: invokeinterface 6554 1 0
    //   703: aload_1
    //   704: ldc_w 9552
    //   707: iconst_2
    //   708: anewarray 5749	java/lang/String
    //   711: dup
    //   712: iconst_0
    //   713: ldc_w 9698
    //   716: aastore
    //   717: dup
    //   718: iconst_1
    //   719: ldc_w 9700
    //   722: aastore
    //   723: ldc_w 9702
    //   726: aconst_null
    //   727: aconst_null
    //   728: aconst_null
    //   729: aconst_null
    //   730: invokevirtual 7232	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   733: astore 30
    //   735: aload 30
    //   737: invokeinterface 6547 1 0
    //   742: ifeq +107 -> 849
    //   745: aload 30
    //   747: iconst_1
    //   748: invokeinterface 6551 2 0
    //   753: lstore 40
    //   755: aload 30
    //   757: iconst_0
    //   758: invokeinterface 9427 2 0
    //   763: astore 42
    //   765: ldc2_w 9703
    //   768: lload 40
    //   770: land
    //   771: lconst_0
    //   772: lcmp
    //   773: ifeq +19 -> 792
    //   776: aload 27
    //   778: aload 42
    //   780: invokestatic 9707	llx:a	([B)Lllx;
    //   783: invokestatic 9709	efj:a	(Lllx;)Ljava/lang/String;
    //   786: invokeinterface 9683 2 0
    //   791: pop
    //   792: lload 40
    //   794: ldc2_w 9710
    //   797: land
    //   798: lconst_0
    //   799: lcmp
    //   800: ifeq -65 -> 735
    //   803: aload 42
    //   805: invokestatic 9714	llt:a	([B)Lllt;
    //   808: astore 44
    //   810: iconst_m1
    //   811: aload 44
    //   813: getfield 8315	llt:a	I
    //   816: iadd
    //   817: istore 45
    //   819: iload 45
    //   821: iflt -86 -> 735
    //   824: aload 27
    //   826: aload 44
    //   828: getfield 8320	llt:f	[Lllx;
    //   831: iload 45
    //   833: aaload
    //   834: invokestatic 9709	efj:a	(Lllx;)Ljava/lang/String;
    //   837: invokeinterface 9683 2 0
    //   842: pop
    //   843: iinc 45 255
    //   846: goto -27 -> 819
    //   849: aload 30
    //   851: invokeinterface 6554 1 0
    //   856: aload 27
    //   858: invokeinterface 9684 1 0
    //   863: ifle +101 -> 964
    //   866: new 5853	java/lang/StringBuffer
    //   869: dup
    //   870: invokespecial 5854	java/lang/StringBuffer:<init>	()V
    //   873: astore 32
    //   875: aload 32
    //   877: ldc_w 9686
    //   880: invokevirtual 9689	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   883: pop
    //   884: bipush 254
    //   886: aload 27
    //   888: invokeinterface 9684 1 0
    //   893: iadd
    //   894: istore 34
    //   896: iload 34
    //   898: iflt +30 -> 928
    //   901: aload 32
    //   903: ldc_w 9691
    //   906: invokevirtual 9689	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   909: pop
    //   910: iinc 34 255
    //   913: goto -17 -> 896
    //   916: astore 31
    //   918: aload 30
    //   920: invokeinterface 6554 1 0
    //   925: aload 31
    //   927: athrow
    //   928: aload 32
    //   930: ldc_w 9693
    //   933: invokevirtual 9689	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   936: pop
    //   937: aload_1
    //   938: ldc_w 9631
    //   941: aload 32
    //   943: invokevirtual 5868	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   946: aload 27
    //   948: iconst_0
    //   949: anewarray 5749	java/lang/String
    //   952: invokeinterface 9694 2 0
    //   957: checkcast 9060	[Ljava/lang/String;
    //   960: invokevirtual 9636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   963: pop
    //   964: aload_1
    //   965: ldc_w 9716
    //   968: invokevirtual 9719	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   971: ldc_w 9721
    //   974: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   977: astore 37
    //   979: aload_0
    //   980: iload_2
    //   981: invokestatic 9656	jrf:a	(Landroid/content/Context;I)Ljava/lang/String;
    //   984: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   987: astore 38
    //   989: aload_1
    //   990: new 5654	java/lang/StringBuilder
    //   993: dup
    //   994: iconst_1
    //   995: aload 37
    //   997: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1000: invokevirtual 5753	java/lang/String:length	()I
    //   1003: iadd
    //   1004: aload 38
    //   1006: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1009: invokevirtual 5753	java/lang/String:length	()I
    //   1012: iadd
    //   1013: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   1016: aload 37
    //   1018: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1021: aload 38
    //   1023: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1026: ldc_w 9650
    //   1029: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1032: invokevirtual 5667	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1035: invokevirtual 9719	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1038: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1039	0	paramContext	Context
    //   0	1039	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	1039	2	paramInt	int
    //   18	143	4	str1	String
    //   37	129	5	str2	String
    //   45	132	6	str3	String
    //   64	124	7	str4	String
    //   72	127	8	str5	String
    //   91	119	9	str6	String
    //   246	78	12	str7	String
    //   256	73	13	str8	String
    //   264	76	14	str9	String
    //   272	85	15	str10	String
    //   394	225	17	localHashSet1	HashSet
    //   404	44	18	localCursor1	Cursor
    //   435	10	19	localObject1	Object
    //   478	56	20	localCursor2	Cursor
    //   521	10	21	localObject2	Object
    //   557	57	22	localStringBuffer1	StringBuffer
    //   578	17	24	i1	int
    //   643	304	27	localHashSet2	HashSet
    //   653	44	28	localCursor3	Cursor
    //   684	10	29	localObject3	Object
    //   733	186	30	localCursor4	Cursor
    //   916	10	31	localObject4	Object
    //   873	69	32	localStringBuffer2	StringBuffer
    //   894	17	34	i2	int
    //   977	40	37	str11	String
    //   987	35	38	str12	String
    //   753	40	40	l1	long
    //   763	41	42	arrayOfByte	byte[]
    //   808	19	44	localllt	llt
    //   817	27	45	i3	int
    // Exception table:
    //   from	to	target	type
    //   406	432	435	finally
    //   480	518	521	finally
    //   655	681	684	finally
    //   735	765	916	finally
    //   776	792	916	finally
    //   803	819	916	finally
    //   824	843	916	finally
  }
  
  public static void a(Context paramContext, RecyclerView paramRecyclerView, View paramView, int paramInt1, int paramInt2, lep paramlep)
  {
    lef locallef = (lef)paramRecyclerView.g;
    if ((!B(paramContext)) || (locallef.a(paramInt1) != 0) || (paramInt2 == -1)) {}
    SpaceListItemView localSpaceListItemView;
    do
    {
      return;
      localSpaceListItemView = (SpaceListItemView)paramView;
      if (paramInt2 > paramRecyclerView.g.a()) {
        paramInt2--;
      }
    } while (paramInt1 != paramInt2);
    leo localleo = new leo(localSpaceListItemView, paramlep);
    m().postDelayed(localleo, 300L);
  }
  
  public static void a(Context paramContext, SearchView paramSearchView, int paramInt)
  {
    if (paramInt == lse.b) {
      a(paramContext, paramSearchView, YZ, YX, dl.aq, dl.ar);
    }
    while (paramInt != lse.a) {
      return;
    }
    a(paramContext, paramSearchView, YY, YW, dl.ap, dl.ao);
  }
  
  public static void a(Context paramContext, SearchView paramSearchView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ImageView localImageView = (ImageView)paramSearchView.findViewById(eyg.bT);
    int i1 = ((git)mbb.a(paramContext, git.class)).c();
    if (((djp)mbb.a(paramContext, djp.class)).a(i1))
    {
      localImageView.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
      paramSearchView.findViewById(eyg.bU).setBackgroundResource(0);
      paramSearchView.setLayoutParams(new ActionBar.LayoutParams(-1, -2));
    }
    for (;;)
    {
      ((ImageView)paramSearchView.findViewById(eyg.bS)).setImageResource(paramInt2);
      SearchView.SearchAutoComplete localSearchAutoComplete = (SearchView.SearchAutoComplete)paramSearchView.findViewById(eyg.bV);
      Resources localResources = paramContext.getResources();
      localSearchAutoComplete.setTextColor(localResources.getColor(paramInt3));
      localSearchAutoComplete.setHintTextColor(localResources.getColor(paramInt4));
      return;
      localImageView.setImageResource(paramInt1);
    }
  }
  
  public static void a(Context paramContext, itd paramitd, int paramInt1, int paramInt2, isv paramisv, Cursor paramCursor, int paramInt3)
  {
    long l1 = paramCursor.getLong(5);
    long l2 = paramCursor.getLong(6);
    long l3 = paramCursor.getLong(3);
    long l4 = paramisv.d;
    if (paramisv.e) {}
    for (long l5 = l3;; l5 = Math.max(l1, l2))
    {
      paramisv.d = Math.max(l4, l5);
      paramisv.c += paramCursor.getInt(4);
      paramisv.a = Integer.valueOf(paramInt2);
      TreeSet localTreeSet = paramisv.f;
      if ((paramInt3 <= 0) || ((localTreeSet.size() >= paramInt3) && (((ita)localTreeSet.last()).c >= l3))) {
        break;
      }
      localTreeSet.addAll(paramitd.a(paramContext, paramInt2, paramisv.e, paramInt1, paramInt3));
      for (int i1 = localTreeSet.size() - paramInt3; i1 > 0; i1--) {
        localTreeSet.remove(localTreeSet.last());
      }
    }
  }
  
  @SuppressLint({"NewApi"})
  public static void a(Context paramContext, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramCharSequence);
      return;
    }
    ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramCharSequence);
  }
  
  public static void a(Context paramContext, Double paramDouble1, Double paramDouble2, String paramString)
  {
    int i1 = 1;
    int i2;
    label22:
    Uri.Builder localBuilder;
    if ((paramDouble1 != null) && (paramDouble2 != null))
    {
      i2 = i1;
      if (TextUtils.isEmpty(paramString)) {
        break label115;
      }
      localBuilder = Uri.parse("http://maps.google.com/maps").buildUpon();
      if (i2 == 0) {
        break label121;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramDouble1).append(',').append(paramDouble2);
      if (i1 != 0) {
        localStringBuilder.append('(').append(paramString).append(')');
      }
      localBuilder.appendQueryParameter("daddr", localStringBuilder.toString());
    }
    for (;;)
    {
      b(paramContext, localBuilder.build());
      return;
      i2 = 0;
      break;
      label115:
      i1 = 0;
      break label22;
      label121:
      if (i1 != 0) {
        localBuilder.appendQueryParameter("daddr", paramString);
      }
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    l();
    ArrayList localArrayList = new ArrayList();
    itd[] arrayOfitd = PW;
    int i1 = arrayOfitd.length;
    for (int i2 = 0; i2 < i1; i2++) {
      localArrayList.addAll(a(paramContext, arrayOfitd[i2], paramString));
    }
    List localList = Collections.unmodifiableList(localArrayList);
    b(paramContext, b(localList));
    e(paramContext, localList);
  }
  
  public static void a(Context paramContext, String paramString1, int paramInt, String paramString2)
  {
    Context localContext = paramContext.getApplicationContext();
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(localContext);
    try
    {
      i1 = localContext.getPackageManager().getPackageInfo(localContext.getPackageName(), 0).versionCode;
      if (localSharedPreferences.getInt(paramString2, 0) < i1)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
        localBuilder.setPositiveButton(aw.eA, new lwg(localContext, paramString2, i1));
        View localView = LayoutInflater.from(paramContext).inflate(Zu, null);
        ((ImageView)localView.findViewById(eyg.bX)).setImageResource(paramInt);
        ((TextView)localView.findViewById(eyg.bW)).setText(paramContext.getString(aw.ez, new Object[] { paramString1 }));
        localBuilder.setView(localView);
        localBuilder.setCancelable(false);
        localBuilder.show();
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int i1 = 0;
      }
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt, lth paramlth, ltj paramltj, ixf paramixf)
  {
    try
    {
      d(paramString1.startsWith("https"), "Csi server should be https url.");
      Za = new lte(paramContext, paramString1, paramString2, "3", paramlth, paramltj, paramixf);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void a(Context paramContext, String paramString, nnf paramnnf)
  {
    ((hze)mbb.a(paramContext, hze.class)).a(paramString, paramnnf.a);
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    b(paramContext, new ComponentName(paramContext, paramString), paramBoolean);
  }
  
  public static void a(Context paramContext, ArrayList<isv> paramArrayList, int paramInt1, int paramInt2)
  {
    SparseArray localSparseArray = new SparseArray();
    int i1 = 0;
    itd localitd;
    Cursor localCursor;
    if (i1 < PW.length)
    {
      localitd = PW[i1];
      if (((paramInt2 != 4) || ((localitd instanceof ite))) && (((paramInt2 != 5) && (paramInt2 != 3)) || ((localitd instanceof isz)))) {
        localCursor = null;
      }
    }
    for (;;)
    {
      isv localisv1;
      try
      {
        localCursor = localitd.a(paramContext, 2);
        if ((localCursor != null) && (localCursor.moveToFirst()))
        {
          Integer localInteger = Integer.valueOf(localCursor.getInt(1));
          localisv1 = (isv)localSparseArray.get(localInteger.intValue());
          if (localisv1 != null) {
            break label263;
          }
          localisv2 = new isv();
          localisv2.b = localCursor.getString(2);
          localisv2.a = localInteger;
          localSparseArray.put(localInteger.intValue(), localisv2);
          a(paramContext, localitd, i1, localInteger.intValue(), localisv2, localCursor, paramInt1);
          boolean bool = localCursor.moveToNext();
          if (bool) {
            continue;
          }
        }
        if (localCursor != null) {
          localCursor.close();
        }
        i1++;
        break;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      for (int i2 = -1 + localSparseArray.size(); i2 >= 0; i2--) {
        paramArrayList.add(localSparseArray.valueAt(i2));
      }
      return;
      label263:
      isv localisv2 = localisv1;
    }
  }
  
  public static void a(Context paramContext, mhv parammhv)
  {
    if (parammhv == null) {}
    hpy localhpy;
    do
    {
      return;
      localhpy = (hpy)mbb.b(paramContext, hpy.class);
    } while ((localhpy == null) || (parammhv.a == null));
    localhpy.a(parammhv.a);
  }
  
  public static void a(Cursor paramCursor, ContentValues paramContentValues)
  {
    int i1 = paramCursor.getColumnIndexOrThrow("auto_follow_state");
    if ((paramCursor.isNull(i1)) || (paramContentValues.getAsInteger("auto_follow_state").intValue() != paramCursor.getInt(i1))) {
      paramContentValues.putNull("followers_sync_timestamp");
    }
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("owner_gaia_id", paramString);
    localContentValues.put("sync_timestamp", Long.valueOf(System.currentTimeMillis()));
    localContentValues.put("type", Integer.valueOf(paramInt));
    paramSQLiteDatabase.insertWithOnConflict("cnxs_sync_timestamps", null, localContentValues, 5);
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, int paramInt, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2))
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("continuation_token", paramString2);
      localContentValues.put("owner_gaia_id", paramString1);
      localContentValues.put("type", Integer.valueOf(paramInt));
      paramSQLiteDatabase.insertWithOnConflict("cnxs_continuation_tokens", null, localContentValues, 5);
      return;
    }
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString1;
    arrayOfString[1] = Integer.toString(paramInt);
    paramSQLiteDatabase.delete("cnxs_continuation_tokens", "owner_gaia_id=? AND type=?", arrayOfString);
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, nei paramnei, Long paramLong)
  {
    if ((paramnei == null) || (paramnei.b == null) || (paramnei.b.a == null) || (TextUtils.isEmpty(paramnei.b.a.a))) {
      return;
    }
    String[] arrayOfString1 = hoi.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = paramnei.b.a.a;
    Cursor localCursor = paramSQLiteDatabase.query("cxns", arrayOfString1, "cxn_id = ? ", arrayOfString2, null, null, null);
    boolean bool;
    if (localCursor != null)
    {
      bool = localCursor.moveToFirst();
      localCursor.close();
    }
    for (;;)
    {
      ContentValues localContentValues = a(paramnei, null);
      if (paramLong != null) {
        localContentValues.put("sync_timestamp", paramLong);
      }
      while (bool)
      {
        String[] arrayOfString3 = new String[1];
        arrayOfString3[0] = paramnei.b.a.a;
        paramSQLiteDatabase.update("cxns", localContentValues, "cxn_id =?", arrayOfString3);
        return;
        localContentValues.putNull("sync_timestamp");
      }
      paramSQLiteDatabase.insertWithOnConflict("cxns", null, localContentValues, 5);
      return;
      bool = false;
    }
  }
  
  public static void a(Canvas paramCanvas, List<Bitmap> paramList, int paramInt, Paint paramPaint1, Paint paramPaint2)
  {
    if ((paramList == null) || (paramList.isEmpty())) {}
    do
    {
      int i1;
      do
      {
        do
        {
          do
          {
            return;
            i1 = paramList.size();
            if (i1 == 1)
            {
              Bitmap localBitmap10 = (Bitmap)paramList.get(0);
              Matrix localMatrix = new Matrix();
              int i2 = Math.min(localBitmap10.getWidth(), localBitmap10.getHeight());
              if (i2 != paramInt)
              {
                float f1 = paramInt / i2;
                localMatrix.postScale(f1, f1, 0.0F, 0.0F);
              }
              paramCanvas.drawBitmap(localBitmap10, localMatrix, paramPaint1);
              return;
            }
            if (i1 != 2) {
              break;
            }
            Bitmap localBitmap8 = a((Bitmap)paramList.get(0), paramInt);
            Bitmap localBitmap9 = a((Bitmap)paramList.get(1), paramInt);
            paramCanvas.drawBitmap(localBitmap8, 0.0F, 0.0F, paramPaint1);
            paramCanvas.drawBitmap(localBitmap9, paramInt / 2, 0.0F, paramPaint1);
          } while (paramPaint2 == null);
          paramCanvas.drawLine(paramInt / 2, 0.0F, paramInt / 2, paramInt, paramPaint2);
          return;
          if (i1 != 3) {
            break;
          }
          Bitmap localBitmap5 = a((Bitmap)paramList.get(0), paramInt);
          Bitmap localBitmap6 = b((Bitmap)paramList.get(1), paramInt);
          Bitmap localBitmap7 = b((Bitmap)paramList.get(2), paramInt);
          paramCanvas.drawBitmap(localBitmap5, 0.0F, 0.0F, paramPaint1);
          paramCanvas.drawBitmap(localBitmap6, paramInt / 2, 0.0F, paramPaint1);
          paramCanvas.drawBitmap(localBitmap7, paramInt / 2, paramInt / 2, paramPaint1);
        } while (paramPaint2 == null);
        paramCanvas.drawLine(paramInt / 2, 0.0F, paramInt / 2, paramInt, paramPaint2);
        paramCanvas.drawLine(paramInt / 2, paramInt / 2, paramInt, paramInt / 2, paramPaint2);
        return;
      } while (i1 < 4);
      Bitmap localBitmap1 = b((Bitmap)paramList.get(0), paramInt);
      Bitmap localBitmap2 = b((Bitmap)paramList.get(1), paramInt);
      Bitmap localBitmap3 = b((Bitmap)paramList.get(2), paramInt);
      Bitmap localBitmap4 = b((Bitmap)paramList.get(3), paramInt);
      paramCanvas.drawBitmap(localBitmap1, 0.0F, 0.0F, paramPaint1);
      paramCanvas.drawBitmap(localBitmap2, paramInt / 2, 0.0F, paramPaint1);
      paramCanvas.drawBitmap(localBitmap3, 0.0F, paramInt / 2, paramPaint1);
      paramCanvas.drawBitmap(localBitmap4, paramInt / 2, paramInt / 2, paramPaint1);
    } while (paramPaint2 == null);
    paramCanvas.drawLine(paramInt / 2, 0.0F, paramInt / 2, paramInt, paramPaint2);
    paramCanvas.drawLine(0.0F, paramInt / 2, paramInt, paramInt / 2, paramPaint2);
  }
  
  public static void a(PointF paramPointF, int paramInt, float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 <= 0.0F) || (paramFloat2 <= 0.0F)) {
      throw new IllegalArgumentException("Illegal value of width or height");
    }
    String str1;
    switch (paramInt)
    {
    default: 
      str1 = String.valueOf(String.valueOf(paramInt));
      if (str1.length() == 0) {
        break;
      }
    }
    for (String str2 = "Illegal value of postRotation:".concat(str1);; str2 = new String("Illegal value of postRotation:"))
    {
      throw new IllegalArgumentException(str2);
      paramPointF.set(paramPointF.y, paramFloat1 - paramPointF.x);
      return;
      paramPointF.set(paramFloat1 - paramPointF.x, paramFloat2 - paramPointF.y);
      return;
      paramPointF.set(paramFloat2 - paramPointF.y, paramPointF.x);
      return;
    }
  }
  
  public static <T extends pzd> void a(Bundle paramBundle, String paramString, T paramT)
  {
    paramBundle.putParcelable(paramString, new owu(null, paramT));
  }
  
  public static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    int i1 = a(paramParcel, paramInt1);
    if (i1 != paramInt2) {
      throw new bm("Expected size " + paramInt2 + " got " + i1 + " (0x" + Integer.toHexString(i1) + ")", paramParcel);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    n(paramParcel, i1);
  }
  
  public static void a(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    n(paramParcel, i1);
  }
  
  public static void a(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    n(paramParcel, i1);
  }
  
  public static void a(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean)
  {
    if (paramInteger == null) {
      return;
    }
    b(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramInteger.intValue());
  }
  
  public static void a(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    n(paramParcel, i1);
  }
  
  public static void a(Parcel paramParcel, int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    if (paramList == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    int i2 = paramList.size();
    paramParcel.writeInt(i2);
    for (int i3 = 0; i3 < i2; i3++) {
      paramParcel.writeInt(((Integer)paramList.get(i3)).intValue());
    }
    n(paramParcel, i1);
  }
  
  public static void a(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    b(paramParcel, paramInt, 4);
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      paramParcel.writeInt(i1);
      return;
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfByte);
    n(paramParcel, i1);
  }
  
  public static void a(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfInt);
    n(paramParcel, i1);
  }
  
  public static <T extends Parcelable> void a(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfT == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt1);
    int i2 = paramArrayOfT.length;
    paramParcel.writeInt(i2);
    int i3 = 0;
    if (i3 < i2)
    {
      T ? = paramArrayOfT[i3];
      if (? == null) {
        paramParcel.writeInt(0);
      }
      for (;;)
      {
        i3++;
        break;
        a(paramParcel, ?, paramInt2);
      }
    }
    n(paramParcel, i1);
  }
  
  public static void a(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    n(paramParcel, i1);
  }
  
  public static <T extends Parcelable> void a(Parcel paramParcel, T paramT, int paramInt)
  {
    int i1 = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int i2 = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    int i3 = paramParcel.dataPosition();
    paramParcel.setDataPosition(i1);
    paramParcel.writeInt(i3 - i2);
    paramParcel.setDataPosition(i3);
  }
  
  public static void a(SpannableStringBuilder paramSpannableStringBuilder, CharSequence paramCharSequence, Object paramObject)
  {
    int i1 = paramSpannableStringBuilder.length();
    paramSpannableStringBuilder.append(paramCharSequence);
    paramSpannableStringBuilder.setSpan(paramObject, i1, paramSpannableStringBuilder.length(), 33);
  }
  
  @TargetApi(11)
  public static void a(View paramView, float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        paramView.setAlpha(paramFloat);
      }
      return;
    }
  }
  
  public static void a(View paramView, pei parampei)
  {
    Object localObject = (List)paramView.getTag(pek.a);
    if (localObject == null)
    {
      localObject = new ArrayList();
      paramView.setTag(pek.a, localObject);
    }
    ((List)localObject).add(parampei);
  }
  
  public static void a(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, 0, paramInt3, 0);
      return;
    }
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(paramInt1, 0, paramInt3, 0);
  }
  
  public static void a(TextView paramTextView, Spannable paramSpannable)
  {
    for (URLSpan localURLSpan : (URLSpan[])paramSpannable.getSpans(0, paramSpannable.length(), URLSpan.class)) {
      paramSpannable.setSpan(new lwn(), paramSpannable.getSpanStart(localURLSpan), paramSpannable.getSpanEnd(localURLSpan), 0);
    }
    paramTextView.setText(paramSpannable);
    paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
  }
  
  public static void a(TextView paramTextView, String paramString1, SpannableStringBuilder paramSpannableStringBuilder, String paramString2, Object paramObject1, Object paramObject2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      paramTextView.setText(paramString1);
      return;
    }
    int i1 = paramString1.toUpperCase().indexOf(paramString2);
    if (i1 == -1)
    {
      paramTextView.setText(paramString1);
      return;
    }
    paramSpannableStringBuilder.clear();
    paramSpannableStringBuilder.append(paramString1);
    int i2 = i1 + paramString2.length();
    if (i2 > paramSpannableStringBuilder.length()) {
      i2 = paramSpannableStringBuilder.length();
    }
    paramSpannableStringBuilder.setSpan(paramObject1, i1, i2, 0);
    paramSpannableStringBuilder.setSpan(paramObject2, i1, i2, 0);
    paramTextView.setText(paramSpannableStringBuilder);
  }
  
  public static void a(ViewFlipper paramViewFlipper)
  {
    TranslateAnimation localTranslateAnimation1 = new TranslateAnimation(2, 0.0F, 2, -1.0F, 2, 0.0F, 2, 0.0F);
    localTranslateAnimation1.setDuration(1000L);
    localTranslateAnimation1.setInterpolator(new DecelerateInterpolator());
    paramViewFlipper.setOutAnimation(localTranslateAnimation1);
    TranslateAnimation localTranslateAnimation2 = new TranslateAnimation(2, 1.0F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
    localTranslateAnimation2.setDuration(1000L);
    localTranslateAnimation2.setInterpolator(new DecelerateInterpolator());
    paramViewFlipper.setInAnimation(localTranslateAnimation2);
    paramViewFlipper.showNext();
  }
  
  public static void a(bw parambw)
  {
    bj localbj = (bj)parambw.a("ProgressDialogHelper:progress_dialog");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  public static void a(FilterParameter paramFilterParameter, ArrayList<qml> paramArrayList, oih paramoih)
  {
    int i1 = 201;
    int i2 = paramFilterParameter.getParameterInteger(12);
    if (i2 == 0)
    {
      byte[] arrayOfByte = paramFilterParameter.getParameterBuffer(i1);
      if ((arrayOfByte == null) || (arrayOfByte.length == 0)) {
        arrayOfByte = paramFilterParameter.getParameterBuffer(202);
      }
      if ((arrayOfByte == null) || (arrayOfByte.length == 0)) {}
      qmg localqmg2;
      do
      {
        return;
        localqmg2 = b(arrayOfByte);
      } while ((localqmg2 == null) || (localqmg2.e == null));
      paramoih.a.e = localqmg2.e;
      return;
    }
    if (i2 == 1) {}
    for (;;)
    {
      qmg localqmg1 = b(paramFilterParameter.getParameterBuffer(i1));
      if (localqmg1 == null) {
        break;
      }
      if (localqmg1.e != null) {
        paramoih.a.e = localqmg1.e;
      }
      for (qml localqml : localqmg1.a) {
        if (gfj.a(localqml)) {
          paramArrayList.add(localqml);
        }
      }
      break;
      i1 = 202;
    }
  }
  
  public static void a(gje paramgje, ome paramome)
  {
    paramgje.c("sharebox_default_acl_base64", Base64.encodeToString(qat.a(paramome), 0));
    paramgje.i("sharebox_settings_base64");
  }
  
  public static void a(Object paramObject, View paramView)
  {
    ((Transition)paramObject).setEpicenterCallback(new cm(a(paramView)));
  }
  
  public static void a(Object paramObject, View paramView, Map<String, View> paramMap, ArrayList<View> paramArrayList)
  {
    TransitionSet localTransitionSet = (TransitionSet)paramObject;
    paramArrayList.clear();
    paramArrayList.addAll(paramMap.values());
    List localList = localTransitionSet.getTargets();
    localList.clear();
    int i1 = paramArrayList.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView1 = (View)paramArrayList.get(i2);
      int i3 = localList.size();
      if (!a(localList, localView1, i3))
      {
        localList.add(localView1);
        for (int i4 = i3; i4 < localList.size(); i4++)
        {
          View localView2 = (View)localList.get(i4);
          if ((localView2 instanceof ViewGroup))
          {
            ViewGroup localViewGroup = (ViewGroup)localView2;
            int i5 = localViewGroup.getChildCount();
            for (int i6 = 0; i6 < i5; i6++)
            {
              View localView3 = localViewGroup.getChildAt(i6);
              if (!a(localList, localView3, i3)) {
                localList.add(localView3);
              }
            }
          }
        }
      }
    }
    paramArrayList.add(paramView);
    b(localTransitionSet, paramArrayList);
  }
  
  public static void a(Object paramObject1, Object paramObject2, View paramView1, cr paramcr, View paramView2, cq paramcq, Map<String, String> paramMap, ArrayList<View> paramArrayList1, Map<String, View> paramMap1, Map<String, View> paramMap2, ArrayList<View> paramArrayList2)
  {
    if ((paramObject1 != null) || (paramObject2 != null))
    {
      Transition localTransition = (Transition)paramObject1;
      if (localTransition != null) {
        localTransition.addTarget(paramView2);
      }
      if (paramObject2 != null) {
        a(paramObject2, paramView2, paramMap1, paramArrayList2);
      }
      paramView1.getViewTreeObserver().addOnPreDrawListener(new cn(paramView1, localTransition, paramView2, paramcr, paramMap, paramMap2, paramArrayList1));
      if (localTransition != null) {
        localTransition.setEpicenterCallback(new co(paramcq));
      }
    }
  }
  
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("null");
      return;
    }
    String str = paramObject.getClass().getSimpleName();
    if ((str == null) || (str.length() <= 0))
    {
      str = paramObject.getClass().getName();
      int i1 = str.lastIndexOf('.');
      if (i1 > 0) {
        str = str.substring(i1 + 1);
      }
    }
    paramStringBuilder.append(str);
    paramStringBuilder.append('{');
    paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
  }
  
  public static void a(Object paramObject, ArrayList<View> paramArrayList)
  {
    Transition localTransition = (Transition)paramObject;
    if ((localTransition instanceof TransitionSet))
    {
      TransitionSet localTransitionSet = (TransitionSet)localTransition;
      int i2 = localTransitionSet.getTransitionCount();
      for (int i3 = 0; i3 < i2; i3++) {
        a(localTransitionSet.getTransitionAt(i3), paramArrayList);
      }
    }
    if (!a(localTransition))
    {
      List localList = localTransition.getTargets();
      if ((localList != null) && (localList.size() == paramArrayList.size()) && (localList.containsAll(paramArrayList))) {
        for (int i1 = -1 + paramArrayList.size(); i1 >= 0; i1--) {
          localTransition.removeTarget((View)paramArrayList.get(i1));
        }
      }
    }
  }
  
  public static void a(Runnable paramRunnable, boolean paramBoolean)
  {
    m().removeCallbacks(paramRunnable);
    m().post(paramRunnable);
  }
  
  public static void a(String paramString, Context paramContext)
  {
    String str1 = paramContext.getCacheDir().getPath();
    File localFile = u(paramContext);
    if (localFile != null) {}
    for (String str2 = localFile.getPath();; str2 = null)
    {
      if ((paramString.contains(str1)) || ((!TextUtils.isEmpty(str2)) && (paramString.contains(str2)))) {
        l(paramString);
      }
      return;
    }
  }
  
  public static void a(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    if (paramObject != null)
    {
      if (!(paramObject instanceof eyk)) {
        break label420;
      }
      int i1 = paramStringBuffer1.length();
      if (paramString != null)
      {
        paramStringBuffer2.append(paramStringBuffer1).append(g(paramString)).append(" <\n");
        paramStringBuffer1.append("  ");
      }
      Class localClass1 = paramObject.getClass();
      Field[] arrayOfField = localClass1.getFields();
      int i2 = arrayOfField.length;
      int i3 = 0;
      if (i3 < i2)
      {
        Field localField = arrayOfField[i3];
        int i6 = localField.getModifiers();
        String str6 = localField.getName();
        Object localObject;
        if (((i6 & 0x1) == 1) && ((i6 & 0x8) != 8) && (!str6.startsWith("_")) && (!str6.endsWith("_")))
        {
          Class localClass2 = localField.getType();
          localObject = localField.get(paramObject);
          if (!localClass2.isArray()) {
            break label234;
          }
          if (localClass2.getComponentType() != Byte.TYPE) {
            break label186;
          }
          a(str6, localObject, paramStringBuffer1, paramStringBuffer2);
        }
        for (;;)
        {
          i3++;
          break;
          label186:
          if (localObject == null) {}
          for (int i7 = 0;; i7 = Array.getLength(localObject))
          {
            for (int i8 = 0; i8 < i7; i8++) {
              a(str6, Array.get(localObject, i8), paramStringBuffer1, paramStringBuffer2);
            }
            break;
          }
          label234:
          a(str6, localObject, paramStringBuffer1, paramStringBuffer2);
        }
      }
      Method[] arrayOfMethod = localClass1.getMethods();
      int i4 = arrayOfMethod.length;
      int i5 = 0;
      while (i5 < i4)
      {
        String str4 = arrayOfMethod[i5].getName();
        String str5;
        if (str4.startsWith("set")) {
          str5 = str4.substring(3);
        }
        for (;;)
        {
          try
          {
            Method localMethod1 = localClass1.getMethod("has" + str5, new Class[0]);
            if (!((Boolean)localMethod1.invoke(paramObject, new Object[0])).booleanValue()) {}
          }
          catch (NoSuchMethodException localNoSuchMethodException1)
          {
            Method localMethod2;
            String str1;
            String str2;
            String str3;
            continue;
          }
          try
          {
            localMethod2 = localClass1.getMethod("get" + str5, new Class[0]);
            a(str5, localMethod2.invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
            i5++;
          }
          catch (NoSuchMethodException localNoSuchMethodException2) {}
        }
      }
      if (paramString != null)
      {
        paramStringBuffer1.setLength(i1);
        paramStringBuffer2.append(paramStringBuffer1).append(">\n");
      }
    }
    return;
    label420:
    str1 = g(paramString);
    paramStringBuffer2.append(paramStringBuffer1).append(str1).append(": ");
    if ((paramObject instanceof String))
    {
      str2 = (String)paramObject;
      if ((!str2.startsWith("http")) && (str2.length() > 200)) {
        str2 = str2.substring(0, 200) + "[...]";
      }
      str3 = h(str2);
      paramStringBuffer2.append("\"").append(str3).append("\"");
    }
    for (;;)
    {
      paramStringBuffer2.append("\n");
      return;
      if ((paramObject instanceof byte[])) {
        a((byte[])paramObject, paramStringBuffer2);
      } else {
        paramStringBuffer2.append(paramObject);
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, Point paramPoint)
  {
    hxp localhxp = new hxp();
    localhxp.a(paramString1);
    int i1 = hxp.a;
    Integer localInteger1 = Integer.valueOf(paramPoint.x);
    hya localhya1 = localhxp.a(i1, localhxp.d(i1));
    Integer localInteger2;
    hya localhya2;
    if (localhya1 == null)
    {
      int i2 = hxp.b;
      localInteger2 = Integer.valueOf(paramPoint.y);
      localhya2 = localhxp.a(i2, localhxp.d(i2));
      if (localhya2 != null) {
        break label103;
      }
    }
    for (;;)
    {
      localhxp.b(paramString2, localhxp.v.a());
      return;
      localhya1.a(localInteger1);
      break;
      label103:
      localhya2.a(localInteger2);
    }
  }
  
  public static void a(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      paramString2 = String.format(Locale.US, paramString2, paramVarArgs);
    }
    Throwable localThrowable;
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      localThrowable = null;
    }
    while (localThrowable != null)
    {
      Log.e(H(paramString1), paramString2, localThrowable);
      return;
      Object localObject = paramVarArgs[(-1 + paramVarArgs.length)];
      if (!(localObject instanceof Throwable)) {
        localThrowable = null;
      } else {
        localThrowable = (Throwable)localObject;
      }
    }
    Log.e(H(paramString1), paramString2);
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("(");
    int i1 = paramVarArgs.length;
    String str = "";
    int i2 = 0;
    if (i2 < i1)
    {
      Object localObject = paramVarArgs[i2];
      localStringBuilder.append(str);
      if ((localObject instanceof Bundle)) {
        localStringBuilder.append(fne.a((Bundle)localObject));
      }
      for (;;)
      {
        str = ", ";
        i2++;
        break;
        localStringBuilder.append(localObject);
      }
    }
    localStringBuilder.append(")");
    if (Log.isLoggable("PeopleClientCall", 2)) {
      new Throwable("STACK TRACE (It's not crash!)");
    }
  }
  
  public static void a(StringBuilder paramStringBuilder, CharSequence... paramVarArgs)
  {
    int i1 = paramVarArgs.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      CharSequence localCharSequence = paramVarArgs[i2];
      if (!TextUtils.isEmpty(localCharSequence)) {
        paramStringBuilder.append(localCharSequence).append(". ");
      }
    }
  }
  
  public static void a(ByteBuffer paramByteBuffer, String paramString)
  {
    FileChannel localFileChannel = new RandomAccessFile(paramString, "rw").getChannel();
    try
    {
      localFileChannel.write(paramByteBuffer);
      paramByteBuffer.position(0);
      return;
    }
    finally
    {
      localFileChannel.close();
    }
  }
  
  public static void a(ArrayList<View> paramArrayList, View paramView)
  {
    ViewGroup localViewGroup;
    if (paramView.getVisibility() == 0)
    {
      if (!(paramView instanceof ViewGroup)) {
        break label65;
      }
      localViewGroup = (ViewGroup)paramView;
      if (!localViewGroup.isTransitionGroup()) {
        break label33;
      }
      paramArrayList.add(localViewGroup);
    }
    for (;;)
    {
      return;
      label33:
      int i1 = localViewGroup.getChildCount();
      for (int i2 = 0; i2 < i1; i2++) {
        a(paramArrayList, localViewGroup.getChildAt(i2));
      }
    }
    label65:
    paramArrayList.add(paramView);
  }
  
  public static void a(Map<String, View> paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = paramView.getTransitionName();
      if (str != null) {
        paramMap.put(str, paramView);
      }
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i1 = localViewGroup.getChildCount();
        for (int i2 = 0; i2 < i1; i2++) {
          a(paramMap, localViewGroup.getChildAt(i2));
        }
      }
    }
  }
  
  public static void a(mca parammca)
  {
    ((gxe)parammca.bo.a(gxe.class)).a();
  }
  
  public static void a(mja parammja, boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    rng localrng = new rng();
    rmi localrmi = new rmi();
    localrmi.g = paramInt1;
    rnk localrnk = new rnk();
    int i1 = 0;
    if (paramInt3 != 0)
    {
      localrnk.a = Integer.valueOf(paramInt3);
      i1 = 1;
    }
    if (paramInt4 != 0)
    {
      localrnk.c = Integer.valueOf(paramInt4);
      i1 = 1;
    }
    if (paramInt5 != 0)
    {
      localrnk.b = Integer.valueOf(paramInt5);
      i1 = 1;
    }
    if (paramInt6 != 0)
    {
      localrnk.d = Integer.valueOf(paramInt6);
      i1 = 1;
    }
    if (!paramBoolean1) {
      localrmi.a = Boolean.valueOf(true);
    }
    if (paramBoolean2) {
      localrmi.b = Boolean.valueOf(true);
    }
    localrmi.c = Integer.valueOf(paramInt7);
    localrmi.d = Integer.valueOf(paramInt2);
    localrmi.e = Integer.valueOf(paramInt8);
    if (i1 != 0) {
      localrmi.f = localrnk;
    }
    localrng.d = localrmi;
    rns localrns = new rns();
    localrns.d = localrng;
    parammja.c = localrns;
  }
  
  public static void a(tp paramtp, boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT <= 19) && (paramBoolean)) {}
    for (boolean bool = true;; bool = false)
    {
      paramtp.b(bool);
      return;
    }
  }
  
  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalStateException(String.valueOf(paramObject));
    }
  }
  
  public static void a(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
    }
  }
  
  public static void a(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    if (paramArrayOfByte == null)
    {
      paramStringBuffer.append("\"\"");
      return;
    }
    paramStringBuffer.append('"');
    int i1 = 0;
    if (i1 < paramArrayOfByte.length)
    {
      int i2 = 0xFF & paramArrayOfByte[i1];
      if ((i2 == 92) || (i2 == 34)) {
        paramStringBuffer.append('\\').append((char)i2);
      }
      for (;;)
      {
        i1++;
        break;
        if ((i2 >= 32) && (i2 < 127))
        {
          paramStringBuffer.append((char)i2);
        }
        else
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(i2);
          paramStringBuffer.append(String.format("\\%03o", arrayOfObject));
        }
      }
    }
    paramStringBuffer.append('"');
  }
  
  public static boolean a(char paramChar)
  {
    return (paramChar == '+') || (paramChar == '@');
  }
  
  public static boolean a(long paramLong1, TimeZone paramTimeZone1, long paramLong2, TimeZone paramTimeZone2, boolean paramBoolean)
  {
    long l1 = paramLong2 - paramLong1;
    boolean bool1 = l1 < 0L;
    boolean bool2 = false;
    if (!bool1)
    {
      boolean bool3 = l1 < 604800000L;
      bool2 = false;
      if (bool3)
      {
        Calendar localCalendar1 = Calendar.getInstance();
        if (paramTimeZone1 != null) {
          localCalendar1.setTimeZone(paramTimeZone1);
        }
        localCalendar1.setTimeInMillis(paramLong1);
        Calendar localCalendar2 = Calendar.getInstance();
        if (paramTimeZone2 != null) {
          localCalendar2.setTimeZone(paramTimeZone2);
        }
        localCalendar2.setTimeInMillis(paramLong2);
        int i1 = localCalendar1.get(7);
        int i2 = localCalendar2.get(7);
        if ((i1 >= i2) && ((paramBoolean) || (i1 == i2)))
        {
          boolean bool4 = l1 < 86400000L;
          bool2 = false;
          if (!bool4) {}
        }
        else
        {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static boolean a(Context paramContext, int paramInt, List<gnb> paramList)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    try
    {
      byte[] arrayOfByte = gnl.a(paramList);
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("audience_history", arrayOfByte);
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      return true;
    }
    catch (IOException localIOException)
    {
      a(6, "AclDataUtils", "Error saving audience history");
    }
    return false;
  }
  
  public static boolean a(Context paramContext, Intent paramIntent)
  {
    List localList = paramContext.getPackageManager().queryIntentActivities(paramIntent, 128);
    int i1 = localList.size();
    int i2 = 0;
    ResolveInfo localResolveInfo;
    if (i2 < i1)
    {
      localResolveInfo = (ResolveInfo)localList.get(i2);
      if (!"com.google.android.talk".equals(localResolveInfo.activityInfo.packageName)) {}
    }
    for (;;)
    {
      if (localResolveInfo == null)
      {
        Log.e("Intents", "Intent not supported by Hangouts app");
        return false;
        i2++;
        break;
      }
      paramIntent.setClassName(localResolveInfo.activityInfo.packageName, localResolveInfo.activityInfo.name);
      return true;
      localResolveInfo = null;
    }
  }
  
  public static boolean a(Context paramContext, Uri paramUri)
  {
    long l1 = ContentUris.parseId(paramUri);
    itd localitd = b(paramUri);
    if (localitd == null) {
      if (Log.isLoggable("LocalMediaData", 6))
      {
        String str2 = String.valueOf(paramUri);
        Log.e("LocalMediaData", 25 + String.valueOf(str2).length() + "fail to get path for uri:" + str2);
      }
    }
    for (Object localObject = null;; localObject = a(paramContext, localitd, l1))
    {
      String str1 = hco.a(paramContext).a(paramUri.toString(), false);
      if ((TextUtils.isEmpty((CharSequence)localObject)) || (TextUtils.isEmpty(str1))) {
        break;
      }
      return bvf.a(paramContext, paramUri, new File((String)localObject), str1);
    }
    return false;
  }
  
  /* Error */
  public static boolean a(Context paramContext, Uri paramUri, File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_3
    //   5: aload_3
    //   6: aload_1
    //   7: invokevirtual 7255	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   10: astore 17
    //   12: aload 17
    //   14: astore 11
    //   16: aload 11
    //   18: ifnonnull +17 -> 35
    //   21: aload 11
    //   23: ifnull +10 -> 33
    //   26: aload 11
    //   28: invokeinterface 10641 1 0
    //   33: iconst_0
    //   34: ireturn
    //   35: new 10643	java/io/BufferedOutputStream
    //   38: dup
    //   39: new 10645	java/io/FileOutputStream
    //   42: dup
    //   43: aload_2
    //   44: iconst_0
    //   45: invokespecial 10648	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   48: invokespecial 10651	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   51: astore 13
    //   53: sipush 8192
    //   56: newarray byte
    //   58: astore 20
    //   60: aload 11
    //   62: aload 20
    //   64: invokevirtual 10654	java/io/InputStream:read	([B)I
    //   67: istore 21
    //   69: iload 21
    //   71: iconst_m1
    //   72: if_icmpeq +54 -> 126
    //   75: aload 13
    //   77: aload 20
    //   79: iconst_0
    //   80: iload 21
    //   82: invokevirtual 10656	java/io/BufferedOutputStream:write	([BII)V
    //   85: goto -25 -> 60
    //   88: astore 19
    //   90: aload 13
    //   92: astore 5
    //   94: aload 11
    //   96: astore 6
    //   98: aload 6
    //   100: ifnull +10 -> 110
    //   103: aload 6
    //   105: invokeinterface 10641 1 0
    //   110: aload 5
    //   112: ifnull +8 -> 120
    //   115: aload 5
    //   117: invokevirtual 10657	java/io/BufferedOutputStream:close	()V
    //   120: iconst_0
    //   121: istore 7
    //   123: iload 7
    //   125: ireturn
    //   126: iconst_1
    //   127: istore 7
    //   129: aload 11
    //   131: ifnull +10 -> 141
    //   134: aload 11
    //   136: invokeinterface 10641 1 0
    //   141: aload 13
    //   143: invokevirtual 10657	java/io/BufferedOutputStream:close	()V
    //   146: goto -23 -> 123
    //   149: astore 22
    //   151: iconst_0
    //   152: istore 7
    //   154: goto -31 -> 123
    //   157: astore 8
    //   159: iconst_0
    //   160: istore 7
    //   162: goto -39 -> 123
    //   165: astore 12
    //   167: aconst_null
    //   168: astore 13
    //   170: aconst_null
    //   171: astore 11
    //   173: aload 12
    //   175: astore 14
    //   177: aload 11
    //   179: ifnull +10 -> 189
    //   182: aload 11
    //   184: invokeinterface 10641 1 0
    //   189: aload 13
    //   191: ifnull +8 -> 199
    //   194: aload 13
    //   196: invokevirtual 10657	java/io/BufferedOutputStream:close	()V
    //   199: aload 14
    //   201: athrow
    //   202: astore 27
    //   204: iconst_0
    //   205: ireturn
    //   206: astore 23
    //   208: goto -67 -> 141
    //   211: astore 9
    //   213: goto -103 -> 110
    //   216: astore 16
    //   218: goto -29 -> 189
    //   221: astore 15
    //   223: goto -24 -> 199
    //   226: astore 26
    //   228: aload 26
    //   230: astore 14
    //   232: aconst_null
    //   233: astore 13
    //   235: goto -58 -> 177
    //   238: astore 14
    //   240: goto -63 -> 177
    //   243: astore 10
    //   245: aconst_null
    //   246: astore 5
    //   248: aconst_null
    //   249: astore 11
    //   251: goto -157 -> 94
    //   254: astore 25
    //   256: aconst_null
    //   257: astore 5
    //   259: goto -165 -> 94
    //   262: astore 4
    //   264: aconst_null
    //   265: astore 5
    //   267: aconst_null
    //   268: astore 6
    //   270: goto -172 -> 98
    //   273: astore 24
    //   275: aload 11
    //   277: astore 6
    //   279: aconst_null
    //   280: astore 5
    //   282: goto -184 -> 98
    //   285: astore 18
    //   287: aload 13
    //   289: astore 5
    //   291: aload 11
    //   293: astore 6
    //   295: goto -197 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	298	0	paramContext	Context
    //   0	298	1	paramUri	Uri
    //   0	298	2	paramFile	File
    //   4	2	3	localContentResolver	ContentResolver
    //   262	1	4	localSecurityException1	java.lang.SecurityException
    //   92	198	5	localBufferedOutputStream1	java.io.BufferedOutputStream
    //   96	198	6	localInputStream1	InputStream
    //   121	40	7	bool	boolean
    //   157	1	8	localIOException1	IOException
    //   211	1	9	localIOException2	IOException
    //   243	1	10	localIOException3	IOException
    //   14	278	11	localInputStream2	InputStream
    //   165	9	12	localObject1	Object
    //   51	237	13	localBufferedOutputStream2	java.io.BufferedOutputStream
    //   175	56	14	localObject2	Object
    //   238	1	14	localObject3	Object
    //   221	1	15	localIOException4	IOException
    //   216	1	16	localIOException5	IOException
    //   10	3	17	localInputStream3	InputStream
    //   285	1	18	localSecurityException2	java.lang.SecurityException
    //   88	1	19	localIOException6	IOException
    //   58	20	20	arrayOfByte	byte[]
    //   67	14	21	i1	int
    //   149	1	22	localIOException7	IOException
    //   206	1	23	localIOException8	IOException
    //   273	1	24	localSecurityException3	java.lang.SecurityException
    //   254	1	25	localIOException9	IOException
    //   226	3	26	localObject4	Object
    //   202	1	27	localIOException10	IOException
    // Exception table:
    //   from	to	target	type
    //   53	60	88	java/io/IOException
    //   60	69	88	java/io/IOException
    //   75	85	88	java/io/IOException
    //   141	146	149	java/io/IOException
    //   115	120	157	java/io/IOException
    //   5	12	165	finally
    //   26	33	202	java/io/IOException
    //   134	141	206	java/io/IOException
    //   103	110	211	java/io/IOException
    //   182	189	216	java/io/IOException
    //   194	199	221	java/io/IOException
    //   35	53	226	finally
    //   53	60	238	finally
    //   60	69	238	finally
    //   75	85	238	finally
    //   5	12	243	java/io/IOException
    //   35	53	254	java/io/IOException
    //   5	12	262	java/lang/SecurityException
    //   35	53	273	java/lang/SecurityException
    //   53	60	285	java/lang/SecurityException
    //   60	69	285	java/lang/SecurityException
    //   75	85	285	java/lang/SecurityException
  }
  
  public static boolean a(Context paramContext, bw parambw, int paramInt, boolean paramBoolean, String paramString)
  {
    if (a(paramContext, paramBoolean, paramInt))
    {
      String str1 = paramContext.getString(aau.pc);
      String str2 = a(paramContext, "plusone_posts", "https://support.google.com/plus/?hl=%locale%").toString();
      gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
      String str3;
      if (localgjb.c("is_default_restricted")) {
        str3 = paramContext.getString(aau.pb, new Object[] { str2 });
      }
      for (;;)
      {
        lut.b(str1, str3, paramContext.getString(aau.mf), null).a(parambw, paramString);
        return true;
        if (localgjb.c("is_child")) {
          str3 = paramContext.getString(aau.pa, new Object[] { str2 });
        } else {
          str3 = paramContext.getString(aau.oZ, new Object[] { str2 });
        }
      }
    }
    return false;
  }
  
  public static boolean a(Context paramContext, gnb paramgnb1, gnb paramgnb2)
  {
    return (paramgnb2 != null) && (TextUtils.equals(paramgnb1.a(paramContext), paramgnb2.a(paramContext)));
  }
  
  public static <T extends gnk> boolean a(Context paramContext, gnb paramgnb, Class<T> paramClass)
  {
    List localList = mbb.c(paramContext, paramClass);
    if (localList == null) {
      return false;
    }
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext()) {
      if (((gnk)localIterator.next()).a(paramgnb)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(Context paramContext, ipf paramipf)
  {
    if (paramipf.d != null) {}
    for (int i1 = 1; i1 == 0; i1 = 0) {
      return false;
    }
    jg localjg = new jg(paramContext);
    Uri localUri = paramipf.d;
    try
    {
      localjg.a.a("ImagePrint", localUri, null);
      return true;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Log.e("Print", "Count not generate PDF", localFileNotFoundException);
    }
    return false;
  }
  
  public static boolean a(Context paramContext, ArrayList<Uri> paramArrayList, ArrayList<String> paramArrayList1)
  {
    int i1 = paramArrayList.size();
    int i2 = 0;
    Object localObject;
    String str1;
    label117:
    int i3;
    if (i2 < i1)
    {
      localObject = (Uri)paramArrayList.get(i2);
      if (localObject == null) {
        throw new NullPointerException();
      }
      if (irn.a(paramContext, (Uri)localObject, null) == null) {
        throw new NullPointerException();
      }
      if (!TextUtils.equals(((Uri)localObject).getAuthority(), "media"))
      {
        try
        {
          localFile1 = paramContext.getCacheDir();
          if (localFile1 == null) {
            break label313;
          }
          str1 = mfq.b(paramContext.getContentResolver(), (Uri)localObject);
          if (TextUtils.equals(str1, "image/jpg")) {
            break label322;
          }
          if (!TextUtils.equals(str1, "image/jpeg")) {
            break label217;
          }
        }
        catch (IOException localIOException)
        {
          File localFile1;
          Log.e("MediaPickerContentUri", "Failed to copy file", localIOException);
          return false;
        }
        if (i3 != 0) {
          break label328;
        }
        if (TextUtils.equals(str1, "image/*")) {
          break label328;
        }
      }
    }
    label136:
    String str2;
    label313:
    label322:
    label328:
    label336:
    for (File localFile2 = File.createTempFile("gplus", str2, localFile1);; localFile2 = null)
    {
      boolean bool2;
      File localFile4;
      if (localFile2 != null)
      {
        boolean bool1 = a(paramContext, (Uri)localObject, localFile2);
        File localFile3 = localFile2;
        bool2 = bool1;
        localFile4 = localFile3;
      }
      for (;;)
      {
        if (!bool2)
        {
          Log.e("MediaPickerContentUri", "Media copy failed.  Cannot be sure high resolution version will be uploaded.");
          throw new IOException("Error copying file.");
          label217:
          i3 = 0;
          break label117;
          if (TextUtils.equals(str1, "image/png"))
          {
            str2 = ".png";
            break label136;
          }
          if (mfq.c(str1))
          {
            str2 = ".mp4";
            break label136;
          }
          if (!mfq.a(str1)) {
            break label336;
          }
          str2 = ".gif";
          break label136;
        }
        Uri localUri = Uri.fromFile(localFile4);
        localObject = localUri;
        paramArrayList1.add(((Uri)localObject).toString());
        i2++;
        break;
        return true;
        localFile4 = localFile2;
        bool2 = false;
        continue;
        localFile4 = null;
        bool2 = false;
      }
      i3 = 1;
      break label117;
      str2 = ".jpg";
      break label136;
    }
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean, int paramInt)
  {
    hyi localhyi = (hyi)mbb.a(paramContext, hyi.class);
    boolean bool1 = localhyi.b(bwb.e, paramInt);
    boolean bool2 = localhyi.b(bwb.f, paramInt);
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    if ((localgjb.c("is_default_restricted")) || (localgjb.c("is_child")) || (bool2)) {
      return (paramBoolean) && (bool1) && (!bgp.b(paramContext, paramInt));
    }
    return false;
  }
  
  public static boolean a(Resources paramResources)
  {
    if (paramResources == null) {}
    label32:
    label56:
    label97:
    label102:
    label108:
    label114:
    label118:
    for (;;)
    {
      return false;
      int i1;
      int i2;
      int i3;
      int i4;
      if ((0xF & paramResources.getConfiguration().screenLayout) > 3)
      {
        i1 = 1;
        if (Build.VERSION.SDK_INT < 11) {
          break label97;
        }
        i2 = 1;
        if ((i2 == 0) || (i1 == 0))
        {
          Configuration localConfiguration = paramResources.getConfiguration();
          if (Build.VERSION.SDK_INT < 13) {
            break label102;
          }
          i3 = 1;
          if (i3 == 0) {
            break label114;
          }
          if (((0xF & localConfiguration.screenLayout) > 3) || (localConfiguration.smallestScreenWidthDp < 600)) {
            break label108;
          }
          i4 = 1;
        }
      }
      for (;;)
      {
        if (i4 == 0) {
          break label118;
        }
        return true;
        i1 = 0;
        break;
        i2 = 0;
        break label32;
        i3 = 0;
        break label56;
        i4 = 0;
        continue;
        i4 = 0;
      }
    }
  }
  
  public static boolean a(Uri paramUri)
  {
    if (paramUri == null) {
      return false;
    }
    String str1 = paramUri.getHost();
    if (TextUtils.isEmpty(str1)) {
      return true;
    }
    String str2 = str1.toLowerCase();
    if ((str2.equals("plus.google.com")) || (str2.equals("plus.sandbox.google.com"))) {
      return true;
    }
    if ((str2.equals("google.com")) || (str2.equals("www.google.com")))
    {
      List localList = paramUri.getPathSegments();
      if (!localList.isEmpty())
      {
        String str3 = (String)localList.get(0);
        if (str3.equals("+")) {
          return false;
        }
        if (str3.startsWith("+")) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean a(Messenger paramMessenger)
  {
    boolean bool = false;
    if (paramMessenger != null) {}
    try
    {
      IBinder localIBinder = paramMessenger.getBinder();
      bool = false;
      if (localIBinder != null) {
        bool = true;
      }
      return bool;
    }
    catch (NullPointerException localNullPointerException) {}
    return false;
  }
  
  public static boolean a(Transition paramTransition)
  {
    return (!a(paramTransition.getTargetIds())) || (!a(paramTransition.getTargetNames())) || (!a(paramTransition.getTargetTypes()));
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      boolean bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
      return bool;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface method onNestedPreFling", localAbstractMethodError);
    }
    return false;
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      boolean bool = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
      return bool;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface method onNestedFling", localAbstractMethodError);
    }
    return false;
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      boolean bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
      return bool;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface method onStartNestedScroll", localAbstractMethodError);
    }
    return false;
  }
  
  public static boolean a(FilterChain paramFilterChain, oih paramoih)
  {
    if (paramFilterChain == null) {
      return false;
    }
    paramoih.a = new qmg();
    ArrayList localArrayList = new ArrayList();
    int i1 = paramFilterChain.getPostRotation();
    if ((i1 != 0) && (i1 != 1) && (i1 != 2) && (i1 != 3)) {
      return false;
    }
    paramoih.a.d = i1;
    qml localqml1;
    Iterator localIterator;
    qml localqml2;
    if (!paramFilterChain.c())
    {
      localqml1 = null;
      localIterator = paramFilterChain.getFilterNodes().iterator();
      localqml2 = localqml1;
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label384;
      }
      FilterParameter localFilterParameter = ((FilterChainNode)localIterator.next()).getFilterParameter();
      if (localFilterParameter.getFilterType() == 18)
      {
        a(localFilterParameter, localArrayList, paramoih);
        if (localqml2 != null)
        {
          localArrayList.add(localqml2);
          localqml2 = null;
          continue;
          qmt localqmt = new qmt();
          localqmt.b = Float.valueOf(paramFilterChain.getRotationAngle());
          localqmt.c = new qmd();
          localqmt.c.b = 0;
          if (paramFilterChain.getAspectRatio() == 2) {
            localqmt.c.b = 2;
          }
          for (;;)
          {
            localqmt.c.a = new qmp();
            localqmt.c.a.a = Float.valueOf(paramFilterChain.getCropRectX());
            localqmt.c.a.b = Float.valueOf(paramFilterChain.getCropRectY());
            localqmt.c.a.c = Float.valueOf(paramFilterChain.getCropRectX() + paramFilterChain.getCropRectWidth());
            localqmt.c.a.d = Float.valueOf(paramFilterChain.getCropRectY() + paramFilterChain.getCropRectHeight());
            localqml1 = new qml();
            localqml1.a(qmt.a, localqmt);
            break;
            if (paramFilterChain.getAspectRatio() == 1) {
              localqmt.c.b = 1;
            }
          }
        }
      }
      else
      {
        if (localqml2 != null)
        {
          localArrayList.add(localqml2);
          localqml2 = null;
        }
        qml localqml3 = a(localFilterParameter);
        if (localqml3 == null) {
          return false;
        }
        localArrayList.add(localqml3);
      }
    }
    label384:
    if ((paramFilterChain.size() == 0) && (localqml2 != null)) {
      localArrayList.add(localqml2);
    }
    paramoih.a.a = ((qml[])localArrayList.toArray(new qml[localArrayList.size()]));
    return true;
  }
  
  public static boolean a(Integer paramInteger1, Integer paramInteger2)
  {
    if (paramInteger1 != null) {
      if ((paramInteger2 == null) || (a(paramInteger1) != a(paramInteger2))) {}
    }
    while (paramInteger2 == null)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static boolean a(List paramList)
  {
    return (paramList == null) || (paramList.isEmpty());
  }
  
  public static boolean a(List<View> paramList, View paramView, int paramInt)
  {
    for (int i1 = 0;; i1++)
    {
      boolean bool = false;
      if (i1 < paramInt)
      {
        if (paramList.get(i1) == paramView) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public static boolean a(jgw paramjgw)
  {
    int i1 = paramjgw.e();
    return (i1 == 8) || (i1 == 9) || (i1 == 5) || (i1 == 7);
  }
  
  public static boolean a(jgw paramjgw, int... paramVarArgs)
  {
    int i1 = paramjgw.e();
    for (int i2 = 0;; i2++)
    {
      int i3 = paramVarArgs.length;
      boolean bool = false;
      if (i2 < i3)
      {
        if (i1 == paramVarArgs[i2]) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public static boolean a(jjd paramjjd, List<jjd> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      if (jjd.a((jjd)localIterator.next(), paramjjd)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(jjg paramjjg)
  {
    return !TextUtils.isEmpty(paramjjg.c());
  }
  
  public static boolean a(nwj paramnwj)
  {
    return (paramnwj != null) && (paramnwj.d != null) && (paramnwj.d.i != null) && (paramnwj.d.i.a != null) && (paramnwj.d.i.a.length != 0);
  }
  
  public static boolean a(qkn paramqkn, byte[] paramArrayOfByte)
  {
    qkn localqkn = new qkn();
    localqkn.a = paramqkn.a;
    if (!TextUtils.isEmpty(paramqkn.b)) {
      localqkn.b = paramqkn.b;
    }
    int i1 = localqkn.a();
    localqkn.ak = i1;
    byte[] arrayOfByte = new byte[i1];
    qal localqal = new qal(arrayOfByte, 0, arrayOfByte.length);
    try
    {
      localqkn.a(localqal);
      return Arrays.equals(arrayOfByte, paramArrayOfByte);
    }
    catch (IOException localIOException) {}
    return false;
  }
  
  public static boolean a(qmg paramqmg)
  {
    return (paramqmg != null) && (paramqmg.a != null) && (paramqmg.a.length > 0);
  }
  
  public static boolean a(qml paramqml, int paramInt)
  {
    if (paramqml.a == null) {}
    for (;;)
    {
      return false;
      if (paramqml.a.a != null)
      {
        int[] arrayOfInt = paramqml.a.a;
        int i1 = arrayOfInt.length;
        for (int i2 = 0; i2 < i1; i2++) {
          if (arrayOfInt[i2] == paramInt) {
            return true;
          }
        }
      }
    }
  }
  
  public static byte[] a(Context paramContext, int paramInt, String paramString)
  {
    Cursor localCursor = bqj.a(paramContext, paramInt).getReadableDatabase().query(true, "activities", lnb.a, "activity_id=?", new String[] { paramString }, null, null, null, null);
    if (localCursor == null) {
      return null;
    }
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        byte[] arrayOfByte = localCursor.getBlob(0);
        localObject2 = arrayOfByte;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static byte[] a(Parcelable paramParcelable)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeParcelable(paramParcelable, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    return arrayOfByte;
  }
  
  public static byte[] a(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      return new byte[0];
    }
    if (paramByteBuffer.hasArray())
    {
      int i2 = paramByteBuffer.arrayOffset();
      if ((i2 == 0) && (paramByteBuffer.array().length == paramByteBuffer.limit())) {
        return paramByteBuffer.array();
      }
      return Arrays.copyOfRange(paramByteBuffer.array(), i2, i2 + paramByteBuffer.limit());
    }
    byte[] arrayOfByte = new byte[paramByteBuffer.limit()];
    int i1 = paramByteBuffer.position();
    paramByteBuffer.position(0);
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer.position(i1);
    return arrayOfByte;
  }
  
  public static <T extends qat> byte[] a(T[] paramArrayOfT)
  {
    int i1 = 0;
    byte[] arrayOfByte;
    if ((paramArrayOfT == null) || (paramArrayOfT.length == 0)) {
      arrayOfByte = null;
    }
    int i3;
    int i5;
    int i4;
    for (;;)
    {
      return arrayOfByte;
      for (;;)
      {
        try
        {
          int i2 = paramArrayOfT.length;
          if (i2 < 0) {
            break label183;
          }
          i3 = qal.d(i2);
        }
        catch (IOException localIOException)
        {
          T ?;
          int i6;
          qal localqal;
          Log.e("MessageNanoList", "Failed to serialize messages", localIOException);
          return null;
        }
        if (i5 >= paramArrayOfT.length) {
          continue;
        }
        ? = paramArrayOfT[i5];
        i6 = ?.a();
        ?.ak = i6;
        i4 += i6 + qal.d(i6);
        i5++;
      }
      arrayOfByte = new byte[i4];
      localqal = new qal(arrayOfByte, 0, arrayOfByte.length);
      localqal.a(paramArrayOfT.length);
      while (i1 < paramArrayOfT.length)
      {
        T ? = paramArrayOfT[i1];
        if (?.ak < 0) {
          ?.ak = ?.a();
        }
        localqal.c(?.ak);
        ?.a(localqal);
        i1++;
      }
    }
    for (;;)
    {
      i4 = i3 + 0;
      i5 = 0;
      break;
      label183:
      i3 = 10;
    }
  }
  
  public static RemoteInput[] a(ew[] paramArrayOfew)
  {
    if (paramArrayOfew == null) {
      return null;
    }
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfew.length];
    for (int i1 = 0; i1 < paramArrayOfew.length; i1++)
    {
      ew localew = paramArrayOfew[i1];
      arrayOfRemoteInput[i1] = new RemoteInput.Builder(localew.a()).setLabel(localew.b()).setChoices(localew.c()).setAllowFreeFormInput(localew.d()).addExtras(localew.e()).build();
    }
    return arrayOfRemoteInput;
  }
  
  public static <T> T[] a(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    if (paramArrayOfT1 == null) {}
    int i1;
    do
    {
      return paramArrayOfT2;
      if (paramArrayOfT2 == null) {
        return paramArrayOfT1;
      }
      i1 = paramArrayOfT1.length;
    } while (i1 == 0);
    int i2 = paramArrayOfT2.length;
    if (i2 == 0) {
      return paramArrayOfT1;
    }
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfT1, i1 + i2);
    System.arraycopy(paramArrayOfT2, 0, arrayOfObject, i1, i2);
    return arrayOfObject;
  }
  
  public static String[] a(String paramString)
  {
    int i1 = 0;
    HashSet localHashSet = new HashSet();
    try
    {
      String str = Uri.parse(paramString).getQueryParameter("pai");
      if (str == null) {
        return null;
      }
      String[] arrayOfString = new String(Base64.decode(str, 0), "UTF-8").split(",");
      while (i1 < arrayOfString.length)
      {
        if (!TextUtils.isEmpty(arrayOfString[i1])) {
          localHashSet.add(arrayOfString[i1]);
        }
        i1++;
      }
      return null;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.e("CloseTiesNotifications", localUnsupportedEncodingException.getMessage());
      if (!localHashSet.isEmpty()) {
        return (String[])localHashSet.toArray(new String[localHashSet.size()]);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("CloseTiesNotifications", localException.getMessage());
      }
    }
  }
  
  public static String[] a(mjd[] paramArrayOfmjd, int... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    if (i1 < paramArrayOfmjd.length) {
      for (int i2 = 0;; i2++) {
        if (i2 <= 0)
        {
          if (paramArrayOfmjd[i1].d == paramVarArgs[i2]) {
            localArrayList.add(paramArrayOfmjd[i1].a);
          }
        }
        else
        {
          i1++;
          break;
        }
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  public static mjk[] a(mjk[] paramArrayOfmjk)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfmjk != null) && (paramArrayOfmjk.length > 0)) {
      for (int i1 = 0; i1 < paramArrayOfmjk.length; i1++)
      {
        mjk localmjk = paramArrayOfmjk[i1];
        if (!"df".equals(localmjk.g)) {
          localArrayList.add(localmjk);
        }
      }
    }
    return (mjk[])localArrayList.toArray(new mjk[localArrayList.size()]);
  }
  
  public static okn[] a(SQLiteDatabase paramSQLiteDatabase, hdx paramhdx, String paramString)
  {
    if (paramhdx == null)
    {
      Log.e("EsTileData", "Null embedAlbum object; cannot insert into the database");
      return null;
    }
    int i1 = paramhdx.b;
    if (i1 == 0)
    {
      Log.e("EsTileData", "Invalid photo list; no photos");
      return null;
    }
    okn[] arrayOfokn1 = new okn[i1];
    for (int i2 = 0; i2 < i1; i2++)
    {
      hea localhea = paramhdx.g[i2];
      ojv localojv = new ojv();
      localojv.b = localhea.d;
      oir localoir = new oir();
      localoir.c = localhea.e;
      if (localoir.c == null) {
        localoir.c = "";
      }
      localoir.e = localojv;
      localoir.b = Integer.valueOf(1);
      localoir.d = 3;
      localoir.a = "";
      arrayOfokn1[i2] = a(paramSQLiteDatabase, localhea, localoir);
    }
    if (TextUtils.isEmpty(paramString)) {
      return arrayOfokn1;
    }
    String str1 = Uri.parse(paramString).getQueryParameter("pids");
    if (TextUtils.isEmpty(str1)) {
      return arrayOfokn1;
    }
    String[] arrayOfString = str1.split(",");
    if (arrayOfString.length != arrayOfokn1.length) {
      return arrayOfokn1;
    }
    okn[] arrayOfokn2 = new okn[arrayOfokn1.length];
    for (int i3 = 0; i3 < arrayOfString.length; i3++)
    {
      String str2 = arrayOfString[i3];
      int i4 = arrayOfokn1.length;
      int i5 = 0;
      okn localokn2;
      if (i5 < i4)
      {
        localokn2 = arrayOfokn1[i5];
        if (!TextUtils.equals(((okm)localokn2.b(okm.a)).b.d, str2)) {}
      }
      for (okn localokn1 = localokn2;; localokn1 = null)
      {
        if (localokn1 != null) {
          break label316;
        }
        return arrayOfokn1;
        i5++;
        break;
      }
      label316:
      arrayOfokn2[i3] = localokn1;
    }
    return arrayOfokn2;
  }
  
  public static <T extends qat> T[] a(byte[] paramArrayOfByte, Class<T> paramClass)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    try
    {
      qak localqak = new qak(paramArrayOfByte, 0, paramArrayOfByte.length);
      int i1 = localqak.i();
      if (i1 == 0) {
        return null;
      }
      Object localObject = Array.newInstance(paramClass, i1);
      for (int i2 = 0; i2 < i1; i2++)
      {
        qat localqat = (qat)paramClass.newInstance();
        localqak.a(localqat);
        Array.set(localObject, i2, localqat);
      }
      qat[] arrayOfqat = (qat[])localObject;
      return arrayOfqat;
    }
    catch (IOException localIOException)
    {
      Log.e("MessageNanoList", "Failed to deserialize messages", localIOException);
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.e("MessageNanoList", "Failed to access class when deserializing", localIllegalAccessException);
      return null;
    }
    catch (InstantiationException localInstantiationException)
    {
      Log.e("MessageNanoList", "Failed to instantiate message when deserializing", localInstantiationException);
    }
    return null;
  }
  
  public static int b(float paramFloat)
  {
    int i1 = (int)Math.floor(1.0F / paramFloat);
    if (i1 <= 1) {
      return 1;
    }
    if (i1 <= 8) {
      return iaw.b(i1);
    }
    return i1 / 8 << 3;
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    }
    do
    {
      do
      {
        do
        {
          return -12303292;
        } while ((paramInt1 & paramInt2) == 0);
        return -65536;
      } while ((paramInt1 & paramInt2) == 0);
      return -16711936;
    } while ((paramInt1 & paramInt2) == 0);
    return -16776961;
  }
  
  public static int b(agr paramagr, afs paramafs, View paramView1, View paramView2, agh paramagh, boolean paramBoolean)
  {
    if ((paramagh.l() == 0) || (paramagr.a() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return paramagr.a();
    }
    int i1 = paramafs.b(paramView2) - paramafs.a(paramView1);
    int i2 = 1 + Math.abs(((agi)paramView1.getLayoutParams()).c.c() - ((agi)paramView2.getLayoutParams()).c.c());
    return (int)(i1 / i2 * paramagr.a());
  }
  
  public static int b(View paramView)
  {
    if (!b) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinWidth");
      a = localField;
      localField.setAccessible(true);
      label28:
      b = true;
      if (a != null) {
        try
        {
          int i1 = ((Integer)a.get(paramView)).intValue();
          return i1;
        }
        catch (Exception localException) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label28;
    }
  }
  
  public static int b(fzk paramfzk)
  {
    switch (paramfzk.e())
    {
    case 0: 
    default: 
      return -1;
    case -1: 
      return 1;
    case 1: 
      return 9;
    case 2: 
      return 8;
    case 3: 
      return 5;
    }
    return 7;
  }
  
  public static int b(CharSequence paramCharSequence)
  {
    int i1 = 0;
    int i2 = paramCharSequence.length();
    for (int i3 = 0; (i3 < i2) && (paramCharSequence.charAt(i3) < ''); i3++) {}
    for (;;)
    {
      if (i3 < i2)
      {
        int i6 = paramCharSequence.charAt(i3);
        if (i6 < 2048)
        {
          i4 += (127 - i6 >>> 31);
          i3++;
          continue;
        }
        int i7 = paramCharSequence.length();
        if (i3 < i7)
        {
          int i8 = paramCharSequence.charAt(i3);
          if (i8 < 2048) {
            i1 += (127 - i8 >>> 31);
          }
          for (;;)
          {
            i3++;
            break;
            i1 += 2;
            if ((55296 <= i8) && (i8 <= 57343))
            {
              if (Character.codePointAt(paramCharSequence, i3) < 65536) {
                throw new pzt(i3, i7);
              }
              i3++;
            }
          }
        }
      }
      for (int i5 = i4 + i1;; i5 = i4)
      {
        if (i5 < i2)
        {
          long l1 = 4294967296L + i5;
          throw new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + l1);
        }
        return i5;
      }
      int i4 = i2;
    }
  }
  
  public static int b(kxg paramkxg)
  {
    switch (lfu.a[paramkxg.ordinal()])
    {
    default: 
      return fa.c;
    case 1: 
    case 2: 
      return fa.B;
    case 3: 
      return fa.H;
    case 4: 
      return fa.q;
    }
    return fa.D;
  }
  
  public static long b(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(paramContext, paramInt1);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cnxs_sync_timestamps");
    String[] arrayOfString1 = hoj.a;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = paramString;
    arrayOfString2[1] = String.valueOf(paramInt2);
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, arrayOfString1, "owner_gaia_id=? AND type=?", arrayOfString2, null, null, null);
    long l1 = 0L;
    try
    {
      if (localCursor.moveToFirst())
      {
        long l2 = localCursor.getLong(localCursor.getColumnIndexOrThrow("sync_timestamp"));
        l1 = l2;
      }
      return l1;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static ain b(String paramString, Context paramContext)
  {
    try
    {
      a(paramContext, "https://csi.gstatic.com/csi", paramString, 3, new lth(paramContext), new ltj(1000, "CsiTimingBreakdownRequestQueue.db", paramContext), (ixf)mbb.a(paramContext, ixf.class));
      lte locallte = Za;
      return locallte;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static Intent b(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.setAction("android.intent.action.MAIN");
    localIntent.addCategory("android.intent.category.LAUNCHER");
    if (paramInt != -1) {
      localIntent.putExtra("account_id", paramInt);
    }
    localIntent.putExtra("destination", 0);
    return localIntent;
  }
  
  public static Intent b(Context paramContext, int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent(paramContext, PhotosHomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("destination", 3);
    localIntent.putExtra("destination_on_account_switch", true);
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("photo_picker_mode", 0);
    return localIntent;
  }
  
  public static Intent b(Context paramContext, int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Intent localIntent = new Intent(paramContext, ProfileEditActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("profile_edit_view_type", paramInt2);
    localIntent.putExtra("profile_edit_items_proto", paramArrayOfByte1);
    localIntent.putExtra("profile_edit_roster_proto", paramArrayOfByte2);
    localIntent.putExtra("profile_data_id", paramInt2);
    return localIntent;
  }
  
  public static Intent b(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, HostStreamOneUpActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("activity_id", paramString);
    localIntent.putExtra("refresh", false);
    return localIntent;
  }
  
  public static Intent b(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramContext, UnifiedSearchActivity.class);
    localIntent.putExtra("account_id", paramInt);
    if (paramString1 != null) {
      localIntent.putExtra("query", paramString1);
    }
    if (paramString2 != null) {
      localIntent.putExtra("injected_item_blob", paramString2);
    }
    return localIntent;
  }
  
  public static Intent b(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, OneProfileActivity.class);
    if (paramBoolean) {
      localIntent.setAction("android.intent.action.VIEW");
    }
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("person_id", paramString1);
    localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramString2);
    return localIntent;
  }
  
  public static Intent b(Context paramContext, int paramInt, ArrayList<? extends jpx> paramArrayList)
  {
    Intent localIntent = new Intent(paramContext, StreamMiniShareActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putParcelableArrayListExtra("shareables", paramArrayList);
    return localIntent;
  }
  
  public static Intent b(String paramString)
  {
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    localIntent.putExtra("output", Uri.fromFile(new File(Environment.getExternalStorageDirectory(), paramString)));
    return localIntent;
  }
  
  /* Error */
  public static Bitmap b(ContentResolver paramContentResolver, Uri paramUri, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: sipush 2048
    //   6: istore 5
    //   8: new 7238	android/graphics/BitmapFactory$Options
    //   11: dup
    //   12: invokespecial 7239	android/graphics/BitmapFactory$Options:<init>	()V
    //   15: astore 6
    //   17: aload 6
    //   19: iload_2
    //   20: sipush 2048
    //   23: idiv
    //   24: iload_3
    //   25: sipush 2048
    //   28: idiv
    //   29: invokestatic 6205	java/lang/Math:max	(II)I
    //   32: putfield 7242	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual 7255	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   40: astore 4
    //   42: aload 4
    //   44: aconst_null
    //   45: aload 6
    //   47: invokestatic 7275	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   50: astore 9
    //   52: iload_2
    //   53: i2f
    //   54: iload_3
    //   55: i2f
    //   56: fdiv
    //   57: fstore 10
    //   59: iload_2
    //   60: iload_3
    //   61: if_icmple +110 -> 171
    //   64: ldc_w 11238
    //   67: fload 10
    //   69: fdiv
    //   70: f2i
    //   71: istore 11
    //   73: aload 9
    //   75: iload 5
    //   77: iload 11
    //   79: iconst_1
    //   80: invokestatic 7281	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   83: astore 12
    //   85: aload 9
    //   87: invokevirtual 7282	android/graphics/Bitmap:recycle	()V
    //   90: ldc_w 7284
    //   93: iconst_4
    //   94: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   97: ifeq +61 -> 158
    //   100: new 5654	java/lang/StringBuilder
    //   103: dup
    //   104: bipush 79
    //   106: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   109: ldc_w 11240
    //   112: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: iload_2
    //   116: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   119: ldc_w 7294
    //   122: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: iload_3
    //   126: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   129: ldc_w 7296
    //   132: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: iload 5
    //   137: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   140: ldc_w 7294
    //   143: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: iload 11
    //   148: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   151: ldc_w 7301
    //   154: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload 4
    //   160: ifnull +8 -> 168
    //   163: aload 4
    //   165: invokevirtual 7251	java/io/InputStream:close	()V
    //   168: aload 12
    //   170: areturn
    //   171: iload_2
    //   172: iload_3
    //   173: if_icmpge +27 -> 200
    //   176: fload 10
    //   178: ldc_w 11238
    //   181: fmul
    //   182: f2i
    //   183: istore 15
    //   185: iload 5
    //   187: istore 16
    //   189: iload 15
    //   191: istore 5
    //   193: iload 16
    //   195: istore 11
    //   197: goto -124 -> 73
    //   200: iload 5
    //   202: istore 11
    //   204: goto -131 -> 73
    //   207: astore 7
    //   209: aload 4
    //   211: ifnull +8 -> 219
    //   214: aload 4
    //   216: invokevirtual 7251	java/io/InputStream:close	()V
    //   219: aload 7
    //   221: athrow
    //   222: astore 13
    //   224: aload 12
    //   226: areturn
    //   227: astore 8
    //   229: goto -10 -> 219
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	paramContentResolver	ContentResolver
    //   0	232	1	paramUri	Uri
    //   0	232	2	paramInt1	int
    //   0	232	3	paramInt2	int
    //   1	214	4	localInputStream	InputStream
    //   6	195	5	i1	int
    //   15	31	6	localOptions	BitmapFactory.Options
    //   207	13	7	localObject	Object
    //   227	1	8	localIOException1	IOException
    //   50	36	9	localBitmap1	Bitmap
    //   57	120	10	f1	float
    //   71	132	11	i2	int
    //   83	142	12	localBitmap2	Bitmap
    //   222	1	13	localIOException2	IOException
    //   183	7	15	i3	int
    //   187	7	16	i4	int
    // Exception table:
    //   from	to	target	type
    //   8	59	207	finally
    //   64	73	207	finally
    //   73	158	207	finally
    //   163	168	222	java/io/IOException
    //   214	219	227	java/io/IOException
  }
  
  public static Bitmap b(Bitmap paramBitmap, int paramInt)
  {
    if (paramBitmap == null) {
      return null;
    }
    Matrix localMatrix = new Matrix();
    localMatrix.setScale(0.5F, 0.5F);
    int i1 = Math.min(paramBitmap.getWidth(), paramBitmap.getHeight());
    if (i1 != paramInt)
    {
      float f1 = paramInt / i1;
      localMatrix.postScale(f1, f1, 0.0F, 0.0F);
    }
    return Bitmap.createBitmap(paramBitmap, 0, 0, i1, i1, localMatrix, true);
  }
  
  /* Error */
  public static Point b(ContentResolver paramContentResolver, Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 7238	android/graphics/BitmapFactory$Options
    //   5: dup
    //   6: invokespecial 7239	android/graphics/BitmapFactory$Options:<init>	()V
    //   9: astore_3
    //   10: aload_3
    //   11: iconst_1
    //   12: putfield 11246	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   15: aload_0
    //   16: aload_1
    //   17: invokevirtual 7255	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   20: astore_2
    //   21: aload_2
    //   22: aconst_null
    //   23: aload_3
    //   24: invokestatic 7258	efj:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   27: pop
    //   28: new 7244	android/graphics/Point
    //   31: dup
    //   32: aload_3
    //   33: getfield 11249	android/graphics/BitmapFactory$Options:outWidth	I
    //   36: aload_3
    //   37: getfield 11252	android/graphics/BitmapFactory$Options:outHeight	I
    //   40: invokespecial 11253	android/graphics/Point:<init>	(II)V
    //   43: astore 7
    //   45: aload_2
    //   46: ifnull +7 -> 53
    //   49: aload_2
    //   50: invokevirtual 7251	java/io/InputStream:close	()V
    //   53: aload 7
    //   55: areturn
    //   56: astore 4
    //   58: aload_2
    //   59: ifnull +7 -> 66
    //   62: aload_2
    //   63: invokevirtual 7251	java/io/InputStream:close	()V
    //   66: aload 4
    //   68: athrow
    //   69: astore 8
    //   71: aload 7
    //   73: areturn
    //   74: astore 5
    //   76: goto -10 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	paramContentResolver	ContentResolver
    //   0	79	1	paramUri	Uri
    //   1	62	2	localInputStream	InputStream
    //   9	28	3	localOptions	BitmapFactory.Options
    //   56	11	4	localObject	Object
    //   74	1	5	localIOException1	IOException
    //   43	29	7	localPoint	Point
    //   69	1	8	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   10	45	56	finally
    //   49	53	69	java/io/IOException
    //   62	66	74	java/io/IOException
  }
  
  public static Drawable b(Resources paramResources)
  {
    if (aay == null) {
      aay = paramResources.getDrawable(da.aU);
    }
    return aay;
  }
  
  public static SpannableStringBuilder b(qoq paramqoq)
  {
    if (Gu == null) {
      Gu = new hga();
    }
    return a(paramqoq, Gu, f(), e());
  }
  
  public static itd b(Uri paramUri)
  {
    h();
    long l1 = ContentUris.parseId(paramUri);
    for (itd localitd : PW) {
      if (paramUri.equals(ContentUris.withAppendedId(localitd.b(), l1))) {
        return localitd;
      }
    }
    return null;
  }
  
  public static <T> T b(T paramT, Object paramObject)
  {
    if (paramT == null) {
      throw new NullPointerException(String.valueOf(paramObject));
    }
    return paramT;
  }
  
  public static String b(Context paramContext, long paramLong)
  {
    p(paramContext);
    Date localDate = new Date(paramLong);
    synchronized (LY)
    {
      String str = LY.format(localDate);
      return str;
    }
  }
  
  public static String b(Context paramContext, long paramLong, TimeZone paramTimeZone)
  {
    p(paramContext);
    synchronized (LZ)
    {
      TimeZone localTimeZone = LZ.getTimeZone();
      LZ.setTimeZone(paramTimeZone);
      String str = LZ.format(Long.valueOf(paramLong));
      LZ.setTimeZone(localTimeZone);
      return str;
    }
  }
  
  public static String b(Context paramContext, Cursor paramCursor)
  {
    int i1 = paramCursor.getInt(7);
    if (i1 <= 1)
    {
      Resources localResources2 = paramContext.getResources();
      int i3 = aau.lo;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(paramCursor.getLong(3));
      arrayOfObject2[1] = Long.valueOf(paramCursor.getLong(4));
      return localResources2.getString(i3, arrayOfObject2);
    }
    Resources localResources1 = paramContext.getResources();
    int i2 = aau.ln;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Long.valueOf(paramCursor.getLong(3));
    arrayOfObject1[1] = Long.valueOf(paramCursor.getLong(4));
    arrayOfObject1[2] = Integer.valueOf(i1);
    return localResources1.getString(i2, arrayOfObject1);
  }
  
  /* Error */
  public static String b(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 8951	java/io/File
    //   3: dup
    //   4: invokestatic 11236	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   7: aload_1
    //   8: invokespecial 11237	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   11: astore_2
    //   12: invokestatic 6536	java/lang/System:currentTimeMillis	()J
    //   15: lstore_3
    //   16: new 8517	java/util/Date
    //   19: dup
    //   20: lload_3
    //   21: invokespecial 8519	java/util/Date:<init>	(J)V
    //   24: astore 5
    //   26: new 11284	java/text/SimpleDateFormat
    //   29: dup
    //   30: aload_0
    //   31: getstatic 11286	aau:iW	I
    //   34: invokevirtual 8509	android/content/Context:getString	(I)Ljava/lang/String;
    //   37: invokestatic 8495	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   40: invokespecial 11289	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   43: aload 5
    //   45: invokevirtual 11290	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   48: astore 6
    //   50: aload_0
    //   51: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   54: astore 7
    //   56: new 6637	android/content/ContentValues
    //   59: dup
    //   60: iconst_5
    //   61: invokespecial 6639	android/content/ContentValues:<init>	(I)V
    //   64: astore 8
    //   66: aload_2
    //   67: invokevirtual 10247	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   70: invokestatic 11292	efj:o	(Ljava/lang/String;)I
    //   73: istore 9
    //   75: aload 8
    //   77: ldc_w 11294
    //   80: aload 6
    //   82: invokevirtual 6665	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload 8
    //   87: ldc_w 11296
    //   90: aload 6
    //   92: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   95: ldc_w 10772
    //   98: invokevirtual 5848	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   101: invokevirtual 6665	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload 8
    //   106: ldc_w 6519
    //   109: lload_3
    //   110: invokestatic 8604	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   113: invokevirtual 6671	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   116: aload 8
    //   118: ldc_w 11298
    //   121: ldc_w 10738
    //   124: invokevirtual 6665	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: aload 8
    //   129: ldc_w 11299
    //   132: iload 9
    //   134: invokestatic 5882	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: invokevirtual 6668	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   140: aload 7
    //   142: aload 8
    //   144: iconst_0
    //   145: invokestatic 11301	efj:a	(Landroid/content/ContentResolver;Landroid/content/ContentValues;Z)Landroid/net/Uri;
    //   148: astore 10
    //   150: aload 10
    //   152: ifnonnull +5 -> 157
    //   155: aconst_null
    //   156: areturn
    //   157: aload 7
    //   159: aload 10
    //   161: invokevirtual 11305	android/content/ContentResolver:openOutputStream	(Landroid/net/Uri;)Ljava/io/OutputStream;
    //   164: astore 20
    //   166: new 11307	java/io/FileInputStream
    //   169: dup
    //   170: aload_2
    //   171: invokespecial 11308	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   174: astore 21
    //   176: sipush 10240
    //   179: newarray byte
    //   181: astore 23
    //   183: aload 21
    //   185: aload 23
    //   187: invokevirtual 11309	java/io/FileInputStream:read	([B)I
    //   190: istore 24
    //   192: iload 24
    //   194: iconst_m1
    //   195: if_icmpeq +58 -> 253
    //   198: aload 20
    //   200: aload 23
    //   202: iconst_0
    //   203: iload 24
    //   205: invokevirtual 11312	java/io/OutputStream:write	([BII)V
    //   208: goto -25 -> 183
    //   211: astore 22
    //   213: aload 20
    //   215: invokevirtual 11313	java/io/OutputStream:close	()V
    //   218: aload 21
    //   220: invokevirtual 11314	java/io/FileInputStream:close	()V
    //   223: aload 22
    //   225: athrow
    //   226: astore 18
    //   228: ldc_w 7423
    //   231: ldc_w 11316
    //   234: aload 18
    //   236: invokestatic 7428	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   239: pop
    //   240: aload 18
    //   242: athrow
    //   243: astore 16
    //   245: aload_2
    //   246: invokevirtual 11318	java/io/File:delete	()Z
    //   249: pop
    //   250: aload 16
    //   252: athrow
    //   253: aload 20
    //   255: invokevirtual 11313	java/io/OutputStream:close	()V
    //   258: aload 21
    //   260: invokevirtual 11314	java/io/FileInputStream:close	()V
    //   263: aload 10
    //   265: invokestatic 7337	efj:c	(Landroid/net/Uri;)Z
    //   268: ifeq +54 -> 322
    //   271: getstatic 11320	efj:PX	I
    //   274: ifne +16 -> 290
    //   277: aload_0
    //   278: invokevirtual 5617	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   281: getstatic 11322	efj:PY	I
    //   284: invokevirtual 5633	android/content/res/Resources:getDimensionPixelSize	(I)I
    //   287: putstatic 11320	efj:PX	I
    //   290: getstatic 11320	efj:PX	I
    //   293: istore 26
    //   295: aload_0
    //   296: aload 10
    //   298: aconst_null
    //   299: invokestatic 11324	efj:a	(Landroid/content/Context;Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   302: astore 27
    //   304: aload 27
    //   306: ifnonnull +32 -> 338
    //   309: aconst_null
    //   310: astore 28
    //   312: aload 28
    //   314: ifnull +8 -> 322
    //   317: aload 28
    //   319: invokevirtual 7282	android/graphics/Bitmap:recycle	()V
    //   322: aload_2
    //   323: invokevirtual 11318	java/io/File:delete	()Z
    //   326: pop
    //   327: aload 10
    //   329: ifnull -174 -> 155
    //   332: aload 10
    //   334: invokevirtual 8685	android/net/Uri:toString	()Ljava/lang/String;
    //   337: areturn
    //   338: aload_0
    //   339: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   342: aload 10
    //   344: aload 27
    //   346: invokestatic 7261	efj:a	(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   349: astore 28
    //   351: aload 28
    //   353: invokevirtual 7346	android/graphics/Bitmap:getWidth	()I
    //   356: iload 26
    //   358: if_icmpne +13 -> 371
    //   361: aload 28
    //   363: invokevirtual 7349	android/graphics/Bitmap:getHeight	()I
    //   366: iload 26
    //   368: if_icmpeq -56 -> 312
    //   371: aload 28
    //   373: iload 26
    //   375: iload 26
    //   377: aconst_null
    //   378: invokestatic 11329	mfo:a	(Landroid/graphics/Bitmap;IILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   381: astore 29
    //   383: aload 29
    //   385: aload 28
    //   387: if_acmpeq -75 -> 312
    //   390: aload 28
    //   392: invokevirtual 7282	android/graphics/Bitmap:recycle	()V
    //   395: aload 29
    //   397: astore 28
    //   399: goto -87 -> 312
    //   402: astore 11
    //   404: ldc_w 7423
    //   407: ldc_w 11331
    //   410: aload 11
    //   412: invokestatic 7428	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   415: pop
    //   416: aload 10
    //   418: ifnull +28 -> 446
    //   421: aload 7
    //   423: aload 10
    //   425: aconst_null
    //   426: aconst_null
    //   427: invokevirtual 6274	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   430: pop
    //   431: aconst_null
    //   432: astore 14
    //   434: aload_2
    //   435: invokevirtual 11318	java/io/File:delete	()Z
    //   438: pop
    //   439: aload 14
    //   441: astore 10
    //   443: goto -116 -> 327
    //   446: aload 10
    //   448: astore 14
    //   450: goto -16 -> 434
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	453	0	paramContext	Context
    //   0	453	1	paramString	String
    //   11	424	2	localFile	File
    //   15	95	3	l1	long
    //   24	20	5	localDate	Date
    //   48	43	6	str	String
    //   54	368	7	localContentResolver	ContentResolver
    //   64	79	8	localContentValues	ContentValues
    //   73	60	9	i1	int
    //   148	299	10	localObject1	Object
    //   402	9	11	localException	Exception
    //   432	17	14	localObject2	Object
    //   243	8	16	localObject3	Object
    //   226	15	18	localFileNotFoundException	FileNotFoundException
    //   164	90	20	localOutputStream	java.io.OutputStream
    //   174	85	21	localFileInputStream	java.io.FileInputStream
    //   211	13	22	localObject4	Object
    //   181	20	23	arrayOfByte	byte[]
    //   190	14	24	i2	int
    //   293	83	26	i3	int
    //   302	43	27	localBitmap1	Bitmap
    //   310	88	28	localObject5	Object
    //   381	15	29	localBitmap2	Bitmap
    // Exception table:
    //   from	to	target	type
    //   176	183	211	finally
    //   183	192	211	finally
    //   198	208	211	finally
    //   157	176	226	java/io/FileNotFoundException
    //   213	226	226	java/io/FileNotFoundException
    //   253	290	226	java/io/FileNotFoundException
    //   290	304	226	java/io/FileNotFoundException
    //   317	322	226	java/io/FileNotFoundException
    //   338	371	226	java/io/FileNotFoundException
    //   371	383	226	java/io/FileNotFoundException
    //   390	395	226	java/io/FileNotFoundException
    //   157	176	243	finally
    //   213	226	243	finally
    //   228	243	243	finally
    //   253	290	243	finally
    //   290	304	243	finally
    //   317	322	243	finally
    //   338	371	243	finally
    //   371	383	243	finally
    //   390	395	243	finally
    //   404	416	243	finally
    //   421	431	243	finally
    //   157	176	402	java/lang/Exception
    //   213	226	402	java/lang/Exception
    //   253	290	402	java/lang/Exception
    //   290	304	402	java/lang/Exception
    //   317	322	402	java/lang/Exception
    //   338	371	402	java/lang/Exception
    //   371	383	402	java/lang/Exception
    //   390	395	402	java/lang/Exception
  }
  
  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    fpw localfpw = (fpw)mbb.a(paramContext, fpw.class);
    AccountManager localAccountManager = AccountManager.get(paramContext);
    Account[] arrayOfAccount = localfpw.a("com.google", null);
    String str3;
    for (int i1 = 0; i1 < arrayOfAccount.length; i1++) {
      if (arrayOfAccount[i1].name.equals(paramString1))
      {
        str3 = localAccountManager.blockingGetAuthToken(arrayOfAccount[i1], paramString2, true);
        if (str3 != null) {
          break label140;
        }
        throw new IOException("Cannot get auth token");
      }
    }
    String str1 = String.valueOf(paramString1);
    if (str1.length() != 0) {}
    for (String str2 = "Account not found: ".concat(str1);; str2 = new String("Account not found: ")) {
      throw new IllegalArgumentException(str2);
    }
    label140:
    return str3;
  }
  
  public static String b(String paramString, int paramInt)
  {
    if (paramInt <= 0) {
      return "0";
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString).append(" IN (?");
    for (int i1 = 1; i1 < paramInt; i1++) {
      localStringBuilder.append(",?");
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static String b(String paramString, Object... paramVarArgs)
  {
    int i1 = 0;
    String str = String.valueOf(paramString);
    StringBuilder localStringBuilder = new StringBuilder(str.length() + 16 * paramVarArgs.length);
    int i2 = 0;
    while (i1 < paramVarArgs.length)
    {
      int i6 = str.indexOf("%s", i2);
      if (i6 == -1) {
        break;
      }
      localStringBuilder.append(str.substring(i2, i6));
      int i7 = i1 + 1;
      localStringBuilder.append(paramVarArgs[i1]);
      i2 = i6 + 2;
      i1 = i7;
    }
    localStringBuilder.append(str.substring(i2));
    if (i1 < paramVarArgs.length)
    {
      localStringBuilder.append(" [");
      int i3 = i1 + 1;
      localStringBuilder.append(paramVarArgs[i1]);
      int i5;
      for (int i4 = i3; i4 < paramVarArgs.length; i4 = i5)
      {
        localStringBuilder.append(", ");
        i5 = i4 + 1;
        localStringBuilder.append(paramVarArgs[i4]);
      }
      localStringBuilder.append(']');
    }
    return localStringBuilder.toString();
  }
  
  public static String b(nxl paramnxl)
  {
    int i1 = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    switch (a(paramnxl))
    {
    }
    while (localStringBuilder.length() == 0)
    {
      String[] arrayOfString;
      do
      {
        return null;
        if (paramnxl.f.b.d.b == null) {
          break;
        }
        arrayOfString = paramnxl.f.b.d.b.c;
      } while ((arrayOfString == null) || (arrayOfString.length == 0));
      int i2 = arrayOfString.length;
      while (i1 < i2)
      {
        String str = arrayOfString[i1];
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append('\n');
        }
        localStringBuilder.append(str);
        i1++;
      }
      if ((paramnxl.d != null) && (paramnxl.d.c != null) && (paramnxl.d.c.c != null) && (paramnxl.d.c.c.length != 0)) {
        localStringBuilder.append(paramnxl.d.c.c[0].c);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String b(orm paramorm)
  {
    if (paramorm == null) {}
    while (TextUtils.isEmpty(paramorm.c)) {
      return null;
    }
    return paramorm.c;
  }
  
  public static KeyPair b()
  {
    try
    {
      KeyPairGenerator localKeyPairGenerator = KeyPairGenerator.getInstance("RSA");
      localKeyPairGenerator.initialize(2048);
      KeyPair localKeyPair = localKeyPairGenerator.generateKeyPair();
      return localKeyPair;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new AssertionError(localNoSuchAlgorithmException);
    }
  }
  
  public static List<Uri> b(List<isy> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((isy)localIterator.next()).c);
    }
    return localArrayList;
  }
  
  public static jjd b(String paramString1, String paramString2)
  {
    String str1;
    String str2;
    if (paramString1.startsWith("g:"))
    {
      str1 = paramString1.substring(2);
      str2 = null;
    }
    for (;;)
    {
      return new jjd(str1, paramString2, str2, null, false, true);
      if (paramString1.startsWith("e:"))
      {
        str2 = paramString1.substring(2);
        str1 = null;
      }
      else if (paramString1.startsWith("p:"))
      {
        str2 = paramString1;
        str1 = null;
      }
      else
      {
        str1 = null;
        str2 = null;
      }
    }
  }
  
  public static omk b(gnb paramgnb)
  {
    return a(paramgnb, null);
  }
  
  public static qmg b(byte[] paramArrayOfByte)
  {
    try
    {
      qmg localqmg = (qmg)qat.b(new qmg(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localqmg;
    }
    catch (qas localqas)
    {
      Log.e("ProtoPacker", "Failed to deserialize EditList.", localqas);
    }
    return null;
  }
  
  public static void b(int paramInt, String paramString1, String paramString2)
  {
    int i1 = 0;
    for (int i2 = paramString2.indexOf('\n', 0); i2 != -1; i2 = paramString2.indexOf('\n', i1))
    {
      Log.println(paramInt, paramString1, paramString2.substring(i1, i2));
      i1 = i2 + 1;
    }
    Log.println(paramInt, paramString1, paramString2.substring(i1));
  }
  
  public static void b(Context paramContext)
  {
    l();
    ArrayList localArrayList = new ArrayList();
    for (itd localitd : PW)
    {
      isv[] arrayOfisv = c(paramContext, 1, 1);
      for (int i3 = 0; i3 < arrayOfisv.length; i3++) {
        localArrayList.addAll(a(paramContext, localitd, String.valueOf(arrayOfisv[i3].a)));
      }
    }
    Iterator localIterator = Collections.unmodifiableList(localArrayList).iterator();
    while (localIterator.hasNext())
    {
      isy localisy = (isy)localIterator.next();
      a(paramContext, localisy.c);
      b(paramContext, localisy.a, localisy.b);
    }
  }
  
  public static void b(Context paramContext, int paramInt, gnb paramgnb)
  {
    gnb localgnb1 = d(paramgnb);
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    Cursor localCursor = localSQLiteDatabase.query("account_status", new String[] { "audience_history" }, null, null, null, null, null);
    ArrayList localArrayList2;
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        byte[] arrayOfByte1 = localCursor.getBlob(0);
        localObject2 = null;
        if (arrayOfByte1 != null)
        {
          ArrayList localArrayList1 = gnl.b(arrayOfByte1);
          localObject2 = localArrayList1;
        }
      }
      localCursor.close();
      if (localObject2 == null) {
        localObject2 = new ArrayList();
      }
      localArrayList2 = new ArrayList();
      if (a(paramContext, localgnb1, gne.class)) {
        localArrayList2.add(localgnb1);
      }
      int i1 = ((ArrayList)localObject2).size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        gnb localgnb2 = (gnb)((ArrayList)localObject2).get(i2);
        if ((!gnb.a(localgnb1, localgnb2)) && (a(paramContext, localgnb2, gne.class))) {
          localArrayList2.add(localgnb2);
        }
      }
      i3 = -1 + localArrayList2.size();
    }
    finally
    {
      localCursor.close();
      new ArrayList();
    }
    int i3;
    while (i3 >= 5)
    {
      localArrayList2.remove(i3);
      i3--;
    }
    try
    {
      byte[] arrayOfByte2 = gnl.a(localArrayList2);
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("audience_history", arrayOfByte2);
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      return;
    }
    catch (IOException localIOException)
    {
      a(6, "AclDataUtils", "Error saving audience history");
    }
  }
  
  public static void b(Context paramContext, ComponentName paramComponentName, boolean paramBoolean)
  {
    if (paramBoolean) {
      try
      {
        paramContext.getPackageManager().setComponentEnabledSetting(paramComponentName, 0, 1);
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        String str = String.valueOf(paramComponentName.getClassName());
        if (str.length() != 0)
        {
          "Tried to restore a component that does not exist: ".concat(str);
          return;
        }
        new String("Tried to restore a component that does not exist: ");
        return;
      }
    }
    paramContext.getPackageManager().setComponentEnabledSetting(paramComponentName, 0, 1);
  }
  
  public static void b(Context paramContext, Uri paramUri)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", paramUri);
    localIntent.addFlags(524288);
    localIntent.setPackage("com.google.android.apps.maps");
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      paramContext.startActivity(Intent.createChooser(localIntent.setPackage(null), null));
    }
  }
  
  public static void b(Context paramContext, ArrayList<isv> paramArrayList, int paramInt1, int paramInt2)
  {
    isv localisv = new isv();
    localisv.b = paramContext.getString(PZ);
    localisv.d = 2147483647L;
    localisv.e = true;
    int i1 = 0;
    while (i1 < PW.length)
    {
      itd localitd = PW[i1];
      Cursor localCursor;
      if (((paramInt2 != 4) || ((localitd instanceof ite))) && ((paramInt2 != 5) || ((localitd instanceof isz)))) {
        localCursor = null;
      }
      try
      {
        localCursor = localitd.a(paramContext, 1);
        if ((localCursor != null) && (localCursor.moveToFirst()))
        {
          boolean bool;
          do
          {
            a(paramContext, localitd, i1, localCursor.getInt(1), localisv, localCursor, paramInt1);
            bool = localCursor.moveToNext();
          } while (bool);
        }
        if (localCursor != null) {
          localCursor.close();
        }
        i1++;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
    if (localisv.c > 0) {
      paramArrayList.add(localisv);
    }
  }
  
  public static void b(Context paramContext, List<Uri> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      a(paramContext, (Uri)localIterator.next());
    }
  }
  
  public static void b(PointF paramPointF, int paramInt, float paramFloat1, float paramFloat2)
  {
    String str1;
    switch (paramInt)
    {
    default: 
      str1 = String.valueOf(String.valueOf(paramInt));
      if (str1.length() == 0) {
        break;
      }
    }
    for (String str2 = "Illegal value of postRotation:".concat(str1);; str2 = new String("Illegal value of postRotation:"))
    {
      throw new IllegalArgumentException(str2);
      a(paramPointF, 3, 1.0F, 1.0F);
      return;
      a(paramPointF, 2, 1.0F, 1.0F);
      return;
      a(paramPointF, 1, 1.0F, 1.0F);
      return;
    }
  }
  
  public static void b(Parcel paramParcel, int paramInt)
  {
    paramParcel.setDataPosition(a(paramParcel, paramInt) + paramParcel.dataPosition());
  }
  
  public static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(0xFFFF0000 | paramInt1);
      paramParcel.writeInt(paramInt2);
      return;
    }
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }
  
  public static void b(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean)
  {
    if (paramList == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    n(paramParcel, i1);
  }
  
  public static void b(Object paramObject, ArrayList<View> paramArrayList)
  {
    int i1 = 0;
    Transition localTransition = (Transition)paramObject;
    if ((localTransition instanceof TransitionSet))
    {
      TransitionSet localTransitionSet = (TransitionSet)localTransition;
      int i4 = localTransitionSet.getTransitionCount();
      while (i1 < i4)
      {
        b(localTransitionSet.getTransitionAt(i1), paramArrayList);
        i1++;
      }
    }
    if ((!a(localTransition)) && (a(localTransition.getTargets())))
    {
      int i2 = paramArrayList.size();
      for (int i3 = 0; i3 < i2; i3++) {
        localTransition.addTarget((View)paramArrayList.get(i3));
      }
    }
  }
  
  public static void b(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    if (paramObject != null)
    {
      if (!(paramObject instanceof qat)) {
        break label489;
      }
      int i1 = paramStringBuffer1.length();
      if (paramString != null)
      {
        paramStringBuffer2.append(paramStringBuffer1).append(F(paramString)).append(" <\n");
        paramStringBuffer1.append("  ");
      }
      Class localClass1 = paramObject.getClass();
      Field[] arrayOfField = localClass1.getFields();
      int i2 = arrayOfField.length;
      int i3 = 0;
      if (i3 < i2)
      {
        Field localField = arrayOfField[i3];
        int i6 = localField.getModifiers();
        String str9 = localField.getName();
        Object localObject;
        if ((!"cachedSize".equals(str9)) && ((i6 & 0x1) == 1) && ((i6 & 0x8) != 8) && (!str9.startsWith("_")) && (!str9.endsWith("_")))
        {
          Class localClass2 = localField.getType();
          localObject = localField.get(paramObject);
          if (!localClass2.isArray()) {
            break label245;
          }
          if (localClass2.getComponentType() != Byte.TYPE) {
            break label197;
          }
          b(str9, localObject, paramStringBuffer1, paramStringBuffer2);
        }
        for (;;)
        {
          i3++;
          break;
          label197:
          if (localObject == null) {}
          for (int i7 = 0;; i7 = Array.getLength(localObject))
          {
            for (int i8 = 0; i8 < i7; i8++) {
              b(str9, Array.get(localObject, i8), paramStringBuffer1, paramStringBuffer2);
            }
            break;
          }
          label245:
          b(str9, localObject, paramStringBuffer1, paramStringBuffer2);
        }
      }
      Method[] arrayOfMethod = localClass1.getMethods();
      int i4 = arrayOfMethod.length;
      int i5 = 0;
      if (i5 < i4)
      {
        String str3 = arrayOfMethod[i5].getName();
        String str4;
        if (str3.startsWith("set")) {
          str4 = str3.substring(3);
        }
        for (;;)
        {
          try
          {
            String str5 = String.valueOf(str4);
            if (str5.length() != 0)
            {
              str6 = "has".concat(str5);
              Method localMethod1 = localClass1.getMethod(str6, new Class[0]);
              if (!((Boolean)localMethod1.invoke(paramObject, new Object[0])).booleanValue()) {}
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException1)
          {
            String str6;
            String str7;
            Method localMethod2;
            continue;
            String str8 = new String("get");
            continue;
          }
          try
          {
            str7 = String.valueOf(str4);
            if (str7.length() == 0) {
              continue;
            }
            str8 = "get".concat(str7);
            localMethod2 = localClass1.getMethod(str8, new Class[0]);
            b(str4, localMethod2.invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
            i5++;
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            continue;
          }
          break;
          str6 = new String("has");
        }
      }
      if (paramString != null)
      {
        paramStringBuffer1.setLength(i1);
        paramStringBuffer2.append(paramStringBuffer1).append(">\n");
      }
    }
    return;
    label489:
    String str1 = F(paramString);
    paramStringBuffer2.append(paramStringBuffer1).append(str1).append(": ");
    if ((paramObject instanceof String))
    {
      String str2 = G((String)paramObject);
      paramStringBuffer2.append("\"").append(str2).append("\"");
    }
    for (;;)
    {
      paramStringBuffer2.append("\n");
      return;
      if ((paramObject instanceof byte[])) {
        b((byte[])paramObject, paramStringBuffer2);
      } else {
        paramStringBuffer2.append(paramObject);
      }
    }
  }
  
  public static void b(mca parammca)
  {
    ((gxe)parammca.bo.a(gxe.class)).a = true;
  }
  
  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
  }
  
  public static void b(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(b(paramString, paramVarArgs));
    }
  }
  
  public static void b(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    if (paramArrayOfByte == null)
    {
      paramStringBuffer.append("\"\"");
      return;
    }
    paramStringBuffer.append('"');
    int i1 = 0;
    if (i1 < paramArrayOfByte.length)
    {
      int i2 = 0xFF & paramArrayOfByte[i1];
      if ((i2 == 92) || (i2 == 34)) {
        paramStringBuffer.append('\\').append((char)i2);
      }
      for (;;)
      {
        i1++;
        break;
        if ((i2 >= 32) && (i2 < 127))
        {
          paramStringBuffer.append((char)i2);
        }
        else
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(i2);
          paramStringBuffer.append(String.format("\\%03o", arrayOfObject));
        }
      }
    }
    paramStringBuffer.append('"');
  }
  
  public static boolean b(int paramInt)
  {
    int i1;
    if (paramInt == 0)
    {
      i1 = 1;
      if (i1 == 0) {
        if (paramInt != 3) {
          break label32;
        }
      }
    }
    label32:
    for (int i2 = 1;; i2 = 0)
    {
      boolean bool = false;
      if (i2 != 0) {
        bool = true;
      }
      return bool;
      i1 = 0;
      break;
    }
  }
  
  public static boolean b(Context paramContext, int paramInt, qwr[] paramArrayOfqwr)
  {
    List localList = a(paramContext, paramInt, paramArrayOfqwr);
    ArrayList localArrayList = new ArrayList();
    int i1 = localList.size();
    for (int i2 = 0; (i2 < i1) && (localArrayList.size() < 5); i2++)
    {
      gnb localgnb = (gnb)localList.get(i2);
      if (a(paramContext, localgnb, gne.class)) {
        localArrayList.add(localgnb);
      }
    }
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    try
    {
      byte[] arrayOfByte = gnl.a(localArrayList);
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("audience_history", arrayOfByte);
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      return true;
    }
    catch (IOException localIOException)
    {
      a(6, "AclDataUtils", "Error saving audience history");
    }
    return false;
  }
  
  /* Error */
  public static boolean b(Context paramContext, Account paramAccount, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray 5749	java/lang/String
    //   4: astore 5
    //   6: aload 5
    //   8: iconst_0
    //   9: aload_2
    //   10: aastore
    //   11: aload 5
    //   13: iconst_1
    //   14: aload_1
    //   15: getfield 6268	android/accounts/Account:type	Ljava/lang/String;
    //   18: aastore
    //   19: aload 5
    //   21: iconst_2
    //   22: aload_3
    //   23: aastore
    //   24: aload 5
    //   26: iconst_3
    //   27: aload_1
    //   28: getfield 6265	android/accounts/Account:name	Ljava/lang/String;
    //   31: aastore
    //   32: aload 5
    //   34: iconst_4
    //   35: aload 4
    //   37: aastore
    //   38: aload_0
    //   39: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   42: getstatic 6260	dnm:a	Landroid/net/Uri;
    //   45: iconst_1
    //   46: anewarray 5749	java/lang/String
    //   49: dup
    //   50: iconst_0
    //   51: ldc_w 11477
    //   54: aastore
    //   55: ldc_w 11479
    //   58: aload 5
    //   60: aconst_null
    //   61: invokevirtual 6542	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   64: astore 6
    //   66: aload 6
    //   68: ifnull +35 -> 103
    //   71: aload 6
    //   73: invokeinterface 6832 1 0
    //   78: istore 9
    //   80: iload 9
    //   82: ifeq +21 -> 103
    //   85: iconst_1
    //   86: istore 7
    //   88: aload 6
    //   90: ifnull +10 -> 100
    //   93: aload 6
    //   95: invokeinterface 6554 1 0
    //   100: iload 7
    //   102: ireturn
    //   103: iconst_0
    //   104: istore 7
    //   106: goto -18 -> 88
    //   109: astore 8
    //   111: aload 6
    //   113: ifnull +10 -> 123
    //   116: aload 6
    //   118: invokeinterface 6554 1 0
    //   123: aload 8
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramContext	Context
    //   0	126	1	paramAccount	Account
    //   0	126	2	paramString1	String
    //   0	126	3	paramString2	String
    //   0	126	4	paramString3	String
    //   4	55	5	arrayOfString	String[]
    //   64	53	6	localCursor	Cursor
    //   86	19	7	bool1	boolean
    //   109	15	8	localObject	Object
    //   78	3	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   71	80	109	finally
  }
  
  /* Error */
  public static boolean b(Context paramContext, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +12 -> 13
    //   4: aload_0
    //   5: invokestatic 11481	efj:a	()Landroid/content/Intent;
    //   8: invokevirtual 11448	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_1
    //   14: invokevirtual 11483	android/content/Intent:getType	()Ljava/lang/String;
    //   17: astore 6
    //   19: aload_0
    //   20: instanceof 6887
    //   23: ifeq +101 -> 124
    //   26: aload_0
    //   27: checkcast 6887	android/app/Activity
    //   30: astore 7
    //   32: aload 6
    //   34: ifnull +29 -> 63
    //   37: aload 6
    //   39: ldc_w 11485
    //   42: invokevirtual 5925	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   45: ifeq +18 -> 63
    //   48: aload 7
    //   50: ifnull +13 -> 63
    //   53: aload 7
    //   55: aload_1
    //   56: iconst_0
    //   57: invokevirtual 11489	android/app/Activity:startActivityForResult	(Landroid/content/Intent;I)V
    //   60: goto +62 -> 122
    //   63: aload_0
    //   64: aload_1
    //   65: invokevirtual 11448	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   68: goto +54 -> 122
    //   71: astore 4
    //   73: aload_0
    //   74: invokestatic 11481	efj:a	()Landroid/content/Intent;
    //   77: invokevirtual 11448	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   80: iconst_0
    //   81: ireturn
    //   82: astore_3
    //   83: aload_0
    //   84: getstatic 11491	aau:cS	I
    //   87: iconst_0
    //   88: invokestatic 11494	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   91: invokevirtual 11496	android/widget/Toast:show	()V
    //   94: goto -14 -> 80
    //   97: astore_2
    //   98: aload_0
    //   99: getstatic 11498	aau:cR	I
    //   102: iconst_0
    //   103: invokestatic 11494	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   106: invokevirtual 11496	android/widget/Toast:show	()V
    //   109: goto -29 -> 80
    //   112: astore 5
    //   114: goto -34 -> 80
    //   117: astore 8
    //   119: goto -108 -> 11
    //   122: iconst_1
    //   123: ireturn
    //   124: aconst_null
    //   125: astore 7
    //   127: goto -95 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	paramContext	Context
    //   0	130	1	paramIntent	Intent
    //   97	1	2	localException	Exception
    //   82	1	3	localSecurityException	java.lang.SecurityException
    //   71	1	4	localActivityNotFoundException1	ActivityNotFoundException
    //   112	1	5	localActivityNotFoundException2	ActivityNotFoundException
    //   17	21	6	str	String
    //   30	96	7	localActivity	Activity
    //   117	1	8	localActivityNotFoundException3	ActivityNotFoundException
    // Exception table:
    //   from	to	target	type
    //   13	32	71	android/content/ActivityNotFoundException
    //   37	48	71	android/content/ActivityNotFoundException
    //   53	60	71	android/content/ActivityNotFoundException
    //   63	68	71	android/content/ActivityNotFoundException
    //   13	32	82	java/lang/SecurityException
    //   37	48	82	java/lang/SecurityException
    //   53	60	82	java/lang/SecurityException
    //   63	68	82	java/lang/SecurityException
    //   13	32	97	java/lang/Exception
    //   37	48	97	java/lang/Exception
    //   53	60	97	java/lang/Exception
    //   63	68	97	java/lang/Exception
    //   73	80	112	android/content/ActivityNotFoundException
    //   4	11	117	android/content/ActivityNotFoundException
  }
  
  public static boolean b(Context paramContext, itd paramitd, long paramLong)
  {
    String str1 = a(paramContext, paramitd, paramLong);
    if (TextUtils.isEmpty(str1))
    {
      ContentResolver localContentResolver2 = paramContext.getContentResolver();
      Uri localUri2 = paramitd.b();
      String str3 = paramitd.a();
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = String.valueOf(paramLong);
      return localContentResolver2.delete(localUri2, str3, arrayOfString2) > 0;
    }
    if (!new File(str1).delete()) {
      return false;
    }
    ContentResolver localContentResolver1 = paramContext.getContentResolver();
    Uri localUri1 = paramitd.b();
    String str2 = paramitd.a();
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = String.valueOf(paramLong);
    localContentResolver1.delete(localUri1, str2, arrayOfString1);
    return true;
  }
  
  public static boolean b(DisplayMetrics paramDisplayMetrics)
  {
    return a(paramDisplayMetrics) > 550.0F;
  }
  
  public static boolean b(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return false;
    }
    return paramBoolean.booleanValue();
  }
  
  public static boolean b(jgw paramjgw)
  {
    return (0x1 & paramjgw.g()) == 0;
  }
  
  public static boolean b(jgw paramjgw, int... paramVarArgs)
  {
    int i1 = paramjgw.e();
    for (int i2 = 0; i2 < paramVarArgs.length; i2++) {
      if (i1 == paramVarArgs[i2]) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean b(nwj paramnwj)
  {
    return (paramnwj != null) && (paramnwj.b != null) && (paramnwj.b.a != null) && (paramnwj.b.a.length != 0);
  }
  
  public static boolean b(nvv[] paramArrayOfnvv)
  {
    nvv localnvv = a(paramArrayOfnvv);
    return (localnvv != null) && (localnvv.a == 2);
  }
  
  /* Error */
  public static byte[] b(Bitmap paramBitmap)
  {
    // Byte code:
    //   0: new 11520	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 11521	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: getstatic 11527	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   12: bipush 90
    //   14: aload_1
    //   15: invokevirtual 11531	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   18: pop
    //   19: aload_1
    //   20: invokevirtual 11534	java/io/ByteArrayOutputStream:flush	()V
    //   23: aload_1
    //   24: invokevirtual 11535	java/io/ByteArrayOutputStream:close	()V
    //   27: aload_0
    //   28: invokevirtual 7282	android/graphics/Bitmap:recycle	()V
    //   31: aload_1
    //   32: invokevirtual 11538	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   35: astore 6
    //   37: ldc_w 7284
    //   40: iconst_3
    //   41: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   44: ifeq +29 -> 73
    //   47: aload 6
    //   49: arraylength
    //   50: istore 7
    //   52: new 5654	java/lang/StringBuilder
    //   55: dup
    //   56: bipush 39
    //   58: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   61: ldc_w 11540
    //   64: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: iload 7
    //   69: invokevirtual 6351	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 6
    //   75: areturn
    //   76: astore 4
    //   78: aload_1
    //   79: invokevirtual 11535	java/io/ByteArrayOutputStream:close	()V
    //   82: goto -55 -> 27
    //   85: astore 5
    //   87: goto -60 -> 27
    //   90: astore_2
    //   91: aload_1
    //   92: invokevirtual 11535	java/io/ByteArrayOutputStream:close	()V
    //   95: aload_2
    //   96: athrow
    //   97: astore 10
    //   99: goto -72 -> 27
    //   102: astore_3
    //   103: goto -8 -> 95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	paramBitmap	Bitmap
    //   7	85	1	localByteArrayOutputStream	ByteArrayOutputStream
    //   90	6	2	localObject	Object
    //   102	1	3	localIOException1	IOException
    //   76	1	4	localIOException2	IOException
    //   85	1	5	localIOException3	IOException
    //   35	39	6	arrayOfByte	byte[]
    //   50	18	7	i1	int
    //   97	1	10	localIOException4	IOException
    // Exception table:
    //   from	to	target	type
    //   8	23	76	java/io/IOException
    //   78	82	85	java/io/IOException
    //   8	23	90	finally
    //   23	27	97	java/io/IOException
    //   91	95	102	java/io/IOException
  }
  
  public static <T> T[] b(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    Object[] arrayOfObject = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i1 + i2);
    return arrayOfObject;
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      paramInt = 1;
    }
    return paramInt;
  }
  
  public static int c(ContentResolver paramContentResolver, Uri paramUri)
  {
    String str;
    int i1;
    if ((mfq.b(paramUri)) || (mfq.a(paramUri))) {
      if (mfq.a(paramUri))
      {
        str = paramUri.getPath();
        i1 = o(str);
      }
    }
    InputStream localInputStream;
    for (;;)
    {
      return i1;
      str = mfq.a(paramContentResolver, paramUri);
      break;
      localInputStream = null;
      try
      {
        localInputStream = paramContentResolver.openInputStream(paramUri);
        int i2 = a(localInputStream);
        i1 = i2;
        if (localInputStream != null) {
          try
          {
            localInputStream.close();
            return i1;
          }
          catch (IOException localIOException3)
          {
            return i1;
          }
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        Log.e("MediaStoreUtil", "File not found", localFileNotFoundException);
        i1 = 0;
        if (localInputStream != null) {
          try
          {
            localInputStream.close();
            return 0;
          }
          catch (IOException localIOException2)
          {
            return 0;
          }
        }
      }
      finally
      {
        if (localInputStream == null) {}
      }
    }
    try
    {
      localInputStream.close();
      label122:
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      break label122;
    }
  }
  
  public static int c(View paramView)
  {
    if (!d) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinHeight");
      c = localField;
      localField.setAccessible(true);
      label28:
      d = true;
      if (c != null) {
        try
        {
          int i1 = ((Integer)c.get(paramView)).intValue();
          return i1;
        }
        catch (Exception localException) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label28;
    }
  }
  
  public static Account c(String paramString)
  {
    return new Account(paramString, "com.google");
  }
  
  public static Intent c(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.putExtra("destination", 0);
    localIntent.putExtra("circle_info", new cyf(paramContext, paramContext.getString(aau.tY), "v.all.circles", 0, 0L));
    return localIntent;
  }
  
  public static Intent c(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("destination", 0);
    return localIntent;
  }
  
  public static Intent c(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("people_view_type", 9);
    localIntent.putExtra("title", paramString1);
    localIntent.putExtra("owner_id", paramString2);
    localIntent.putExtra("use_cached_data", paramBoolean);
    return localIntent;
  }
  
  public static Cursor c(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(paramContext, paramInt1);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cnxs_continuation_tokens");
    String[] arrayOfString1 = hoh.a;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = paramString;
    arrayOfString2[1] = Integer.toString(paramInt2);
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, arrayOfString1, "owner_gaia_id=? AND type=?", arrayOfString2, null, null, null);
  }
  
  public static hge c()
  {
    if (Gr == null) {
      Gr = new hfw();
    }
    return Gr;
  }
  
  public static String c(int paramInt1, int paramInt2)
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = paramInt2 + 3;
    int i2 = 3;
    if (i2 < i1)
    {
      if (i2 + 4 >= arrayOfStackTraceElement.length) {}
      StackTraceElement localStackTraceElement;
      for (String str = "<bottom of call stack>";; str = localStackTraceElement.getClassName() + "." + localStackTraceElement.getMethodName() + ":" + localStackTraceElement.getLineNumber())
      {
        localStringBuffer.append(str).append(" ");
        i2++;
        break;
        localStackTraceElement = arrayOfStackTraceElement[(i2 + 4)];
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String c(Context paramContext, int paramInt, ArrayList<lmi> paramArrayList)
  {
    Object localObject1 = null;
    if (paramInt == 0) {
      return null;
    }
    Object localObject2;
    int i1;
    Object localObject3;
    Object localObject4;
    if (paramArrayList != null)
    {
      Iterator localIterator = paramArrayList.iterator();
      localObject2 = null;
      i1 = 0;
      if (!localIterator.hasNext()) {
        break label112;
      }
      localObject3 = ((lmi)localIterator.next()).b;
      if (TextUtils.isEmpty((CharSequence)localObject3)) {
        break label235;
      }
      if (i1 == 0)
      {
        Object localObject5 = localObject1;
        localObject4 = localObject3;
        localObject3 = localObject5;
      }
    }
    label73:
    for (int i4 = i1 + 1;; i4 = i1)
    {
      i1 = i4;
      localObject2 = localObject4;
      localObject1 = localObject3;
      break;
      if (i1 == 1)
      {
        localObject4 = localObject2;
        break label73;
        localObject2 = null;
        i1 = 0;
        label112:
        Resources localResources = paramContext.getResources();
        if ((i1 == 0) || ((i1 == 1) && (paramInt > 1)))
        {
          int i2 = YQ;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(paramInt);
          return localResources.getQuantityString(i2, paramInt, arrayOfObject1);
        }
        int i3 = YR;
        Object[] arrayOfObject2 = new Object[6];
        arrayOfObject2[0] = "COUNT";
        arrayOfObject2[1] = Integer.valueOf(paramInt);
        arrayOfObject2[2] = "PERSON1";
        arrayOfObject2[3] = localObject2;
        arrayOfObject2[4] = "PERSON2";
        arrayOfObject2[5] = localObject1;
        return a(paramContext, i3, arrayOfObject2);
      }
      localObject3 = localObject1;
      localObject4 = localObject2;
      break label73;
      label235:
      localObject3 = localObject1;
      localObject4 = localObject2;
    }
  }
  
  public static String c(Context paramContext, long paramLong)
  {
    p(paramContext);
    synchronized (LZ)
    {
      String str = LZ.format(Long.valueOf(paramLong));
      return str;
    }
  }
  
  /* Error */
  public static String c(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: invokevirtual 11609	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   10: astore_3
    //   11: ldc_w 7284
    //   14: iconst_2
    //   15: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   18: ifeq +26 -> 44
    //   21: aload_3
    //   22: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   25: astore 18
    //   27: aload 18
    //   29: invokevirtual 5753	java/lang/String:length	()I
    //   32: ifeq +124 -> 156
    //   35: ldc_w 11611
    //   38: aload 18
    //   40: invokevirtual 5848	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   43: pop
    //   44: aload_3
    //   45: ifnonnull +44 -> 89
    //   48: aload_1
    //   49: invokevirtual 8685	android/net/Uri:toString	()Ljava/lang/String;
    //   52: invokestatic 11616	java/net/URLConnection:guessContentTypeFromName	(Ljava/lang/String;)Ljava/lang/String;
    //   55: astore_3
    //   56: ldc_w 7284
    //   59: iconst_2
    //   60: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   63: ifeq +26 -> 89
    //   66: aload_3
    //   67: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   70: astore 15
    //   72: aload 15
    //   74: invokevirtual 5753	java/lang/String:length	()I
    //   77: ifeq +93 -> 170
    //   80: ldc_w 11618
    //   83: aload 15
    //   85: invokevirtual 5848	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   88: pop
    //   89: aload_3
    //   90: ifnonnull +64 -> 154
    //   93: aconst_null
    //   94: astore 4
    //   96: aload_2
    //   97: aload_1
    //   98: invokevirtual 7255	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   101: astore 4
    //   103: aload 4
    //   105: invokestatic 11622	java/net/URLConnection:guessContentTypeFromStream	(Ljava/io/InputStream;)Ljava/lang/String;
    //   108: astore_3
    //   109: ldc_w 7284
    //   112: iconst_2
    //   113: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   116: ifeq +26 -> 142
    //   119: aload_3
    //   120: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   123: astore 12
    //   125: aload 12
    //   127: invokevirtual 5753	java/lang/String:length	()I
    //   130: ifeq +54 -> 184
    //   133: ldc_w 11624
    //   136: aload 12
    //   138: invokevirtual 5848	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   141: pop
    //   142: aload 4
    //   144: ifnull +10 -> 154
    //   147: aload 4
    //   149: invokeinterface 10641 1 0
    //   154: aload_3
    //   155: areturn
    //   156: new 5749	java/lang/String
    //   159: dup
    //   160: ldc_w 11611
    //   163: invokespecial 5849	java/lang/String:<init>	(Ljava/lang/String;)V
    //   166: pop
    //   167: goto -123 -> 44
    //   170: new 5749	java/lang/String
    //   173: dup
    //   174: ldc_w 11618
    //   177: invokespecial 5849	java/lang/String:<init>	(Ljava/lang/String;)V
    //   180: pop
    //   181: goto -92 -> 89
    //   184: new 5749	java/lang/String
    //   187: dup
    //   188: ldc_w 11624
    //   191: invokespecial 5849	java/lang/String:<init>	(Ljava/lang/String;)V
    //   194: pop
    //   195: goto -53 -> 142
    //   198: astore 7
    //   200: ldc_w 7284
    //   203: iconst_5
    //   204: invokestatic 7290	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   207: ifeq +40 -> 247
    //   210: aload 7
    //   212: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   215: astore 9
    //   217: new 5654	java/lang/StringBuilder
    //   220: dup
    //   221: bipush 30
    //   223: aload 9
    //   225: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   228: invokevirtual 5753	java/lang/String:length	()I
    //   231: iadd
    //   232: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   235: ldc_w 11626
    //   238: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: aload 9
    //   243: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: aload 4
    //   249: ifnull -95 -> 154
    //   252: aload 4
    //   254: invokeinterface 10641 1 0
    //   259: aload_3
    //   260: areturn
    //   261: astore 8
    //   263: aload_3
    //   264: areturn
    //   265: astore 5
    //   267: aload 4
    //   269: ifnull +10 -> 279
    //   272: aload 4
    //   274: invokeinterface 10641 1 0
    //   279: aload 5
    //   281: athrow
    //   282: astore 11
    //   284: aload_3
    //   285: areturn
    //   286: astore 6
    //   288: goto -9 -> 279
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	291	0	paramContext	Context
    //   0	291	1	paramUri	Uri
    //   4	93	2	localContentResolver	ContentResolver
    //   10	275	3	str1	String
    //   94	179	4	localInputStream	InputStream
    //   265	15	5	localObject	Object
    //   286	1	6	localIOException1	IOException
    //   198	13	7	localThrowable	Throwable
    //   261	1	8	localIOException2	IOException
    //   215	27	9	str2	String
    //   282	1	11	localIOException3	IOException
    //   123	14	12	str3	String
    //   70	14	15	str4	String
    //   25	14	18	str5	String
    // Exception table:
    //   from	to	target	type
    //   96	142	198	java/lang/Throwable
    //   184	195	198	java/lang/Throwable
    //   252	259	261	java/io/IOException
    //   96	142	265	finally
    //   184	195	265	finally
    //   200	247	265	finally
    //   147	154	282	java/io/IOException
    //   272	279	286	java/io/IOException
  }
  
  public static String c(Context paramContext, List<String> paramList)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (duk.a(localPackageManager, str)) {
        return str;
      }
    }
    return null;
  }
  
  public static String c(nxl paramnxl)
  {
    switch (a(paramnxl))
    {
    }
    do
    {
      do
      {
        return null;
      } while ((paramnxl.f.b.d.j == null) || (paramnxl.f.b.d.j.a == null) || (paramnxl.f.b.d.j.a.length == 0));
      return paramnxl.f.b.d.j.a[0].a;
    } while ((paramnxl.d == null) || (paramnxl.d.c == null) || (paramnxl.d.c.a == null) || (paramnxl.d.c.a.length == 0));
    return paramnxl.d.c.a[0].c;
  }
  
  public static <T> ArrayList<T> c(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    ArrayList localArrayList = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i1 + i2);
    return localArrayList;
  }
  
  public static HashMap<String, String> c(List<jgw> paramList)
  {
    HashMap localHashMap = new HashMap();
    int i1 = paramList.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      jgw localjgw = (jgw)paramList.get(i2);
      localHashMap.put(localjgw.b(), localjgw.c());
    }
    return localHashMap;
  }
  
  public static jqa c(Context paramContext, int paramInt, String paramString)
  {
    jqa localjqa = new jqa(paramContext, HostLocalCollectionTileActivity.class, paramInt);
    localjqa.a = paramString;
    return localjqa;
  }
  
  public static <T extends Parcelable> void c(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean)
  {
    if (paramList == null) {
      return;
    }
    int i1 = m(paramParcel, paramInt);
    int i2 = paramList.size();
    paramParcel.writeInt(i2);
    int i3 = 0;
    if (i3 < i2)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(i3);
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      }
      for (;;)
      {
        i3++;
        break;
        a(paramParcel, localParcelable, 0);
      }
    }
    n(paramParcel, i1);
  }
  
  public static void c(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
  }
  
  public static void c(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean) {
      throw new IllegalStateException(b(paramString, paramVarArgs));
    }
  }
  
  public static boolean c(Context paramContext, Intent paramIntent)
  {
    try
    {
      List localList = paramContext.getPackageManager().queryIntentActivities(paramIntent, 64);
      if ((localList == null) || (localList.size() == 0)) {
        break label116;
      }
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
        IntentFilter localIntentFilter = localResolveInfo.filter;
        if ((localIntentFilter != null) && (localIntentFilter.countDataAuthorities() != 0) && (localIntentFilter.countDataPaths() != 0))
        {
          ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
          if (localActivityInfo != null) {
            return true;
          }
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
    }
    return false;
    label116:
    return false;
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i1 = localPackageManager.getApplicationInfo(paramString, 0).flags;
      int i2 = i1 & 0x200000;
      boolean bool = false;
      if (i2 != 0) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public static boolean c(Uri paramUri)
  {
    boolean bool1 = mfq.b(paramUri);
    boolean bool2 = false;
    if (bool1)
    {
      String str1 = paramUri.getPath();
      String str2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.getPath();
      String str3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI.getPath();
      if (!str1.startsWith(str2))
      {
        boolean bool3 = str1.startsWith(str3);
        bool2 = false;
        if (!bool3) {}
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static boolean c(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readInt() != 0;
  }
  
  public static boolean c(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static boolean c(String paramString, int paramInt)
  {
    int i1 = 0;
    while (paramInt > 0)
    {
      int i2 = paramString.indexOf("~", i1);
      if (i2 == -1) {
        return false;
      }
      i1 = i2 + 1;
      paramInt--;
    }
    return true;
  }
  
  public static boolean c(String paramString1, String paramString2)
  {
    boolean bool;
    if (!TextUtils.isEmpty(paramString2))
    {
      bool = true;
      if (bool) {
        break label63;
      }
      Log.e("TypedActivityId", 36 + String.valueOf(paramString1).length() + "Empty " + paramString1 + " component for TypedActivityId");
    }
    label63:
    while (!paramString2.contains("~"))
    {
      return bool;
      bool = false;
      break;
    }
    Log.e("TypedActivityId", 67 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + "Component " + paramString1 + " includes field separator when creating TypedActivityId: " + paramString2);
    return bool;
  }
  
  public static boolean c(jgw paramjgw)
  {
    return (0x2 & paramjgw.g()) == 0;
  }
  
  public static byte[] c(Bitmap paramBitmap, int paramInt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(65536);
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 95, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static isv[] c(Context paramContext, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    ArrayList localArrayList = new ArrayList();
    h();
    int i2;
    if (paramInt2 != i1)
    {
      i2 = i1;
      if ((paramInt2 == 2) || (paramInt2 == 3)) {
        break label96;
      }
    }
    for (;;)
    {
      if (i2 != 0) {
        a(paramContext, localArrayList, paramInt1, paramInt2);
      }
      if (i1 != 0) {
        b(paramContext, localArrayList, paramInt1, paramInt2);
      }
      isv[] arrayOfisv = (isv[])localArrayList.toArray(new isv[localArrayList.size()]);
      Arrays.sort(arrayOfisv, new isu());
      return arrayOfisv;
      i2 = 0;
      break;
      label96:
      i1 = 0;
    }
  }
  
  public static omn[] c(gnb paramgnb)
  {
    int i1 = 0;
    ArrayList localArrayList = new ArrayList();
    if (paramgnb != null)
    {
      jgs[] arrayOfjgs = paramgnb.c;
      int i2 = arrayOfjgs.length;
      int i3 = 0;
      if (i3 < i2)
      {
        jgs localjgs = arrayOfjgs[i3];
        omn localomn3 = new omn();
        int i7 = localjgs.c;
        if (i7 == 5) {
          localomn3.c = 3;
        }
        for (;;)
        {
          localArrayList.add(localomn3);
          i3++;
          break;
          if (i7 == 7)
          {
            localomn3.c = 4;
          }
          else if (i7 == 8)
          {
            localomn3.c = 2;
          }
          else if (i7 == 9)
          {
            localomn3.c = 1;
          }
          else
          {
            String str2 = localjgs.a;
            if (str2.startsWith("f.")) {
              localomn3.b = str2.substring(2);
            } else {
              localomn3.b = str2;
            }
          }
        }
      }
      jjd[] arrayOfjjd = paramgnb.b;
      int i4 = arrayOfjjd.length;
      int i5 = 0;
      if (i5 < i4)
      {
        jjd localjjd = arrayOfjjd[i5];
        omn localomn2 = new omn();
        orm localorm = new orm();
        if (!TextUtils.isEmpty(localjjd.a))
        {
          localorm.c = localjjd.a;
          label239:
          localomn2.a = localorm;
          localArrayList.add(localomn2);
        }
        for (;;)
        {
          i5++;
          break;
          if (!TextUtils.isEmpty(localjjd.c))
          {
            localorm.a = localjjd.c;
            break label239;
          }
          if (Log.isLoggable("AclDataUtils", 3))
          {
            String str1 = String.valueOf(localjjd.b);
            if (str1.length() != 0) {
              "Invalid user: ".concat(str1);
            } else {
              new String("Invalid user: ");
            }
          }
        }
      }
      lhp[] arrayOflhp = paramgnb.d;
      int i6 = arrayOflhp.length;
      while (i1 < i6)
      {
        lhp locallhp = arrayOflhp[i1];
        omn localomn1 = new omn();
        omo localomo = new omo();
        localomo.a = locallhp.a;
        localomn1.d = localomo;
        if (locallhp.a == null) {
          throw new IllegalArgumentException("Missing Square stream id.");
        }
        localArrayList.add(localomn1);
        i1++;
      }
    }
    return (omn[])localArrayList.toArray(new omn[localArrayList.size()]);
  }
  
  public static int d(Context paramContext, List<Uri> paramList)
  {
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      Uri localUri2 = (Uri)localIterator1.next();
      boolean bool = mfq.b(localUri2);
      String str = String.valueOf(localUri2);
      c(bool, 38 + String.valueOf(str).length() + "Uri provided is not a MediaStore Uri: " + str);
    }
    List localList = mbb.c(paramContext, ist.class);
    Iterator localIterator2 = paramList.iterator();
    int i1 = 0;
    if (localIterator2.hasNext())
    {
      Uri localUri1 = (Uri)localIterator2.next();
      long l1 = ContentUris.parseId(localUri1);
      itd localitd = b(localUri1);
      if ((localitd == null) || (!b(paramContext, localitd, l1))) {
        break label197;
      }
      Iterator localIterator3 = localList.iterator();
      while (localIterator3.hasNext()) {
        localIterator3.next();
      }
    }
    label197:
    for (int i2 = i1 + 1;; i2 = i1)
    {
      i1 = i2;
      break;
      return i1;
    }
  }
  
  public static Intent d(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, PhotosLauncherActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.addFlags(335609856);
    return localIntent;
  }
  
  public static Intent d(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, MainSettingsPlusActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public static Intent d(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = k(paramContext, paramInt);
    localIntent.setAction("android.intent.action.SEND");
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.putExtra("android.intent.extra.TEXT", paramString);
    }
    localIntent.putExtra("is_internal", true);
    return localIntent;
  }
  
  public static Intent d(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("people_view_type", 10);
    localIntent.putExtra("title", paramString1);
    localIntent.putExtra("owner_id", paramString2);
    localIntent.putExtra("use_cached_data", paramBoolean);
    return localIntent;
  }
  
  public static Intent d(List<String> paramList)
  {
    String str = e(paramList);
    if (!TextUtils.isEmpty(str)) {
      return duk.a(str);
    }
    return null;
  }
  
  public static Bitmap d(Bitmap paramBitmap, int paramInt)
  {
    Matrix localMatrix;
    if ((paramInt != 0) && (paramBitmap != null))
    {
      localMatrix = new Matrix();
      localMatrix.setRotate(paramInt);
    }
    try
    {
      int i1 = paramBitmap.getWidth();
      int i2 = paramBitmap.getHeight();
      Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, i1, i2, localMatrix, true);
      paramBitmap = localBitmap;
      return paramBitmap;
    }
    catch (OutOfMemoryError localOutOfMemoryError) {}
    return paramBitmap;
  }
  
  /* Error */
  public static Point d(ContentResolver paramContentResolver, Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 7238	android/graphics/BitmapFactory$Options
    //   5: dup
    //   6: invokespecial 7239	android/graphics/BitmapFactory$Options:<init>	()V
    //   9: astore_3
    //   10: aload_3
    //   11: iconst_1
    //   12: putfield 11246	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   15: aload_0
    //   16: aload_1
    //   17: invokevirtual 7255	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   20: astore_2
    //   21: aload_2
    //   22: aconst_null
    //   23: aload_3
    //   24: invokestatic 7275	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   27: pop
    //   28: new 7244	android/graphics/Point
    //   31: dup
    //   32: aload_3
    //   33: getfield 11249	android/graphics/BitmapFactory$Options:outWidth	I
    //   36: aload_3
    //   37: getfield 11252	android/graphics/BitmapFactory$Options:outHeight	I
    //   40: invokespecial 11253	android/graphics/Point:<init>	(II)V
    //   43: astore 7
    //   45: aload_2
    //   46: ifnull +7 -> 53
    //   49: aload_2
    //   50: invokevirtual 7251	java/io/InputStream:close	()V
    //   53: aload 7
    //   55: areturn
    //   56: astore 4
    //   58: aload_2
    //   59: ifnull +7 -> 66
    //   62: aload_2
    //   63: invokevirtual 7251	java/io/InputStream:close	()V
    //   66: aload 4
    //   68: athrow
    //   69: astore 8
    //   71: aload 7
    //   73: areturn
    //   74: astore 5
    //   76: goto -10 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	paramContentResolver	ContentResolver
    //   0	79	1	paramUri	Uri
    //   1	62	2	localInputStream	InputStream
    //   9	28	3	localOptions	BitmapFactory.Options
    //   56	11	4	localObject	Object
    //   74	1	5	localIOException1	IOException
    //   43	29	7	localPoint	Point
    //   69	1	8	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   10	45	56	finally
    //   49	53	69	java/io/IOException
    //   62	66	74	java/io/IOException
  }
  
  public static gnb d(gnb paramgnb)
  {
    int i1 = paramgnb.b.length;
    ArrayList localArrayList = new ArrayList(i1);
    int i2 = 0;
    int i3 = 0;
    if (i2 < i1)
    {
      jjd localjjd = paramgnb.b[i2];
      if (localjjd.f) {}
      for (int i4 = i3 + 1;; i4 = i3)
      {
        i2++;
        i3 = i4;
        break;
        localArrayList.add(localjjd);
      }
    }
    return new gnb(localArrayList, Arrays.asList(paramgnb.c), Arrays.asList(paramgnb.d), Arrays.asList(paramgnb.e), paramgnb.a - i3);
  }
  
  public static hge d()
  {
    if (Gs == null) {
      Gs = new hfy();
    }
    return Gs;
  }
  
  public static Integer d(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    if (i1 == 0) {
      return null;
    }
    if (i1 != 4) {
      throw new bm("Expected size " + 4 + " got " + i1 + " (0x" + Integer.toHexString(i1) + ")", paramParcel);
    }
    return Integer.valueOf(paramParcel.readInt());
  }
  
  public static String d(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    Cursor localCursor = c(paramContext, paramInt1, paramString, paramInt2);
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        String str = localCursor.getString(localCursor.getColumnIndexOrThrow("continuation_token"));
        localObject2 = str;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String d(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Given String is empty or null");
    }
    return paramString;
  }
  
  public static String d(String paramString1, String paramString2)
  {
    if (paramString2.endsWith("=")) {}
    int i2;
    int i3;
    for (;;)
    {
      int i1 = paramString1.indexOf(paramString2);
      if (i1 == -1) {
        break label71;
      }
      i2 = i1 + paramString2.length();
      i3 = paramString1.indexOf('&', i2);
      if (i3 != -1) {
        break;
      }
      return paramString1.substring(i2);
      paramString2 = String.valueOf(paramString2).concat("=");
    }
    return paramString1.substring(i2, i3);
    label71:
    return null;
  }
  
  public static String d(nxl paramnxl)
  {
    if (paramnxl.f.b.d.a == null) {
      return null;
    }
    return paramnxl.f.b.d.a.f;
  }
  
  public static void d(View paramView)
  {
    paramView.setVisibility(0);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(500L);
    paramView.startAnimation(localAlphaAnimation);
  }
  
  public static void d(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalStateException(String.valueOf(paramObject));
    }
  }
  
  public static boolean d(int paramInt)
  {
    return Log.isLoggable("PeopleService", paramInt);
  }
  
  public static boolean d(int paramInt1, int paramInt2)
  {
    float f1 = paramInt1 / paramInt2;
    return (f1 > 2.0F) || (f1 < 0.5F);
  }
  
  public static boolean d(Context paramContext, Uri paramUri)
  {
    if (mfq.b(paramUri))
    {
      String str2 = f(paramContext.getContentResolver(), paramUri);
      if ((!"image/jpeg".equals(str2)) && (!"image/jpg".equals(str2))) {}
      while (new jrl(paramContext, paramUri).a()) {
        return false;
      }
    }
    for (;;)
    {
      try
      {
        localPoint = d(paramContext.getContentResolver(), paramUri);
        bool = d(localPoint.x, localPoint.y);
        if ((!bool) || (localPoint.x * localPoint.y <= 3145728)) {
          break label261;
        }
        i1 = 1;
        if (bool) {
          break label267;
        }
        if (localPoint.x > 2048) {
          break label243;
        }
        if (localPoint.y <= 2048) {
          break label267;
        }
      }
      catch (IOException localIOException)
      {
        Point localPoint;
        boolean bool;
        String str1;
        int i3;
        int i4;
        return false;
      }
      if ((Log.isLoggable("iu.UploadUtils", 4)) && (i1 == 0) && (i2 == 0)) {
        if (bool)
        {
          str1 = "pano";
          i3 = localPoint.x;
          i4 = localPoint.y;
          new StringBuilder(61 + String.valueOf(str1).length()).append("Don't resize; ").append(str1).append(" is too small; size: (").append(i3).append(", ").append(i4).append(")");
        }
        else
        {
          str1 = "image";
          continue;
          label243:
          i2 = 1;
          continue;
        }
      }
      if ((i1 == 0) && (i2 == 0)) {
        break;
      }
      return true;
      label261:
      int i1 = 0;
      continue;
      label267:
      int i2 = 0;
    }
  }
  
  public static boolean d(Context paramContext, String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 4096);
      String[] arrayOfString1 = localPackageInfo.requestedPermissions;
      boolean bool1 = false;
      String[] arrayOfString2;
      int i1;
      if (arrayOfString1 != null)
      {
        arrayOfString2 = localPackageInfo.requestedPermissions;
        i1 = arrayOfString2.length;
      }
      for (int i2 = 0;; i2++)
      {
        bool1 = false;
        if (i2 < i1)
        {
          boolean bool2 = arrayOfString2[i2].equals(paramString);
          if (bool2) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
  
  public static boolean d(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      return paramObject1 == paramObject2;
    }
    if (((paramObject1 instanceof Object[])) && ((paramObject2 instanceof Object[]))) {
      return Arrays.deepEquals((Object[])paramObject1, (Object[])paramObject2);
    }
    if (((paramObject1 instanceof boolean[])) && ((paramObject2 instanceof boolean[]))) {
      return Arrays.equals((boolean[])paramObject1, (boolean[])paramObject2);
    }
    if (((paramObject1 instanceof byte[])) && ((paramObject2 instanceof byte[]))) {
      return Arrays.equals((byte[])paramObject1, (byte[])paramObject2);
    }
    if (((paramObject1 instanceof char[])) && ((paramObject2 instanceof char[]))) {
      return Arrays.equals((char[])paramObject1, (char[])paramObject2);
    }
    if (((paramObject1 instanceof double[])) && ((paramObject2 instanceof double[]))) {
      return Arrays.equals((double[])paramObject1, (double[])paramObject2);
    }
    if (((paramObject1 instanceof float[])) && ((paramObject2 instanceof float[]))) {
      return Arrays.equals((float[])paramObject1, (float[])paramObject2);
    }
    if (((paramObject1 instanceof int[])) && ((paramObject2 instanceof int[]))) {
      return Arrays.equals((int[])paramObject1, (int[])paramObject2);
    }
    if (((paramObject1 instanceof long[])) && ((paramObject2 instanceof long[]))) {
      return Arrays.equals((long[])paramObject1, (long[])paramObject2);
    }
    if (((paramObject1 instanceof short[])) && ((paramObject2 instanceof short[]))) {
      return Arrays.equals((short[])paramObject1, (short[])paramObject2);
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static boolean d(jgw paramjgw)
  {
    return (0x8 & paramjgw.g()) == 0;
  }
  
  public static float e(int paramInt)
  {
    String str1;
    switch (paramInt)
    {
    default: 
      str1 = String.valueOf(String.valueOf(paramInt));
      if (str1.length() == 0) {
        break;
      }
    }
    for (String str2 = "Illegal value of postRotationType:".concat(str1);; str2 = new String("Illegal value of postRotationType:"))
    {
      throw new IllegalArgumentException(str2);
      return 0.0F;
      return 90.0F;
      return 180.0F;
      return 270.0F;
    }
  }
  
  public static Intent e(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.google.android.gms.location.settings.LOCATION_SHARING");
    localIntent.putExtra("account_name", ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name"));
    return localIntent;
  }
  
  public static Intent e(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("people_view_type", 8);
    if (paramString != null) {
      localIntent.putExtra("query", paramString);
    }
    return localIntent;
  }
  
  public static Rect e(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    return new Rect(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
  }
  
  /* Error */
  public static Uri e(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 4	java/lang/Object
    //   4: astore 4
    //   6: aload 4
    //   8: iconst_0
    //   9: aload_1
    //   10: invokevirtual 8685	android/net/Uri:toString	()Ljava/lang/String;
    //   13: invokestatic 11856	efj:C	(Ljava/lang/String;)Ljava/lang/String;
    //   16: aastore
    //   17: ldc_w 11858
    //   20: aload 4
    //   22: invokestatic 5888	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   25: astore 5
    //   27: aload_0
    //   28: aload 5
    //   30: invokevirtual 11862	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   33: invokevirtual 10247	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   36: astore 6
    //   38: aload_0
    //   39: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   42: astore 7
    //   44: aload 7
    //   46: aload_1
    //   47: invokestatic 11792	efj:d	(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Point;
    //   50: astore 8
    //   52: aload 8
    //   54: getfield 7246	android/graphics/Point:x	I
    //   57: aload 8
    //   59: getfield 7248	android/graphics/Point:y	I
    //   62: invokestatic 11794	efj:d	(II)Z
    //   65: ifeq +131 -> 196
    //   68: aload 7
    //   70: aload_1
    //   71: aload 8
    //   73: getfield 7246	android/graphics/Point:x	I
    //   76: aload 8
    //   78: getfield 7248	android/graphics/Point:y	I
    //   81: invokestatic 11864	efj:a	(Landroid/content/ContentResolver;Landroid/net/Uri;II)Landroid/graphics/Bitmap;
    //   84: astore 9
    //   86: new 7244	android/graphics/Point
    //   89: dup
    //   90: aload 9
    //   92: invokevirtual 7346	android/graphics/Bitmap:getWidth	()I
    //   95: aload 9
    //   97: invokevirtual 7349	android/graphics/Bitmap:getHeight	()I
    //   100: invokespecial 11253	android/graphics/Point:<init>	(II)V
    //   103: astore 10
    //   105: aload 9
    //   107: invokestatic 11866	efj:b	(Landroid/graphics/Bitmap;)[B
    //   110: astore 11
    //   112: aload 9
    //   114: invokevirtual 7282	android/graphics/Bitmap:recycle	()V
    //   117: aload_0
    //   118: aload 5
    //   120: iconst_0
    //   121: invokevirtual 11870	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   124: astore 12
    //   126: aload 12
    //   128: aload 11
    //   130: invokevirtual 11872	java/io/FileOutputStream:write	([B)V
    //   133: aload 12
    //   135: invokevirtual 11873	java/io/FileOutputStream:flush	()V
    //   138: aload 12
    //   140: invokevirtual 11874	java/io/FileOutputStream:close	()V
    //   143: aload_1
    //   144: invokestatic 6299	mfq:b	(Landroid/net/Uri;)Z
    //   147: ifeq +94 -> 241
    //   150: aload_0
    //   151: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   154: aload_1
    //   155: invokestatic 11549	mfq:a	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   158: aload 6
    //   160: aload 10
    //   162: invokestatic 11876	efj:a	(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Point;)V
    //   165: aload 6
    //   167: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   170: astore 16
    //   172: aload 16
    //   174: invokevirtual 5753	java/lang/String:length	()I
    //   177: ifeq +112 -> 289
    //   180: ldc_w 11878
    //   183: aload 16
    //   185: invokevirtual 5848	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   188: astore 17
    //   190: aload 17
    //   192: invokestatic 6043	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   195: areturn
    //   196: aload 7
    //   198: aload_1
    //   199: aload 8
    //   201: getfield 7246	android/graphics/Point:x	I
    //   204: aload 8
    //   206: getfield 7248	android/graphics/Point:y	I
    //   209: invokestatic 11880	efj:b	(Landroid/content/ContentResolver;Landroid/net/Uri;II)Landroid/graphics/Bitmap;
    //   212: astore 9
    //   214: goto -128 -> 86
    //   217: astore 13
    //   219: aload 12
    //   221: invokevirtual 11874	java/io/FileOutputStream:close	()V
    //   224: aload 13
    //   226: athrow
    //   227: astore_2
    //   228: ldc_w 7284
    //   231: ldc_w 11882
    //   234: aload_2
    //   235: invokestatic 7428	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   238: pop
    //   239: aconst_null
    //   240: areturn
    //   241: aload_1
    //   242: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   245: astore 14
    //   247: ldc_w 7284
    //   250: new 5654	java/lang/StringBuilder
    //   253: dup
    //   254: bipush 33
    //   256: aload 14
    //   258: invokestatic 5845	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   261: invokevirtual 5753	java/lang/String:length	()I
    //   264: iadd
    //   265: invokespecial 5876	java/lang/StringBuilder:<init>	(I)V
    //   268: ldc_w 11884
    //   271: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: aload 14
    //   276: invokevirtual 5663	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: invokevirtual 5667	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   282: invokestatic 7557	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   285: pop
    //   286: goto -121 -> 165
    //   289: new 5749	java/lang/String
    //   292: dup
    //   293: ldc_w 11878
    //   296: invokespecial 5849	java/lang/String:<init>	(Ljava/lang/String;)V
    //   299: astore 17
    //   301: goto -111 -> 190
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	paramContext	Context
    //   0	304	1	paramUri	Uri
    //   227	8	2	localThrowable	Throwable
    //   4	17	4	arrayOfObject	Object[]
    //   25	94	5	str1	String
    //   36	130	6	str2	String
    //   42	155	7	localContentResolver	ContentResolver
    //   50	155	8	localPoint1	Point
    //   84	129	9	localBitmap	Bitmap
    //   103	58	10	localPoint2	Point
    //   110	19	11	arrayOfByte	byte[]
    //   124	96	12	localFileOutputStream	java.io.FileOutputStream
    //   217	8	13	localObject	Object
    //   245	30	14	str3	String
    //   170	14	16	str4	String
    //   188	112	17	str5	String
    // Exception table:
    //   from	to	target	type
    //   126	138	217	finally
    //   0	86	227	java/lang/Throwable
    //   86	126	227	java/lang/Throwable
    //   138	165	227	java/lang/Throwable
    //   165	190	227	java/lang/Throwable
    //   190	196	227	java/lang/Throwable
    //   196	214	227	java/lang/Throwable
    //   219	227	227	java/lang/Throwable
    //   241	286	227	java/lang/Throwable
    //   289	301	227	java/lang/Throwable
  }
  
  public static hge e()
  {
    if (Gw == null) {
      Gw = new hgb();
    }
    return Gw;
  }
  
  public static <T> T e(T paramT, Object paramObject)
  {
    if (paramT == null) {
      throw new NullPointerException(String.valueOf(paramObject));
    }
    return paramT;
  }
  
  public static String e(ContentResolver paramContentResolver, Uri paramUri)
  {
    try
    {
      String str3 = paramContentResolver.getType(paramUri);
      str1 = str3;
    }
    catch (Exception localException)
    {
      boolean bool;
      do
      {
        bool = Log.isLoggable("iu.UploadUtils", 5);
        String str1 = null;
      } while (!bool);
      String str2 = String.valueOf(paramUri);
      new StringBuilder(31 + String.valueOf(str2).length()).append("safeGetMimeType failed for uri=").append(str2);
    }
    return str1;
    return null;
  }
  
  /* Error */
  public static String e(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokestatic 6043	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   6: astore_3
    //   7: aload_0
    //   8: aload_1
    //   9: invokestatic 11893	efj:f	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   12: astore 10
    //   14: new 8951	java/io/File
    //   17: dup
    //   18: aload 10
    //   20: invokespecial 10628	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: invokevirtual 11896	java/io/File:exists	()Z
    //   26: istore 11
    //   28: iload 11
    //   30: ifeq +16 -> 46
    //   33: iconst_0
    //   34: ifeq +9 -> 43
    //   37: aconst_null
    //   38: invokeinterface 10641 1 0
    //   43: aload 10
    //   45: areturn
    //   46: aload_0
    //   47: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   50: aload_3
    //   51: ldc_w 6558
    //   54: invokevirtual 11900	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   57: invokevirtual 11905	android/os/ParcelFileDescriptor:getStatSize	()J
    //   60: lstore 14
    //   62: lload 14
    //   64: ldc2_w 11906
    //   67: lcmp
    //   68: ifle +29 -> 97
    //   71: iconst_0
    //   72: ifeq +9 -> 81
    //   75: aconst_null
    //   76: invokeinterface 10641 1 0
    //   81: aconst_null
    //   82: areturn
    //   83: astore 12
    //   85: iconst_0
    //   86: ifeq +9 -> 95
    //   89: aconst_null
    //   90: invokeinterface 10641 1 0
    //   95: aconst_null
    //   96: areturn
    //   97: aload_0
    //   98: invokevirtual 5811	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   101: aload_3
    //   102: invokevirtual 7255	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   105: astore 16
    //   107: aload 16
    //   109: astore 5
    //   111: sipush 8192
    //   114: newarray byte
    //   116: astore 17
    //   118: new 10645	java/io/FileOutputStream
    //   121: dup
    //   122: aload 10
    //   124: invokespecial 11908	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   127: astore 18
    //   129: aload 5
    //   131: aload 17
    //   133: invokevirtual 10654	java/io/InputStream:read	([B)I
    //   136: istore 20
    //   138: iload 20
    //   140: iconst_m1
    //   141: if_icmpeq +54 -> 195
    //   144: aload 18
    //   146: aload 17
    //   148: iconst_0
    //   149: iload 20
    //   151: invokevirtual 11909	java/io/FileOutputStream:write	([BII)V
    //   154: goto -25 -> 129
    //   157: astore 19
    //   159: aload 18
    //   161: invokevirtual 11874	java/io/FileOutputStream:close	()V
    //   164: aload 19
    //   166: athrow
    //   167: astore 4
    //   169: ldc_w 7284
    //   172: ldc_w 11911
    //   175: aload 4
    //   177: invokestatic 7428	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   180: pop
    //   181: aload 5
    //   183: ifnull +10 -> 193
    //   186: aload 5
    //   188: invokeinterface 10641 1 0
    //   193: aconst_null
    //   194: areturn
    //   195: aload 18
    //   197: invokevirtual 11874	java/io/FileOutputStream:close	()V
    //   200: aload 5
    //   202: ifnull -159 -> 43
    //   205: aload 5
    //   207: invokeinterface 10641 1 0
    //   212: aload 10
    //   214: areturn
    //   215: astore 21
    //   217: aload 10
    //   219: areturn
    //   220: astore 6
    //   222: aload_2
    //   223: ifnull +9 -> 232
    //   226: aload_2
    //   227: invokeinterface 10641 1 0
    //   232: aload 6
    //   234: athrow
    //   235: astore 23
    //   237: aload 10
    //   239: areturn
    //   240: astore 22
    //   242: goto -161 -> 81
    //   245: astore 13
    //   247: goto -152 -> 95
    //   250: astore 9
    //   252: goto -59 -> 193
    //   255: astore 7
    //   257: goto -25 -> 232
    //   260: astore 6
    //   262: aload 5
    //   264: astore_2
    //   265: goto -43 -> 222
    //   268: astore 4
    //   270: aconst_null
    //   271: astore 5
    //   273: goto -104 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramContext	Context
    //   0	276	1	paramString	String
    //   1	264	2	localObject1	Object
    //   6	96	3	localUri	Uri
    //   167	9	4	localThrowable1	Throwable
    //   268	1	4	localThrowable2	Throwable
    //   109	163	5	localInputStream1	InputStream
    //   220	13	6	localObject2	Object
    //   260	1	6	localObject3	Object
    //   255	1	7	localIOException1	IOException
    //   250	1	9	localIOException2	IOException
    //   12	226	10	str	String
    //   26	3	11	bool	boolean
    //   83	1	12	localFileNotFoundException	FileNotFoundException
    //   245	1	13	localIOException3	IOException
    //   60	3	14	l1	long
    //   105	3	16	localInputStream2	InputStream
    //   116	31	17	arrayOfByte	byte[]
    //   127	69	18	localFileOutputStream	java.io.FileOutputStream
    //   157	8	19	localObject4	Object
    //   136	14	20	i1	int
    //   215	1	21	localIOException4	IOException
    //   240	1	22	localIOException5	IOException
    //   235	1	23	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   46	62	83	java/io/FileNotFoundException
    //   129	138	157	finally
    //   144	154	157	finally
    //   111	129	167	java/lang/Throwable
    //   159	167	167	java/lang/Throwable
    //   195	200	167	java/lang/Throwable
    //   205	212	215	java/io/IOException
    //   7	28	220	finally
    //   46	62	220	finally
    //   97	107	220	finally
    //   37	43	235	java/io/IOException
    //   75	81	240	java/io/IOException
    //   89	95	245	java/io/IOException
    //   186	193	250	java/io/IOException
    //   226	232	255	java/io/IOException
    //   111	129	260	finally
    //   159	167	260	finally
    //   169	181	260	finally
    //   195	200	260	finally
    //   7	28	268	java/lang/Throwable
    //   46	62	268	java/lang/Throwable
    //   97	107	268	java/lang/Throwable
  }
  
  public static String e(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i1 + i2);
    return str;
  }
  
  public static String e(List<String> paramList)
  {
    if (paramList.size() > 0) {
      return (String)paramList.get(0);
    }
    return null;
  }
  
  public static kxg e(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 3) || (paramInt1 == 2) || (paramInt1 == 1)) {
      return kxg.k;
    }
    if (paramInt1 == 4) {
      return kxg.g;
    }
    if (paramInt1 == 5) {
      return kxg.e;
    }
    if (paramInt2 == 0) {
      return kxg.d;
    }
    if (paramInt2 == 1) {
      return kxg.f;
    }
    if (paramInt2 == 2) {
      return kxg.j;
    }
    return kxg.a;
  }
  
  public static qhh e(nxl paramnxl)
  {
    if ((paramnxl == null) || (paramnxl.f == null) || (paramnxl.f.b == null) || (paramnxl.f.b.d == null)) {
      return null;
    }
    return paramnxl.f.b.d.o;
  }
  
  public static void e(Context paramContext)
  {
    AppWidgetManager localAppWidgetManager = eaq.b(paramContext);
    if (localAppWidgetManager == null) {}
    for (;;)
    {
      return;
      int[] arrayOfInt = localAppWidgetManager.getAppWidgetIds(new ComponentName(paramContext, LocationsWidgetProvider.class));
      int i1 = arrayOfInt.length;
      for (int i2 = 0; i2 < i1; i2++) {
        LocationsWidgetProvider.a(paramContext, arrayOfInt[i2]);
      }
    }
  }
  
  public static void e(Context paramContext, List<isy> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      isy localisy = (isy)localIterator.next();
      b(paramContext, localisy.a, localisy.b);
    }
  }
  
  public static void e(String paramString)
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException(paramString);
    }
  }
  
  public static Intent f(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("destination", 1);
    return localIntent;
  }
  
  public static Intent f(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, GatewayActivity.class);
    localIntent.setData(Uri.parse(paramString));
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public static IBinder f(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    IBinder localIBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i1 + i2);
    return localIBinder;
  }
  
  public static hge f()
  {
    if (Gv == null) {
      Gv = new hgc();
    }
    return Gv;
  }
  
  public static String f(int paramInt)
  {
    int i1 = 0;
    boolean bool;
    StringBuilder localStringBuilder;
    if (paramInt > 0)
    {
      bool = true;
      c(bool, "numValues must be greater than zero.");
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(" IN (");
      label31:
      if (i1 >= paramInt) {
        break label69;
      }
      if (i1 != 0) {
        break label58;
      }
      localStringBuilder.append('?');
    }
    for (;;)
    {
      i1++;
      break label31;
      bool = false;
      break;
      label58:
      localStringBuilder.append(", ?");
    }
    label69:
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static String f(ContentResolver paramContentResolver, Uri paramUri)
  {
    Object localObject = null;
    try
    {
      localObject = e(paramContentResolver, paramUri);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        String str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(paramUri.toString()));
        localObject = str2;
      }
    }
    catch (Exception localException)
    {
      while (!Log.isLoggable("iu.UploadUtils", 5)) {}
      String str1 = String.valueOf(paramUri);
      new StringBuilder(27 + String.valueOf(str1).length()).append("getMimeType failed for uri=").append(str1);
    }
    return localObject;
    return localObject;
  }
  
  public static String f(Context paramContext)
  {
    int i1 = Binder.getCallingPid();
    List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if (localRunningAppProcessInfo.pid == i1) {
          return localRunningAppProcessInfo.processName;
        }
      }
    }
    return null;
  }
  
  public static String f(Context paramContext, String paramString)
  {
    if (Qa == null)
    {
      File localFile = new File(paramContext.getCacheDir(), "tmp");
      Qa = localFile;
      if (localFile.exists()) {}
    }
    try
    {
      Qa.mkdir();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(Qa);
      localStringBuilder.append(File.separatorChar);
      localStringBuilder.append(C(paramString));
      return localStringBuilder.toString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = String.valueOf(Qa);
        Log.e("iu.UploadUtils", 30 + String.valueOf(str).length() + "Cannot create temp directory: " + str, localException);
      }
    }
  }
  
  public static String f(nxl paramnxl)
  {
    if (paramnxl.f.b.d.p == null) {
      return null;
    }
    return paramnxl.f.b.d.p.a;
  }
  
  public static void f(View paramView)
  {
    ((gxe)mbb.a(paramView.getContext(), gxe.class)).a(paramView);
  }
  
  public static void f(String paramString)
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      throw new IllegalStateException(paramString);
    }
  }
  
  public static boolean f(Context paramContext, Uri paramUri)
  {
    if (!mfq.b(paramUri)) {
      label7:
      return false;
    }
    String[] arrayOfString = { "_data" };
    Cursor localCursor1;
    try
    {
      Cursor localCursor2 = paramContext.getContentResolver().query(paramUri, arrayOfString, null, null, null);
      localCursor1 = localCursor2;
      if (localCursor1 == null) {}
    }
    finally
    {
      try
      {
        if (localCursor1.moveToNext())
        {
          String str = localCursor1.getString(localCursor1.getColumnIndex("_data"));
          if (!TextUtils.isEmpty(str))
          {
            boolean bool2 = new File(str).getName().startsWith("AUTO_AWESOME_MOVIE_1_");
            if (!bool2) {}
          }
          for (boolean bool1 = true;; bool1 = false)
          {
            if (localCursor1 != null) {
              localCursor1.close();
            }
            return bool1;
          }
        }
        if (localCursor1 == null) {
          break label7;
        }
        localCursor1.close();
        return false;
      }
      finally {}
      localObject1 = finally;
      localCursor1 = null;
    }
    if (localCursor1 != null) {
      localCursor1.close();
    }
    throw localObject1;
  }
  
  public static <T extends qat> byte[] f(List<T> paramList)
  {
    return a((qat[])paramList.toArray(new qat[paramList.size()]));
  }
  
  public static int g(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    }
    return 6;
  }
  
  public static int g(Context paramContext)
  {
    if (FG == 0) {
      FG = paramContext.getApplicationContext().getResources().getDimensionPixelSize(Gb);
    }
    return FG;
  }
  
  public static Intent g(Context paramContext, int paramInt)
  {
    if (((hyi)mbb.a(paramContext, hyi.class)).b(jik.d, paramInt))
    {
      ddx localddx = new ddx(paramContext).a(paramInt);
      localddx.a.addFlags(67108864);
      localddx.a.putExtra("peopleTabIndex", 0);
      return localddx.a();
    }
    Intent localIntent = new Intent(paramContext, HostPeopleActivity.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public static Intent g(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, HostFriendLocationsActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("gaia_id", paramString);
    return localIntent;
  }
  
  public static Bundle g(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    Bundle localBundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i1 + i2);
    return localBundle;
  }
  
  public static hge g()
  {
    if (Gx == null) {
      Gx = new hfx();
    }
    return Gx;
  }
  
  public static String g(Context paramContext, String paramString)
  {
    int i1 = -1;
    for (;;)
    {
      try
      {
        int i2 = Integer.parseInt(paramString);
        switch (i2)
        {
        case 3: 
        default: 
          String str = null;
          if (i1 > 0) {
            str = paramContext.getString(i1);
          }
          return str;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Log.e("Profile", "Unexpected index for Phone Type", localNumberFormatException);
        return null;
      }
      i1 = aaw.po;
      continue;
      i1 = aaw.py;
      continue;
      i1 = aaw.pp;
      continue;
      i1 = aaw.pz;
      continue;
      i1 = aaw.ps;
      continue;
      i1 = aaw.pu;
      continue;
      i1 = aaw.pt;
      continue;
      i1 = aaw.pm;
      continue;
      i1 = aaw.pj;
      continue;
      i1 = aaw.pl;
      continue;
      i1 = aaw.pv;
      continue;
      i1 = aaw.pq;
      continue;
      i1 = aaw.pk;
      continue;
      i1 = aaw.pw;
      continue;
      i1 = aaw.px;
      continue;
      i1 = aaw.pA;
      continue;
      i1 = aaw.pB;
      continue;
      i1 = aaw.pr;
      continue;
      i1 = aaw.pn;
    }
  }
  
  public static String g(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    if (i1 < paramString.length())
    {
      char c1 = paramString.charAt(i1);
      if (i1 == 0) {
        localStringBuffer.append(Character.toLowerCase(c1));
      }
      for (;;)
      {
        i1++;
        break;
        if (Character.isUpperCase(c1)) {
          localStringBuffer.append('_').append(Character.toLowerCase(c1));
        } else {
          localStringBuffer.append(c1);
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static List<qgj> g(nxl paramnxl)
  {
    ArrayList localArrayList = new ArrayList();
    qgl localqgl = paramnxl.f.b.d.h;
    if ((localqgl != null) && (localqgl.a != null) && (localqgl.a.length > 0)) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        Collections.addAll(localArrayList, localqgl.a);
      }
      return localArrayList;
    }
  }
  
  public static nnc g(List<String> paramList)
  {
    nnc localnnc = new nnc();
    int i1 = paramList.size();
    localnnc.a = new nnd[i1];
    for (int i2 = 0; i2 < i1; i2++)
    {
      nnd localnnd = new nnd();
      localnnd.a = ((String)paramList.get(i2));
      localnnc.a[i2] = localnnd;
    }
    return localnnc;
  }
  
  public static void g(View paramView)
  {
    ((gxe)mbb.a(paramView.getContext(), gxe.class)).b(paramView);
  }
  
  public static int h(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalStateException(32 + "Invalid follow state " + paramInt);
    case 4: 
    case 5: 
      return 2;
    }
    return 4;
  }
  
  public static Intent h(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, PhotosHomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    if (paramInt != -1) {
      localIntent.putExtra("account_id", paramInt);
    }
    localIntent.putExtra("destination", 1);
    localIntent.putExtra("picker_mode", 0);
    return localIntent;
  }
  
  public static Intent h(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = a(paramContext, "vnd.google.android.hangouts/vnd.google.android.hangout_privileged", paramInt, true);
    if (localIntent != null) {
      localIntent.putExtra("hangout_uri", Uri.parse(paramString));
    }
    return localIntent;
  }
  
  public static Bitmap h(Context paramContext)
  {
    if (FK == null) {
      FK = mfo.a(l(paramContext), g(paramContext), 0);
    }
    return FK;
  }
  
  public static gxq h(View paramView)
  {
    if ((paramView instanceof gxs)) {
      return ((gxs)paramView).v();
    }
    return (gxq)paramView.getTag(Fe);
  }
  
  public static String h(String paramString)
  {
    int i1 = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i1);
    int i2 = 0;
    if (i2 < i1)
    {
      char c1 = paramString.charAt(i2);
      if ((c1 >= ' ') && (c1 <= '~') && (c1 != '"') && (c1 != '\'')) {
        localStringBuilder.append(c1);
      }
      for (;;)
      {
        i2++;
        break;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(c1);
        localStringBuilder.append(String.format("\\u%04x", arrayOfObject));
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String h(List<jgw> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      jgw localjgw = (jgw)localIterator.next();
      if (localjgw != null)
      {
        String str = localjgw.b();
        if (!TextUtils.isEmpty(str)) {
          localArrayList.add(str);
        }
      }
    }
    return a(localArrayList);
  }
  
  public static void h()
  {
    if (PW == null)
    {
      itd[] arrayOfitd = new itd[4];
      arrayOfitd[0] = new isz(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
      arrayOfitd[1] = new isz(itf.b);
      arrayOfitd[2] = new ite(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
      arrayOfitd[3] = new ite(itf.a);
      PW = arrayOfitd;
    }
  }
  
  public static boolean h(nxl paramnxl)
  {
    switch (a(paramnxl))
    {
    default: 
      return false;
    case 3: 
    case 4: 
      return a(paramnxl.f.b);
    }
    return b(paramnxl.f.b);
  }
  
  public static byte[] h(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i1 + i2);
    return arrayOfByte;
  }
  
  public static int i(int paramInt)
  {
    if ((paramInt == 3) || (paramInt == 1) || (paramInt == 6) || (paramInt == 2) || (paramInt == 4)) {
      return paramInt;
    }
    if (Log.isLoggable("EventUtils", 3)) {
      new StringBuilder(46).append("[FILTER_RSVP_TYPE]; ").append(paramInt).append(" not recognized");
    }
    return 5;
  }
  
  public static int i(Context paramContext)
  {
    if (FH == 0) {
      FH = paramContext.getApplicationContext().getResources().getDimensionPixelSize(FX);
    }
    return FH;
  }
  
  public static Intent i(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("destination", 0);
    localIntent.putExtra("circle_info", new cyf(paramContext, null, "v.whatshot", 0, 0L));
    return localIntent;
  }
  
  public static Intent i(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = a(paramContext, "vnd.google.android.hangouts/vnd.google.android.hangout_privileged", paramInt, false);
    if (localIntent != null) {
      localIntent.putExtra("participant_gaia", paramString);
    }
    return localIntent;
  }
  
  public static SparseIntArray i()
  {
    if (Wu == null)
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      Wu = localSparseIntArray;
      localSparseIntArray.append(1, Wp);
      Wu.append(2, Wn);
      Wu.append(3, Wm);
      Wu.append(16, Wl);
      Wu.append(4, Wk);
      Wu.append(18, Wo);
    }
    return Wu;
  }
  
  public static qgm i(nxl paramnxl)
  {
    switch (a(paramnxl))
    {
    }
    do
    {
      return null;
    } while (paramnxl.f.b.d.f == null);
    return paramnxl.f.b.d.f.a;
  }
  
  public static rgw i(String paramString)
  {
    rgw localrgw = new rgw();
    localrgw.a = Long.valueOf(Process.getElapsedCpuTime());
    localrgw.b = Boolean.valueOf(ged.a());
    localrgw.c = Integer.valueOf(Thread.activeCount());
    if (paramString != null) {
      localrgw.d = paramString;
    }
    return localrgw;
  }
  
  public static void i(View paramView)
  {
    if (Build.VERSION.SDK_INT < 16) {
      paramView.setContentDescription(paramView.getContentDescription());
    }
  }
  
  public static int[] i(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(i1 + i2);
    return arrayOfInt;
  }
  
  public static Intent j(Context paramContext, int paramInt)
  {
    Intent localIntent = k(paramContext, paramInt);
    localIntent.putExtra("is_internal", true);
    return localIntent;
  }
  
  public static Intent j(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, TopicStreamActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("query", paramString);
    localIntent.putExtra("show_search_view", false);
    return localIntent;
  }
  
  public static Bitmap j(Context paramContext)
  {
    if (FN == null) {
      FN = mfo.a(l(paramContext), i(paramContext), 0);
    }
    return FN;
  }
  
  public static String j(String paramString)
  {
    Locale localLocale = Locale.getDefault();
    String str1 = String.valueOf(localLocale.getLanguage());
    String str2 = String.valueOf(localLocale.getCountry().toLowerCase());
    String str3 = 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "-" + str2;
    if (paramString.contains("%locale%")) {
      return paramString.replace("%locale%", str3);
    }
    Uri.Builder localBuilder = Uri.parse(paramString).buildUpon();
    localBuilder.appendQueryParameter("hl", str3);
    return localBuilder.build().toString();
  }
  
  public static String j(nxl paramnxl)
  {
    qgz localqgz = paramnxl.f.b.d.l;
    qha localqha1;
    int i2;
    String str;
    if (localqgz != null)
    {
      localqha1 = localqgz.b;
      qha[] arrayOfqha = localqgz.c;
      if (arrayOfqha == null) {
        break label100;
      }
      int i1 = arrayOfqha.length;
      i2 = 0;
      if (i2 >= i1) {
        break label100;
      }
      qha localqha2 = arrayOfqha[i2];
      if ((localqha2.b.intValue() == 1600) && (localqha2.c.intValue() == 900)) {
        str = localqha2.a;
      }
    }
    label100:
    do
    {
      return str;
      i2++;
      break;
      localqha1 = null;
      str = null;
    } while (localqha1 == null);
    return localqha1.a;
  }
  
  @Deprecated
  public static jjm<jgw> j(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 8: 
    case 19: 
    default: 
      return jgx.a;
    case 0: 
      return jgx.a;
    case 1: 
      return jgx.c;
    case 2: 
      return jgx.d;
    case 3: 
      return jgx.f;
    case 4: 
      return jgx.e;
    case 5: 
      return jgx.g;
    case 7: 
      return jgx.k;
    case 9: 
      return jgx.h;
    case 10: 
      return jgx.i;
    case 11: 
      return jgx.l;
    case 12: 
      return jgx.m;
    case 13: 
      return jgx.n;
    case 14: 
      return jgx.o;
    case 15: 
      return jgx.p;
    case 16: 
      return jgx.j;
    case 17: 
      return jgx.q;
    case 18: 
      return jgx.r;
    }
    return jgx.s;
  }
  
  public static void j(View paramView)
  {
    if (paramView == null) {}
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.showSoftInput(paramView, 0);
  }
  
  public static boolean j()
  {
    if (abc == null) {
      abc = Looper.getMainLooper().getThread();
    }
    return Thread.currentThread() == abc;
  }
  
  public static String[] j(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    String[] arrayOfString = paramParcel.createStringArray();
    paramParcel.setDataPosition(i1 + i2);
    return arrayOfString;
  }
  
  public static int k(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 1: 
      return 9;
    case 2: 
      return 8;
    case 3: 
      return 5;
    case 4: 
      return 7;
    case 5: 
      return 10;
    case 6: 
      return 100;
    }
    return 11;
  }
  
  public static int k(Context paramContext)
  {
    if (FI == 0) {
      FI = paramContext.getApplicationContext().getResources().getDimensionPixelSize(FZ);
    }
    return FI;
  }
  
  public static Intent k(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, PlusShareboxActivity.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public static Intent k(Context paramContext, int paramInt, String paramString)
  {
    if (paramInt == -1) {
      throw new IllegalStateException("Making a PhotoTileSearchAcitivity Intent with an invalid ACCOUNT_ID");
    }
    Intent localIntent = new Intent(paramContext, PhotoTileSearchActivity.class);
    localIntent.putExtra("account_id", paramInt);
    if (paramString != null) {
      localIntent.putExtra("query", paramString);
    }
    return localIntent;
  }
  
  public static ArrayList<Integer> k(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i3 = paramParcel.readInt();
    for (int i4 = 0; i4 < i3; i4++) {
      localArrayList.add(Integer.valueOf(paramParcel.readInt()));
    }
    paramParcel.setDataPosition(i2 + i1);
    return localArrayList;
  }
  
  public static qkn k(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return null;
      byte[] arrayOfByte = Base64.decode(paramString, 10);
      qkn localqkn = new qkn();
      try
      {
        qat.b(localqkn, arrayOfByte, 0, arrayOfByte.length);
        if (a(localqkn, arrayOfByte)) {
          return localqkn;
        }
      }
      catch (Exception localException) {}
    }
    return null;
  }
  
  public static void k()
  {
    if (!j()) {
      throw new RuntimeException("Must be called on the UI thread");
    }
  }
  
  public static void k(View paramView)
  {
    if (paramView == null) {}
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public static qga[] k(nxl paramnxl)
  {
    switch (a(paramnxl))
    {
    }
    do
    {
      return null;
    } while (paramnxl.f.b.d.d == null);
    return paramnxl.f.b.d.d.a;
  }
  
  public static long l(int paramInt)
  {
    long l1 = 0L;
    if ((paramInt & 0x1) != 0) {
      l1 = 32L;
    }
    if ((paramInt & 0x8) != 0) {
      l1 |= 0x80;
    }
    if ((paramInt & 0x10) != 0) {
      l1 |= 0x400000;
    }
    if ((paramInt & 0x20) != 0) {
      l1 |= 0x1000000;
    }
    return l1;
  }
  
  public static Intent l(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("people_view_type", 0);
    return localIntent;
  }
  
  public static Bitmap l(Context paramContext)
  {
    if (FQ == null) {
      FQ = mfo.a(n(paramContext), k(paramContext), 0);
    }
    return FQ;
  }
  
  public static String l(Context paramContext, int paramInt, String paramString)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      return localResources.getString(Cj);
    case 1: 
      if (a(localResources)) {
        return localResources.getString(Ca, new Object[] { paramString });
      }
      return localResources.getString(BZ, new Object[] { paramString });
    case 3: 
      return localResources.getString(BW, new Object[] { paramString });
    case 18: 
      return localResources.getString(Cp, new Object[] { paramString });
    case 2: 
      return localResources.getString(Cn, new Object[] { paramString });
    case 42: 
      return localResources.getString(BS, new Object[] { paramString });
    case 9: 
      return localResources.getString(Ck, new Object[] { paramString });
    case 7: 
      return localResources.getString(Ce);
    case 5: 
      return localResources.getString(Cc);
    case 16: 
      return localResources.getString(BU, new Object[] { paramString });
    }
    return localResources.getString(Ch);
  }
  
  public static ArrayList<String> l(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    int i2 = paramParcel.dataPosition();
    if (i1 == 0) {
      return null;
    }
    ArrayList localArrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(i1 + i2);
    return localArrayList;
  }
  
  public static void l()
  {
    if (j()) {
      throw new RuntimeException("Must be called on a background thread");
    }
  }
  
  public static void l(View paramView)
  {
    if (paramView == null) {}
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.restartInput(paramView);
  }
  
  public static void l(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    if ((localUri != null) && (localUri.getScheme().equals("file"))) {}
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      if (!new File(localUri.getPath()).delete()) {
        Log.e("LocalMediaHandler", "Media file could not be deleted.");
      }
      return;
    }
    throw new IllegalArgumentException("Expecting non-null file:// uri parameter.");
  }
  
  public static int m(Context paramContext)
  {
    if (FJ == 0) {
      FJ = paramContext.getApplicationContext().getResources().getDimensionPixelSize(FY);
    }
    return FJ;
  }
  
  public static int m(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(0xFFFF0000 | paramInt);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  public static long m(int paramInt)
  {
    if ((paramInt & 0x2) != 0) {}
    for (long l1 = 32L;; l1 = 0L)
    {
      if (l1 == 0L) {
        l1 = 9223372036854775807L;
      }
      return l1;
    }
  }
  
  public static Intent m(Context paramContext, int paramInt)
  {
    if (((hyi)mbb.a(paramContext, hyi.class)).b(jik.d, paramInt))
    {
      ddx localddx = new ddx(paramContext).a(paramInt);
      localddx.a.addFlags(67108864);
      localddx.a.putExtra("peopleTabIndex", 0);
      return localddx.a();
    }
    Intent localIntent = new Intent(paramContext, PeopleListActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("people_view_type", 13);
    localIntent.putExtra("people_clear_cache", true);
    return localIntent;
  }
  
  public static Handler m()
  {
    if (abd == null) {
      abd = new Handler(Looper.getMainLooper());
    }
    return abd;
  }
  
  public static String m(String paramString)
  {
    Locale localLocale = Locale.US;
    String str1 = String.valueOf("case when (");
    String str2 = 120 + String.valueOf(str1).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + String.valueOf(paramString).length() + str1 + paramString + " >= %1$d and " + paramString + " < %2$d) then " + paramString + " * 1000 when (" + paramString + " >= %3$d and " + paramString + " < %4$d) then " + paramString + " when (" + paramString + " >= %5$d and " + paramString + " < %6$d) then " + paramString + " / 1000 else 0" + " end";
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Long.valueOf(157680000L);
    arrayOfObject[1] = Long.valueOf(1892160000L);
    arrayOfObject[2] = Long.valueOf(157680000000L);
    arrayOfObject[3] = Long.valueOf(1892160000000L);
    arrayOfObject[4] = Long.valueOf(157680000000000L);
    arrayOfObject[5] = Long.valueOf(1892160000000000L);
    return String.format(localLocale, str2, arrayOfObject);
  }
  
  public static Intent n(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent("com.google.android.gms.plus.action.MANAGE_APPS");
    localIntent.setPackage("com.google.android.gms");
    if (paramInt != -1) {
      localIntent.putExtra("com.google.android.gms.extras.ACCOUNT_NAME", ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name"));
    }
    return localIntent;
  }
  
  public static Bitmap n(Context paramContext)
  {
    if (FT == null) {
      FT = ((BitmapDrawable)paramContext.getApplicationContext().getResources().getDrawable(aau.ye)).getBitmap();
    }
    return FT;
  }
  
  public static void n(Parcel paramParcel, int paramInt)
  {
    int i1 = paramParcel.dataPosition();
    int i2 = i1 - paramInt;
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i2);
    paramParcel.setDataPosition(i1);
  }
  
  public static boolean n(int paramInt)
  {
    return m(paramInt) == 9223372036854775807L;
  }
  
  public static boolean n(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && ((paramString.startsWith("image/")) || (paramString.startsWith("video/")));
  }
  
  public static float o(Context paramContext)
  {
    if (FW == 0.0F) {
      FW = paramContext.getResources().getDimension(Ga);
    }
    return FW;
  }
  
  public static int o(String paramString)
  {
    hxp localhxp = new hxp();
    try
    {
      localhxp.a(paramString);
      int i1 = hxp.f;
      hya localhya = localhxp.a(i1, localhxp.d(i1));
      int[] arrayOfInt1;
      if ((localhya != null) && (localhya.g != null) && ((localhya.g instanceof long[])))
      {
        long[] arrayOfLong = (long[])localhya.g;
        int[] arrayOfInt2 = new int[arrayOfLong.length];
        for (int i2 = 0; i2 < arrayOfLong.length; i2++) {
          arrayOfInt2[i2] = ((int)arrayOfLong[i2]);
        }
        arrayOfInt1 = arrayOfInt2;
        if ((arrayOfInt1 != null) && (arrayOfInt1.length > 0)) {
          break label129;
        }
      }
      label129:
      for (Integer localInteger = null;; localInteger = Integer.valueOf(arrayOfInt1[0]))
      {
        if (localInteger != null) {
          break label141;
        }
        return 0;
        arrayOfInt1 = null;
        break;
      }
      label141:
      return hxp.a(localInteger.shortValue());
    }
    catch (IOException localIOException) {}
    return 0;
  }
  
  public static eba o(Context paramContext, int paramInt)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.apps.plus.widget.LocationsWidgetUtils", 0);
    String str1 = String.valueOf("accountGaiaId_");
    String str2 = localSharedPreferences.getString(11 + String.valueOf(str1).length() + str1 + paramInt, null);
    if (TextUtils.isEmpty(str2)) {
      return null;
    }
    int i1 = ((giz)mbb.a(paramContext, giz.class)).b(str2);
    if (i1 == -1) {
      return null;
    }
    String str3 = String.valueOf("circleId_");
    String str4 = localSharedPreferences.getString(11 + String.valueOf(str3).length() + str3 + paramInt, null);
    String str5 = String.valueOf("gaiaId_");
    String str6 = localSharedPreferences.getString(11 + String.valueOf(str5).length() + str5 + paramInt, null);
    String str7 = String.valueOf("hasMulti_");
    boolean bool = localSharedPreferences.getBoolean(11 + String.valueOf(str7).length() + str7 + paramInt, true);
    if ((TextUtils.isEmpty(str4)) && (TextUtils.isEmpty(str6))) {
      return null;
    }
    return new eba(i1, str4, str6, bool);
  }
  
  public static boolean o(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    default: 
      return false;
    }
    return true;
  }
  
  public static String p(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      return localResources.getString(17039370);
    case 1: 
      return localResources.getString(BY);
    case 3: 
      return localResources.getString(BV);
    }
    return localResources.getString(Cm);
  }
  
  public static <E> ArrayList<E> p(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException(40 + String.valueOf("initialArraySize").length() + "initialArraySize" + " cannot be negative but was: " + paramInt);
    }
    return new ArrayList(paramInt);
  }
  
  public static void p(Context paramContext)
  {
    if (LX == null)
    {
      LX = android.text.format.DateFormat.getMediumDateFormat(paramContext);
      LY = android.text.format.DateFormat.getLongDateFormat(paramContext);
      LZ = android.text.format.DateFormat.getTimeFormat(paramContext);
      Locale localLocale = paramContext.getResources().getConfiguration().locale;
      new SimpleDateFormat("MMM", localLocale);
      new SimpleDateFormat("dd", localLocale);
    }
  }
  
  public static boolean p(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    return (!mfq.a(localUri)) && (!mfq.b(localUri));
  }
  
  public static int q(int paramInt)
  {
    if (paramInt < 3) {
      return paramInt + 1;
    }
    if (paramInt < 1073741824) {
      return (int)(1.0F + paramInt / 0.75F);
    }
    return 2147483647;
  }
  
  public static String q(String paramString)
  {
    if ((paramString.startsWith("f.")) || (paramString.startsWith("v."))) {
      return paramString;
    }
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      return "f.".concat(str);
    }
    return new String("f.");
  }
  
  public static void q(Context paramContext)
  {
    if (LU == null)
    {
      LU = paramContext.getString(LR);
      LV = paramContext.getString(LS);
      LW = paramContext.getString(LT);
      Md = paramContext.getString(LM);
      Me = paramContext.getString(LL);
      Mh = paramContext.getString(LJ);
      Mf = paramContext.getString(LK);
      Mg = paramContext.getString(LN);
    }
    Calendar localCalendar = Calendar.getInstance();
    if (localCalendar.getTimeInMillis() > Mb)
    {
      localCalendar.set(11, 0);
      localCalendar.set(12, 0);
      localCalendar.set(13, 0);
      localCalendar.set(14, 0);
      long l1 = localCalendar.getTimeInMillis();
      Ma = l1;
      Mb = l1 + 86400000L;
      Mc = Ma - 86400000L;
    }
  }
  
  public static boolean q(Context paramContext, int paramInt)
  {
    return mbb.a(paramContext, "com.google.android.libraries.social.appid", 300) == paramInt;
  }
  
  public static int r(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 0: 
      return g(paramContext);
    case 1: 
      return i(paramContext);
    case 2: 
      return k(paramContext);
    }
    return m(paramContext);
  }
  
  public static ArrayList<iim> r(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    String str1 = localContext.getPackageName();
    ArrayList localArrayList;
    try
    {
      ServiceInfo localServiceInfo2 = localContext.getPackageManager().getServiceInfo(new ComponentName(localContext, "com.google.android.libraries.social.licenses.MetadataHolder"), 640);
      localServiceInfo1 = localServiceInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Iterator localIterator;
        Log.wtf(String.format("Could not find application info for package: %s", new Object[] { str1 }), localNameNotFoundException);
        ServiceInfo localServiceInfo1 = null;
        continue;
        Bundle localBundle = Bundle.EMPTY;
      }
      Collections.sort(localArrayList);
    }
    if (localServiceInfo1.metaData != null)
    {
      localBundle = localServiceInfo1.metaData;
      localArrayList = new ArrayList();
      localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (str2.startsWith("com.google.android.libraries.social.licenses.LICENSE.")) {
          localArrayList.add(new iim(localBundle.getString(str2), String.valueOf(str2.substring(53)).concat("_license")));
        }
      }
    }
    return localArrayList;
  }
  
  public static ork r(String paramString)
  {
    ork localork = new ork();
    localork.a = s(paramString);
    return localork;
  }
  
  public static Bitmap s(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return j(paramContext);
    case 1: 
      if (FO == null) {
        FO = lwe.a(j(paramContext));
      }
      return FO;
    }
    if (FP == null) {
      FP = lwe.a(j(paramContext), o(paramContext));
    }
    return FP;
  }
  
  public static String s(String paramString)
  {
    if (paramString.startsWith("f.")) {
      paramString = paramString.substring(2);
    }
    return paramString;
  }
  
  public static boolean s(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 11) {
      return t(paramContext);
    }
    switch (ijl.a(paramContext))
    {
    default: 
      return t(paramContext);
    }
    return false;
  }
  
  public static Bitmap t(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return l(paramContext);
    case 1: 
      if (FR == null) {
        FR = lwe.a(l(paramContext));
      }
      return FR;
    }
    if (FS == null) {
      FS = lwe.a(l(paramContext), o(paramContext));
    }
    return FS;
  }
  
  public static String t(String paramString)
  {
    if ((paramString != null) && (paramString.startsWith("g:"))) {
      return paramString.substring(2);
    }
    return null;
  }
  
  public static boolean t(Context paramContext)
  {
    LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
    return (localLocationManager.isProviderEnabled("network")) || (localLocationManager.isProviderEnabled("gps"));
  }
  
  public static Bitmap u(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return n(paramContext);
    case 1: 
      if (FU == null) {
        FU = lwe.a(n(paramContext));
      }
      return FU;
    }
    if (FV == null) {
      FV = lwe.a(n(paramContext), o(paramContext));
    }
    return FV;
  }
  
  public static File u(Context paramContext)
  {
    File localFile = paramContext.getExternalCacheDir();
    if ((localFile != null) && (Environment.getExternalStorageState().equals("mounted"))) {
      return localFile;
    }
    return null;
  }
  
  public static String u(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (!w(paramString)) {
      return "update";
    }
    if (!c(paramString, 4))
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0) {}
      for (String str2 = "Malformed TypedActivityId: missing field separators: ".concat(str1);; str2 = new String("Malformed TypedActivityId: missing field separators: "))
      {
        Log.e("TypedActivityId", str2);
        return "update";
      }
    }
    return paramString.substring(12, paramString.indexOf("~", 12));
  }
  
  public static int v(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null) {
      return 0;
    }
    switch (localNetworkInfo.getType())
    {
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 8: 
    default: 
      return 0;
    case 1: 
      return 1;
    case 6: 
      return 2;
    case 9: 
      return 3;
    case 7: 
      return 4;
    }
    switch (localNetworkInfo.getSubtype())
    {
    case 5: 
    default: 
      return 0;
    case 7: 
      return 5;
    case 4: 
      return 6;
    case 2: 
      return 7;
    case 14: 
      return 8;
    case 6: 
      return 10;
    case 12: 
      return 11;
    case 1: 
      return 12;
    case 8: 
      return 13;
    case 10: 
      return 14;
    case 15: 
      return 15;
    case 9: 
      return 16;
    case 11: 
      return 17;
    case 13: 
      return 18;
    }
    return 19;
  }
  
  public static int v(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    return Math.max(1, paramInt / (int)(localResources.getDimension(Kg) + localResources.getDimension(Kh)));
  }
  
  public static String v(String paramString)
  {
    if (!w(paramString)) {
      return null;
    }
    if (!c(paramString, 4))
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0) {}
      for (String str2 = "Malformed TypedActivityId: missing field separators: ".concat(str1);; str2 = new String("Malformed TypedActivityId: missing field separators: "))
      {
        Log.e("TypedActivityId", str2);
        return null;
      }
    }
    int i1 = 1 + paramString.indexOf("~", 12);
    return paramString.substring(i1, paramString.indexOf("~", i1));
  }
  
  public static Uri w(Context paramContext)
  {
    String str1 = ((jjz)mbb.a(paramContext, jjz.class)).c();
    String str2 = String.valueOf("circles");
    return Uri.parse(11 + String.valueOf(str1).length() + String.valueOf(str2).length() + "content://" + str1 + "/" + str2);
  }
  
  public static void w(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    localSQLiteDatabase.beginTransaction();
    try
    {
      a(localSQLiteDatabase, str, 2, null);
      localSQLiteDatabase.delete("srchcxns", null, null);
      localSQLiteDatabase.delete("srchcxnsqry", null, null);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public static boolean w(String paramString)
  {
    return (paramString != null) && (paramString.startsWith("~typeprefix~"));
  }
  
  public static int x(Context paramContext)
  {
    if (paramContext.getResources().getConfiguration().orientation == 2) {}
    for (int i1 = 1; i1 != 0; i1 = 0) {
      return 2;
    }
    return 1;
  }
  
  public static Integer x(Context paramContext, int paramInt)
  {
    Cursor localCursor = a(paramContext, paramInt, new String[] { "COUNT(*)" }, "priority IN (3,4) and read_state = 1", null, null);
    try
    {
      localCursor.moveToFirst();
      Integer localInteger = Integer.valueOf(localCursor.getInt(0));
      return localInteger;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String x(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = "com.google.android.libraries.social.topics.INVALID_TOPIC_KEY";
    }
    while (paramString.startsWith("com.google.android.libraries.social.topics.topic_key-")) {
      return paramString;
    }
    String str1 = String.valueOf("com.google.android.libraries.social.topics.topic_key-");
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public static int y(Context paramContext)
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = aau.r;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(arrayOfInt);
    int i1 = localTypedArray.getDimensionPixelSize(0, 0);
    localTypedArray.recycle();
    return i1;
  }
  
  public static Spanned y(String paramString)
  {
    if (aaz == null) {
      aaz = new lwi();
    }
    return Html.fromHtml(paramString, null, aaz);
  }
  
  public static String y(Context paramContext, int paramInt)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    String str2 = String.valueOf(paramContext.getPackageName());
    return 22 + String.valueOf(str2).length() + String.valueOf(str1).length() + str2 + ":notifications:gaiaid:" + str1;
  }
  
  public static String z(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    Uri localUri;
    do
    {
      return null;
      localUri = Uri.parse(paramString);
    } while ((!"www.youtube.com".equals(localUri.getHost())) || (!"/watch".equals(localUri.getPath())));
    return localUri.getQueryParameter("v");
  }
  
  public static boolean z(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 21) {}
    boolean bool1;
    boolean bool2;
    do
    {
      return false;
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = aau.ah;
      arrayOfInt[1] = aau.ag;
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(arrayOfInt);
      bool1 = localTypedArray.getBoolean(0, false);
      bool2 = localTypedArray.getBoolean(1, true);
      localTypedArray.recycle();
    } while ((!bool1) || (bool2));
    return true;
  }
  
  public static boolean z(Context paramContext, int paramInt)
  {
    return ((hyi)mbb.a(paramContext, hyi.class)).b(kmj.d, paramInt);
  }
  
  public ub a(efj paramefj)
  {
    a locala = new a(this, paramefj);
    try
    {
      boolean bool = this.abf.a(locala);
      if (!bool) {
        return null;
      }
      return new ub(this.abf, locala, this.abg);
    }
    catch (RemoteException localRemoteException) {}
    return null;
  }
  
  public void a(int paramInt) {}
  
  public void a(Activity paramActivity, Uri paramUri)
  {
    this.abh.setData(paramUri);
    if (this.abi != null)
    {
      paramActivity.startActivity(this.abh, this.abi);
      return;
    }
    paramActivity.startActivity(this.abh);
  }
  
  public boolean a(x paramx)
  {
    return (paramx != null) && (null.get() == paramx);
  }
  
  public boolean b(long paramLong)
  {
    try
    {
      boolean bool = this.abf.a(0L);
      return bool;
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efj
 * JD-Core Version:    0.7.0.1
 */