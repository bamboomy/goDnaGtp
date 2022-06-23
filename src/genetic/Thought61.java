package genetic;
import java.util.ArrayList;
class Thought61 extends Thought{
private static ArrayList<Thought61> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 791.0044359081021;
private double fd1 = 380.40315388039477;
private Thought fo0 = null;
private Thought fo1 = null;
Thought61 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought61 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought61 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought61 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought61 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Output.points[6][4] += fd1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 154.39748790799416;
    lb0 = fb0 && fb1;
    lb0 = ld1 < fd0;
    fb0 = fb1 && lb0;
    fb0 = fd1 < ld1;
    Thought lo2 = Thought87.getInstance(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    ld1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    double ld1 = 124.82219838320822;
        ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    double ld2 = 715.3723951484301;
    ld1 = ld2 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ld2, fd0, fd1);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    Output.points[6][5] -= ld1;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ld2 > fd0;
if(fo1 != null){
      fo1.m3();
}
    double ld3 = 335.97240984332547;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(ld1, ld2, ld3, fd0, ab4, fb0, fb1, ab1);
}
        Output.points[6][6] += fd1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, ld3, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 - ld2;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    double ld0 = 234.97317189907102;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld2 = 112.57817328528817;
    double ld3 = 344.0970929998078;
    fb0 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld0 = 403.0011394688576;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1);
}
    ab2 = ad2 > ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ad3 < ad4;
    ab2 = fd0 > fd1;
    if (ab3) {
if(fo1 != null){
          ld0 = fo1.m3();
}
        ab4 = ad1 < ad2;
        fb0 = fb1 && ab1;
        Output.points[6][7] += ad3;
        double ld1 = 680.7715613505528;
        ab2 = !ab3;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Output.points[6][8] -= fd0;
    boolean lb0 = false;
    Thought lo1 = Thought63.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought11.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    boolean lb3 = true;
    double ld4 = 354.47815469324416;
    lb0 = lb3 || fb0;
    Thought lo5 = Thought53.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb3, fb0);
    fb1 = ld4 < fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ld4, fd0, fd1, ld4);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld4, fd0);
}
    fd1 = ld4 + fd0;
if(ao4 != null){
      lb0 = ao4.m2(lb3, fb0, fb1, lb0);
}
    boolean lb6 = true;
    lb3 = fd1 > ld4;
    lb6 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fd0 < fd1;
    ld4 = fd0 + fd1;
    lb3 = ld4 > fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        Output.points[7][0] += ad1;
        boolean lb0 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
        boolean lb2 = true;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought82.getInstance();
    double ld1 = 278.5366961315766;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
        Output.points[7][1] -= fd0;
        boolean lb2 = false;
        ab4 = !fb0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        Output.points[7][2] += ld1;
        for(int i1=0; i1<10; i1++){
            fd0 = fd1 + ld1;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, fb1, lb2, ab1, ab2);
}
            fd1 = ld1 + fd0;
            double ld3 = 356.66704621844707;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld0 = 390.8206156863656;
        boolean lb1 = false;
        ab1 = !ab2;
if(ao1 != null){
          ad4 = ao1.m3(ab3, ab4, fb0, fb1);
}
        lb1 = ab1 || ab2;
if(ao3 != null){
          ao2 = ao3.m4();
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[7][3] += fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        boolean lb1 = true;
        boolean lb2 = true;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
        Output.points[7][4] += fd1;
        Thought lo3 = Thought98.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
        fd1 = fd0 + fd1;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][5] += fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        boolean lb0 = false;
        for(int i1=0; i1<10; i1++){
            ab1 = ab2 || ab3;
            ab4 = fb0 && fb1;
            lb0 = !ab1;
}}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 *= -1;
        for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb0;
        Thought lo1 = Thought68.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb0);
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    double ld0 = 20.076274039766055;
    ab2 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    ab4 = ad4 < fd0;
    fd1 = ld0 + ad1;
    fb0 = ad2 < ad3;
    boolean lb1 = true;
    ad4 *= -1;
    double ld2 = 192.44705609936844;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ao2.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought36.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[7][6] -= fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb1 = fd1 < fd0;
    Output.points[7][7] += fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    lb1 = lb2 || fb0;
    Thought lo3 = Thought34.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, lb2, fb0);
    boolean lb4 = true;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
    Output.points[7][8] += ad3;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m2();
}
    ad4 *= -1;
    Thought lo0 = Thought17.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      fd0 = ao3.m3(ab2, ab3, ab4, fb0);
}
    double ld1 = 80.93478033039379;
    boolean lb2 = false;
    fb0 = fd0 > fd1;
        ld1 = fd0 - fd1;
if(ao4 != null){
      ao4.m3();
}
    fb1 = lb0 && lb2;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb3, ab1, ab2, ab3);
}
    double ld4 = 493.1770657703602;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    Thought lo1 = Thought24.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 > ad2;
    ab3 = ab4 || fb0;
    ad3 *= -1;
    ad4 *= -1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 902.0788329974281;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    lb1 = fd0 < fd1;
    fb0 = ld0 > fd0;
    fb1 = fd1 < ld0;
    double ld2 = 290.5535066448729;
    boolean lb3 = true;
    boolean lb4 = true;
    lb1 = lb3 || lb4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb3);
}
    ld2 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb4 = fo1.m2(ld2, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, lb4, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
    lb3 = ld2 > fd0;
    Thought lo5 = Thought8.getInstance(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb1);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo0.m2();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought78.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld1 = 434.71415510657283;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ld1 - ad1;
    fb1 = lb2 || fb0;
    if (fb1) {
        boolean lb3 = true;
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        lb2 = ld1 > ad1;
        Output.points[8][0] += ad2;
        fb0 = fb1 || lb3;
if(fo0 != null){
          fo0.m2(lb2, fb0, fb1, lb3);
}
        lb2 = !fb0;
if(fo1 != null){
          ad3 = fo1.m3();
}
        double ld4 = 547.5285233550635;
        boolean lb5 = true;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought53.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought88.getInstance(fo0, fo1, fo0, fo1);
    Output.points[8][1] -= fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][2] += fd0;
    fb1 = lb2 && lb3;
    ab1 = ab2 || ab3;
    Thought lo4 = Thought49.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb2);

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    Output.points[8][3] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 605.4376918874015;
    fb0 = ld0 < fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][4] += ad1;
    ad2 *= -1;
if(ao4 != null){
      ao4.m3();
}
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    ad4 *= -1;
    Output.points[8][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    fb0 = fb1 || lb0;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb1 = false;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld0 = 398.87626951615886;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ld0 = fd0 - fd1;
    ab1 = !ab2;
    Output.points[8][6] -= ld0;
    ab3 = fd0 > fd1;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    Output.points[8][7] += ad1;
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    boolean lb1 = true;
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao2.m1(lb0, lb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld4 = 114.67108172677958;
    fd0 = fd1 + ld4;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld4, lb1, lb2, lb3, ab1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
if(ao4 != null){
      ao4.m1(ad2, ad3, ad4, fd0);
}
    Thought lo6 = Thought61.getInstance(fo0, fo1, ao1, ao2, fd1, ld4, ad1, ad2);

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought65.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 > fd1;
    Thought lo1 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought97.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[8][8] += fd1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + fd0;
        double ld3 = 827.3066840156489;
        boolean lb4 = true;
        Thought lo5 = Thought68.getInstance(fo1, fo0, fo1, fo0);
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    if (fb1) {
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
        double ld1 = 690.4725722585283;
        fd0 = fd1 - ld1;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        Output.points[0][0] += fd1;
        Output.points[0][1] -= ld1;
        lb2 = ab1 && ab2;
        if (ab3) {
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Output.points[0][2] += ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[0][3] += fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought31.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(fo1 != null){
          fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ab1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb1 = true;
        ad4 *= -1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = fb0 && fb1;
        double ld0 = 610.3608412857674;
        fb0 = fb1 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        ld0 *= -1;
        fd0 *= -1;
if(ao3 != null){
          ao3.m1();
}
if(ao4 != null){
          fb1 = ao4.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
        boolean lb1 = false;
        Thought lo2 = Thought38.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
        fd0 = fd1 - ld0;
        boolean lb3 = true;
        fb0 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    Thought lo0 = Thought5.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fd1 = ad1 + ad2;
    double ld1 = 869.7036836181728;
    fb0 = !fb1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld1;
if(fo0 != null){
          fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    Output.points[0][4] += fd0;
    fd1 = ld1 + ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
}
    Thought lo3 = Thought82.getInstance(fb0, fb1, lb2, fb0);
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1, lb2, lb4, fb0, fb1);
}
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld5 = 187.50048452875316;
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought34.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 975.84437153143;
    ab1 = ld1 < fd0;
    ab2 = fd1 > ld1;
    fd0 = fd1 + ld1;
    fd0 *= -1;
    ab3 = fd1 > ld1;
    ab4 = fb0 && fb1;
        boolean lb2 = true;
    lb2 = fd0 < fd1;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    double ld1 = 597.1545353596393;
    ab2 = ab3 && ab4;
    double ld2 = 377.9207638786017;
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
    double ld3 = 161.4772897218908;
    fb1 = ld3 > ad1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    if (lb0) {
        ad2 = ad3 + ad4;
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought40.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 616.4398773037044;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    ld1 = fd0 - fd1;
    fb1 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = ld1 > fd0;
    boolean lb2 = false;
    fd1 = ld1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb2, fb0);
}
        Thought lo3 = Thought93.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
    Thought lo5 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb4, fb0, fb1, lb2);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 534.0998879876631;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Output.points[0][5] -= fd1;
    boolean lb2 = false;
    double ld3 = 841.4665257145095;
    lb2 = fb0 && fb1;
        Thought lo4 = Thought91.getInstance(lb1, lb2, fb0, fb1);
    lb1 = lb2 || fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb5 = true;
    lb1 = ld0 > ld3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    double ld0 = 984.308720038198;
    double ld1 = 669.7633246827764;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[0][6] += ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
