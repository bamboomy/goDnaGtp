package genetic;
import java.util.ArrayList;
class Thought54 extends Thought{
private static ArrayList<Thought54> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 280.18203099576647;
private double fd1 = 387.8540697031217;
private Thought fo0 = null;
private Thought fo1 = null;
Thought54 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought54 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought54 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 731.3329308848798;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
        double ld2 = 490.2659985672176;
        fb0 = ld2 > ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo3 = Thought38.getInstance(fd1, ld2, ld0, fd0, lb1, fb0, fb1, lb1);
        fb0 = fb1 && lb1;
        fb0 = fd1 < ld2;
        ld0 = fd0 - fd1;
        double ld4 = 835.6579868640795;
if(fo1 != null){
          fb1 = fo1.m2();
}
if(fo0 != null){
          lb1 = fo0.m2(ld2, ld4, ld0, fd0);
}
if(fo1 != null){
          fo1.m2(fb0, fb1, lb1, fb0);
}
        fb1 = !lb1;
        boolean lb5 = true;
        fd1 *= -1;
        lb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld4, ld0, fd0);
}
        lb5 = !lb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld4, ld0, fb0, fb1, lb5, lb1);
}
        fd0 *= -1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 135.5573572848837;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
        fb0 = !fb1;
    lb1 = !ab1;
    ab2 = !ab3;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 945.2949748445295;
        Thought lo3 = Thought52.getInstance(ld0, fd0, fd1, ld2, ab4, fb0, fb1, lb1);
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
if(fo0 != null){
          ld0 = fo0.m3();
}
        Output.points[7][5] -= fd0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Thought lo0 = Thought53.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    Thought lo1 = Thought79.getInstance(fb1, fb0, fb1, fb0);
    double ld2 = 182.7353832175808;
    Output.points[7][6] -= ad1;
    Thought lo3 = Thought86.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    Output.points[7][7] += fd1;
    boolean lb4 = false;
    double ld5 = 835.6826109598511;
    ld2 = ld5 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb4, fb0);
}
    Output.points[7][8] += ld2;
    Output.points[8][0] -= ld5;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb4);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        double ld6 = 236.53568031105738;
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
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab4 = fb0 && fb1;
    lb0 = lb1 || ab1;
    boolean lb2 = false;
    Thought lo3 = Thought66.getInstance();
    ab1 = ab2 || ab3;
    Thought lo4 = Thought49.getInstance(fd1, ad1, ad2, ad3);
    ab4 = fb0 || fb1;
    ad4 = fd0 + fd1;
    boolean lb5 = false;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    lb0 = fd0 < fd1;
if(fo0 != null){
      lb1 = fo0.m2(lb2, lb5, ab1, ab2);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
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
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[8][1] += fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[8][2] += fd0;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = !fb0;
    Thought lo0 = Thought49.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    if (fb0) {
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2();
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought13.getInstance(ad4, fd0, fd1, ad1);
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought40.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[8][3] += fd1;
    double ld2 = 901.8419869203763;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        Thought lo3 = Thought9.getInstance(fo1, ao1, ao2, ao3);
        if (fb1) {
            fb0 = fb1 || fb0;
            boolean lb4 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(ao4 != null){
      ab1 = ao4.m2();
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 904.8774494824056;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    Output.points[8][4] -= ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 > fd0;
    Thought lo1 = Thought44.getInstance();
    Output.points[8][5] -= fd1;
    boolean lb2 = false;
    Output.points[8][6] += ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
    double ld3 = 114.48584812205466;
    boolean lb4 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld3, lb2, lb4, ab1, ab2);
}
    Output.points[8][7] -= fd0;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, lb4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 365.5756852249316;
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
    Output.points[8][8] += ad4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    lb1 = ad2 < ad3;
    ab1 = ad4 > fd0;
    boolean lb2 = false;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      ao2.m2(ld0, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 396.195082126911;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    boolean lb1 = false;
    ld0 *= -1;
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    lb1 = fd1 < ld0;
    Thought lo4 = Thought24.getInstance(fo1, fo0, fo1, fo0);
    lb2 = !lb3;
    Output.points[0][0] -= fd0;
    Thought lo5 = Thought80.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
if(fo1 != null){
      fo1.m1();
}
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    Thought lo7 = Thought48.getInstance(lb3, lb6, fb0, fb1);
    Output.points[0][1] += fd0;
    lb1 = !lb2;
    Thought lo8 = Thought33.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    double ld2 = 134.66206687656427;
    fd0 = fd1 + ld2;
    ab1 = ab2 && ab3;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought68.getInstance(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 < ld2;
    double ld6 = 509.0121371307891;
if(fo0 != null){
      fo1 = fo0.m4(ld6, fd0, fd1, ld2);
}
    lb0 = lb1 || lb3;
if(fo1 != null){
      fo1.m3(lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld6, fd0, fd1, ld2);
}
    ab4 = fb0 && fb1;
    double ld7 = 996.6131063161566;
    lb0 = lb1 || lb3;
    lb4 = ab1 && ab2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld6, ld7, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb3, lb4);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo8 = Thought70.getInstance(ld6, ld7, fd0, fd1, ab1, ab2, ab3, ab4);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    Output.points[0][2] -= ad3;
    double ld0 = 241.6353675061082;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    Thought lo3 = Thought34.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    double ld4 = 641.832754662108;
    lb2 = fb0 || fb1;
    lb1 = !lb2;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld4, ad1, ad2);
}
    lb5 = ad3 < ad4;
    fb0 = fb1 && lb1;
    Thought lo6 = Thought24.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4, lb2, lb5, fb0, fb1);
    lb1 = lb2 || lb5;
    boolean lb7 = false;
    ad1 *= -1;

Thought.STACK_COUNTER++;
return lb7;
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
    ab1 = ad2 > ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    Output.points[0][3] -= ad2;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    lb0 = lb1 || ab1;
    boolean lb2 = false;
    ab1 = !ab2;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    boolean lb4 = true;
    fb0 = fb1 && lb0;
    lb1 = lb2 || lb3;
    Thought lo5 = Thought4.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;

Thought.STACK_COUNTER++;
return lb4;
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
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        Thought lo1 = Thought50.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return lb0;
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
    ad1 = ad2 - ad3;
    Output.points[0][4] += ad4;
    fb1 = fd0 < fd1;
        fb0 = ad1 < ad2;
    ad3 *= -1;
    Thought lo0 = Thought65.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = ad2 < ad3;
    fb1 = lb1 || fb0;
    ad4 = fd0 + fd1;
    fb1 = lb1 && fb0;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Output.points[0][5] -= fd0;
    Output.points[0][6] -= fd1;
    fb0 = fb1 || ab1;
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
    fd1 = fd0 + fd1;

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
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought85.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[0][7] -= fd1;
    if (ab4) {
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
        fb1 = ab1 && ab2;
        boolean lb1 = true;
if(ao1 != null){
          fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
        } else {
        Thought lo2 = Thought21.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
        ab1 = ad4 < fd0;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        boolean lb3 = false;
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb3, ab1);
}
        Output.points[0][8] -= ad1;
        ab2 = ad2 < ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought76.getInstance();
    fd1 = fd0 + fd1;
    Thought lo1 = Thought29.getInstance(fd0, fd1, fd0, fd1);
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
        Output.points[1][0] += fd1;
        Output.points[1][1] += fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        } else {
        fb0 = fd1 < fd0;
        for(int i0=0; i0<10; i0++){
            fd1 = fd0 + fd1;
            fd0 = fd1 + fd0;
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
            fb0 = fd1 > fd0;
            fd1 = fd0 - fd1;
            fb1 = fd0 < fd1;
            fd0 *= -1;
            fb0 = fb1 || fb0;
            fd1 *= -1;
            fb1 = fb0 || fb1;
}}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
        fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[1][2] += fd0;
    boolean lb0 = false;
    fd1 *= -1;
    Output.points[1][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb0;
        ab1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad4 = fd0 - fd1;
        fb1 = fb0 && fb1;
        boolean lb0 = true;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3();
}
        fb0 = fd1 < ad1;
        Thought lo1 = Thought70.getInstance(ad2, ad3, ad4, fd0);
        fb1 = fd1 > ad1;
if(fo1 != null){
          fo1.m3(lb0, fb0, fb1, lb0);
}
        Output.points[1][4] -= ad2;
        boolean lb2 = false;
        lb2 = !fb0;
        double ld3 = 992.2553673749808;
        ad2 *= -1;
        Thought lo4 = Thought0.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
        fb1 = lb0 && lb2;
        ld3 = ad1 + ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}
}
Thought.STACK_COUNTER++;
return ad2;
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
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
    Output.points[1][5] -= ad1;
    ab3 = ab4 && fb0;
    ad2 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 *= -1;
    double ld3 = 236.5154204706188;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo0 != null){
      lb2 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    lb1 = fd1 > ld3;
    ad1 = ad2 - ad3;
    lb2 = !ab1;
    Output.points[1][6] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1);
}
    Thought lo4 = Thought82.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    Output.points[1][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    ld3 = ad1 - ad2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 737.4778504002854;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1();
}
    fd0 = fd1 - ld0;
    lb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
    Thought lo2 = Thought56.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    Thought lo3 = Thought90.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb1 = ao3.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ld0 = fd0 - fd1;
    fb1 = ld0 > fd0;
    double ld4 = 440.47747133341176;
    boolean lb5 = true;
    boolean lb6 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad2 < ad3;
    double ld0 = 651.748007033982;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ld0 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = ad3 > ad4;
    double ld1 = 729.5233711462165;
    double ld2 = 1000.0638549709317;
    Output.points[1][8] -= ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    ld1 = ld2 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - ld1;
    ld2 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[2][0] += ad1;
    fb0 = fb1 || fb0;
    double ld3 = 148.244651605345;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld4 = 871.9308725445985;

Thought.STACK_COUNTER++;
return ld4;
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
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2();
}
    boolean lb0 = true;
    double ld1 = 828.0491265339189;
    ld1 = fd0 + fd1;
    lb0 = ab1 || ab2;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1);
}
    Output.points[2][1] += fd0;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ld1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld1;
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
    ab1 = ad2 < ad3;
    ab2 = ab3 || ab4;
    fb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    lb0 = !lb1;
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought88.getInstance();

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought71.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    boolean lb1 = true;
        boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb1, lb2);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        double ld3 = 757.5249465748665;
    Output.points[2][2] -= fd0;
    fd1 *= -1;
    Output.points[2][3] -= ld3;
    fd0 = fd1 + ld3;
    fb1 = lb1 || lb2;
    fd0 = fd1 - ld3;
        Thought lo4 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, fb0, fb1, lb1, lb2);
    fd1 = ld3 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    fd1 *= -1;
    boolean lb5 = false;
    double ld6 = 500.65112556711455;
    ld3 = ld6 + fd0;
    fd1 = ld3 + ld6;
    lb5 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought12.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m2();
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Output.points[2][4] -= fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    if (lb1) {
        Thought lo2 = Thought61.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab3 = ab4 || fb0;
        fd0 = fd1 - fd0;
        Output.points[2][5] -= fd1;
        double ld3 = 935.741229723246;
        double ld4 = 332.4795150546156;
if(fo0 != null){
          fo1 = fo0.m4(ld3, ld4, fd0, fd1, fb1, lb1, ab1, ab2);
}
        ab3 = ld3 > ld4;
        ab4 = fb0 && fb1;
        lb1 = fd0 > fd1;
        ab1 = ld3 > ld4;
        Thought lo5 = Thought50.getInstance();
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought35.getInstance(ad1, ad2, ad3, ad4);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        boolean lb1 = true;
        ad3 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
        lb1 = fb0 && fb1;
        lb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
        lb1 = fb0 && fb1;
        lb1 = ad2 < ad3;
        fb0 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
        ad4 = fd0 - fd1;
        Thought lo2 = Thought16.getInstance();
        Output.points[2][6] -= ad1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought38.getInstance(ad3, ad4, fd0, fd1);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = ab1 || ab2;
    Output.points[2][7] += ad3;
    ab3 = ab4 || fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
        fd1 = fd0 - fd1;
    Thought lo2 = Thought98.getInstance(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
    boolean lb3 = true;
    Thought lo4 = Thought89.getInstance(fo1, ao1, ao2, ao3);
    fd0 *= -1;
    lb1 = fd1 < fd0;
    Thought lo5 = Thought84.getInstance(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo6 = Thought38.getInstance(fd0, fd1, fd0, fd1);
    double ld7 = 697.9957148027354;
if(fo1 != null){
      ld7 = fo1.m3(lb1, lb3, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld7, fd0);
}
    double ld8 = 655.6008183745397;
    boolean lb9 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld7, ld8, lb1, lb3, lb9, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld7 = fo1.m3(ao1, ao2, ao3, ao4, lb0, lb1, lb3, lb9);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    Thought lo10 = Thought21.getInstance(ld8, fd0, fd1, ld7, fb1, lb0, lb1, lb3);
    ld8 *= -1;
    fd0 = fd1 - ld7;

Thought.STACK_COUNTER++;
return ao4;
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
if(ao1 != null){
      ad2 = ao1.m3();
}
    fb1 = ad3 < ad4;
    boolean lb0 = false;
    fd0 = fd1 - ad1;
    lb0 = ad2 > ad3;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    Thought lo2 = Thought13.getInstance(ad4, fd0, fd1, ad1);
    double ld3 = 704.5277774695603;
    Thought lo4 = Thought95.getInstance(lb1, fb0, fb1, lb0);
    Output.points[2][8] += ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld3, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
        fd1 = fd0 - fd1;
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought55.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    Thought lo1 = Thought7.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    double ld2 = 837.2767066611062;
    fd0 = fd1 + ld2;
    ab4 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
}
        fb0 = !fb1;
    ab1 = fd1 > ld2;

Thought.STACK_COUNTER++;
return ao4;
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
    ad2 *= -1;
    ad3 *= -1;
    ad4 *= -1;
    ab2 = fd0 > fd1;
    double ld0 = 611.1514797523931;
    Thought lo1 = Thought66.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought57.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[3][0] -= ad4;
    fd0 = fd1 - ld0;
    boolean lb3 = false;
    ab4 = fb0 || fb1;
    lb3 = !ab1;
    boolean lb4 = false;
    Thought lo5 = Thought11.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb3, lb4);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + ad1;
    Thought lo6 = Thought7.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb3, lb4);
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ad2 < ad3;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    Output.points[3][1] += fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 605.9681511430805;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
    fb1 = ld0 > fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    Thought lo1 = Thought30.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[3][2] += fd1;
    fb1 = fd0 < fd1;
    lb0 = lb1 && fb0;
    boolean lb2 = false;
    fb0 = !fb1;
    Thought lo3 = Thought21.getInstance(lb0, lb1, lb2, fb0);
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb5 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb0);
}
    Thought lo6 = Thought73.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, lb4, lb5);

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
    fd0 = fd1 + fd0;
    double ld0 = 727.4070735036386;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld0;
    Thought lo1 = Thought11.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[3][3] += ld0;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0);
}
        fb1 = fd1 < ld0;
if(fo1 != null){
      fo1.m1(lb2, fb0, fb1, lb2);
}
    fd0 = fd1 - ld0;
    Thought lo3 = Thought22.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    Thought lo4 = Thought44.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    boolean lb5 = false;

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
