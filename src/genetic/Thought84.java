package genetic;
import java.util.ArrayList;
class Thought84 extends Thought{
private static ArrayList<Thought84> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 870.8100050367101;
private double fd1 = 477.4967015466562;
private Thought fo0 = null;
private Thought fo1 = null;
Thought84 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought84 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought84 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought84 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought84 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[8][8] += fd0;
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    double ld2 = 260.4832891277127;
    Thought lo3 = Thought389.getInstance(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld2;
    boolean lb4 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, lb1, lb4, fb0, fb1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fb1 = !lb0;
    Thought lo1 = Thought90.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 && ab3;
    double ld2 = 99.0419343081192;
        boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    double ld4 = 105.44402310586112;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld2, fb0, fb1, lb0, lb3);
}
    Output.points[0][0] -= ld4;
    ab1 = ab2 || ab3;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 = ad1 - ad2;
    lb0 = fb0 || fb1;

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
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    double ld0 = 649.5950134298671;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
    Thought lo1 = Thought65.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
    boolean lb2 = true;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb2, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    lb2 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld3 = 321.2982205362626;
    fb1 = lb2 || ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    Output.points[0][1] -= ad4;
if(fo0 != null){
      fb1 = fo0.m2(lb2, ab1, ab2, ab3);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 434.28404239113956;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m1(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    double ld1 = 757.3424406657516;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    double ld2 = 59.631577642105384;
    fd0 = fd1 - ld0;
    fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4();
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought328.getInstance(ad1, ad2, ad3, ad4);
    Thought lo1 = Thought178.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    boolean lb3 = true;
    lb2 = lb3 && fb0;
    fb1 = ad2 > ad3;
    lb2 = ad4 < fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    Thought lo4 = Thought138.getInstance(ao1, ao2, ao3, ao4, lb3, fb0, fb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4();
}
        lb3 = fb0 || fb1;
    Thought lo5 = Thought271.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);
    lb2 = fd0 > fd1;
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    lb3 = fd1 < ad1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb2, lb3, fb0);
}
    double ld6 = 487.9563292626736;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought206.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
    fd0 = fd1 - fd0;
    if (ab3) {
        ab4 = fb0 || fb1;
        fd1 = fd0 - fd1;
        if (ab1) {
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    lb0 = ad1 < ad2;
    ab1 = ad3 > ad4;
    Output.points[0][2] -= fd0;
    double ld1 = 241.21936296557507;
    fd0 = fd1 + ld1;
    Output.points[0][3] -= ad1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought396.getInstance(ao1, ao2, ao3, ao4);
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
    if (fb0) {
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
        fb1 = fb0 && fb1;
        fd0 *= -1;
        fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        fb1 = fb0 || fb1;
        double ld0 = 541.1139092236842;
        fb0 = fb1 || fb0;
        fb1 = fd0 < fd1;
        double ld1 = 582.8688610419599;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ld0 > ld1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 - ld1;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && fb0;
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
    ab1 = !ab2;
    ab3 = !ab4;
    Thought lo0 = Thought151.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought190.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought225.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fb1, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought74.getInstance(fd1, fd0, fd1, fd0);

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
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    lb0 = fb0 && fb1;
if(fo0 != null){
          fo0.m2(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[0][4] += fd0;
    double ld1 = 793.3379277356047;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad1 > ad2;
    boolean lb3 = false;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ld1;
    ad1 = ad2 + ad3;
    boolean lb4 = false;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
    double ld5 = 89.99784918468225;

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
    ad1 = ad2 - ad3;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ab3 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    Output.points[0][5] -= ad4;

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 692.7400075320313;
    Thought lo1 = Thought338.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    ld0 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[0][6] -= ld0;
    Output.points[0][7] += fd0;
    fb1 = fd1 > ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    if (fb0) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 664.2768748146365;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
    boolean lb3 = true;
    lb2 = !lb3;
        ld0 = ad1 + ad2;
    fb0 = fb1 && lb1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          lb2 = ao1.m2(ad3, ad4, fd0, fd1);
}
        Thought lo4 = Thought5.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ld0, lb3, fb0, fb1, lb1);
}
        }
    double ld5 = 591.5243681098115;
    boolean lb6 = true;
    lb2 = lb3 || lb6;
if(ao2 != null){
      ld5 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb2);
}
    ad1 = ad2 - ad3;
    Thought lo7 = Thought251.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, lb3, lb6, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(lb1, lb2, lb3, lb6);
}
    boolean lb8 = false;
    Thought lo9 = Thought321.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ld5, ad1, ad2, ad3);
}
    lb8 = fb0 && fb1;

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
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought201.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld2 = 136.33564605241665;
    ld2 = fd0 - fd1;
if(ao1 != null){
      ld2 = ao1.m3();
}
    fd0 = fd1 + ld2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, fb0, fb1, lb0, ab1);
}
    Output.points[0][8] -= fd1;
    ld2 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
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
    ad1 = ad2 + ad3;
    Output.points[1][0] -= ad4;
    double ld0 = 999.3258157878323;
    ab1 = ab2 && ab3;
    Output.points[1][1] -= ad4;
    boolean lb1 = false;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[1][2] += fd0;
    Output.points[1][3] += fd1;

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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    double ld2 = 991.4738985510194;
    Thought lo3 = Thought15.getInstance(ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    Output.points[1][4] += ld2;
    fd0 *= -1;
    lb1 = fb0 && fb1;
    fd1 = ld2 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > ld2;
    boolean lb4 = false;
        Thought lo5 = Thought244.getInstance(lb1, lb4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    lb0 = lb1 || lb4;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
    Output.points[1][5] += fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 589.6824768307318;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought205.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
        ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fb0 || fb1;
    if (ab1) {
        fd0 = fd1 + ld0;
        fd0 = fd1 + ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ld0 + fd0;
        fd1 = ld0 - fd0;
        fb1 = fd1 > ld0;
        fd0 = fd1 - ld0;
        ab1 = fd0 > fd1;
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = ad2 > ad3;
    ad4 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 865.1482065028453;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
    double ld1 = 902.0126875289133;
    boolean lb2 = false;
    Thought lo3 = Thought150.getInstance(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
    Thought lo4 = Thought256.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
    Thought lo5 = Thought235.getInstance(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb6 = true;
    ld1 *= -1;
    Thought lo7 = Thought130.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb2, lb6, fb0, fb1);
    Thought lo8 = Thought363.getInstance(lb2, lb6, fb0, fb1);
    double ld9 = 113.19788250556392;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    fd0 = fd1 + ld0;
    Thought lo10 = Thought10.getInstance(ld1, ld9, ad1, ad2);
    lb2 = lb6 || fb0;

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
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[1][6] += ad1;
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[1][7] -= fd1;
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought14.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;

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
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld0 = 852.7775765967816;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    double ld1 = 932.7832165185198;
if(ao3 != null){
      ld0 = ao3.m3(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 944.4924413881142;
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 668.2273003700575;
    ld0 = ld3 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld3, fd0, lb1, lb2, ab1, ab2);
}
    ab3 = fd1 < ld0;
    double ld4 = 609.5946760798198;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
if(ao3 != null){
      ld3 = ao3.m3();
}
    boolean lb5 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    Output.points[1][8] += ad2;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
    Output.points[2][0] -= ad1;
    ad2 = ad3 + ad4;
    double ld2 = 843.8887182344148;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld3 = 968.1945750757003;
    boolean lb4 = false;

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought269.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[2][1] -= fd1;
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought322.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb1 = fo1.m2();
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
    double ld0 = 396.6043627289867;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    fb0 = fb1 || fb0;
    if (fb1) {
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
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    double ld0 = 0.5969647759618362;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    double ld2 = 789.1952043205556;
    Output.points[2][2] -= ad1;
    Output.points[2][3] += ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][4] += ad3;
    ad4 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb1 = ab1 || ab2;
    ad2 = ad3 + ad4;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld2, ad1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ld2;
    double ld3 = 115.98679960270107;
    ld3 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    boolean lb4 = false;
    ld0 = ld2 - ld3;

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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    lb0 = !fb0;
    fd1 *= -1;
    Output.points[2][5] -= fd0;
    fb1 = !lb0;
    boolean lb1 = false;

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
    double ld0 = 678.1668634225489;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought167.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    ld0 = ad1 + ad2;
    boolean lb2 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
}
    lb2 = !lb3;
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb2;
    double ld4 = 944.7707763374335;
    double ld5 = 56.7750926635899;
    lb3 = !fb0;
    ld0 = ld4 - ld5;
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb2);
}
    boolean lb6 = true;
    lb3 = lb6 || fb0;
    double ld7 = 952.5361599752481;
    fb1 = lb2 && lb3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb6, fb0, fb1, lb2);
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
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(ao2 != null){
          ab2 = ao2.m2();
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao3.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb0 = false;
        ab4 = fb0 || fb1;
if(ao4 != null){
          lb0 = ao4.m2(fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        lb1 = fd1 > fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        if (fb0) {
            double ld2 = 865.5003864346344;
            double ld3 = 899.1839208962147;
            ld2 = ld3 - fd0;
            for(int i1=0; i1<10; i1++){
                fb1 = fd1 > ld2;
                double ld4 = 446.22843263713173;
                ld2 *= -1;
                lb0 = !lb1;
}}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    Output.points[2][6] -= ad2;
if(ao2 != null){
      ao2.m3();
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(lb0, lb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    boolean lb2 = false;
    Thought lo3 = Thought201.getInstance(fo0, fo1, ao1, ao2);
    boolean lb4 = true;
    Thought lo5 = Thought77.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb6 = true;
    for(int i0=0; i0<10; i0++){
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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
        fb0 = !fb1;
    lb0 = fd1 < fd0;
    Thought lo1 = Thought10.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !lb0;
    Output.points[2][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, lb2, fb0);
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
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd0 < fd1;
    boolean lb2 = true;
        fd0 = fd1 - fd0;
    boolean lb3 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = !lb2;
        fd0 = fd1 + fd0;
    lb3 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
    Output.points[2][8] -= fd1;
    lb1 = !fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    lb0 = !lb1;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    double ld3 = 716.1848718154018;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
    fb1 = !lb0;
    lb1 = lb2 || fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m3(lb1, lb2, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ld3 *= -1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, fd0, fd1);
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
