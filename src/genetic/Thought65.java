package genetic;
import java.util.ArrayList;
class Thought65 extends Thought{
private static ArrayList<Thought65> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 319.20025574340787;
private double fd1 = 417.17994407957303;
private Thought fo0 = null;
private Thought fo1 = null;
Thought65 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought65 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought65 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought65 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought65 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Output.points[1][6] -= fd0;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    lb2 = lb3 && fb0;
    boolean lb4 = false;

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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 661.4136831214643;
    double ld1 = 582.665521556718;
    Thought lo2 = Thought21.getInstance(ld0, ld1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    double ld3 = 306.1879636594625;
    ld0 *= -1;
    ld1 *= -1;
    double ld4 = 243.52139056738685;
    ab4 = ld3 < ld4;
    Thought lo5 = Thought90.getInstance();
    boolean lb6 = false;
    Output.points[1][7] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, ld3, ld4, ab4, fb0, fb1, lb6);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    boolean lb7 = true;
    ld0 = ld1 + ld3;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld3, ab4, fb0, fb1, lb6);
}
    lb7 = ld4 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[1][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ld3, ld4);
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
    double ld0 = 951.7180946869065;
    Thought lo1 = Thought89.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
    fb0 = fb1 && fb0;
    ad4 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld2 = 474.62310680850993;
        ad3 = ad4 - fd0;
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo3 = Thought37.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb4 = true;
    lb4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
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
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    Output.points[2][0] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        double ld0 = 500.29209716604606;
        fb1 = fb0 && fb1;
if(ao4 != null){
          fd0 = ao4.m3();
}
if(fo0 != null){
          fo0.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    Output.points[2][1] -= fd0;
    Output.points[2][2] -= fd1;
    double ld0 = 464.10088854903677;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    Output.points[2][3] += fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    double ld1 = 86.96573570242607;
    ld0 = ld1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = ld0 < ld1;

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
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    lb0 = ab1 || ab2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought35.getInstance(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
        double ld2 = 9.066228929457745;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    fb1 = ab1 || ab2;
if(ao4 != null){
      ab3 = ao4.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ad2 = ad3 + ad4;
    double ld1 = 518.1570131725462;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought65.getInstance(ad4, fd0, fd1, ld1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
        if (lb0) {
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        fd1 = ld1 + ad1;
        double ld3 = 431.676816100074;
        double ld4 = 461.44858380020486;
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
    Thought lo0 = Thought95.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    double ld2 = 22.52852018709856;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld2 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
    fd1 = ld2 - fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought77.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd0 = fd1 - fd0;
    ab3 = fd1 > fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    boolean lb3 = false;
    double ld4 = 134.4807503838376;
    ld4 = fd0 + fd1;
    double ld5 = 916.5029233301142;
        lb1 = ld4 < ld5;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld4, ld5);
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
    Output.points[2][4] -= ad1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought45.getInstance(fb1, fb0, fb1, fb0);
        boolean lb1 = true;
        boolean lb2 = true;
        lb2 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb1 = fd1 < ad1;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
}
        ad1 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        double ld3 = 608.7955705799686;
        ad1 = ad2 + ad3;
        lb2 = fb0 && fb1;
        lb1 = ad4 > fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld3, ad1, ad2, lb2, fb0, fb1, lb1);
}
        lb2 = fb0 && fb1;
        lb1 = lb2 && fb0;
        ad3 = ad4 - fd0;
        fb1 = lb1 && lb2;
        Output.points[2][5] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
        boolean lb4 = false;
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
    ab2 = ab3 && ab4;
    fb0 = ad1 < ad2;
    Thought lo0 = Thought21.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        Output.points[2][6] += ad2;
        fb0 = fb1 || ab1;
        Output.points[2][7] += ad3;
        Thought lo1 = Thought7.getInstance();
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        Thought lo3 = Thought54.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
        fb1 = ad3 > ad4;
if(fo0 != null){
          fd0 = fo0.m3(lb2, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        Output.points[2][8] += fd1;
        double ld4 = 964.0116932764178;
        lb2 = !ab1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought57.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb1 = false;
    Output.points[3][0] += fd0;
    fb0 = fd1 > fd0;
    Output.points[3][1] -= fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    fd0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = ad3 < ad4;
    Thought lo0 = Thought9.getInstance();

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
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo0 = Thought54.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    Thought lo1 = Thought62.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought50.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
    boolean lb3 = true;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab3 = ao1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb3);
}
        boolean lb4 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        lb3 = !ab1;
        double ld5 = 104.49296092608817;
        ab2 = ab3 && ab4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought17.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought68.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
    double ld2 = 34.40494921076013;
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
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
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    lb0 = fd0 < fd1;
    Thought lo3 = Thought58.getInstance(lb1, lb2, fb0, fb1);
    lb0 = lb1 && lb2;
    Output.points[3][2] += fd0;
    boolean lb4 = false;
    Thought lo5 = Thought86.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    lb2 = lb4 || fb0;
    fb1 = !lb0;
    Output.points[3][3] -= fd0;
    Thought lo6 = Thought91.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
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
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought60.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    double ld1 = 324.65968779319206;
    ld1 = fd0 - fd1;
if(fo1 != null){
      ld1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought9.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought77.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo0.m3();
}
        Thought lo3 = Thought9.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        Thought lo4 = Thought65.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        if (fb1) {
            Thought lo5 = Thought33.getInstance(fb0, fb1, fb0, fb1);
            fb0 = fb1 || fb0;
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo0 != null){
              fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
}}
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        }
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    ab1 = ad2 > ad3;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought22.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[3][4] += fd0;
    lb2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb1;
    double ld3 = 669.7766946308334;
    Thought lo4 = Thought61.getInstance(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb1);
    lb2 = !fb0;
    double ld5 = 185.52584081644417;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
    boolean lb6 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought60.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought89.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    Output.points[3][5] -= ad3;
    fb1 = !fb0;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = ad1 > ad2;
    boolean lb2 = false;
    boolean lb3 = true;
    lb2 = ad3 < ad4;
    lb3 = fd0 > fd1;
    double ld4 = 757.5450035458807;
    Thought lo5 = Thought5.getInstance(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
    ad4 = fd0 + fd1;
    double ld6 = 243.83979419977246;
    boolean lb7 = false;
    Thought lo8 = Thought79.getInstance(ao3, ao4, fo0, fo1, lb7, fb0, fb1, lb2);
    ld4 = ld6 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    lb3 = lb7 && fb0;
    boolean lb9 = false;

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
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought51.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = !fb1;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb1 = !ab1;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    Output.points[3][6] -= fd0;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab1 = ad3 > ad4;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ab1 = ao2.m2();
}
    Output.points[3][7] -= fd0;
    ab2 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[3][8] += ad1;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
        boolean lb2 = false;
        ad4 *= -1;
        Output.points[4][0] += fd0;
        lb1 = !ab1;
        fd1 = ad1 - ad2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
        Thought lo2 = Thought73.getInstance();
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb1 = fd0 < fd1;
    Thought lo3 = Thought33.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 || fb1;
    Output.points[4][1] -= fd0;
    if (lb1) {
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
            Thought lo4 = Thought43.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
            fd1 *= -1;
            Thought lo5 = Thought91.getInstance(fd0, fd1, fd0, fd1);
            lb1 = !fb0;
            Thought lo6 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
            Thought lo7 = Thought58.getInstance(fb1, lb1, fb0, fb1);
            Thought lo8 = Thought81.getInstance();
if(fo1 != null){
              fo1.m2(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought10.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    if (ab3) {
        Thought lo1 = Thought68.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        fd0 *= -1;
        ab2 = fd1 < fd0;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          ab3 = fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 > fd0;
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
    double ld0 = 489.1791390083764;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = !fb0;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
}
    if (lb1) {
        fd0 *= -1;
        fd1 = ld0 + ad1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld3 = 39.30271002481368;
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
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    Thought lo1 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
    ab2 = ab3 && ab4;
        fb0 = ad4 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = fd1 > ad1;
        boolean lb2 = false;
    ab3 = ad2 > ad3;
    ab4 = ad4 < fd0;
    boolean lb3 = true;
    ab4 = fb0 && fb1;
    boolean lb4 = true;
    lb0 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[4][2] -= ad1;
if(fo0 != null){
          lb2 = fo0.m2(lb3, lb4, ab1, ab2);
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
    fd1 *= -1;
    double ld0 = 41.72644389206639;
    double ld1 = 97.38933774402605;
    ld0 = ld1 + fd0;
    fb0 = fb1 || fb0;
    double ld2 = 191.03862543633335;
    double ld3 = 552.7381753730695;
if(ao1 != null){
      ao1.m3();
}
    fb1 = fb0 || fb1;
if(ao2 != null){
          fb0 = ao2.m2(ld3, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
    fb1 = ld2 < ld3;
    if (fb0) {
        fb1 = !fb0;
        fb1 = fb0 || fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 *= -1;
    Output.points[4][3] += ad2;
    boolean lb1 = true;
    boolean lb2 = true;
        boolean lb3 = false;
    Thought lo4 = Thought20.getInstance(ao2, ao3, ao4, fo0);
    boolean lb5 = false;
    ad3 = ad4 + fd0;
    lb0 = fd1 < ad1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
        boolean lb1 = true;
    double ld2 = 100.12791282154392;
    lb0 = lb1 && ab1;
    ab2 = fd0 < fd1;
    boolean lb3 = true;
    double ld4 = 638.613301432595;
    Output.points[4][4] -= ld2;
if(fo1 != null){
      ld4 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, ld4, fd0);
}
    boolean lb6 = false;
    Output.points[4][5] += fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld2, ld4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ld2 = ld4 + fd0;
    lb1 = !lb3;
    fd1 *= -1;
if(ao1 != null){
      ld2 = ao1.m3();
}
if(ao2 != null){
      ao2.m3(ld4, fd0, fd1, ld2, lb5, lb6, ab1, ab2);
}
    Output.points[4][6] += ld4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo7 = Thought54.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld4, ab3, ab4, fb0, fb1);
    lb0 = fd0 > fd1;
    lb1 = ld2 > ld4;
    lb3 = lb5 || lb6;

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
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    ab2 = ad4 < fd0;
    double ld1 = 819.3402175676737;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
    if (lb0) {
if(fo0 != null){
          lb2 = fo0.m2();
}
        lb3 = fd0 < fd1;
        ab1 = !ab2;
        ab3 = !ab4;
if(fo1 != null){
          fb0 = fo1.m2(ld1, ad1, ad2, ad3, fb1, lb0, lb2, lb3);
}
        ad4 = fd0 - fd1;
        double ld4 = 959.1769506279537;
        ld4 *= -1;
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
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
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[4][7] -= fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought42.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[4][8] += fd1;
    lb1 = fb0 || fb1;
    Output.points[5][0] += fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3();
}
    fb0 = fb1 || lb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    double ld0 = 724.8746296088267;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought98.getInstance();
    fb1 = !fb0;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;

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
