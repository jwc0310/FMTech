import java.nio.ByteBuffer;

public final class nie
  extends qan<nie>
{
  private Integer A = null;
  private Integer B = null;
  private int C = -2147483648;
  private Long D = null;
  private Long E = null;
  private String F = null;
  private nmn[] G = nmn.b();
  private String[] H = qay.f;
  private Integer I = null;
  private Integer J = null;
  private String K = null;
  private String L = null;
  private njx[] M = njx.b();
  private njy[] N = njy.b();
  private String O = null;
  private Integer P = null;
  private Integer Q = null;
  private nlm[] R = nlm.b();
  private Integer S = null;
  private Integer T = null;
  private Integer U = null;
  private String V = null;
  private int W = -2147483648;
  private nlp X = null;
  private Integer Y = null;
  private nkd Z = null;
  public String a = null;
  private Integer aA = null;
  private int aB = -2147483648;
  private njo[] aC = njo.b();
  private nkv aD = null;
  private nlj aE = null;
  private String aF = null;
  private Integer aG = null;
  private nli aH = null;
  private nls aI = null;
  private nkt aJ = null;
  private nlf aK = null;
  private nll aL = null;
  private Integer aM = null;
  private nkp aN = null;
  private String aO = null;
  private nju aP = null;
  private njz aQ = null;
  private nkh aR = null;
  private int[] aS = qay.a;
  private nke aT = null;
  private nkn aU = null;
  private int aV = -2147483648;
  private nky aa = null;
  private nlc ab = null;
  private nlb ac = null;
  private njv ad = null;
  private njw ae = null;
  private String af = null;
  private String ag = null;
  private nkf ah = null;
  private Long ai = null;
  private String al = null;
  private nlg am = null;
  private nle an = null;
  private String ao = null;
  private nkg ap = null;
  private int aq = -2147483648;
  private Integer ar = null;
  private nmi as = null;
  private nmo at = null;
  private nid au = null;
  private nkl av = null;
  private Integer aw = null;
  private nml ax = null;
  private nmk ay = null;
  private nmp az = null;
  public String b = null;
  public String c = null;
  public nlx[] d = nlx.b();
  public Integer e = null;
  public Integer f = null;
  public njt g = null;
  public nif h = null;
  public nmw i = null;
  public Boolean j = null;
  public String k = null;
  public String[] l = qay.f;
  public njs m = null;
  public nih n = null;
  public nmv o = null;
  public nlh p = null;
  public Integer q = null;
  public nme r = null;
  public Integer s = null;
  public Integer t = null;
  private long[] u = qay.b;
  private long[] v = qay.b;
  private Integer w = null;
  private Long x = null;
  private Long y = null;
  private String z = null;
  
  public nie()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 0;
    int i2 = 10;
    int i3 = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i4 = qal.d(8);
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str18 = this.a;
      paramqal.c(10);
      paramqal.a(str18);
    }
    if ((this.u != null) && (this.u.length > 0)) {
      for (int i40 = 0; i40 < this.u.length; i40++)
      {
        long l7 = this.u[i40];
        paramqal.c(16);
        paramqal.a(l7);
      }
    }
    if (this.b != null)
    {
      String str17 = this.b;
      paramqal.c(26);
      paramqal.a(str17);
    }
    if ((this.v != null) && (this.v.length > 0)) {
      for (int i39 = 0; i39 < this.v.length; i39++)
      {
        long l6 = this.v[i39];
        paramqal.c(32);
        paramqal.a(l6);
      }
    }
    if (this.w != null)
    {
      int i38 = this.w.intValue();
      paramqal.c(40);
      paramqal.a(i38);
    }
    if (this.x != null)
    {
      long l5 = this.x.longValue();
      paramqal.c(49);
      paramqal.c(l5);
    }
    if (this.y != null)
    {
      long l4 = this.y.longValue();
      paramqal.c(57);
      paramqal.c(l4);
    }
    if (this.C != -2147483648)
    {
      int i37 = this.C;
      paramqal.c(64);
      paramqal.a(i37);
    }
    if (this.D != null)
    {
      long l3 = this.D.longValue();
      paramqal.c(72);
      paramqal.a(l3);
    }
    if (this.c != null)
    {
      String str16 = this.c;
      paramqal.c(82);
      paramqal.a(str16);
    }
    if ((this.H != null) && (this.H.length > 0)) {
      for (int i36 = 0; i36 < this.H.length; i36++)
      {
        String str15 = this.H[i36];
        if (str15 != null)
        {
          paramqal.c(90);
          paramqal.a(str15);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i35 = 0; i35 < this.d.length; i35++)
      {
        nlx localnlx = this.d[i35];
        if (localnlx != null)
        {
          paramqal.c(98);
          if (localnlx.ak < 0) {
            localnlx.ak = localnlx.a();
          }
          paramqal.c(localnlx.ak);
          localnlx.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      int i34 = this.e.intValue();
      paramqal.c(104);
      paramqal.a(i34);
    }
    if (this.I != null)
    {
      int i33 = this.I.intValue();
      paramqal.c(112);
      paramqal.a(i33);
    }
    if ((this.M != null) && (this.M.length > 0)) {
      for (int i32 = 0; i32 < this.M.length; i32++)
      {
        njx localnjx = this.M[i32];
        if (localnjx != null)
        {
          paramqal.c(122);
          if (localnjx.ak < 0) {
            localnjx.ak = localnjx.a();
          }
          paramqal.c(localnjx.ak);
          localnjx.a(paramqal);
        }
      }
    }
    if ((this.N != null) && (this.N.length > 0)) {
      for (int i31 = 0; i31 < this.N.length; i31++)
      {
        njy localnjy = this.N[i31];
        if (localnjy != null)
        {
          paramqal.c(130);
          if (localnjy.ak < 0) {
            localnjy.ak = localnjy.a();
          }
          paramqal.c(localnjy.ak);
          localnjy.a(paramqal);
        }
      }
    }
    if (this.O != null)
    {
      String str14 = this.O;
      paramqal.c(138);
      paramqal.a(str14);
    }
    if (this.P != null)
    {
      int i30 = this.P.intValue();
      paramqal.c(144);
      paramqal.a(i30);
    }
    if (this.Q != null)
    {
      int i29 = this.Q.intValue();
      paramqal.c(152);
      paramqal.a(i29);
    }
    if ((this.R != null) && (this.R.length > 0)) {
      for (int i28 = 0; i28 < this.R.length; i28++)
      {
        nlm localnlm = this.R[i28];
        if (localnlm != null)
        {
          paramqal.c(162);
          if (localnlm.ak < 0) {
            localnlm.ak = localnlm.a();
          }
          paramqal.c(localnlm.ak);
          localnlm.a(paramqal);
        }
      }
    }
    if (this.A != null)
    {
      int i27 = this.A.intValue();
      paramqal.c(168);
      paramqal.a(i27);
    }
    if ((this.G != null) && (this.G.length > 0)) {
      for (int i26 = 0; i26 < this.G.length; i26++)
      {
        nmn localnmn = this.G[i26];
        if (localnmn != null)
        {
          paramqal.c(178);
          if (localnmn.ak < 0) {
            localnmn.ak = localnmn.a();
          }
          paramqal.c(localnmn.ak);
          localnmn.a(paramqal);
        }
      }
    }
    if (this.F != null)
    {
      String str13 = this.F;
      paramqal.c(186);
      paramqal.a(str13);
    }
    if (this.z != null)
    {
      String str12 = this.z;
      paramqal.c(194);
      paramqal.a(str12);
    }
    if (this.B != null)
    {
      int i25 = this.B.intValue();
      paramqal.c(200);
      paramqal.a(i25);
    }
    if (this.f != null)
    {
      int i24 = this.f.intValue();
      paramqal.c(208);
      paramqal.a(i24);
    }
    if (this.S != null)
    {
      int i23 = this.S.intValue();
      paramqal.c(216);
      paramqal.a(i23);
    }
    if (this.g != null)
    {
      njt localnjt = this.g;
      paramqal.c(226);
      if (localnjt.ak < 0) {
        localnjt.ak = localnjt.a();
      }
      paramqal.c(localnjt.ak);
      localnjt.a(paramqal);
    }
    if (this.T != null)
    {
      int i22 = this.T.intValue();
      paramqal.c(232);
      paramqal.a(i22);
    }
    if (this.U != null)
    {
      int i21 = this.U.intValue();
      paramqal.c(240);
      paramqal.a(i21);
    }
    if (this.V != null)
    {
      String str11 = this.V;
      paramqal.c(250);
      paramqal.a(str11);
    }
    if (this.W != -2147483648)
    {
      int i20 = this.W;
      paramqal.c(256);
      paramqal.a(i20);
    }
    if (this.J != null)
    {
      int i19 = this.J.intValue();
      paramqal.c(264);
      paramqal.a(i19);
    }
    if (this.K != null)
    {
      String str10 = this.K;
      paramqal.c(274);
      paramqal.a(str10);
    }
    if (this.L != null)
    {
      String str9 = this.L;
      paramqal.c(282);
      paramqal.a(str9);
    }
    if (this.X != null)
    {
      nlp localnlp = this.X;
      paramqal.c(290);
      if (localnlp.ak < 0) {
        localnlp.ak = localnlp.a();
      }
      paramqal.c(localnlp.ak);
      localnlp.a(paramqal);
    }
    if (this.h != null)
    {
      nif localnif = this.h;
      paramqal.c(298);
      if (localnif.ak < 0) {
        localnif.ak = localnif.a();
      }
      paramqal.c(localnif.ak);
      localnif.a(paramqal);
    }
    if (this.Y != null)
    {
      int i18 = this.Y.intValue();
      paramqal.c(304);
      paramqal.a(i18);
    }
    if (this.i != null)
    {
      nmw localnmw = this.i;
      paramqal.c(314);
      if (localnmw.ak < 0) {
        localnmw.ak = localnmw.a();
      }
      paramqal.c(localnmw.ak);
      localnmw.a(paramqal);
    }
    if (this.E != null)
    {
      long l2 = this.E.longValue();
      paramqal.c(320);
      paramqal.a(l2);
    }
    if (this.Z != null)
    {
      nkd localnkd = this.Z;
      paramqal.c(330);
      if (localnkd.ak < 0) {
        localnkd.ak = localnkd.a();
      }
      paramqal.c(localnkd.ak);
      localnkd.a(paramqal);
    }
    if (this.aa != null)
    {
      nky localnky = this.aa;
      paramqal.c(338);
      if (localnky.ak < 0) {
        localnky.ak = localnky.a();
      }
      paramqal.c(localnky.ak);
      localnky.a(paramqal);
    }
    if (this.ab != null)
    {
      nlc localnlc = this.ab;
      paramqal.c(346);
      if (localnlc.ak < 0) {
        localnlc.ak = localnlc.a();
      }
      paramqal.c(localnlc.ak);
      localnlc.a(paramqal);
    }
    if (this.ac != null)
    {
      nlb localnlb = this.ac;
      paramqal.c(354);
      if (localnlb.ak < 0) {
        localnlb.ak = localnlb.a();
      }
      paramqal.c(localnlb.ak);
      localnlb.a(paramqal);
    }
    if (this.ad != null)
    {
      njv localnjv = this.ad;
      paramqal.c(362);
      if (localnjv.ak < 0) {
        localnjv.ak = localnjv.a();
      }
      paramqal.c(localnjv.ak);
      localnjv.a(paramqal);
    }
    if (this.ae != null)
    {
      njw localnjw = this.ae;
      paramqal.c(370);
      if (localnjw.ak < 0) {
        localnjw.ak = localnjw.a();
      }
      paramqal.c(localnjw.ak);
      localnjw.a(paramqal);
    }
    if (this.af != null)
    {
      String str8 = this.af;
      paramqal.c(378);
      paramqal.a(str8);
    }
    if (this.ag != null)
    {
      String str7 = this.ag;
      paramqal.c(386);
      paramqal.a(str7);
    }
    if (this.j != null)
    {
      boolean bool = this.j.booleanValue();
      paramqal.c(392);
      if (bool) {}
      byte b1;
      for (int i17 = 1;; i17 = 0)
      {
        b1 = (byte)i17;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.ah != null)
    {
      nkf localnkf = this.ah;
      paramqal.c(402);
      if (localnkf.ak < 0) {
        localnkf.ak = localnkf.a();
      }
      paramqal.c(localnkf.ak);
      localnkf.a(paramqal);
    }
    if (this.ai != null)
    {
      long l1 = this.ai.longValue();
      paramqal.c(408);
      paramqal.a(l1);
    }
    if (this.al != null)
    {
      String str6 = this.al;
      paramqal.c(418);
      paramqal.a(str6);
    }
    if (this.am != null)
    {
      nlg localnlg = this.am;
      paramqal.c(426);
      if (localnlg.ak < 0) {
        localnlg.ak = localnlg.a();
      }
      paramqal.c(localnlg.ak);
      localnlg.a(paramqal);
    }
    if (this.k != null)
    {
      String str5 = this.k;
      paramqal.c(434);
      paramqal.a(str5);
    }
    if (this.an != null)
    {
      nle localnle = this.an;
      paramqal.c(442);
      if (localnle.ak < 0) {
        localnle.ak = localnle.a();
      }
      paramqal.c(localnle.ak);
      localnle.a(paramqal);
    }
    if (this.ao != null)
    {
      String str4 = this.ao;
      paramqal.c(450);
      paramqal.a(str4);
    }
    if (this.ap != null)
    {
      nkg localnkg = this.ap;
      paramqal.c(458);
      if (localnkg.ak < 0) {
        localnkg.ak = localnkg.a();
      }
      paramqal.c(localnkg.ak);
      localnkg.a(paramqal);
    }
    if (this.aq != -2147483648)
    {
      int i16 = this.aq;
      paramqal.c(464);
      paramqal.a(i16);
    }
    if (this.ar != null)
    {
      int i15 = this.ar.intValue();
      paramqal.c(472);
      paramqal.a(i15);
    }
    if (this.as != null)
    {
      nmi localnmi = this.as;
      paramqal.c(482);
      if (localnmi.ak < 0) {
        localnmi.ak = localnmi.a();
      }
      paramqal.c(localnmi.ak);
      localnmi.a(paramqal);
    }
    if (this.at != null)
    {
      nmo localnmo = this.at;
      paramqal.c(490);
      if (localnmo.ak < 0) {
        localnmo.ak = localnmo.a();
      }
      paramqal.c(localnmo.ak);
      localnmo.a(paramqal);
    }
    if (this.au != null)
    {
      nid localnid = this.au;
      paramqal.c(498);
      if (localnid.ak < 0) {
        localnid.ak = localnid.a();
      }
      paramqal.c(localnid.ak);
      localnid.a(paramqal);
    }
    if (this.av != null)
    {
      nkl localnkl = this.av;
      paramqal.c(506);
      if (localnkl.ak < 0) {
        localnkl.ak = localnkl.a();
      }
      paramqal.c(localnkl.ak);
      localnkl.a(paramqal);
    }
    if (this.aw != null)
    {
      int i14 = this.aw.intValue();
      paramqal.c(512);
      paramqal.a(i14);
    }
    if (this.ax != null)
    {
      nml localnml = this.ax;
      paramqal.c(522);
      if (localnml.ak < 0) {
        localnml.ak = localnml.a();
      }
      paramqal.c(localnml.ak);
      localnml.a(paramqal);
    }
    if (this.ay != null)
    {
      nmk localnmk = this.ay;
      paramqal.c(530);
      if (localnmk.ak < 0) {
        localnmk.ak = localnmk.a();
      }
      paramqal.c(localnmk.ak);
      localnmk.a(paramqal);
    }
    if (this.az != null)
    {
      nmp localnmp = this.az;
      paramqal.c(538);
      if (localnmp.ak < 0) {
        localnmp.ak = localnmp.a();
      }
      paramqal.c(localnmp.ak);
      localnmp.a(paramqal);
    }
    if (this.aA != null)
    {
      int i13 = this.aA.intValue();
      paramqal.c(544);
      paramqal.a(i13);
    }
    if ((this.l != null) && (this.l.length > 0)) {
      for (int i12 = 0; i12 < this.l.length; i12++)
      {
        String str3 = this.l[i12];
        if (str3 != null)
        {
          paramqal.c(554);
          paramqal.a(str3);
        }
      }
    }
    if (this.m != null)
    {
      njs localnjs = this.m;
      paramqal.c(562);
      if (localnjs.ak < 0) {
        localnjs.ak = localnjs.a();
      }
      paramqal.c(localnjs.ak);
      localnjs.a(paramqal);
    }
    if (this.n != null)
    {
      nih localnih = this.n;
      paramqal.c(570);
      if (localnih.ak < 0) {
        localnih.ak = localnih.a();
      }
      paramqal.c(localnih.ak);
      localnih.a(paramqal);
    }
    if (this.aB != -2147483648)
    {
      int i11 = this.aB;
      paramqal.c(576);
      paramqal.a(i11);
    }
    if ((this.aC != null) && (this.aC.length > 0)) {
      for (int i10 = 0; i10 < this.aC.length; i10++)
      {
        njo localnjo = this.aC[i10];
        if (localnjo != null)
        {
          paramqal.c(586);
          if (localnjo.ak < 0) {
            localnjo.ak = localnjo.a();
          }
          paramqal.c(localnjo.ak);
          localnjo.a(paramqal);
        }
      }
    }
    if (this.aD != null)
    {
      nkv localnkv = this.aD;
      paramqal.c(594);
      if (localnkv.ak < 0) {
        localnkv.ak = localnkv.a();
      }
      paramqal.c(localnkv.ak);
      localnkv.a(paramqal);
    }
    if (this.aE != null)
    {
      nlj localnlj = this.aE;
      paramqal.c(602);
      if (localnlj.ak < 0) {
        localnlj.ak = localnlj.a();
      }
      paramqal.c(localnlj.ak);
      localnlj.a(paramqal);
    }
    if (this.aF != null)
    {
      String str2 = this.aF;
      paramqal.c(610);
      paramqal.a(str2);
    }
    if (this.aG != null)
    {
      int i9 = this.aG.intValue();
      paramqal.c(616);
      paramqal.a(i9);
    }
    if (this.o != null)
    {
      nmv localnmv = this.o;
      paramqal.c(626);
      if (localnmv.ak < 0) {
        localnmv.ak = localnmv.a();
      }
      paramqal.c(localnmv.ak);
      localnmv.a(paramqal);
    }
    if (this.aH != null)
    {
      nli localnli = this.aH;
      paramqal.c(634);
      if (localnli.ak < 0) {
        localnli.ak = localnli.a();
      }
      paramqal.c(localnli.ak);
      localnli.a(paramqal);
    }
    if (this.aI != null)
    {
      nls localnls = this.aI;
      paramqal.c(642);
      if (localnls.ak < 0) {
        localnls.ak = localnls.a();
      }
      paramqal.c(localnls.ak);
      localnls.a(paramqal);
    }
    if (this.aJ != null)
    {
      nkt localnkt = this.aJ;
      paramqal.c(650);
      if (localnkt.ak < 0) {
        localnkt.ak = localnkt.a();
      }
      paramqal.c(localnkt.ak);
      localnkt.a(paramqal);
    }
    if (this.p != null)
    {
      nlh localnlh = this.p;
      paramqal.c(658);
      if (localnlh.ak < 0) {
        localnlh.ak = localnlh.a();
      }
      paramqal.c(localnlh.ak);
      localnlh.a(paramqal);
    }
    if (this.aK != null)
    {
      nlf localnlf = this.aK;
      paramqal.c(666);
      if (localnlf.ak < 0) {
        localnlf.ak = localnlf.a();
      }
      paramqal.c(localnlf.ak);
      localnlf.a(paramqal);
    }
    if (this.aL != null)
    {
      nll localnll = this.aL;
      paramqal.c(674);
      if (localnll.ak < 0) {
        localnll.ak = localnll.a();
      }
      paramqal.c(localnll.ak);
      localnll.a(paramqal);
    }
    if (this.q != null)
    {
      int i8 = this.q.intValue();
      paramqal.c(680);
      paramqal.a(i8);
    }
    if (this.aM != null)
    {
      int i7 = this.aM.intValue();
      paramqal.c(688);
      paramqal.a(i7);
    }
    if (this.r != null)
    {
      nme localnme = this.r;
      paramqal.c(698);
      if (localnme.ak < 0) {
        localnme.ak = localnme.a();
      }
      paramqal.c(localnme.ak);
      localnme.a(paramqal);
    }
    if (this.s != null)
    {
      int i6 = this.s.intValue();
      paramqal.c(704);
      paramqal.a(i6);
    }
    if (this.t != null)
    {
      int i5 = this.t.intValue();
      paramqal.c(712);
      paramqal.a(i5);
    }
    if (this.aN != null)
    {
      nkp localnkp = this.aN;
      paramqal.c(722);
      if (localnkp.ak < 0) {
        localnkp.ak = localnkp.a();
      }
      paramqal.c(localnkp.ak);
      localnkp.a(paramqal);
    }
    if (this.aO != null)
    {
      String str1 = this.aO;
      paramqal.c(730);
      paramqal.a(str1);
    }
    if (this.aP != null)
    {
      nju localnju = this.aP;
      paramqal.c(738);
      if (localnju.ak < 0) {
        localnju.ak = localnju.a();
      }
      paramqal.c(localnju.ak);
      localnju.a(paramqal);
    }
    if (this.aQ != null)
    {
      njz localnjz = this.aQ;
      paramqal.c(746);
      if (localnjz.ak < 0) {
        localnjz.ak = localnjz.a();
      }
      paramqal.c(localnjz.ak);
      localnjz.a(paramqal);
    }
    if (this.aR != null)
    {
      nkh localnkh = this.aR;
      paramqal.c(754);
      if (localnkh.ak < 0) {
        localnkh.ak = localnkh.a();
      }
      paramqal.c(localnkh.ak);
      localnkh.a(paramqal);
    }
    if (this.aS != null)
    {
      int i2 = this.aS.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.aS.length)
        {
          int i4 = this.aS[i3];
          paramqal.c(760);
          paramqal.a(i4);
          i3++;
        }
      }
    }
    if (this.aT != null)
    {
      nke localnke = this.aT;
      paramqal.c(770);
      if (localnke.ak < 0) {
        localnke.ak = localnke.a();
      }
      paramqal.c(localnke.ak);
      localnke.a(paramqal);
    }
    if (this.aU != null)
    {
      nkn localnkn = this.aU;
      paramqal.c(778);
      if (localnkn.ak < 0) {
        localnkn.ak = localnkn.a();
      }
      paramqal.c(localnkn.ak);
      localnkn.a(paramqal);
    }
    if (this.aV != -2147483648)
    {
      int i1 = this.aV;
      paramqal.c(784);
      paramqal.a(i1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nie
 * JD-Core Version:    0.7.0.1
 */