package genetic;
import java.util.ArrayList;
class Thought79 extends Thought{
private static ArrayList<Thought79> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 302.3523238949395;
private double fd1 = 904.3356939582666;
private Thought fo0 = null;
private Thought fo1 = null;
Thought79 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought79 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought79 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought79 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought79 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    Output.points[8][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, fb0);
}
    double ld2 = 858.9986408277216;
    fd0 = fd1 + ld2;
    double ld3 = 108.4005130560405;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
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
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought37.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
    ad4 = fd0 - fd1;
    Output.points[8][2] += ad1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fb1 = fd0 < fd1;
    lb0 = fb0 && fb1;

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
    ad1 = ad2 + ad3;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    lb0 = ad2 < ad3;
    Thought lo1 = Thought83.getInstance(ab1, ab2, ab3, ab4);
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought50.getInstance(ab4, fb0, fb1, lb0);
    ad2 = ad3 - ad4;
    if (lb2) {
        Thought lo4 = Thought91.getInstance();
        fd0 *= -1;
        double ld5 = 494.75665264327;
        fd0 *= -1;
        boolean lb6 = true;
        lb2 = !ab1;
        Thought lo7 = Thought44.getInstance(fd1, ld5, ad1, ad2, ab2, ab3, ab4, fb0);
        fb1 = lb6 || lb0;
        lb2 = ab1 && ab2;
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
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought14.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] -= fd1;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought29.getInstance();
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought38.getInstance(ad1, ad2, ad3, ad4);
    if (fb1) {
        fd0 *= -1;
        fb0 = fb1 || fb0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        double ld1 = 184.47055287093144;
        fb1 = !fb0;
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
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 781.3151643316058;
    Thought lo1 = Thought88.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    double ld2 = 166.18847228142468;
    boolean lb3 = true;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        ld2 = fd0 - fd1;
        double ld4 = 718.0857597563038;
if(fo1 != null){
          lb3 = fo1.m2(ao1, ao2, ao3, ao4);
}
        if (ab1) {
if(fo0 != null){
              fo0.m2(fo1, ao1, ao2, ao3, ld4, ld0, ld2, fd0, ab2, ab3, ab4, fb0);
}
            fd1 = ld4 - ld0;
            boolean lb5 = false;
            double ld6 = 12.068791210460082;
            ld0 *= -1;
if(ao4 != null){
              fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb5, lb3, ab1);
}
if(ao4 != null){
              ao3 = ao4.m4(ld2, fd0, fd1, ld6);
}
if(fo0 != null){
              ld4 = fo0.m3(fo1, ao1, ao2, ao3, ld0, ld2, fd0, fd1);
}
if(ao4 != null){
              ao4.m1(ab2, ab3, ab4, fb0);
}
            ld6 = ld4 + ld0;
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
    ab1 = ad2 < ad3;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 541.6558602983722;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[8][4] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought42.getInstance(fd1, ld0, ad1, ad2);
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ad3 = ad4 - fd0;
    double ld2 = 803.1100912256419;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld2, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
    boolean lb3 = true;
    ab4 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ld2, ad1, fb0, fb1, lb3, ab1);
}
    boolean lb4 = true;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ld2, ad1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
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
    Thought lo0 = Thought43.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    fd1 *= -1;
    Thought lo1 = Thought27.getInstance();
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought58.getInstance(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        boolean lb4 = false;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb4, lb2, fb0);
}
        fd0 = fd1 + fd0;
        fb1 = !lb4;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb4);
}
        double ld5 = 560.5686071477529;
        fd0 = fd1 + ld5;
        fd0 = fd1 + ld5;
        lb2 = fd0 < fd1;
        double ld6 = 483.1382974919161;
        for(int i1=0; i1<10; i1++){
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    if (ab4) {
        boolean lb0 = true;
        fd0 = fd1 + fd0;
        } else if (fb0) {
        fb1 = !ab1;
        Thought lo1 = Thought20.getInstance(fd1, fd0, fd1, fd0);
        ab2 = fd1 > fd0;
        fd1 *= -1;
        Thought lo2 = Thought11.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        ab3 = ab4 || fb0;
        fb1 = !ab1;
        Output.points[8][5] -= fd1;
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
        double ld3 = 679.3624092340389;
if(fo0 != null){
          fo0.m3();
}
        if (fb1) {
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought74.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[8][6] += fd1;
    fb1 = ad1 < ad2;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[8][7] += ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    boolean lb1 = true;
    double ld2 = 678.7574023853056;
    Thought lo3 = Thought90.getInstance(lb1, fb0, fb1, lb1);
        fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld2 *= -1;

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
    ab1 = ad2 < ad3;
    ab2 = ad4 > fd0;
    Output.points[8][8] -= fd1;
    Output.points[0][0] -= ad1;
    ab3 = ad2 > ad3;
    double ld0 = 706.9070442996895;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    ad3 = ad4 - fd0;
    lb2 = ab1 && ab2;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 649.4613428309345;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought39.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
    Thought lo2 = Thought51.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    fb0 = fd1 < ld0;

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
    boolean lb0 = false;
    lb0 = ad2 > ad3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    Output.points[0][1] += ad3;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought60.getInstance(ad4, fd0, fd1, ad1);
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    ad2 = ad3 - ad4;
    double ld4 = 160.20514267077883;
    ad4 *= -1;
    boolean lb5 = false;
    boolean lb6 = false;
    lb0 = lb1 && lb3;

Thought.STACK_COUNTER++;
return lb5;
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
    ab1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
        fd1 = fd0 + fd1;
        Output.points[0][2] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        Output.points[0][3] -= fd1;
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
        ab3 = fd1 > fd0;
        ab4 = !fb0;
        fb1 = ab1 || ab2;
        boolean lb0 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m1();
}
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought13.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    Thought lo2 = Thought15.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    Thought lo3 = Thought58.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1);
}
    lb0 = ab1 && ab2;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[0][4] -= fd1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    lb4 = ab1 || ab2;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    ab3 = fd0 < fd1;
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      lb4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + ad1;
    ab1 = !ab2;
    ab3 = ad2 > ad3;
    Thought lo5 = Thought39.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][5] += fd1;
    fd0 = fd1 + fd0;
    double ld0 = 729.4678035476293;
    fd0 = fd1 + ld0;
    fb0 = fb1 && fb0;
    Output.points[0][6] += fd0;
    boolean lb1 = true;
    Thought lo2 = Thought21.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ld0 *= -1;
    Thought lo3 = Thought14.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb1 = lb1 && fb0;
    ld0 = fd0 + fd1;
    fb1 = lb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    boolean lb4 = false;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb1 = fo1.m2(ld0, fd0, fd1, ld0, lb4, fb0, fb1, lb1);
}
    fd0 *= -1;
    Output.points[0][7] += fd1;
    lb4 = fb0 || fb1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Thought lo0 = Thought92.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 || ab3;
    double ld1 = 243.85089302250805;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ld1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
    ab1 = fd0 < fd1;
    ld1 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld1;

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
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought90.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought59.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[0][8] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb2 = true;
if(fo1 != null){
          fo1.m3(lb2, fb0, fb1, lb2);
}
    Output.points[1][0] -= ad4;
        boolean lb3 = true;
    lb3 = fd0 > fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 *= -1;
    ab3 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    ad2 *= -1;
    boolean lb1 = true;
    lb1 = ad3 < ad4;
    Thought lo2 = Thought61.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 && ab3;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ad1 - ad2;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb3, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd1 = ad1 - ad2;
    Thought lo4 = Thought96.getInstance(ad3, ad4, fd0, fd1, lb1, lb3, ab1, ab2);
    boolean lb5 = false;

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
    double ld0 = 278.7431248196117;
    Output.points[1][1] -= fd0;
    fd1 *= -1;
    ld0 = fd0 + fd1;
    Output.points[1][2] -= ld0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
    fb1 = lb1 || fb0;
    Thought lo2 = Thought34.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
    Thought lo3 = Thought18.getInstance(ld0, fd0, fd1, ld0);
    lb1 = fb0 || fb1;
    Output.points[1][3] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    Thought lo4 = Thought15.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
    double ld5 = 571.7562081698338;
    double ld6 = 1000.1432947612973;
    boolean lb7 = false;
    fb0 = !fb1;
    lb1 = lb7 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}

Thought.STACK_COUNTER++;
return ld6;
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
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 84.4727247760848;
    ld0 = ad1 - ad2;
    fb0 = ad3 < ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought0.getInstance(fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    boolean lb1 = false;
    double ld2 = 475.7835818071092;
    Output.points[1][4] += ld2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ld2 > fd0;
    fd1 = ld2 + fd0;
    fd1 = ld2 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = ld2 > fd0;
    fb0 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb1, ab1, ab2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    if (ab3) {
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
if(ao1 != null){
          ab4 = ao1.m2(fb0, fb1, lb0, ab1);
}
        for(int i0=0; i0<10; i0++){
            if (ab2) {
                ab3 = ad1 < ad2;
                ad3 = ad4 - fd0;
if(ao3 != null){
                  ao2 = ao3.m4();
}
                ab4 = !fb0;
                boolean lb1 = true;
                double ld2 = 51.76213553577092;
if(fo0 != null){
                  ao4 = fo0.m4(fd0, fd1, ld2, ad1, fb0, fb1, lb1, lb0);
}
                ad2 = ad3 - ad4;
                fd0 = fd1 - ld2;
                double ld3 = 677.6817844624986;
                ab1 = ld3 > ad1;
}}}
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought80.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    Output.points[1][5] += fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
    double ld4 = 875.5933217549906;
    ld4 = fd0 - fd1;
    ld4 = fd0 - fd1;
if(fo0 != null){
      lb2 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(ld4, fd0, fd1, ld4, lb3, fb0, fb1, lb0);
}
    double ld5 = 55.91954760116163;
    ld5 = fd0 + fd1;
    lb2 = ld4 > ld5;
    Thought lo6 = Thought90.getInstance(fo0, fo1, fo0, fo1);
    boolean lb7 = true;
    lb3 = !lb7;
    fb0 = fd0 < fd1;

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
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          lb0 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
        fb0 = fb1 || lb0;
        boolean lb1 = false;
        }
    Thought lo2 = Thought92.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + fd0;
    Thought lo3 = Thought88.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
        fd1 = fd0 + fd1;
    Thought lo4 = Thought35.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
    Output.points[1][6] -= fd0;
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb5 = false;

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
    fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[1][7] -= ad3;
    Thought lo0 = Thought45.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = !fb1;
    boolean lb1 = true;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    Thought lo1 = Thought44.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
    ab2 = ad4 > fd0;
    fd1 *= -1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
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
      ao1.m1(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    fd1 = fd0 - fd1;
    lb0 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 464.82928799299987;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    ld0 = ad1 + ad2;
    fb0 = !fb1;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    ld0 = ad1 + ad2;
    boolean lb1 = true;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    double ld2 = 969.1461036348915;
    lb1 = fb0 || fb1;
    Thought lo3 = Thought45.getInstance(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3);
    ad4 *= -1;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    fb1 = lb1 && fb0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    boolean lb4 = true;
    lb1 = lb4 || fb0;
    fb1 = ld2 > ad1;
if(ao1 != null){
      ao1.m3();
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    Output.points[1][8] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = !fb1;
    Output.points[2][0] -= fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb1 = fd1 > fd0;
        ab1 = ab2 || ab3;
        boolean lb0 = true;
        boolean lb1 = false;
        Thought lo2 = Thought46.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
}
        fb1 = lb0 || lb1;
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
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        ab1 = ab2 || ab3;
if(ao1 != null){
          ad3 = ao1.m3(ab4, fb0, fb1, ab1);
}
        ad4 = fd0 - fd1;
        Thought lo0 = Thought22.getInstance();
        for(int i1=0; i1<10; i1++){
            }
        ad1 = ad2 + ad3;
        Output.points[2][1] += ad4;
        double ld1 = 561.7174724339839;
        }
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad3 = ad4 - fd0;
    double ld2 = 977.5236809976252;
    boolean lb3 = true;
    fb0 = fb1 && lb3;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought46.getInstance(ao2, ao3, ao4, fo0, fb1, lb3, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2);
}
    ab4 = fb0 || fb1;
    Thought lo5 = Thought47.getInstance(lb3, ab1, ab2, ab3);
    ab4 = !fb0;

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
      fb0 = fo1.m2();
}
    boolean lb0 = false;
        fb0 = fb1 && lb0;
    double ld1 = 16.555246853693802;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > ld1;
    fb0 = fd0 > fd1;
    Output.points[2][2] += ld1;
    fd0 *= -1;
    fb1 = fd1 > ld1;
    double ld2 = 229.08355036630596;
    lb0 = !fb0;
    fb1 = ld2 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ld1 *= -1;
    lb0 = ld2 > fd0;
    Thought lo3 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0, fb0, fb1, lb0, fb0);

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 742.9504745113647;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, fb0, fb1);
}
    boolean lb3 = false;
        lb0 = fd0 < fd1;
    lb2 = !lb3;
    Thought lo4 = Thought53.getInstance();
    fb0 = fb1 || lb0;
        boolean lb5 = false;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, lb2, lb3, lb5, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, lb3, lb5, fb0);
}
    fb1 = lb0 || lb2;
    lb3 = !lb5;

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
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought95.getInstance(lb0, fb0, fb1, lb0);
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
    fd1 = fd0 - fd1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    lb2 = !lb3;
    double ld5 = 521.3020701348753;
    fd0 = fd1 - ld5;
    Thought lo6 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0, lb4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, lb4, fb0);
}
if(fo0 != null){
      fo0.m3(fd1, ld5, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld5);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, lb3, lb4);
}
if(fo0 != null){
      fo0.m2();
}
    Output.points[2][3] -= fd0;
    boolean lb7 = true;

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
