package genetic;
import java.util.ArrayList;
class Thought43 extends Thought{
private static ArrayList<Thought43> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 831.2028469790138;
private double fd1 = 951.6482875931691;
private Thought fo0 = null;
private Thought fo1 = null;
Thought43 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought43 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought43 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[2][8] -= fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[3][0] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[3][1] += fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought272.getInstance();
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    Thought lo3 = Thought221.getInstance(fb0, fb1, lb0, lb1);

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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
    fb1 = fb0 || fb1;
    Output.points[3][2] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought107.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    double ld2 = 650.4784653080001;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ad3 = ad4 - fd0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 || ab3;
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought341.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
    double ld2 = 224.2892553886484;
    fd0 = fd1 - ld2;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao1 != null){
      ao1.m3();
}
    Output.points[3][3] += ad3;
    Thought lo0 = Thought357.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    double ld1 = 969.3399456659303;
    ad4 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
    fb0 = fb1 && fb0;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 = ld1 - ad1;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought159.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
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
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    ab1 = fd0 < fd1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m2();
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3(fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    ab4 = fd1 > ad1;
    Output.points[3][4] -= ad2;
    double ld3 = 851.662947334954;
    boolean lb4 = false;
    ab4 = !fb0;
    fb1 = lb0 && lb1;
    lb2 = lb4 && ab1;
    boolean lb5 = false;
    boolean lb6 = true;
    lb6 = ad2 < ad3;

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought295.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 740.755110072244;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 443.7299550942566;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    Thought lo4 = Thought280.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, lb3, fb0, fb1, lb3);
    boolean lb5 = true;
if(fo1 != null){
      lb5 = fo1.m2(fb0, fb1, lb3, lb5);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
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
    ab1 = fd0 > fd1;
    Output.points[3][5] -= fd0;
    fd1 *= -1;
    Thought lo0 = Thought132.getInstance(fd0, fd1, fd0, fd1);
    ab2 = fd0 < fd1;
    fd0 *= -1;
    ab3 = fd1 > fd0;
    boolean lb1 = true;
    ab3 = ab4 && fb0;
    boolean lb2 = false;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = lb1 && lb2;
    ab1 = ab2 || ab3;
    boolean lb3 = false;
    Output.points[3][6] += fd0;
    Thought lo4 = Thought153.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo5 = Thought275.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, lb3, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3();
}
    boolean lb6 = true;
    boolean lb7 = false;

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
    ad1 *= -1;
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 157.40197671047136;
if(fo1 != null){
      lb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    if (lb0) {
        lb1 = !fb0;
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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought188.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    Thought lo1 = Thought4.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    double ld2 = 183.22460258659814;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    Output.points[3][7] -= ad2;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    boolean lb3 = true;
    ad3 *= -1;
    Thought lo4 = Thought293.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld2, ad1);
}
    ab3 = ad2 < ad3;
    Output.points[3][8] -= ad4;
    fd0 = fd1 + ld2;
    ad1 = ad2 + ad3;

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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld0 = 739.5826981536959;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 896.4269531534878;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld1 = fd0 + fd1;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
    lb3 = fd0 < fd1;
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(lb4, fb0, fb1, lb2);
}
    Output.points[4][0] -= ld0;
    boolean lb5 = true;
    Thought lo6 = Thought10.getInstance(fo0, fo1, ao1, ao2);
    Thought lo7 = Thought115.getInstance(ld1, fd0, fd1, ld0);
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
}
    fd0 = fd1 - ld0;
    Thought lo8 = Thought87.getInstance(ld1, fd0, fd1, ld0, lb3, lb4, lb5, fb0);

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2();
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb1, lb2, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
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
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    if (ab2) {
        ab3 = fd0 < fd1;
        fd0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao4.m1(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 < fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        double ld0 = 347.56908140474155;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought188.getInstance(ao4, fo0, fo1, ao1);
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = ad2 < ad3;
    Output.points[4][1] += ad4;
    fb1 = !ab1;
    ab2 = fd0 < fd1;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    ab2 = ad4 > fd0;
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought308.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    boolean lb3 = false;
    ab1 = ad1 < ad2;
    boolean lb4 = true;
if(ao3 != null){
      ao3.m3();
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && lb3;
    lb4 = ab1 && ab2;
if(ao3 != null){
      ad1 = ao3.m3(ab3, ab4, fb0, fb1);
}
    lb1 = ad2 > ad3;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought62.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    Thought lo2 = Thought18.getInstance();
    boolean lb3 = true;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        Thought lo4 = Thought101.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb3, fb0);
        Thought lo5 = Thought298.getInstance(fb1, lb0, lb3, fb0);
        fb1 = lb0 && lb3;
        Thought lo6 = Thought1.getInstance(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        boolean lb0 = true;
        double ld1 = 995.5710181532448;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        lb0 = fd1 < ld1;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd1 = ld1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = !lb0;
        if (ab1) {
            } else {
            ld1 = fd0 - fd1;
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
    fb0 = ad2 < ad3;
    boolean lb0 = true;
    double ld1 = 857.9337865461616;
    double ld2 = 558.3732006537789;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        lb0 = fd1 > ld1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
        Thought lo4 = Thought46.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, lb3, lb0);
        boolean lb5 = false;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb5);
}
        lb0 = ld2 > ad1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[4][2] -= ad2;
        fb0 = !fb1;
        double ld6 = 675.091631856895;
        }
    Output.points[4][3] -= ad3;
    lb0 = ad4 > fd0;
    fb0 = fd1 < ld1;
    fb1 = ld2 < ad1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought377.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought24.getInstance(fd0, fd1, ad1, ad2);
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought30.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
        ad2 *= -1;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            ab1 = ad2 < ad3;
            ab2 = ad4 > fd0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
            ab1 = ab2 && ab3;
            Thought lo3 = Thought89.getInstance();
            fd1 = ad1 + ad2;
if(fo1 != null){
              ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
}}
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
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Output.points[4][4] -= fd0;
    boolean lb0 = false;
    Thought lo1 = Thought258.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    double ld3 = 76.92220077303956;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
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
    boolean lb0 = false;
    lb0 = ad1 < ad2;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    ad3 *= -1;
    fb1 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    if (lb0) {
        double ld1 = 137.48848482470171;
        fb0 = !fb1;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4(ld1, ad1, ad2, ad3, lb2, lb0, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 434.2912362727408;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ld0;
    ab2 = fd0 > fd1;
    Output.points[4][5] += ld0;
    fd0 = fd1 + ld0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ab3 = fd1 < ld0;
    ab4 = fb0 && fb1;
    ab1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0);
}
    double ld1 = 643.2608604715812;
    ld1 = fd0 + fd1;
    ld0 *= -1;
        ld1 = fd0 + fd1;
    ab2 = ld0 > ld1;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought205.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    boolean lb2 = false;
        Output.points[4][6] -= ad2;
    Thought lo3 = Thought287.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ad3 > ad4;
    lb1 = fd0 < fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought367.getInstance();
    fb1 = ab1 && ab2;
    ab3 = fd1 > fd0;
    ab4 = fd1 < fd0;
    double ld1 = 998.2332726362312;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m1(fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    Output.points[4][7] -= fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    Thought lo3 = Thought24.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    Output.points[4][8] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    Thought lo4 = Thought203.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;

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
    ad1 *= -1;
    double ld0 = 634.521355922659;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    if (fb0) {
if(fo1 != null){
          ad1 = fo1.m3(fb1, lb1, fb0, fb1);
}
        ad2 = ad3 - ad4;
        Thought lo2 = Thought216.getInstance(fo0, fo1, fo0, fo1);
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    lb0 = ad2 > ad3;
    boolean lb1 = false;
    Output.points[5][0] -= ad4;
    boolean lb2 = true;

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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought362.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Output.points[5][1] -= fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    double ld1 = 635.2619165622793;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought119.getInstance(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    Output.points[5][2] -= fd0;
    double ld3 = 389.8513581535413;
    Output.points[5][3] += fd0;

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
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought328.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    Output.points[5][4] += ad2;
    ad3 = ad4 + fd0;
    fb1 = lb1 && fb0;
    fd1 *= -1;
    fb1 = ad1 > ad2;
    boolean lb2 = true;
        double ld3 = 578.643765776234;
    lb1 = !lb2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, lb2, fb0);
}
    fb1 = ad2 < ad3;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    if (ab1) {
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
if(ao4 != null){
          ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
        ab3 = fd0 > fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fd0 = fd1 - fd0;
        double ld0 = 53.14118785835701;
        fd0 *= -1;
        Output.points[5][5] += fd1;
if(ao4 != null){
          ao4.m3(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
        boolean lb1 = true;
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
        ab3 = ab4 && fb0;
        fd1 = ld0 + fd0;
        Thought lo2 = Thought260.getInstance(fd1, ld0, fd0, fd1, fb1, lb1, ab1, ab2);
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought351.getInstance();
        lb1 = ab1 && ab2;
        ld0 = fd0 + fd1;
        boolean lb4 = false;
        ab2 = !ab3;
        ab4 = ld0 > fd0;
        Output.points[5][6] -= fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao1 != null){
      fd0 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = fb1 || ab1;
    double ld0 = 282.92043118175286;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought29.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
    boolean lb2 = false;
    if (ab4) {
        fb0 = !fb1;
        boolean lb3 = true;
if(ao2 != null){
          lb3 = ao2.m2(fd1, ld0, ad1, ad2, lb2, ab1, ab2, ab3);
}
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
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    double ld0 = 572.7089378100164;
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought70.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = ld0 < fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    double ld2 = 36.91035792278127;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = ld2 - fd0;

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
    Thought lo0 = Thought296.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    Thought lo2 = Thought147.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
    double ld3 = 53.79859115079221;
    fb0 = fb1 && lb1;
    Thought lo4 = Thought16.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    ld3 = fd0 - fd1;
if(fo0 != null){
      ld3 = fo0.m3();
}
    Thought lo5 = Thought226.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, fb1, lb1, fb0, fb1);
    lb1 = fb0 && fb1;
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
        fb1 = fd1 > ld3;
    lb1 = fd0 < fd1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld3;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld3, fd0);
}
    Thought lo6 = Thought159.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
    fb0 = fb1 && lb1;

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
    Thought lo0 = Thought166.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fd0 *= -1;
if(fo1 != null){
          fb1 = fo1.m2();
}
    Thought lo1 = Thought43.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought1.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    double ld3 = 31.159852741831006;
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
}
