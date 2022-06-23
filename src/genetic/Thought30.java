package genetic;
import java.util.ArrayList;
class Thought30 extends Thought{
private static ArrayList<Thought30> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 141.58930887580314;
private double fd1 = 377.3732275032441;
private Thought fo0 = null;
private Thought fo1 = null;
Thought30 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought30 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought30 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    double ld0 = 350.6552614992785;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ld0 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0);
    Output.points[8][2] -= ld0;
    double ld2 = 380.5381518907863;
    Output.points[8][3] -= ld2;

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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    double ld1 = 589.8716931224907;
    Thought lo2 = Thought98.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
    double ld3 = 31.70014947031139;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    ab4 = fd1 > ld1;
    ld3 = fd0 - fd1;
    fb0 = fb1 && lb0;
    ld1 = ld3 + fd0;
    lb4 = fd1 < ld1;
    boolean lb5 = true;
if(fo0 != null){
      fo0.m3(ld3, fd0, fd1, ld1);
}
    ld3 = fd0 - fd1;
    ld1 = ld3 + fd0;

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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    Thought lo0 = Thought38.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    fb1 = lb1 && fb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = lb1 || fb0;
    boolean lb2 = true;
    double ld3 = 708.2297473251168;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    boolean lb4 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = ld3 + ad1;
    Output.points[8][4] += ad2;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, lb4, lb5, fb0, fb1);
}
    boolean lb6 = true;
    Thought lo7 = Thought30.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, lb1, lb2, lb4, lb5);
}
    boolean lb8 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb6, lb8, fb0, fb1);
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
    ab1 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
        double ld0 = 954.6306250267178;
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = true;
    ad4 *= -1;
    lb2 = !lb3;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1, lb1, lb2, lb3, ab1);
}
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    fb1 = ld0 < ad1;
    double ld4 = 832.3945694372453;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought79.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, lb2, lb3, ab1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb6 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    Thought lo3 = Thought1.getInstance(fo0, fo1, ao1, ao2, lb1, lb2, fb0, fb1);
    lb0 = fd1 > fd0;

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
    boolean lb0 = true;
    double ld1 = 212.89273786853357;
    double ld2 = 415.05700989856;
if(ao1 != null){
      ld2 = ao1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld1;
    double ld3 = 810.0637683819303;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld2, ld3, ad1, ad2);
}
    Output.points[8][5] -= ad3;
    double ld4 = 621.9416500444718;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    Thought lo5 = Thought81.getInstance();
    fb1 = ad3 > ad4;
if(ao3 != null){
      ao3.m1(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    ld3 = ld4 - ad1;

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
    Thought lo0 = Thought53.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = !ab1;
    ab2 = ab3 && ab4;
    fd0 *= -1;
    fb0 = fb1 && lb1;
    fd1 *= -1;
    ab1 = fd0 < fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    Output.points[8][6] += fd1;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo3 = Thought4.getInstance(ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m1();
}
    Thought lo4 = Thought27.getInstance(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    if (ab4) {
        boolean lb5 = true;
        boolean lb6 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fd1 = fd0 + fd1;
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
    ab1 = fd1 < ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(ao3 != null){
      ad4 = ao3.m3();
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[8][7] -= ad1;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb1, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb1, lb2, ab1);
}
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;

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
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought19.getInstance();
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    double ld1 = 641.0580621190267;
    fb0 = ld1 > fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld1);
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
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        ab2 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
        boolean lb0 = false;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo1 = Thought68.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
        fb0 = fb1 || lb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab1 = fd0 < fd1;
        ab2 = !ab3;
        ab4 = fb0 || fb1;
        Output.points[8][8] += fd0;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
        ab2 = fd0 < fd1;
        boolean lb2 = false;
        Thought lo3 = Thought86.getInstance(fd0, fd1, fd0, fd1);
        ab2 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(ab3, ab4, fb0, fb1);
}
        Thought lo4 = Thought85.getInstance();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad1 = ad2 + ad3;
    Thought lo0 = Thought18.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    double ld1 = 752.7149774287681;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    Output.points[0][0] -= ad1;
    Thought lo3 = Thought94.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
    fb1 = lb2 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    double ld4 = 603.1500509576844;
    Thought lo5 = Thought76.getInstance(ld1, ld4, ad1, ad2);
    Output.points[0][1] += ad3;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    boolean lb6 = true;
    ld4 *= -1;
        boolean lb7 = false;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld8 = 439.17945942622026;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3();
}
}
Thought.STACK_COUNTER++;
return lb6;
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
    double ld0 = 126.22435324846651;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
    Thought lo1 = Thought32.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    ad4 = fd0 - fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        ab1 = !ab2;
    ld0 = ad1 + ad2;
    Output.points[0][2] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
    fd0 *= -1;
    double ld2 = 149.00662105799972;
    ab3 = !ab4;
    fd0 *= -1;
    fb0 = fb1 && ab1;

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
    double ld0 = 388.92082181363025;
    fb0 = fd0 > fd1;
    double ld1 = 626.1846857341236;
if(ao1 != null){
      ao1.m2(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 = ld1 + fd0;
    if (fb1) {
        fd1 *= -1;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ld0 = ld1 - fd0;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < ld0;
if(ao1 != null){
          fo1 = ao1.m4(ld1, fd0, fd1, ld0);
}
        Thought lo2 = Thought42.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0);
        Thought lo3 = Thought41.getInstance(fb0, fb1, fb0, fb1);
        boolean lb4 = true;
        Thought lo5 = Thought4.getInstance();
        boolean lb6 = true;
        ld1 *= -1;
        Thought lo7 = Thought20.getInstance(fd0, fd1, ld0, ld1, lb4, lb6, fb0, fb1);
        lb4 = fd0 > fd1;
if(fo1 != null){
          ld0 = fo1.m3(ao1, ao2, ao3, ao4);
}
        } else {
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
    fb0 = fb1 && fb0;
    ad2 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought74.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    Thought lo3 = Thought34.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
if(ao4 != null){
      fd1 = ao4.m3(fb1, lb1, lb2, fb0);
}
    Thought lo4 = Thought42.getInstance();
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, lb1, lb2, fb0);
}
    fb1 = fd1 < ad1;
    boolean lb5 = true;
    double ld6 = 37.279211994877485;
    Thought lo7 = Thought42.getInstance(fo1, ao1, ao2, ao3);
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ld6 = ad1 + ad2;
    lb1 = ad3 < ad4;
    lb2 = !lb5;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld6, ad1, fb1, lb1, lb2, lb5);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld6, ad1, ad2);
}
    double ld8 = 487.840116000474;

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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
        Thought lo0 = Thought20.getInstance(ab3, ab4, fb0, fb1);
    fd0 *= -1;
    boolean lb1 = true;
    double ld2 = 979.8928218166354;
    fd0 *= -1;
if(ao1 != null){
      lb1 = ao1.m2();
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    boolean lb3 = false;
    Thought lo4 = Thought17.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    double ld5 = 64.19191973410095;
    boolean lb6 = false;
    lb1 = fd0 > fd1;
    ld2 = ld5 + fd0;
    Thought lo7 = Thought46.getInstance(ao1, ao2, ao3, ao4, lb3, lb6, ab1, ab2);
    boolean lb8 = false;
if(fo0 != null){
      ab2 = fo0.m2(fd1, ld2, ld5, fd0);
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo0 = Thought43.getInstance();
if(ao3 != null){
      ab2 = ao3.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ad4 = fd0 + fd1;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought9.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    double ld1 = 674.2043053787521;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought31.getInstance(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
        fb1 = fd1 > ld1;
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
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
        ab4 = fb0 || fb1;
        lb0 = ab1 || ab2;
if(fo1 != null){
          ab3 = fo1.m2(fd0, fd1, fd0, fd1);
}
        ab4 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fb0 = !fb1;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
            boolean lb1 = true;
            lb1 = fd1 < fd0;
            lb0 = ab1 && ab2;
if(fo1 != null){
              fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              fo0.m1();
}
            for(int i2=0; i2<10; i2++){
                double ld2 = 448.12831839614637;
                boolean lb3 = false;
if(fo0 != null){
                  fo1 = fo0.m4(fd0, fd1, ld2, fd0, lb3, lb1, lb0, ab1);
}
                ab2 = !ab3;
                Thought lo4 = Thought5.getInstance(fo1, fo0, fo1, fo0);
                fd1 = ld2 + fd0;
if(fo1 != null){
                  fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb0, ab1, ab2);
}
                boolean lb5 = true;
}}}
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[0][3] += ad4;
    fb0 = fd0 > fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    Output.points[0][4] += ad2;
    lb0 = lb1 && fb0;
    double ld2 = 1000.2872937481885;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Output.points[0][5] += ld2;

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
    ab2 = ad1 > ad2;
    boolean lb0 = true;
    double ld1 = 119.59083383599527;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought23.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb0 = ab1 || ab2;
    ab3 = ad2 < ad3;
    ab4 = fb0 && fb1;
    lb0 = ad4 < fd0;
    fd1 = ld1 + ad1;
    Thought lo3 = Thought37.getInstance();
    ad2 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
        Output.points[0][6] += fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[0][7] += fd1;
    fb0 = fd0 < fd1;
    Output.points[0][8] += fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 243.4807399393168;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
    fd1 *= -1;
    Output.points[1][0] += ld0;
    boolean lb1 = true;

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
    double ld0 = 971.9638999260293;
    boolean lb1 = true;
    ld0 = ad1 + ad2;
    fb0 = ad3 > ad4;
    Thought lo2 = Thought42.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, fb0, fb1);
}
    boolean lb3 = false;
    ad2 = ad3 + ad4;
    if (lb1) {
        double ld4 = 497.7557970685059;
        boolean lb5 = true;
if(ao2 != null){
          ao2.m1();
}
        boolean lb6 = false;
        ad4 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(ld4, ld0, ad1, ad2, lb6, lb1, lb3, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb1 = ad3 < ad4;
if(fo0 != null){
          lb5 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld4, ld0, lb6, lb1, lb3, fb0);
}
        ad1 *= -1;
        fb1 = lb5 && lb6;
        Thought lo7 = Thought2.getInstance(ao4, fo0, fo1, ao1, lb1, lb3, fb0, fb1);
        boolean lb8 = true;
        lb5 = lb6 || lb8;
if(ao2 != null){
          ao2.m1(ad2, ad3, ad4, fd0);
}
        fd1 = ld4 - ld0;
        lb1 = ad1 < ad2;
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
    Output.points[1][1] -= fd1;
    Thought lo0 = Thought55.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought54.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    double ld2 = 3.469083268058945;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0);
}
    fb0 = fb1 && ab1;
    double ld3 = 613.2735053650763;
    Output.points[1][2] -= fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ld2, ld3, fd0);
}
    Output.points[1][3] -= fd1;
    ld2 *= -1;
    ab2 = ld3 > fd0;
    ab3 = !ab4;
        if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        ld2 *= -1;
        Output.points[1][4] += ld3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab2 = ad2 > ad3;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab3 = !ab4;
        fb0 = fb1 && ab1;
        ab2 = ab3 || ab4;
        ad4 = fd0 + fd1;
if(ao3 != null){
          fb0 = ao3.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
        Thought lo0 = Thought41.getInstance(ao4, fo0, fo1, ao1);
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        ad3 = ad4 + fd0;
        fd1 *= -1;
        lb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
        Thought lo2 = Thought30.getInstance(ao2, ao3, ao4, fo0, fb1, lb1, ab1, ab2);
        Output.points[1][5] -= ad1;
        boolean lb3 = true;
        Thought lo4 = Thought17.getInstance(ad2, ad3, ad4, fd0);
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought35.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought43.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);

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
    double ld0 = 904.4815607516497;
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    Thought lo2 = Thought44.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb0) {
        fb1 = lb1 && ab1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb3 = true;
        boolean lb4 = true;
        ab4 = fb0 && fb1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo5 = Thought74.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb3, lb4, lb1, ab1);
        double ld6 = 367.945230429173;
        Output.points[1][6] -= ld0;
        boolean lb7 = false;
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    fb1 = !fb0;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    ad4 = fd0 + fd1;
    lb0 = !fb0;
    double ld1 = 271.2351803594732;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3();
}
    if (fb0) {
        fb1 = lb0 || fb0;
        ad4 *= -1;
        fd0 = fd1 - ld1;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Thought lo2 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
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
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        Thought lo0 = Thought87.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        boolean lb1 = true;
        double ld2 = 810.7326950212315;
        fd0 = fd1 + ld2;
        boolean lb3 = false;
        boolean lb4 = true;
        ab2 = ad1 > ad2;
        ad3 = ad4 - fd0;
        Thought lo5 = Thought29.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;

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
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 < fd1;
    if (fb1) {
        double ld0 = 777.865708295815;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fb1 = fo0.m2(ld0, fd0, fd1, ld0);
}
        fb0 = !fb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
        fb0 = fd1 < ld0;
        fb1 = fd0 < fd1;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    Output.points[1][7] += ad3;
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            fb0 = !fb1;
if(ao4 != null){
              ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
            Output.points[1][8] += fd1;
            Thought lo0 = Thought96.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}}
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
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = !fb1;
    Output.points[2][0] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 551.5538593753826;
    fd0 = fd1 + ld0;
    boolean lb1 = true;
    ab4 = !fb0;
    Thought lo2 = Thought72.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
}
    fd1 = ld0 - fd0;
    ab3 = fd1 > ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought36.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
        ab1 = fd1 < ld0;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        Thought lo4 = Thought11.getInstance(ld0, fd0, fd1, ld0);
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
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
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    double ld0 = 908.7857750698531;
    ad3 *= -1;
    ad4 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 = fd1 - ld0;
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought82.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = lb1 && ab1;
    ab2 = ab3 && ab4;
    ld0 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || lb1;

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
    fd0 *= -1;
    Thought lo0 = Thought63.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 365.39420145320105;
    fd0 = fd1 - ld1;
    Output.points[2][1] -= fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld2 = 498.00327133268036;
    ld1 = ld2 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ld1 - ld2;
    Thought lo3 = Thought43.getInstance(fd0, fd1, ld1, ld2);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0);
}
    fb0 = fd1 > ld1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      ld2 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb4 = true;
    fd0 = fd1 - ld1;
    Output.points[2][2] -= ld2;
    lb4 = fd0 > fd1;
    fb0 = fb1 && lb4;
    fb0 = ld1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd0 = fd1 + ld1;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld1, fb0, fb1, lb4, lb5);
}
    boolean lb6 = false;

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
    Output.points[2][3] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 762.2872859872513;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
    double ld1 = 158.07158134495393;
    fb1 = fd0 < fd1;
    double ld2 = 337.77549111326965;
    fb0 = !fb1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    Output.points[2][4] += ld0;
    fb0 = fb1 && fb0;
    fb1 = ld1 > ld2;
    fb0 = fd0 < fd1;
    ld0 = ld1 + ld2;
    boolean lb3 = false;
    boolean lb4 = true;
    Output.points[2][5] -= fd0;
    boolean lb5 = false;

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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[2][6] += fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && lb1;
    Output.points[2][7] += fd0;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    lb2 = fd1 > fd0;
    double ld3 = 732.4065711353131;
    boolean lb4 = true;
    boolean lb5 = false;

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
