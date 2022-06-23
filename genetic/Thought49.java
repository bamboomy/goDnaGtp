package genetic;
import java.util.ArrayList;
class Thought49 extends Thought{
private static ArrayList<Thought49> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 323.8217265710716;
private double fd1 = 364.40030792590636;
private Thought fo0 = null;
private Thought fo1 = null;
Thought49 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought49 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought49 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought49 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought49 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo0 = Thought82.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    if (fb0) {
        boolean lb1 = true;
        fd1 *= -1;
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    boolean lb1 = true;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
    Output.points[6][5] += fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought75.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
        fb1 = !lb0;
        lb1 = !ab1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 && lb1;
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    double ld0 = 134.47456167439083;
    ad4 *= -1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad4 < fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Output.points[6][6] -= fd1;
    fb0 = !fb1;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought15.getInstance(ad1, ad2, ad3, ad4);
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    Output.points[6][7] += fd0;
    fd1 = ad1 + ad2;
    Thought lo1 = Thought61.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    boolean lb2 = true;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
}
    fd1 = ad1 + ad2;
    Thought lo3 = Thought99.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    double ld4 = 609.8814364255024;
    ad2 = ad3 - ad4;
    boolean lb5 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(fd1, ld4, ad1, ad2, fb0, fb1, lb2, lb5);
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
if(ao1 != null){
      fd1 = ao1.m3();
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo0 = Thought93.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought69.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;

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
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[6][8] -= ad4;
        fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad4 = fd0 + fd1;
    Output.points[7][0] += ad1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    if (lb0) {
        fb0 = fb1 || lb0;
        boolean lb1 = false;
if(ao2 != null){
          lb0 = ao2.m2(fb0, fb1, lb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
        double ld2 = 165.1625561905375;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, fb0, fb1, lb1, lb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Thought lo0 = Thought84.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 *= -1;
if(fo1 != null){
      ab4 = fo1.m2();
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought26.getInstance(fb1, ab1, ab2, ab3);
    ab4 = fd1 > fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[7][1] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    double ld2 = 378.9255964621575;
    Output.points[7][2] -= fd0;
    fd1 = ld2 - fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought96.getInstance(fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
    ld2 *= -1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = true;

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
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought28.getInstance(ad2, ad3, ad4, fd0);
    lb0 = !lb1;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought41.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
    Output.points[7][3] += ad3;
    Thought lo4 = Thought61.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
    lb1 = ab1 && ab2;
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo5 = Thought58.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    Thought lo6 = Thought24.getInstance();
if(ao3 != null){
      lb0 = ao3.m2(fd0, fd1, ad1, ad2);
}
    Output.points[7][4] += ad3;
    double ld7 = 347.4338055665597;
if(fo0 != null){
      ao4 = fo0.m4(lb1, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
    Output.points[7][5] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld7, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
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
    Output.points[7][6] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought33.getInstance();
    Output.points[7][7] += fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + fd0;
        double ld1 = 729.5395933059306;
        boolean lb2 = true;
        lb2 = fd0 > fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    double ld0 = 623.0775457510697;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo1 = Thought91.getInstance();
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    Output.points[7][8] -= fd0;

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
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    double ld0 = 854.0075653943138;
    fb0 = ld0 < ad1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
}
    ad3 = ad4 + fd0;
    fd1 = ld0 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought98.getInstance(fo1, fo0, fo1, fo0);
    lb1 = !fb0;
    boolean lb3 = false;
    double ld4 = 810.7173854561963;
    Thought lo5 = Thought11.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
    Thought lo6 = Thought47.getInstance();
    Output.points[8][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld4, ad1, ad2);
}
    boolean lb7 = false;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    double ld8 = 82.55239816753796;
    lb7 = ld0 > ld4;
    Output.points[8][1] -= ld8;
    fb0 = fb1 || lb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
    if (fb0) {
        fb1 = ad1 > ad2;
        Thought lo1 = Thought93.getInstance(fo0, fo1, fo0, fo1);
        lb0 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad3 = ad4 + fd0;
        fb0 = fb1 && lb0;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 + fd0;
        ab4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb2, lb0, ab1);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
            Thought lo3 = Thought85.getInstance(fo0, fo1, fo0, fo1);
            Thought lo4 = Thought7.getInstance(ad4, fd0, fd1, ad1, fb1, lb2, lb0, ab1);
            ab2 = !ab3;
            ad2 = ad3 - ad4;
            ab4 = fd0 < fd1;
            boolean lb5 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    double ld0 = 158.65424956293128;
    boolean lb1 = false;
        Thought lo2 = Thought22.getInstance();
    ld0 = fd0 - fd1;
    lb1 = ld0 < fd0;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
        fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fb1 = fd1 < ld0;
    fd0 = fd1 + ld0;
    lb1 = !fb0;
    boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb1, lb1, lb3, fb0);
}
        fb1 = lb1 && lb3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb3);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = lb1 || lb3;
    boolean lb4 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    double ld0 = 316.4396776815351;
    fb0 = ld0 > ad1;
    fb1 = !fb0;
    Output.points[8][2] += ad2;
    ad3 *= -1;
    Thought lo1 = Thought51.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = ad1 > ad2;
if(ao1 != null){
      fb0 = ao1.m2();
}
    Thought lo2 = Thought94.getInstance(ad3, ad4, fd0, fd1);
    boolean lb3 = false;
if(ao2 != null){
      ld0 = ao2.m3(fb0, fb1, lb3, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[8][3] += fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    lb1 = lb2 && ab1;
    ab2 = fd0 < fd1;
    ab3 = fd0 > fd1;
    if (ab4) {
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        for(int i0=0; i0<10; i0++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][4] += ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    if (ab4) {
        ad1 = ad2 - ad3;
        fb0 = fb1 || ab1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao3.m3();
}
        fb1 = !ab1;
        boolean lb0 = false;
if(ao4 != null){
          ab1 = ao4.m2(ad2, ad3, ad4, fd0);
}
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
        double ld2 = 271.0812198291554;
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
        Output.points[8][5] += ad2;
        boolean lb3 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb1, lb3, ab1, ab2);
}
        ld2 = ad1 - ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
}
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
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || fb0;
        fb1 = !fb0;
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
        fd0 = fd1 + fd0;
        Output.points[8][6] += fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 || fb0;
}}
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        }
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 + fd0;

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
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
        boolean lb0 = true;
    lb0 = fb0 || fb1;
    Output.points[8][7] -= ad1;
    lb0 = !fb0;
    ad2 = ad3 + ad4;
    double ld1 = 544.7130091073186;
    fb1 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    Thought lo2 = Thought67.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
        boolean lb1 = true;
    ab3 = fd1 < ad1;
    ab4 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought19.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
    double ld3 = 956.8747291077233;
if(fo0 != null){
      ao4 = fo0.m4(ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
}
    boolean lb4 = false;
    Thought lo5 = Thought16.getInstance();
if(fo1 != null){
      fo1.m1(fd0, fd1, ld3, fd0);
}
    double ld6 = 23.026480617687614;
    Thought lo7 = Thought23.getInstance(lb2, lb4, fb0, fb1);
    lb0 = lb2 || lb4;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld3, ld6, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    Output.points[8][8] += ad4;
    lb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    fb1 = lb0 && lb1;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb0 = ao4.m2(fd1, ad1, ad2, ad3);
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
    Thought lo0 = Thought64.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    Thought lo1 = Thought56.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought14.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    fb1 = lb2 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb4 = true;
    lb2 = lb4 || ab1;
    ab2 = ab3 || ab4;

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
    ab1 = ad2 < ad3;
        boolean lb0 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab1 = ad4 < fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought70.getInstance();
    Thought lo3 = Thought7.getInstance(ad4, fd0, fd1, ad1);
    boolean lb4 = false;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 133.9155837667545;
    Thought lo1 = Thought48.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought79.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    if (fb0) {
if(fo1 != null){
          fd1 = fo1.m3(fb1, lb3, fb0, fb1);
}
        lb3 = fb0 && fb1;
        double ld4 = 139.53580147520952;
        Output.points[0][0] += ld4;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld4);
}
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld4, fb0, fb1, lb3, fb0);
}
        fb1 = lb3 || fb0;
        ld0 = fd0 - fd1;
        if (fb1) {
            ld4 = ld0 + fd0;
            lb3 = fb0 || fb1;
            boolean lb5 = true;
            fd1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb5, lb3, fb0, fb1);
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][1] += fd0;
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
        fd1 *= -1;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1();
}
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    Output.points[0][2] -= fd0;
    fd1 = fd0 - fd1;
    double ld1 = 390.5560790913338;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    lb0 = fd1 > ld1;
    Output.points[0][3] += fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    Output.points[0][4] += ld1;
    double ld3 = 931.3437131843218;
    ab4 = fb0 || fb1;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb2, ab1, ab2);
}
        boolean lb4 = false;

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
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
    Output.points[0][5] += ad2;
    double ld0 = 843.5641136023257;
    ad2 *= -1;
    ad3 *= -1;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    double ld1 = 399.2173480744318;
if(fo0 != null){
      ld0 = fo0.m3();
}
    ld1 = ad1 - ad2;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        ld0 = ld1 - ad1;
        ad2 *= -1;
        double ld2 = 389.6401210145843;
        fb1 = fb0 && fb1;
        Output.points[0][6] += ad2;
        fb0 = fb1 && fb0;
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[0][7] += fd1;
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 60.708109562060486;
    ad3 *= -1;
    ab1 = ad4 < fd0;
    ab2 = !ab3;
    ab4 = !fb0;
    double ld2 = 87.52548416254656;
    fb1 = fd0 < fd1;
    Thought lo3 = Thought20.getInstance(ld1, ld2, ad1, ad2, lb0, ab1, ab2, ab3);
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1();
}
    Output.points[0][8] += ad3;
    Output.points[1][0] += ad4;
    Thought lo5 = Thought49.getInstance(fd0, fd1, ld1, ld2);
    ab3 = !ab4;

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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[1][1] -= fd1;
    Output.points[1][2] -= fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Output.points[1][3] += fd0;
    Output.points[1][4] += fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    Output.points[1][5] += fd0;

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
    double ld0 = 992.5437590476329;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought56.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        Output.points[1][6] += ad1;
    double ld2 = 901.341200873163;
    fb1 = fb0 || fb1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb0 = !fb1;
    Thought lo3 = Thought48.getInstance();
    fb0 = fb1 || fb0;
    Thought lo4 = Thought87.getInstance(fd0, fd1, ld0, ld2);
    boolean lb5 = false;
    Thought lo6 = Thought21.getInstance(fb0, fb1, lb5, fb0);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    lb5 = !fb0;
    boolean lb7 = false;
    ld0 = ld2 + ad1;
    fb0 = ad2 > ad3;
    double ld8 = 183.40244119228646;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb5, lb7, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao3.m3();
}
    double ld0 = 947.7499073840802;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fb1 = fd0 > fd1;
    double ld1 = 631.3254351869062;
    double ld2 = 736.791100513509;
    boolean lb3 = false;
    ld0 = ld1 - ld2;
    Output.points[1][7] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(lb3, ab1, ab2, ab3);
}
    ld0 = ld1 + ld2;
    fd0 = fd1 - ld0;
    double ld4 = 390.6535734604243;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, ld2, ld4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld0, ld1, ld2, ld4, ab4, fb0, fb1, lb3);
}
    ab1 = !ab2;
    ab3 = !ab4;
    Output.points[1][8] -= fd0;
    fd1 = ld0 - ld1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 882.593367097991;
    ld0 = ad1 + ad2;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    ad3 *= -1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought92.getInstance(ad4, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    ad1 *= -1;
    lb1 = !ab1;
        ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0);
}

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
    Thought lo0 = Thought8.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fb1 = !fb0;
    fb1 = fd1 > fd0;
    Output.points[2][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
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
    fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
        fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fb1 && fb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fd1 = fo1.m3();
}
        Thought lo0 = Thought73.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    boolean lb2 = false;
if(fo0 != null){
          fd1 = fo0.m3(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    boolean lb4 = true;
    Output.points[2][1] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
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
}
