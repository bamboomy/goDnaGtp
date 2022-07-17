package genetic;
import java.util.ArrayList;
class Thought81 extends Thought{
private static ArrayList<Thought81> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 262.7966994930435;
private double fd1 = 50.11392192525135;
private Thought fo0 = null;
private Thought fo1 = null;
Thought81 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought81 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought81 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought81 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought81 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    double ld0 = 688.2761903548806;
    fb1 = ld0 > fd0;
    boolean lb1 = true;
    lb1 = !fb0;
    fd1 = ld0 - fd0;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    fb1 = !lb1;
    ld0 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought169.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        fb0 = fb1 || lb1;
        fb0 = ld0 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
        double ld3 = 405.67436563461007;
        Thought lo4 = Thought332.getInstance(lb1, fb0, fb1, lb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo5 = Thought309.getInstance(ld3, ld0, fd0, fd1);
        for(int i1=0; i1<10; i1++){
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    boolean lb0 = true;
    fd0 *= -1;
    double ld1 = 678.6217066058996;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m3(fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought260.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      ld1 = fo1.m3();
}
    fd0 = fd1 + ld1;

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
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || fb0;
    double ld0 = 6.197169238611328;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo0.m3();
}
    boolean lb1 = true;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb0 = false;
    ad1 *= -1;
    Output.points[6][4] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab4, fb0, fb1, lb0);
}
    ad4 = fd0 - fd1;
    ab1 = ad1 > ad2;
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    ab4 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    double ld2 = 71.87238465691135;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
    Output.points[6][5] -= ad4;

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
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought345.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Output.points[6][6] += fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Output.points[6][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought156.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    ad1 *= -1;
    Thought lo1 = Thought143.getInstance();
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought76.getInstance(fb1, fb0, fb1, fb0);
    Thought lo3 = Thought116.getInstance(ao4, fo0, fo1, ao1);
    fb1 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2();
}
    fb1 = fb0 || fb1;
    boolean lb4 = true;
    ad2 *= -1;

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
    Thought lo0 = Thought157.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[6][8] += fd0;
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought271.getInstance(fd0, fd1, fd0, fd1);
    double ld2 = 255.65890369246026;
    Output.points[7][0] -= ld2;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
}
    if (ab4) {
if(ao4 != null){
          ao4.m1(fd1, ld2, fd0, fd1, fb0, fb1, ab1, ab2);
}
        ab3 = ld2 > fd0;
        ab4 = fd1 < ld2;
        fb0 = !fb1;
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
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3();
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo0 = Thought344.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    Output.points[7][1] -= ad4;
    for(int i0=0; i0<10; i0++){
        Output.points[7][2] += fd0;
        boolean lb1 = true;
        }
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Output.points[7][3] += ad3;
    ab1 = ab2 || ab3;
    Output.points[7][4] -= ad4;

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
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        lb1 = fb0 && fb1;
        lb0 = lb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
        lb0 = lb1 && fb0;
        fb1 = lb0 && lb1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
        boolean lb2 = true;
        boolean lb3 = true;
        double ld4 = 212.70651815528575;
        ld4 = fd0 + fd1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        lb1 = fb0 && fb1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought150.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][5] -= fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        ab1 = fd1 > fd0;
    Thought lo1 = Thought134.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = !ab1;
    boolean lb2 = true;
    Thought lo3 = Thought76.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought261.getInstance();
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    Output.points[7][7] += ad1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    Thought lo2 = Thought268.getInstance();
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought391.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
        fb0 = !fb1;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 605.4490523544717;
    fb0 = ld0 < ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    double ld1 = 364.8075553066289;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    Thought lo2 = Thought298.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = ld0 > ld1;
    ad1 *= -1;
    ad2 *= -1;
    ab4 = ad3 < ad4;
    fb0 = fb1 && ab1;
    fd0 *= -1;
    Thought lo3 = Thought259.getInstance();

Thought.STACK_COUNTER++;
return ab2;
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
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought385.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought12.getInstance();
    Output.points[7][8] -= fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb3 = true;
        Output.points[8][0] += fd0;
    lb1 = lb3 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(lb1, lb3, fb0, fb1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    double ld0 = 343.7883579707438;
    fb0 = ad4 > fd0;
    boolean lb1 = false;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ld0 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Output.points[8][1] += ld0;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld2 = 168.86992750222313;
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, lb3, lb1);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Thought lo4 = Thought381.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ld0);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Output.points[8][2] += fd1;
    double ld1 = 938.2746521273465;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
    ab4 = fd1 < ld1;
    fd0 = fd1 + ld1;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
if(ao2 != null){
      lb2 = ao2.m2();
}
    Thought lo3 = Thought260.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
        ab4 = fb0 && fb1;
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ab2 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[8][3] -= ad3;
    ab3 = !ab4;
    double ld1 = 339.6763831591932;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 943.1865223150376;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    if (lb1) {
        fb0 = ld0 > fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
if(fo0 != null){
          lb1 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
        Thought lo2 = Thought191.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
        lb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb3 = false;
        fb0 = fb1 && lb3;
        fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb3);
}
        fd1 = ld0 + fd0;
        } else if (fb0) {
        double ld4 = 299.11966303107994;
        Thought lo5 = Thought26.getInstance(fb1, lb1, fb0, fb1);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    double ld2 = 791.2551634243526;
    ab3 = ld2 > fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    ab1 = fd1 < ld2;
    Output.points[8][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
    Thought lo3 = Thought80.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);

Thought.STACK_COUNTER++;
return ld2;
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
    fb1 = ad2 < ad3;
    if (fb0) {
        ad4 = fd0 - fd1;
        ad1 = ad2 + ad3;
        Output.points[8][5] += ad4;
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
        } else {
        boolean lb0 = true;
        Thought lo1 = Thought37.getInstance(fo1, fo0, fo1, fo0);
        fb0 = ad2 < ad3;
        fb1 = ad4 < fd0;
if(fo1 != null){
          lb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
        double ld2 = 317.012185902138;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 675.0759225543492;
    Output.points[8][6] += ld0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought266.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    double ld2 = 813.7542246071805;
    fb0 = fb1 || ab1;
    boolean lb3 = true;
        ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2();
}
        ab4 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, lb3, ab1, ab2, ab3);
}
        double ld4 = 346.3579368393367;
if(fo0 != null){
          fo0.m3(ab4, fb0, fb1, lb3);
}
        double ld5 = 993.5530764871819;
        Thought lo6 = Thought292.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0);
}
        fd1 = ld4 + ld5;
        ab1 = ld0 > ld2;
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
}
        boolean lb7 = false;
        ld5 = ld0 - ld2;
        ad1 = ad2 - ad3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought30.getInstance();
    double ld1 = 298.59359651032554;
    Output.points[8][7] += fd0;
    fb0 = fd1 < ld1;
    fb1 = fd0 < fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    fb1 = !fb0;
    Thought lo2 = Thought382.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[8][8] += ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ad3 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought390.getInstance(fb0, fb1, lb0, fb0);
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
    if (fb1) {
if(ao4 != null){
          lb0 = ao4.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
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
    fd0 = fd1 + fd0;
        Thought lo0 = Thought35.getInstance();
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[0][0] -= fd0;
    fb0 = fb1 || ab1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld1 = 30.350198398961155;
    Output.points[0][1] -= ld1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fb1 = !ab1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
}
    boolean lb2 = true;
    if (ab1) {
        Thought lo3 = Thought106.getInstance(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab3 = fd1 > ld1;
        Output.points[0][2] -= fd0;
        Output.points[0][3] -= fd1;
        ld1 *= -1;
        Thought lo4 = Thought322.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb2);
        Output.points[0][4] += fd1;
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ld1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ld1, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Output.points[0][5] -= ad4;
    boolean lb0 = true;
    ab4 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    fb0 = fb1 || lb0;
    ab1 = ad1 > ad2;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
        ad1 *= -1;
        ab4 = ad2 < ad3;
if(ao4 != null){
          ao4.m2(fb0, fb1, lb0, ab1);
}
        Output.points[0][6] -= ad4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[0][7] += fd1;
    boolean lb0 = false;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought171.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    lb0 = fd0 < fd1;

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
    ab2 = ab3 && ab4;
    double ld0 = 630.7122648759266;
    double ld1 = 660.9613343553061;
    ld0 = ld1 - fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 > ld0;
    double ld4 = 151.3707016594416;

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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought151.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
    if (lb0) {
        fb0 = ad4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        lb0 = fd1 < ad1;
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = ad2 > ad3;
    Thought lo3 = Thought274.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
    if (ab4) {
        Thought lo4 = Thought43.getInstance(fb0, fb1, lb0, lb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 + ad4;
        lb2 = ab1 && ab2;
        Thought lo5 = Thought261.getInstance(fd0, fd1, ad1, ad2);
        ab3 = ab4 && fb0;
        fb1 = lb0 && lb1;
        Thought lo6 = Thought45.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought20.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    lb0 = fd1 > fd0;
    lb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    boolean lb4 = false;

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
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought247.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    Output.points[0][8] -= fd1;
    double ld1 = 37.668425872577835;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 + ld1;
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    ad3 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb2 = true;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1, fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb2, fb0, fb1);
}
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2);
}
    Thought lo4 = Thought90.getInstance(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb2);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][0] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    double ld0 = 275.1668583719719;
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    fd0 = fd1 - ld0;
if(ao1 != null){
      ao1.m3();
}
    boolean lb1 = true;
    double ld2 = 663.6883162792959;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    boolean lb3 = false;
    lb3 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    if (lb1) {
        Thought lo5 = Thought180.getInstance(ao3, ao4, fo0, fo1);
        Thought lo6 = Thought65.getInstance(ld2, fd0, fd1, ld0);
        ld2 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld2, fd0, fd1);
}
        ld0 = ld2 + fd0;
        Thought lo7 = Thought2.getInstance(fd1, ld0, ld2, fd0, lb3, lb4, ab1, ab2);
        ab3 = ab4 || fb0;
        fb1 = fd1 < ld0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    ab3 = fd0 > fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    lb2 = ab1 || ab2;
    Output.points[1][1] += fd1;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            lb0 = lb1 && lb2;
            ab1 = ad1 > ad2;
            double ld3 = 214.80765454906208;
            ad2 *= -1;
            ab2 = ab3 || ab4;
            Thought lo4 = Thought306.getInstance(ao4, fo0, fo1, ao1);
            fb0 = !fb1;
            if (lb0) {
if(ao2 != null){
                  ao2.m3(ad3, ad4, fd0, fd1);
}
}}}
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
    fb1 = fd0 > fd1;
    Thought lo0 = Thought299.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    boolean lb1 = true;
    Output.points[1][2] -= fd1;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought152.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
    Thought lo2 = Thought128.getInstance();
    lb1 = !fb0;
    double ld3 = 529.319610691989;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, fb1, lb1, fb0, fb1);
}
            double ld4 = 498.56391537118765;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
