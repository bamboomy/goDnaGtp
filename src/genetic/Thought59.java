package genetic;
import java.util.ArrayList;
class Thought59 extends Thought{
private static ArrayList<Thought59> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 209.46692246732636;
private double fd1 = 277.5158937021641;
private Thought fo0 = null;
private Thought fo1 = null;
Thought59 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought59 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought59 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought59 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought59 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Output.points[8][1] -= fd0;
    fd1 *= -1;
    Output.points[8][2] -= fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
        fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 575.0545606685274;
    fd0 = fd1 + ld0;
    double ld1 = 291.2760148050215;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld1 = fd0 + fd1;
    boolean lb2 = true;
    ld0 *= -1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    fb0 = ld1 < fd0;

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
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 274.5373949258472;
    if (ab1) {
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        double ld1 = 584.1968555207684;
        ab3 = ld0 < fd0;
        Thought lo2 = Thought60.getInstance(ab4, fb0, fb1, ab1);
        boolean lb3 = true;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad1 > ad2;
    boolean lb0 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad2 *= -1;
    Thought lo1 = Thought74.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought47.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
    ad1 = ad2 - ad3;
    boolean lb3 = false;
    Output.points[8][3] += ad4;
    Output.points[8][4] += fd0;
    Output.points[8][5] += fd1;
    fb0 = ad1 > ad2;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ab3 = !ab4;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(fb1, ab1, ab2, ab3);
}
        double ld0 = 799.8305880472273;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
        fd1 *= -1;
        ab2 = !ab3;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Output.points[8][6] -= ld0;
            Thought lo1 = Thought7.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
            }
        }
    boolean lb2 = true;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
    lb3 = ab1 || ab2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    Output.points[8][7] += fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 && fb0;
if(ao4 != null){
      ao4.m1();
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
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
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    double ld1 = 470.8476407331339;
    ad4 = fd0 - fd1;
    lb0 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, ad1);
}
    double ld3 = 734.3065588242579;
    fb0 = ad1 > ad2;
    if (fb1) {
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
}
        boolean lb4 = false;
        boolean lb5 = true;
        } else {
        boolean lb6 = true;
        Output.points[8][8] += ld3;
        double ld7 = 703.5744183985828;
        Thought lo8 = Thought0.getInstance(lb6, lb0, lb2, fb0);
        boolean lb9 = true;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fb0 = fo1.m2(ld3, ad1, ad2, ad3, fb1, lb6, lb9, lb0);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        lb2 = ad4 < fd0;
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
    Thought lo2 = Thought38.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    lb0 = lb1 || ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought53.getInstance();
    boolean lb1 = true;
    if (ab2) {
        ab3 = fd0 > fd1;
        double ld2 = 849.5808554596513;
        Output.points[0][0] -= ld2;
        ab4 = ad1 > ad2;
        fb0 = !fb1;
if(ao1 != null){
          ao1.m3(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
        boolean lb3 = false;
        boolean lb4 = false;
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
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo2 = Thought52.getInstance();
    Thought lo3 = Thought40.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    double ld0 = 315.4158504114067;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought31.getInstance(ab4, fb0, fb1, ab1);
    Output.points[0][1] -= fd1;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = ab4 && fb0;
    double ld2 = 194.63953172052615;
    fb1 = ab1 && ab2;
        double ld3 = 826.8300366568947;
    boolean lb4 = true;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m3(ld0, ld2, ld3, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb4;
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb5 = ab1 || ab2;

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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[0][2] -= fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    Output.points[0][3] += ad2;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    Output.points[0][4] -= ad3;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
    Output.points[0][5] -= fd0;
    Output.points[0][6] += fd1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ad1;
    double ld0 = 683.6059990139869;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

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
    fb0 = !fb1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
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
    if (fb0) {
        fb1 = ad1 > ad2;
        ad3 = ad4 - fd0;
if(ao1 != null){
          ao1.m2(fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        boolean lb1 = true;
if(ao2 != null){
          ao2.m1();
}
        if (lb0) {
            fd1 *= -1;
if(ao4 != null){
              ao3 = ao4.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
            fd0 = fd1 - ad1;
            Output.points[0][7] -= ad2;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
    ab1 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    double ld0 = 128.93319216752053;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    ab1 = ab2 || ab3;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    double ld2 = 612.8781338418545;
    double ld3 = 184.5446906796404;

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
    Thought lo0 = Thought35.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    boolean lb1 = false;
    ab1 = ab2 || ab3;
        boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    lb1 = !lb2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    fb0 = fb1 && lb1;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    Output.points[0][8] += ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb2 = ad3 > ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    Thought lo3 = Thought6.getInstance(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    double ld4 = 606.1937935596959;
    ad4 = fd0 - fd1;
    boolean lb5 = false;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    double ld0 = 802.2505318829404;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 336.4064057017505;
    ld1 *= -1;
    lb0 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    ab2 = fd1 > ld1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    fd1 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    double ld1 = 170.7998785453269;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 < ad3;
    Thought lo2 = Thought0.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    Thought lo3 = Thought58.getInstance(ad4, fd0, fd1, ld1);
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          fd1 = fo0.m3(ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        lb0 = ad4 < fd0;
        fb0 = !fb1;
        fd1 = ld1 - ad1;
        Thought lo4 = Thought99.getInstance(fo1, fo0, fo1, fo0);
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
        }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    double ld0 = 864.2503211658742;
    Output.points[1][0] += ad1;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    double ld1 = 517.1074737025555;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        Output.points[1][1] += ld1;
        boolean lb3 = false;
        ab2 = ab3 || ab4;
        fb0 = !fb1;
        lb3 = ad1 < ad2;
        lb2 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[1][2] += fd0;
        fd1 = ld0 + ld1;
        ab1 = ab2 || ab3;
        for(int i1=0; i1<10; i1++){
            ad1 = ad2 + ad3;
            Output.points[1][3] -= ad4;
            fd0 *= -1;
            Output.points[1][4] += fd1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought17.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    double ld1 = 538.1204886159782;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    Output.points[1][5] -= fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[1][6] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fb0 = ld1 > fd0;
    fb1 = !fb0;
        fb1 = fd1 > ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
        fd0 = fd1 + ad1;
    lb0 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    lb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    fb0 = fb1 || lb0;
    ad1 *= -1;
    Thought lo2 = Thought31.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ad4 = ao1.m3(lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    lb1 = !fb0;
    Thought lo3 = Thought83.getInstance(fd0, fd1, ad1, ad2, fb1, lb0, lb1, fb0);
    fb1 = lb0 && lb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb4 = true;
    Output.points[1][7] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, lb0, lb1, ab1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
        ab4 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = lb0 && lb1;
    lb2 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb2 = fd1 > fd0;

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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao2 != null){
      ab3 = ao2.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Output.points[1][8] -= ad4;
    fb1 = !lb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    Output.points[2][0] += fd1;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
        fd0 *= -1;
        fd1 = fd0 + fd1;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    double ld0 = 839.794851974574;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought40.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    ld0 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb2;
    lb3 = ab1 && ab2;
    Output.points[2][1] += fd1;
    ld0 = fd0 + fd1;
    boolean lb4 = true;
    ld0 = fd0 + fd1;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
    if (fb0) {
        Output.points[2][2] -= ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ad1;
        fb0 = ad2 < ad3;
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
        boolean lb0 = true;
        fb0 = fb1 && lb0;
        Output.points[2][3] -= ad3;
        fb0 = ad4 > fd0;
        } else {
        fd1 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fb1 = !fb0;
        fb1 = fd0 < fd1;
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
if(fo0 != null){
      fo0.m1(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    Output.points[2][4] -= fd0;
    if (ab1) {
        ab2 = fd1 < ad1;
        Thought lo1 = Thought9.getInstance(fo0, fo1, fo0, fo1);
        Thought lo2 = Thought84.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
        lb0 = !ab1;
        ab2 = fd1 > ad1;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
        } else if (ab3) {
        ab4 = fd1 < ad1;
        boolean lb3 = true;
        Thought lo4 = Thought73.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb3);
}
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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
        fb1 = !fb0;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    double ld0 = 580.756988317873;
    Output.points[2][5] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    boolean lb2 = true;
    lb1 = lb2 || fb0;
    fb1 = !lb1;
    lb2 = fb0 || fb1;
    double ld3 = 83.41235972328538;
    boolean lb4 = false;
    boolean lb5 = false;
    double ld6 = 515.1416167699239;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      ad1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought81.getInstance();
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
    Output.points[2][6] -= ad1;
    double ld2 = 235.7289168057695;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    fd1 *= -1;
    lb1 = fb0 && fb1;
if(ao3 != null){
      ld2 = ao3.m3(ad1, ad2, ad3, ad4);
}
    lb1 = fb0 || fb1;
    Thought lo3 = Thought36.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1);
    lb1 = !fb0;
    fb1 = ad2 > ad3;
    lb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = ad4 < fd0;
    boolean lb4 = true;
    fb0 = fd1 < ld2;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb1, lb4, fb0);
}
    if (fb1) {
        lb1 = lb4 || fb0;
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
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    Thought lo0 = Thought6.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    boolean lb1 = true;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = ad2 > ad3;
    Thought lo0 = Thought30.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    ab1 = !ab2;
    ab3 = ad2 > ad3;
    ad4 *= -1;
    ab4 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;

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
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought77.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;

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
    Thought lo0 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 635.4028924575261;
    Output.points[2][7] -= fd0;
    Thought lo2 = Thought91.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = true;
    lb4 = lb5 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb3, lb4, lb5, fb0);
}
    Output.points[2][8] -= fd0;
    fb1 = !lb3;
if(fo1 != null){
      lb4 = fo1.m2(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m3(lb5, fb0, fb1, lb3);
}
    boolean lb6 = true;
if(fo0 != null){
      lb4 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(fd1, ld1, fd0, fd1, lb5, lb6, fb0, fb1);
}
    ld1 = fd0 - fd1;
    lb3 = !lb4;

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[3][0] += fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    double ld0 = 158.40969254345615;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    double ld1 = 336.61524229795276;
    ld1 = fd0 - fd1;
    ld0 = ld1 + fd0;
    fb0 = fd1 > ld0;

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
