package genetic;
import java.util.ArrayList;
class Thought64 extends Thought{
private static ArrayList<Thought64> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 500.53809029295815;
private double fd1 = 777.748643013656;
private Thought fo0 = null;
private Thought fo1 = null;
Thought64 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought64 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought64 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought64 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought64 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    lb0 = !lb1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
    lb2 = fd1 > fd0;
    fb0 = fb1 || lb0;
    lb1 = lb2 || fb0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb0 = !lb1;
    lb2 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought126.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    fb0 = fb1 && lb0;
    Thought lo4 = Thought377.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
    double ld5 = 689.8437606739551;

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
    ab1 = ab2 && ab3;
    Output.points[7][5] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = fd0 < fd1;
    double ld1 = 60.48308214575828;
    Thought lo2 = Thought40.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 759.9528762340617;

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
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought199.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 *= -1;
    double ld1 = 168.92134881766913;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    double ld2 = 387.0853019370938;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ld2, ad1, ad2);
}
    fb1 = ad3 > ad4;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    for(int i0=0; i0<10; i0++){
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
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[7][6] += ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
    double ld0 = 939.8969113750032;
    Thought lo1 = Thought367.getInstance();
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Output.points[7][7] -= fd1;
    ld0 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought60.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ad3 = fo0.m3();
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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3();
}
        fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        if (lb0) {
if(fo0 != null){
              fo0.m1(fb0, fb1, lb0, fb0);
}
            fd1 *= -1;
            Thought lo1 = Thought98.getInstance(fo1, ao1, ao2, ao3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    double ld1 = 985.8151111573591;
    fb0 = !fb1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    double ld2 = 888.1279585791079;
    fb0 = ad2 > ad3;
    boolean lb3 = false;
    ad4 *= -1;
    fb0 = fb1 || lb0;
    double ld4 = 78.82868092726808;
    ad4 = fd0 - fd1;
    ld1 = ld2 - ld4;
    Thought lo5 = Thought270.getInstance(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb0);
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
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
    fd1 = fd0 - fd1;
    Output.points[7][8] += fd0;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fd1 *= -1;
    boolean lb0 = true;
    ab4 = fd0 > fd1;
    Thought lo1 = Thought163.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    ab4 = fd0 > fd1;
    boolean lb3 = false;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb2, lb3, ab1, ab2);
}
    Thought lo4 = Thought305.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
        ab1 = !ab2;
    boolean lb0 = false;
        boolean lb1 = false;
    ab1 = ad2 < ad3;
    Thought lo2 = Thought249.getInstance(ab2, ab3, ab4, fb0);
    ad4 = fd0 + fd1;
    fb1 = lb0 && lb1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = ad1 > ad2;

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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
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
    fd0 *= -1;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
        double ld0 = 860.558447291881;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
        Thought lo2 = Thought191.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Output.points[8][0] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
        fb0 = ad1 > ad2;

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
    double ld1 = 905.5390979326564;
    lb0 = ld1 < ad1;
    ab1 = ab2 || ab3;
        ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought102.getInstance();
    fd1 = ld1 - ad1;
    boolean lb3 = false;
    Thought lo4 = Thought264.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb3, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}

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
    fd0 = fd1 - fd0;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought272.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
        fb1 = fd1 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought29.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
        double ld2 = 665.9866794320312;
        double ld3 = 229.3772569528277;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = fb1 || fb0;
        fb1 = ld3 < fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, ld3, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fb0 = fb1 || fb0;
if(ao4 != null){
          ao4.m2(fb1, fb0, fb1, fb0);
}
        Output.points[8][1] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        double ld4 = 186.63455449123285;
        Output.points[8][2] += ld2;
        ld3 = ld4 - fd0;
        fd1 *= -1;
        fb1 = ld2 < ld3;
        Thought lo5 = Thought327.getInstance(ld4, fd0, fd1, ld2);
        fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
        ld3 = ld4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, ld3, ld4);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 730.6256830820893;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    for(int i0=0; i0<10; i0++){
        double ld2 = 981.990876017514;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
        boolean lb3 = false;
        lb3 = !lb0;
        boolean lb4 = true;
        fd1 = ld2 - ld1;
if(ao1 != null){
          lb0 = ao1.m2();
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb3, lb4);
}
if(ao1 != null){
          fd0 = ao1.m3(lb0, fb0, fb1, lb3);
}
        lb4 = lb0 && fb0;
        fb1 = !lb3;
        fd1 = ld2 + ld1;
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        double ld5 = 251.12463454315193;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Output.points[8][3] -= fd1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab4 = !fb0;
    boolean lb1 = false;
    fb0 = !fb1;
    Output.points[8][4] -= fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    Thought lo2 = Thought333.getInstance(ab3, ab4, fb0, fb1);
    lb0 = lb1 && ab1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld3 = 326.7656304482962;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3();
}
    fb0 = !fb1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd1 > ad1;
    Thought lo0 = Thought294.getInstance(ab4, fb0, fb1, ab1);
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1);
}
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    ad3 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought41.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ab1 = ao2.m2();
}
    fd1 = ad1 + ad2;
    boolean lb2 = false;
    ad3 *= -1;
        ab1 = ad4 > fd0;
        double ld3 = 779.9904192678978;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ad1, ab2, ab3, ab4, fb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        boolean lb0 = false;
        double ld1 = 465.2985086669707;
        ld1 *= -1;
        fb0 = !fb1;
        double ld2 = 743.0062236204026;
        Thought lo3 = Thought348.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fo0.m1(ld2, fd0, fd1, ld1);
}
        if (lb0) {
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
            ld2 = fd0 + fd1;
            ld1 *= -1;
            fb0 = fb1 && lb0;
            boolean lb4 = true;
if(fo0 != null){
              lb0 = fo0.m2(ld2, fd0, fd1, ld1, fb0, fb1, lb4, lb0);
}
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo1 = Thought192.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld2 = 762.3093605746732;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, ab1);
}
    double ld3 = 927.8115523267;
    ld2 = ld3 + fd0;
    boolean lb4 = false;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    Output.points[8][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, fd0, fd1);
}
        lb4 = ab1 || ab2;
    ab3 = ab4 || fb0;
    Thought lo5 = Thought198.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
    ld2 = ld3 + fd0;
    boolean lb6 = true;

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
    fb1 = fb0 || fb1;
    fb0 = ad1 < ad2;
    double ld0 = 437.3236345113342;
    for(int i0=0; i0<10; i0++){
        fb1 = ad2 > ad3;
        ad4 = fd0 - fd1;
        fb0 = fb1 || fb0;
        Thought lo1 = Thought241.getInstance(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
        double ld2 = 219.7826093679818;
        fb1 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        boolean lb3 = true;
        fd0 *= -1;
        boolean lb4 = true;
        fd1 = ld2 - ld0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad1 = ad2 - ad3;
        Thought lo5 = Thought270.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, lb3, lb4, fb0, fb1);
        lb3 = lb4 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(lb3, lb4, fb0, fb1);
}
        boolean lb6 = false;
        Output.points[8][6] -= ld0;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        lb3 = !lb4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld0, ad1, ad2);
}
        boolean lb7 = false;
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
    double ld0 = 84.90883184417726;
    Output.points[8][7] += ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ld0;
    ab3 = ab4 || fb0;
    Output.points[8][8] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought51.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = fd0 < fd1;
    lb2 = fb0 && fb1;
    Output.points[0][0] += fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb1, lb2, fb0);
}
    boolean lb3 = true;
    boolean lb4 = false;

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
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought153.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought299.getInstance(ao2, ao3, ao4, fo0);
    fb1 = ad4 < fd0;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    double ld3 = 374.94132146184535;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld3);
}
    double ld4 = 767.3973376879616;
    ld4 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld3, ld4, lb2, fb0, fb1, lb2);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 > fd0;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fd1 *= -1;
    double ld1 = 772.8495611056549;
    fb0 = ld1 < fd0;
if(ao2 != null){
      ao2.m1(fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
    ab3 = !ab4;
    fb0 = fd1 > ld1;
if(ao4 != null){
      ao4.m3(fd0, fd1, ld1, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo2 = Thought2.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
    boolean lb3 = true;
    Thought lo4 = Thought40.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 < fd0;

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
    ab1 = ad1 < ad2;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 *= -1;
    fd1 = ad1 - ad2;

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
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            fb1 = fb0 || fb1;
            double ld0 = 703.4271677475543;
            fd0 = fd1 + ld0;
            fb0 = fb1 && fb0;
            fd0 *= -1;
            Thought lo1 = Thought298.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
            Thought lo2 = Thought188.getInstance();
            fd1 *= -1;
            ld0 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
            fd1 = ld0 - fd0;
            fd1 = ld0 + fd0;
            fd1 = ld0 - fd0;
            double ld3 = 945.9379693422245;
            double ld4 = 646.7040836984224;
if(fo0 != null){
              fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
            }
        fb1 = fd0 > fd1;
        boolean lb5 = false;
if(fo1 != null){
          lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - fd0;
        fb0 = fd1 > fd0;
        fd1 = fd0 + fd1;
        Thought lo6 = Thought217.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
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
    fd0 *= -1;
    ab1 = !ab2;
    double ld0 = 592.0063744214673;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
    Thought lo1 = Thought376.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
    Output.points[0][1] += ld0;
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
    ab1 = ld0 > fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld0 = fd0 + fd1;
    ab3 = ld0 > fd0;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        boolean lb2 = false;
        lb2 = fd1 > ld0;
        fd0 *= -1;
        ab1 = !ab2;
        ab3 = ab4 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(lb2, ab1, ab2, ab3);
}
        }
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || ab1;

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
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    Thought lo1 = Thought170.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    ad4 *= -1;
    Thought lo2 = Thought221.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          ad1 = fo1.m3(fb0, fb1, lb0, fb0);
}
        ad2 = ad3 - ad4;
        Output.points[0][2] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        fb1 = lb0 || fb0;
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
        boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought242.getInstance(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        Thought lo3 = Thought281.getInstance(ad2, ad3, ad4, fd0);
        boolean lb4 = false;
        Thought lo5 = Thought388.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        ad4 *= -1;
        fd0 = fd1 + ad1;
        lb0 = ab1 || ab2;
        Thought lo6 = Thought245.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
        fd1 *= -1;
        boolean lb7 = true;
        }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
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
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought154.getInstance();
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
    Output.points[0][3] += fd1;
    Thought lo1 = Thought93.getInstance(fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought154.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    boolean lb4 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        }
    fd0 *= -1;
    boolean lb5 = true;
    Output.points[0][4] -= fd1;
    lb4 = fd0 > fd1;
    lb5 = fd0 > fd1;

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
    for(int i0=0; i0<10; i0++){
        double ld0 = 996.0373426675327;
        fb1 = ld0 > ad1;
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought307.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
        ld0 = ad1 - ad2;
        ad3 = ad4 + fd0;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd1 = ld0 - ad1;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought35.getInstance(ao3, ao4, fo0, fo1);
        fb1 = fb0 || fb1;
if(ao1 != null){
          ao1.m2(fd1, ld0, ad1, ad2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought191.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
    Thought lo1 = Thought114.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    ab3 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    Output.points[0][5] += fd0;
    Output.points[0][6] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought76.getInstance(fo1, ao1, ao2, ao3);
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[0][7] += fd0;
    ab1 = ab2 && ab3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][8] -= ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    Output.points[1][0] += fd1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    double ld2 = 535.7110906558;
if(ao2 != null){
      ab1 = ao2.m2();
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
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought250.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    Thought lo2 = Thought184.getInstance(fo1, fo0, fo1, fo0);
    lb1 = fb0 && fb1;
    boolean lb3 = true;
    boolean lb4 = false;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb3 = lb4 || fb0;
        Thought lo5 = Thought284.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);

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
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought351.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
        fd1 = fd0 - fd1;
    Output.points[1][1] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;

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
    Output.points[1][2] -= fd0;
        fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd1 *= -1;
    double ld1 = 729.5172729783483;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1);
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
