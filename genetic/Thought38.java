package genetic;
import java.util.ArrayList;
class Thought38 extends Thought{
private static ArrayList<Thought38> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 815.9664562196333;
private double fd1 = 367.96843182029136;
private Thought fo0 = null;
private Thought fo1 = null;
Thought38 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought38 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought38 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
    double ld2 = 398.9518029786192;
    fd0 = fd1 - ld2;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = ld2 > fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      ld2 = fo0.m3(lb1, fb0, fb1, lb0);
}
    Output.points[2][2] -= fd0;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    Output.points[2][3] += fd0;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    fb0 = fb1 || ab1;
    double ld0 = 937.4833620778704;
    boolean lb1 = true;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    ab1 = fd0 < fd1;
    if (ab2) {
        ld0 *= -1;
        fd0 = fd1 + ld0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 972.4852793283912;
    double ld1 = 968.1793476329967;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, ad1, fb0, fb1, lb2, fb0);
}
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;

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
    double ld0 = 303.9136344788265;
    Thought lo1 = Thought99.getInstance();
if(fo1 != null){
      fo1.m1(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        ad4 = fd0 + fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        Thought lo2 = Thought26.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
        } else if (ab4) {
        } else {
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
    double ld0 = 533.3911210791895;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    boolean lb1 = false;
    lb1 = !fb0;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(fd1, ld0, fd0, fd1);
}
    fb1 = lb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    double ld2 = 778.1754284711567;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    ld2 = fd0 - fd1;

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
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 979.4400541773622;
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
    ad1 *= -1;
        fb1 = lb0 || lb1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 && lb0;
    lb1 = fb0 && fb1;
    fd1 *= -1;
    Thought lo3 = Thought40.getInstance(ao1, ao2, ao3, ao4);
    Thought lo4 = Thought50.getInstance(ld2, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
    lb0 = ad4 < fd0;
    fd1 = ld2 - ad1;
if(fo0 != null){
      lb1 = fo0.m2();
}
    Thought lo5 = Thought3.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 > ld2;
    boolean lb6 = true;
    ad1 = ad2 + ad3;
    boolean lb7 = false;
    ad4 *= -1;
    Thought lo8 = Thought98.getInstance(lb7, fb0, fb1, lb0);
    Thought lo9 = Thought11.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ad1);

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        fd1 *= -1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = fd0 > fd1;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Output.points[2][4] += fd0;
        boolean lb0 = false;
        fd1 = fd0 + fd1;
        boolean lb1 = false;
        fd0 = fd1 - fd0;
        ab3 = ab4 && fb0;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought93.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ad4 *= -1;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    ad1 *= -1;
    Thought lo3 = Thought85.getInstance(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);

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
    double ld0 = 895.3659992276298;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2();
}
    fb0 = fb1 || fb0;
    ld0 = fd0 + fd1;
    fb1 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    fb1 = fb0 && fb1;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought46.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    double ld1 = 234.57771172595653;
    Output.points[2][5] += fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ld1 = fo0.m3();
}
    fb0 = fb1 && ab1;
    boolean lb2 = true;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, lb2);
}
    ab1 = ld1 > fd0;
    Thought lo3 = Thought68.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
        ad1 = ad2 - ad3;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb0);
}
        lb1 = fb0 && fb1;
        double ld3 = 854.4023592922027;
        fd0 *= -1;
        lb2 = lb0 && lb1;
        fb0 = fd1 > ld3;
        fb1 = lb2 && lb0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Output.points[2][6] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought37.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought14.getInstance();
    ab2 = !ab3;
    double ld2 = 210.27893120492084;
    ab4 = fb0 || fb1;
    ad4 = fd0 - fd1;
    ab1 = ab2 || ab3;
    ld2 = ad1 - ad2;
    ad3 *= -1;
    ab4 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
    ad2 *= -1;
    ab3 = ab4 || fb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought48.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Thought lo1 = Thought85.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought81.getInstance();
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    double ld4 = 582.102498642921;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought85.getInstance(fb0, fb1, fb0, fb1);
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    ad4 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    Output.points[2][7] += fd0;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    Thought lo1 = Thought2.getInstance(fo1, ao1, ao2, ao3);
    fd1 *= -1;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    fd1 = fd0 - fd1;
    boolean lb4 = false;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, lb2, lb3);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        ad2 = ad3 - ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb0 = false;
        Output.points[2][8] -= fd0;
        ab2 = fd1 < ad1;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
            lb0 = fd1 < ad1;
            ad2 = ad3 + ad4;
if(ao4 != null){
              ao4.m2();
}
            ab1 = ab2 && ab3;
            Thought lo1 = Thought97.getInstance(fd0, fd1, ad1, ad2);
            ab4 = ad3 < ad4;
if(fo0 != null){
              fo0.m1(fb0, fb1, lb0, ab1);
}
            fd0 *= -1;
            ab2 = ab3 || ab4;
            boolean lb2 = true;
}}
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
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld0 = 229.05753340548577;
    double ld1 = 133.5542401005024;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    double ld3 = 927.5759718469121;
    fb0 = ld0 < ld1;
    boolean lb4 = true;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb2);
}
    double ld6 = 952.043783476605;
    lb4 = ld3 > ld6;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[3][0] -= ld0;
if(fo1 != null){
      lb5 = fo1.m2(ld1, ld3, ld6, fd0, fb0, fb1, lb2, lb4);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ab1 = fd0 < fd1;
    Output.points[3][1] += fd0;
    Thought lo0 = Thought82.getInstance(fd1, fd0, fd1, fd0);
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
    ab4 = fb0 || fb1;

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
    Thought lo0 = Thought48.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 974.0583728655731;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Output.points[3][2] -= ad4;
    Thought lo2 = Thought84.getInstance();
    boolean lb3 = true;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab3 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    ad3 = ad4 + fd0;
    ab4 = fd1 < ad1;
    Thought lo1 = Thought47.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && lb0;
    ab1 = ad2 < ad3;
    ab2 = ab3 || ab4;
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb0;

Thought.STACK_COUNTER++;
return ad1;
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
    Thought lo0 = Thought22.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought96.getInstance();
    fd0 *= -1;
    lb1 = fb0 && fb1;
    Thought lo3 = Thought48.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought23.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
    fd1 = fd0 - fd1;

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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
    if (fb1) {
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        fb1 = ad1 < ad2;
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        ad4 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        lb0 = fb0 || fb1;
        Output.points[3][3] += fd1;
}
Thought.STACK_COUNTER++;
return ad1;
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
    for(int i0=0; i0<10; i0++){
        double ld0 = 445.13668678745444;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd0 *= -1;
        boolean lb1 = false;
        lb1 = fd1 > ld0;
        fd0 = fd1 + ld0;
        }
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
    Output.points[3][4] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld3 = 754.4699360551333;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[3][5] -= ld3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought74.getInstance(ad1, ad2, ad3, ad4);
    double ld1 = 71.86159370828989;
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    double ld2 = 194.36828941741726;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ld1, ld2, ad1);
}
    ad2 *= -1;
    Output.points[3][6] -= ad3;
    boolean lb3 = false;
    Output.points[3][7] += ad4;
    fb0 = fd0 < fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 223.09885762199852;
    ld1 = fd0 - fd1;
    double ld2 = 877.1986300345889;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(lb3, fb0, fb1, lb0);
}
    boolean lb4 = false;
    Thought lo5 = Thought25.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, lb3, lb4, fb0, fb1);
}
    double ld6 = 307.7822013148811;
    lb0 = lb3 || lb4;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    ld6 = fd0 + fd1;
    lb4 = fb0 || fb1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld2 = fo1.m3(ld6, fd0, fd1, ld1, lb0, lb3, lb4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = ld2 > ld6;
    lb3 = lb4 || fb0;

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
    ab1 = !ab2;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
    lb0 = fd0 > fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;

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
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    Output.points[3][8] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = false;
    Thought lo1 = Thought86.getInstance(ad4, fd0, fd1, ad1);
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] += ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought72.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 588.1807470629354;
    fb0 = !fb1;
    boolean lb2 = true;
    lb2 = !ab1;
    double ld3 = 12.422483292486394;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb4 = false;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(fo1 != null){
          fo1.m3();
}
        boolean lb5 = true;
        boolean lb6 = true;
        lb5 = ld3 < ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    Thought lo0 = Thought29.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb1 = !fb0;
    fb1 = fd1 < fd0;
    Output.points[4][1] += fd1;
    fd0 = fd1 + fd0;
    lb1 = fd1 < fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && fb0;
    fd1 = ad1 + ad2;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    double ld1 = 667.2944592417767;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = fd1 > ld1;

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
    Output.points[4][2] -= fd1;
    Thought lo0 = Thought58.getInstance();
    double ld1 = 264.49350472362715;
    ld1 *= -1;
        ab1 = !ab2;
    fd0 *= -1;
    double ld2 = 870.2774055800605;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld1, ld2);
}
    boolean lb3 = true;
    ab2 = fd0 > fd1;
    ld1 = ld2 - fd0;
    boolean lb4 = true;
    double ld5 = 323.04266367414186;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought32.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        double ld1 = 612.9163931616478;
    ab1 = fd0 < fd1;
    ab2 = ld1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[4][3] += fd1;
    ld1 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
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
if(fo1 != null){
      fo1.m3();
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
        double ld1 = 366.4584913891864;
    fb1 = fd0 < fd1;
    boolean lb2 = true;
    Thought lo3 = Thought49.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
    lb0 = lb2 || fb0;
    fd0 *= -1;

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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    lb1 = fb0 || fb1;
    lb0 = !lb1;
        Thought lo2 = Thought74.getInstance(fo1, fo0, fo1, fo0);
    double ld3 = 666.4945343980776;
    ld3 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(ld3, fd0, fd1, ld3, lb0, lb1, fb0, fb1);
}
    double ld4 = 485.99515121449167;
if(fo1 != null){
      fo0 = fo1.m4();
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought3.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    boolean lb2 = true;
    Thought lo3 = Thought60.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    Output.points[4][4] -= fd1;
    lb1 = fd0 > fd1;
    Thought lo4 = Thought87.getInstance(fo0, fo1, fo0, fo1);
    boolean lb5 = false;
    boolean lb6 = false;
    fd0 = fd1 - fd0;
    Thought lo7 = Thought89.getInstance(fd1, fd0, fd1, fd0, lb2, lb5, lb6, fb0);
    fb1 = fd1 > fd0;
    Output.points[4][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = lb2 && lb5;
    Output.points[4][6] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb6, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = lb5 || lb6;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb8 = true;
    Thought lo9 = Thought92.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb8, fb0, fb1, lb1);

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
