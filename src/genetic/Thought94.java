package genetic;
import java.util.ArrayList;
class Thought94 extends Thought{
private static ArrayList<Thought94> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 389.27912220447513;
private double fd1 = 116.40149538173958;
private Thought fo0 = null;
private Thought fo1 = null;
Thought94 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought94 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought94 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought94 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought94 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    Output.points[5][0] -= fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb0 = !fb0;
        fb1 = fd0 > fd1;
        lb1 = !lb0;
        boolean lb2 = false;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        Output.points[5][1] -= fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        lb0 = !fb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo3 = Thought137.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, lb2, lb0);
        Output.points[5][2] -= fd0;
        if (fb0) {
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb2, lb0);
}
            fb0 = fd1 < fd0;
if(fo1 != null){
              fo1.m2();
}
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
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[5][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 482.26714967335886;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[5][4] += fd1;
    fb1 = ab1 && ab2;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[5][5] -= fd0;
    fb0 = fd1 > ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        Thought lo0 = Thought175.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        Thought lo1 = Thought316.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fo1.m1();
}
    double ld0 = 391.1944905992458;
    Output.points[5][6] -= ld0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
    Thought lo3 = Thought232.getInstance(lb1, lb2, ab1, ab2);
    fd1 = ld0 + ad1;
    double ld4 = 85.86187909321754;
    Output.points[5][7] += ad1;

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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    fd1 *= -1;
    Output.points[5][8] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    Output.points[6][0] += fd1;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought43.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    fb0 = fd0 < fd1;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
        fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ad2 = ao1.m3();
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = ad4 > fd0;
    fb1 = lb0 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    lb0 = fd1 < ad1;

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
    double ld0 = 1000.3986301160522;
    fd0 *= -1;
    boolean lb1 = true;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ld0, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
    Output.points[6][1] += fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
    fd1 *= -1;
    lb2 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
if(ao3 != null){
      fd0 = ao3.m3(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    ab4 = fd1 > ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || lb1;
    fd1 *= -1;
    Thought lo4 = Thought70.getInstance(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
        Output.points[6][2] -= fd0;

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
    ab2 = ad1 > ad2;
    double ld0 = 776.9253892308387;
if(ao2 != null){
      ab3 = ao2.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    ab4 = fd1 < ld0;
    boolean lb2 = false;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    lb2 = ad2 < ad3;
    boolean lb3 = false;
    lb3 = !ab1;
    Thought lo4 = Thought370.getInstance();

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought79.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Thought lo2 = Thought260.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb3);
}
    fd0 = fd1 + fd0;
    double ld4 = 477.65420748173955;
    Thought lo5 = Thought238.getInstance(fb0, fb1, lb0, lb3);
    fd0 = fd1 - ld4;
    Thought lo6 = Thought258.getInstance(fo1, fo0, fo1, fo0);

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
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 293.77439940300616;
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;

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
    boolean lb0 = true;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    ad4 = fd0 + fd1;
    Output.points[6][3] -= ad1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][4] -= ad2;
    Output.points[6][5] -= ad3;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    lb0 = ad3 > ad4;
    double ld1 = 224.46031324748023;
    double ld2 = 501.59629991363545;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ld2, fb1, lb0, fb0, fb1);
}
    double ld3 = 452.08043747828924;

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
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought165.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    Thought lo1 = Thought306.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought363.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    Thought lo3 = Thought186.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb4 = true;
    boolean lb5 = false;
    boolean lb6 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought99.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    double ld3 = 439.7957282317583;
    Thought lo4 = Thought282.getInstance(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
    fd0 *= -1;
    fd1 = ld3 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
}
    Output.points[6][6] -= fd0;
    double ld5 = 146.79984235095205;
    lb2 = fd0 < fd1;
    boolean lb6 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb6, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, ld5, fd0, fd1, lb2, lb6, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb2, lb6, fb0);
}
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2);
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
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[6][7] += fd1;
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fd1 > ad1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 && fb0;

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
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = !fb0;
    Thought lo1 = Thought65.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || ab1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb2 = true;
    Thought lo3 = Thought371.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, lb2);
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld4 = 245.06861394787765;
    boolean lb5 = true;
if(ao3 != null){
      ab3 = ao3.m2(fd0, fd1, ld4, fd0);
}
    Thought lo6 = Thought165.getInstance(ao4, fo0, fo1, ao1, fd1, ld4, fd0, fd1);
    Thought lo7 = Thought288.getInstance(ld4, fd0, fd1, ld4, ab4, fb0, fb1, lb0);
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, lb2, lb5, ab1, ab2);
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
if(ao1 != null){
      ao1.m3();
}
    ab1 = !ab2;
    ab3 = !ab4;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1);
}
    ab2 = !ab3;
    Output.points[6][8] -= ad1;
    ab4 = fb0 || fb1;
    ab1 = ad2 < ad3;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought261.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought253.getInstance();
    boolean lb2 = false;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);
}
    lb2 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, fb0, fb1);
}
    double ld3 = 635.9164063429879;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = fb0 && fb1;
    Thought lo4 = Thought348.getInstance(ld3, fd0, fd1, ld3);
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    lb2 = !fb0;
    fb1 = lb2 && fb0;
    Output.points[7][0] -= fd1;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0, fb1, lb2, fb0, fb1);
}
    double ld5 = 574.2125778472755;
    Output.points[7][1] -= fd0;

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
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        lb0 = ab1 && ab2;
        Thought lo1 = Thought83.getInstance();
        double ld2 = 730.241677146947;
        ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, ab1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought26.getInstance();
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    fd0 = fd1 - ad1;
    lb0 = lb2 || fb0;
    double ld3 = 607.9154165913485;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb4 = false;
    ad1 *= -1;
    lb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    lb2 = lb4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ld3, ad1, ad2, ad3);
}
    ad4 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 > ad2;
    ab2 = ab3 && ab4;
    Output.points[7][2] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought339.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[7][3] += fd1;
    fd0 *= -1;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao1 != null){
      lb2 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    lb3 = !fb0;
    fd1 = fd0 - fd1;
    boolean lb4 = true;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = !lb1;
    Output.points[7][4] -= fd0;
    double ld5 = 345.89596634284663;
    Output.points[7][5] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld5, fd0, fd1, lb2, lb3, lb4, fb0);
}
    ld5 *= -1;
    fd0 = fd1 + ld5;
if(ao3 != null){
      fb1 = ao3.m2(lb1, lb2, lb3, lb4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m1(fd0, fd1, ld5, fd0);
}
    boolean lb6 = true;
    fb0 = fb1 && lb1;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld5, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ld5, fd0, fd1, ld5, lb3, lb4, lb6, fb0);
}
    boolean lb7 = false;

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
    double ld0 = 56.18454003535201;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    double ld1 = 339.7653090483099;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = ld0 < ld1;
    Thought lo2 = Thought328.getInstance();
    double ld3 = 3.7287096123042405;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fd1 *= -1;
    Thought lo4 = Thought172.getInstance(fb1, fb0, fb1, fb0);
    ld0 *= -1;
    ld1 = ld3 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld3, ad1, ad2);
}
    Output.points[7][6] += ad3;
    Thought lo5 = Thought123.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    Output.points[7][7] += fd0;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    double ld1 = 153.7069145258449;
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ld1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought203.getInstance(fd1, ld1, fd0, fd1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = ld1 - fd0;
    Thought lo3 = Thought74.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
    Thought lo4 = Thought304.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld5 = 240.88537710532387;
    Thought lo6 = Thought136.getInstance(fb0, fb1, lb0, ab1);
    double ld7 = 719.4325669583288;
    ab2 = !ab3;
    ld1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab4 = ao2.m2(ld5, ld7, fd0, fd1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    double ld0 = 640.2239686495354;
    ab2 = ad3 > ad4;
    Output.points[7][8] -= fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3();
}
        fb1 = ab1 || ab2;
    boolean lb1 = true;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb1, ab1, ab2, ab3);
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
Thought m4() throws CountDownExc {
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
    Thought lo0 = Thought240.getInstance(fd1, fd0, fd1, fd0);
    Output.points[8][0] -= fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    Output.points[8][1] += fd0;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    lb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought297.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2();
}
    fd0 *= -1;
    lb1 = lb2 && fb0;
    double ld4 = 710.3773069411568;
    Output.points[8][2] += fd0;
    boolean lb5 = false;
    fb0 = fb1 || lb1;
    boolean lb6 = true;

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
    ab2 = ab3 || ab4;
    double ld0 = 451.89093013212994;
    double ld1 = 397.0414246696622;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    double ld2 = 904.031890204561;
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
    ld0 = ld1 + ld2;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = ld2 + fd0;
    ab3 = fd1 < ld0;
    Output.points[8][3] += ld1;
    double ld3 = 580.5357355126807;
    Thought lo4 = Thought200.getInstance(ld2, ld3, fd0, fd1);
    boolean lb5 = false;
    ab3 = ab4 || fb0;
    fb1 = ld0 > ld1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    double ld2 = 536.8103249142443;
    Output.points[8][4] -= fd0;
    if (lb1) {
        Output.points[8][5] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
        double ld3 = 336.21947816084474;
        ld3 = ld2 - ad1;
        if (fb0) {
            ad2 *= -1;
            boolean lb4 = true;
            fb0 = fb1 && lb4;
            ad3 = ad4 + fd0;
if(fo0 != null){
              fo1 = fo0.m4();
}
            lb0 = fd1 < ld3;
            double ld5 = 374.92660805928506;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought396.getInstance(ab1, ab2, ab3, ab4);
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    ab4 = fd1 < ad1;
    double ld2 = 734.2522865539171;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
    ab4 = fb0 && fb1;

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
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    Thought lo3 = Thought146.getInstance();
    fd0 = fd1 - fd0;
    lb1 = fd1 > fd0;
    lb2 = fb0 || fb1;
    boolean lb4 = true;
    lb0 = !lb1;
    lb2 = fd1 < fd0;
    fd1 *= -1;
    lb4 = fd0 > fd1;
    fd0 = fd1 - fd0;

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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd1 = ad1 + ad2;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought373.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought396.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 || fb0;
        double ld2 = 328.67776094046155;
    Output.points[8][6] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    ab2 = !ab3;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    Output.points[8][7] -= fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        ab1 = !ab2;
        }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld0 = 699.0217424707743;
    double ld1 = 63.59504691547458;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
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
    double ld0 = 729.4093162297272;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    ld0 = ad1 - ad2;
    fb0 = !fb1;
    ab1 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb1 = true;
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        Output.points[8][8] += ad2;
        boolean lb2 = false;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ab4 = ld0 > ad1;
        boolean lb3 = false;
        ab4 = ad2 > ad3;
        }
    ad4 = fd0 - fd1;
    lb1 = ab1 && ab2;

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
    double ld0 = 337.99527961766194;
    Thought lo1 = Thought58.getInstance(fb1, fb0, fb1, fb0);
    Output.points[0][0] -= ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought135.getInstance(fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = fb0 && fb1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought0.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Thought lo4 = Thought316.getInstance();
    fb1 = fd0 < fd1;
    double ld5 = 436.31003978049654;
    fb0 = ld0 > ld5;
    boolean lb6 = false;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld0, fb0, fb1, lb6, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb6, fb0, fb1);
}
    lb6 = fb0 || fb1;
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb6 = !fb0;
    double ld7 = 806.5711871013956;
    fb1 = ld7 < fd0;
    lb6 = fb0 || fb1;
    boolean lb8 = false;

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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = !lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 719.5116508678592;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought236.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fb1 = lb0 && fb0;
if(fo0 != null){
          fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;

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
    Thought lo1 = Thought135.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    Output.points[0][1] -= fd1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought193.getInstance();
        fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    Output.points[0][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought244.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought208.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    Thought lo5 = Thought383.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);

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
