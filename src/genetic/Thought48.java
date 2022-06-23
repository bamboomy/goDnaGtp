package genetic;
import java.util.ArrayList;
class Thought48 extends Thought{
private static ArrayList<Thought48> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 835.7663812092821;
private double fd1 = 66.52001231982891;
private Thought fo0 = null;
private Thought fo1 = null;
Thought48 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought48 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought48 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        Output.points[8][6] += fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
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
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought69.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    Output.points[8][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    double ld3 = 471.8041388114109;
if(fo1 != null){
      fo1.m2();
}
    double ld4 = 656.7463542768287;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld3, lb2, ab1, ab2, ab3);
}
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld5 = 88.90208136674552;
    Thought lo6 = Thought70.getInstance(fo0, fo1, fo0, fo1, ld3, ld4, ld5, fd0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    fd1 = ld3 + ld4;

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
        Thought lo0 = Thought30.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = ad1 + ad2;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        Output.points[8][8] += ad2;
        ad3 *= -1;
        fb1 = ad4 > fd0;
        double ld1 = 76.54417529046101;
        double ld2 = 572.996609839004;
        fb0 = ad4 > fd0;
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ad1, fb1, fb0, fb1, fb0);
}
        ad2 *= -1;
        fb1 = !fb0;
        boolean lb3 = false;
        fb0 = fb1 || lb3;
        boolean lb4 = false;
        Thought lo5 = Thought34.getInstance(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb3);
        ad3 = ad4 - fd0;
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
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        ad4 = fd0 + fd1;
        Thought lo2 = Thought63.getInstance();
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought26.getInstance(fo0, fo1, fo0, fo1);
        Thought lo4 = Thought95.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
        Thought lo5 = Thought44.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        boolean lb6 = true;
if(fo0 != null){
          fo1 = fo0.m4(lb6, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        }
    fb1 = fd0 < fd1;
    double ld7 = 703.6634019663321;
    ld7 = ad1 + ad2;
    ab1 = ad3 < ad4;

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
    if (fb1) {
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - fd0;
        boolean lb0 = true;
        fb0 = fd1 > fd0;
        fd1 = fd0 + fd1;
        Output.points[0][0] -= fd0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
        Output.points[0][1] += fd1;
        fb0 = fb1 && lb0;
        double ld1 = 558.9320206259293;
if(ao1 != null){
          ld1 = ao1.m3(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
        ld1 = fd0 - fd1;
        fb0 = ld1 > fd0;
if(ao2 != null){
          ao2.m1(fb1, lb0, fb0, fb1);
}
        Thought lo2 = Thought72.getInstance();
        lb0 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        lb0 = ld1 < fd0;
        fb0 = fb1 && lb0;
        double ld3 = 819.1347716534929;
        fd0 = fd1 + ld1;
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
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought40.getInstance(ao1, ao2, ao3, ao4);
    lb1 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;
    ad3 *= -1;
    ad4 *= -1;
    Output.points[0][2] -= fd0;
    boolean lb3 = true;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      lb3 = ao4.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    Output.points[0][3] += ad4;
    lb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ad4 *= -1;

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
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 581.1802641956757;
if(ao1 != null){
      ld0 = ao1.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought39.getInstance(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
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
    Output.points[0][4] -= ad1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    double ld0 = 111.79445367403596;
    ad1 = ad2 - ad3;
    Output.points[0][5] += ad4;
    fd0 = fd1 - ld0;
    fb0 = ad1 > ad2;
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;

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
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld0 = 772.4126377000425;
    double ld1 = 263.96321906813955;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > ld1;
    fd0 *= -1;
    Thought lo2 = Thought34.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - ld1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    ld0 *= -1;
    Thought lo3 = Thought24.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    double ld4 = 254.2079188127898;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 878.6589228760486;
    ab1 = !ab2;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought44.getInstance(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
    boolean lb3 = true;
    fd1 = ld0 - fd0;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return lb1;
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
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    boolean lb0 = false;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    Output.points[0][6] += ad2;
    lb0 = ad3 < ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    Output.points[0][7] += fd1;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    ad1 = ad2 + ad3;

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
    boolean lb0 = false;
    Thought lo1 = Thought26.getInstance();
    lb0 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        lb0 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
        ab3 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        ad2 *= -1;
        ad3 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    if (fb0) {
        fb1 = lb0 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
        fd1 *= -1;
        fd0 = fd1 + fd0;
        fd1 *= -1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        Output.points[0][8] += fd0;
        } else {
        fd1 = fd0 - fd1;
        fd0 *= -1;
        double ld1 = 854.7050644342369;
        fb0 = fd0 < fd1;
        fb1 = lb0 && fb0;
        fb1 = ld1 > fd0;
        lb0 = fb0 && fb1;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
        if (fb0) {
            ld1 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought81.getInstance(ao2, ao3, ao4, fo0);
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
    Output.points[1][0] -= ad4;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    lb1 = fb0 || fb1;
        lb1 = ad4 < fd0;

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
    boolean lb0 = true;
    Output.points[1][1] += fd1;
    lb0 = ab1 && ab2;
    Output.points[1][2] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought33.getInstance(ab3, ab4, fb0, fb1);
    boolean lb2 = false;
if(ao1 != null){
      lb0 = ao1.m2();
}
    fd0 *= -1;
    lb2 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fb1 = lb0 || lb2;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought21.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
    ab1 = ab2 && ab3;
    fd0 *= -1;
    ab4 = fb0 && fb1;
    lb0 = lb2 && ab1;
    Output.points[1][3] += fd1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld4 = 466.48635030640537;

Thought.STACK_COUNTER++;
return ab1;
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
    ab3 = !ab4;
        boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought40.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    double ld2 = 178.8678081274383;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = ld2 < ad1;
    Output.points[1][4] += ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld2);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld2;
    fb1 = lb0 || ab1;
    ad1 *= -1;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ab1;
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought37.getInstance();
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    double ld1 = 872.4092411647255;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought24.getInstance(fo0, fo1, fo0, fo1);
    fd1 = ld1 - fd0;
    fb1 = fd1 < ld1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo3 = Thought37.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld1;
    Thought lo4 = Thought33.getInstance(fd0, fd1, ld1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    double ld5 = 553.4551893244821;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(ld1, ld5, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb6 = false;
    Thought lo7 = Thought92.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld1, lb6, fb0, fb1, lb6);
    double ld8 = 231.72855361678336;
        Thought lo9 = Thought51.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb6, fb0);

Thought.STACK_COUNTER++;
return ld5;
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought41.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb4 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    double ld5 = 983.5799490724794;
    ld5 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(lb0, lb1, lb2, lb4);
}
    ld5 = fd0 + fd1;
    ab1 = !ab2;
    ld5 = fd0 + fd1;
        boolean lb6 = true;
    ab2 = ld5 < fd0;
    ab3 = ab4 || fb0;
    boolean lb7 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(ld5, fd0, fd1, ld5, fb1, lb0, lb1, lb2);
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
    fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad3 > ad4;
    double ld0 = 751.8622406794323;
    double ld1 = 722.3907124735721;
    boolean lb2 = true;
    boolean lb3 = false;
    lb2 = lb3 && fb0;
    fb1 = !lb2;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb0;
    ab1 = !ab2;
    boolean lb1 = true;
    Output.points[1][5] += fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ab2 = ad3 < ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    if (ab3) {
}
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
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
    Thought lo0 = Thought92.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought44.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 573.1922900321126;
if(ao3 != null){
      ad1 = ao3.m3();
}
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao4.m1(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][6] -= fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd1 > fd0;
    double ld0 = 291.80202324962823;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
        fd1 = ld0 + fd0;
    double ld1 = 727.8838207319606;

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
    Thought lo0 = Thought63.getInstance(ad2, ad3, ad4, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ad4 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    ab3 = !ab4;
    Thought lo2 = Thought76.getInstance(ao1, ao2, ao3, ao4);
        fd1 = ad1 + ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
    boolean lb3 = true;
    ab2 = !ab3;
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ad1);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3(lb1, lb3, ab1, ab2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    fd1 *= -1;
    lb1 = fd0 > fd1;
        fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    Output.points[1][7] -= fd1;
    Thought lo2 = Thought91.getInstance(fo1, fo0, fo1, fo0);
    double ld3 = 872.9916397057394;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ld3 *= -1;

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
    fd1 *= -1;
    Thought lo0 = Thought96.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    Output.points[1][8] += fd0;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fd1 *= -1;
            boolean lb1 = false;
            Thought lo2 = Thought45.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
            boolean lb3 = false;
            for(int i2=0; i2<10; i2++){
                boolean lb4 = false;
                fd1 *= -1;
                double ld5 = 49.18511191079249;
                lb3 = ld5 > fd0;
                }
            fd0 = fd1 - fd0;
if(fo0 != null){
              fo0.m2(ab2, ab3, ab4, fb0);
}
}}
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
    double ld0 = 683.9957047293723;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    double ld1 = 66.32185040586253;
    fb0 = ad1 > ad2;
    boolean lb2 = true;
        fb0 = ad3 > ad4;
    fb1 = lb2 && fb0;
    Thought lo3 = Thought70.getInstance(fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        Output.points[2][0] -= ad1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Output.points[2][1] -= ad3;
    if (fb1) {
        Output.points[2][2] -= ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        } else {
        ad1 = ad2 - ad3;
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
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought87.getInstance();
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    Output.points[2][3] -= fd0;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 > fd0;

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
    ad2 *= -1;
    ad3 *= -1;
    fb0 = ad4 < fd0;
    Output.points[2][4] += fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 630.8002371497054;
        boolean lb1 = false;
    ad4 = fd0 + fd1;

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
    ab1 = fd0 < fd1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought91.getInstance();
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld1 = 149.6858785663905;
    ab3 = ld1 < fd0;
if(ao3 != null){
      ao3.m3(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    boolean lb3 = false;
    lb3 = ab1 && ab2;
    ld1 = fd0 - fd1;
    double ld4 = 492.12670576645127;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 885.8989713541002;
    ab1 = ab2 && ab3;
    ld0 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought43.getInstance(ld0, ad1, ad2, ad3);
    boolean lb4 = false;
    boolean lb5 = true;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
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
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    Thought lo0 = Thought47.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;

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
    Output.points[2][5] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought12.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;

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
if(fo0 != null){
      fo0.m1();
}
    Thought lo0 = Thought55.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    fd0 *= -1;
    boolean lb2 = false;
    fd1 *= -1;
    boolean lb3 = true;
        boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = lb2 || lb3;
    fd0 = fd1 - fd0;

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
