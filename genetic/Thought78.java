package genetic;
import java.util.ArrayList;
class Thought78 extends Thought{
private static ArrayList<Thought78> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 975.6524752421336;
private double fd1 = 827.5690581488826;
private Thought fo0 = null;
private Thought fo1 = null;
Thought78 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought78 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought78 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought78 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought78 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 243.80230562641415;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    double ld2 = 901.7101978995622;
if(fo0 != null){
      ld2 = fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Output.points[8][7] -= ld0;
        Thought lo3 = Thought61.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
    fb0 = ld0 > ld2;
    fd0 = fd1 + ld0;

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
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought45.getInstance(fd1, fd0, fd1, fd0);
    fb1 = !ab1;
    double ld1 = 861.0792638486456;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    ab2 = ab3 || ab4;
    fd1 = ld1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[8][8] -= ld1;
if(fo1 != null){
          fo1.m3();
}
        ab2 = fd0 > fd1;
        ld1 = fd0 + fd1;
        ab3 = ab4 || fb0;
        boolean lb3 = false;
        boolean lb4 = true;
        Output.points[0][0] += ld1;
        Output.points[0][1] -= fd0;
        Thought lo5 = Thought10.getInstance(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb3);
        lb4 = ld1 < fd0;
        Output.points[0][2] -= fd1;
        lb2 = ab1 && ab2;
        ab3 = !ab4;
        ld1 *= -1;
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
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[0][3] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    Thought lo0 = Thought71.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought5.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    double ld2 = 32.14534934308367;
    Thought lo3 = Thought23.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;

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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = ad2 > ad3;
    boolean lb2 = true;
    lb1 = lb2 || ab1;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
        ab2 = ab3 && ab4;
        ad1 = ad2 + ad3;
        boolean lb3 = false;
        ad4 = fd0 + fd1;
        ab4 = ad1 < ad2;
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
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Output.points[0][4] += fd1;
    boolean lb0 = false;
    Thought lo1 = Thought87.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    Output.points[0][5] += ad2;
    Output.points[0][6] += ad3;
    double ld1 = 606.7152525478924;
    double ld2 = 21.14688370643552;
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb0;
    double ld3 = 573.6060206036384;
    fb0 = !fb1;
    Output.points[0][7] -= ad4;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    Thought lo4 = Thought7.getInstance(ld1, ld2, ld3, ad1);
    ad2 *= -1;
    fb1 = ad3 < ad4;
    lb0 = fb0 || fb1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld2);
}
    Output.points[0][8] += ld3;
    ad1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    Output.points[1][0] -= ad2;
    ad3 = ad4 + fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2();
}
    fd0 = fd1 + fd0;
    double ld0 = 206.45325079282242;
    fd0 = fd1 - ld0;
    ab2 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        Output.points[1][1] += ld0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ld0 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb1 = fd1 > ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        ab4 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
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
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought59.getInstance(ab2, ab3, ab4, fb0);
if(ao4 != null){
      fb1 = ao4.m2();
}
        boolean lb1 = false;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
    ab1 = fd0 > fd1;
    double ld2 = 964.1101536169971;
    for(int i0=0; i0<10; i0++){
        ab2 = ld2 < ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        boolean lb3 = false;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld2, ad1, ad2);
}
if(ao1 != null){
          fo1 = ao1.m4(lb3, lb1, ab1, ab2);
}
        ab3 = ad3 < ad4;
        ab4 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4();
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    Thought lo0 = Thought73.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = !fb0;
if(fo1 != null){
      fo1.m1(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    Output.points[1][2] -= fd0;
        boolean lb2 = false;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    boolean lb3 = true;
    double ld4 = 534.9147872278679;
    lb2 = fd0 < fd1;
    lb3 = ld4 > fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = ab1 && ab2;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd0 < fd1;
    fd0 *= -1;
    Thought lo1 = Thought19.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought31.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    ab4 = !fb0;
    Output.points[1][3] -= fd1;
    Output.points[1][4] += fd0;
    Thought lo3 = Thought33.getInstance(fb1, lb0, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 527.4271861155977;
    ad1 *= -1;
    boolean lb1 = true;
    lb1 = !fb0;
    Output.points[1][5] -= ad2;
    Output.points[1][6] += ad3;
    Output.points[1][7] += ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
}
        }
    Thought lo2 = Thought31.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought84.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    Thought lo4 = Thought41.getInstance(ld0, ad1, ad2, ad3);
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
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
    ab2 = !ab3;
    ad2 *= -1;
    Output.points[1][8] -= ad3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 *= -1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 105.27106299074741;
    Output.points[2][0] += ad2;

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
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fd1 < fd0;
    fd1 *= -1;
    Output.points[2][1] -= fd0;
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought13.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Thought lo3 = Thought73.getInstance(fb1, lb0, lb1, fb0);
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = fd1 < fd0;
    boolean lb4 = true;
    Thought lo5 = Thought52.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, lb1, lb4, fb0);
    fb1 = lb0 || lb1;
if(ao2 != null){
      lb4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb6 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(lb4, lb6, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Output.points[2][2] += fd0;
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb0 = ad3 > ad4;
    Thought lo1 = Thought86.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    boolean lb2 = false;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb2, lb3, fb0);
}
    ad3 *= -1;
    boolean lb4 = false;
    Thought lo5 = Thought40.getInstance(ad4, fd0, fd1, ad1);
    double ld6 = 245.61489019961408;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld6);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, lb3);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    lb4 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4();
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
    Thought lo0 = Thought99.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 < fd1;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Output.points[2][3] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought16.getInstance(fd1, fd0, fd1, fd0);
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
    boolean lb3 = false;
    if (ab2) {
        Thought lo4 = Thought69.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
if(ao4 != null){
          ao4.m1(ab3, ab4, fb0, fb1);
}
        } else if (lb1) {
if(fo0 != null){
          fo0.m3();
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        lb3 = fd1 > fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        fd0 = fd1 + fd0;
        } else if (fb0) {
        fd1 = fd0 - fd1;
        boolean lb5 = true;
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
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
    Output.points[2][4] -= ad3;
    Thought lo1 = Thought24.getInstance(ad4, fd0, fd1, ad1);
    double ld2 = 900.9664481231374;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[2][5] += fd0;
    Thought lo3 = Thought49.getInstance(fd1, ld2, ad1, ad2, ab3, ab4, fb0, fb1);
    if (lb0) {
        boolean lb4 = true;
        ad3 = ad4 + fd0;
        lb0 = fd1 > ld2;
        ad1 *= -1;
        ab1 = ad2 < ad3;
        ad4 = fd0 - fd1;
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Thought lo5 = Thought33.getInstance(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb4, lb0, ab1, ab2);
}
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ld2);
}
        ab3 = !ab4;
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
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        boolean lb0 = true;
        if (lb0) {
            fd0 *= -1;
            fb0 = !fb1;
if(fo1 != null){
              fo0 = fo1.m4();
}
            Thought lo1 = Thought19.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
            fb0 = fb1 || lb0;
            fb0 = !fb1;
if(fo0 != null){
              lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
            double ld2 = 943.0105069073863;
            fb0 = fd0 < fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
              fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
            ld2 = fd0 - fd1;
            ld2 = fd0 - fd1;
            ld2 *= -1;
            fb0 = !fb1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
            double ld3 = 739.088268113585;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Output.points[2][6] -= fd1;
    Output.points[2][7] -= fd0;
    Output.points[2][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
        lb0 = fd0 > fd1;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought50.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    Output.points[3][0] -= fd1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    boolean lb3 = true;

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
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[3][1] -= fd1;
    boolean lb1 = true;
    lb0 = ad1 > ad2;
    Thought lo2 = Thought51.getInstance(lb1, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[3][2] += ad3;
    lb1 = ad4 < fd0;

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[3][3] -= ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    double ld0 = 807.127889165734;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    fd1 = ld0 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    boolean lb2 = false;
    Thought lo3 = Thought36.getInstance(fd0, fd1, ld0, ad1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld4 = 807.7473627295049;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
        ld4 = ad1 + ad2;
    Thought lo5 = Thought93.getInstance(lb1, lb2, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    Output.points[3][4] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    double ld0 = 519.027712747902;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 28.955523349948063;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld0, ld1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
    boolean lb2 = true;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb2);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    double ld3 = 201.17701261485828;
    fd0 *= -1;
    Thought lo4 = Thought23.getInstance(fd1, ld0, ld1, ld3, fb1, lb2, fb0, fb1);
    Thought lo5 = Thought99.getInstance(ao4, fo0, fo1, ao1);
    fd0 = fd1 - ld0;
    Thought lo6 = Thought17.getInstance(ao2, ao3, ao4, fo0, ld1, ld3, fd0, fd1, lb2, fb0, fb1, lb2);
    Thought lo7 = Thought16.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb2, fb0);
if(ao4 != null){
      ao4.m3(ld0, ld1, ld3, fd0);
}
    fd1 *= -1;
    ld0 *= -1;
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld3, fd0, fd1);
}
    Thought lo8 = Thought87.getInstance(fb0, fb1, lb2, fb0);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2();
}
    boolean lb0 = false;
    double ld1 = 242.16506837621856;
    Thought lo2 = Thought56.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;
    ld1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = lb4 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, lb3, lb4);
}
    ld1 *= -1;
    Thought lo5 = Thought48.getInstance(ad1, ad2, ad3, ad4);
    double ld6 = 240.14695401610615;
    ad4 *= -1;
    fb0 = fb1 || lb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld6);
}
    Thought lo7 = Thought5.getInstance(lb3, lb4, fb0, fb1);
    lb0 = !lb3;

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
        ab1 = fd1 < fd0;
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2();
}
    ab3 = ab4 || fb0;
    Thought lo2 = Thought24.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld3 = 21.935809331513322;
    double ld4 = 433.26501182884726;
    boolean lb5 = true;
    Output.points[3][5] += ld4;
    Output.points[3][6] += fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld3, ld4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb6 = true;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    boolean lb7 = false;
if(ao2 != null){
      lb1 = ao2.m2(ld3, ld4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ld4, fd0, fd1);
}
    lb5 = !lb6;
    lb7 = ab1 || ab2;
    ab3 = ld3 > ld4;
    fd0 *= -1;
    boolean lb8 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
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
    ab1 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = ad3 > ad4;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = ad1 < ad2;
    Output.points[3][7] -= ad3;
if(ao1 != null){
          ab2 = ao1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
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
        fb0 = fd1 > fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2();
}
    lb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        boolean lb1 = false;
        fd1 = fd0 - fd1;
        lb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb0);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought60.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb1, lb0);
}
        Thought lo3 = Thought50.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        }
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
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
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        lb0 = fd1 < fd0;
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought1.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m3();
}
    Thought lo2 = Thought14.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = fd1 > fd0;

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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 797.5495350871455;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - ad1;
    Output.points[3][8] += ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad4 < fd0;
    double ld1 = 347.9925125116988;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fb0 = fd0 < fd1;
    double ld3 = 744.244688444835;
    Output.points[4][0] += ld0;
    ld1 = ld3 + ad1;
    if (fb1) {
        lb2 = fb0 || fb1;
        lb2 = ad2 > ad3;
        fb0 = !fb1;
        lb2 = !fb0;
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
    ad1 = ad2 + ad3;
    double ld0 = 500.11277247375403;
    Thought lo1 = Thought70.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought55.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb2);
    double ld4 = 22.456595996081205;
    ad3 = ad4 + fd0;
    Thought lo5 = Thought68.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb2;

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
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought62.getInstance(fd0, fd1, fd0, fd1);
    double ld2 = 953.2598239450791;
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
    fb0 = !fb1;
    lb0 = fd1 > ld2;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought1.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
    double ld4 = 342.5991713940544;
    Thought lo5 = Thought77.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
    Thought lo6 = Thought19.getInstance(ld2, ld4, fd0, fd1);
    Thought lo7 = Thought24.getInstance(fo0, fo1, ao1, ao2, ld2, ld4, fd0, fd1);
if(ao3 != null){
      ao3.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = ld2 < ld4;
    Thought lo8 = Thought39.getInstance(fd0, fd1, ld2, ld4, fb1, lb0, fb0, fb1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    Output.points[4][1] -= ad1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    Output.points[4][2] -= ad1;
    boolean lb1 = true;
    ad2 *= -1;
    ad3 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    lb2 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought75.getInstance(lb0, lb1, lb2, fb0);
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb5 = true;
    Output.points[4][3] -= fd1;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[4][4] += fd0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    lb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought3.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought40.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(fb1, lb0, lb1, ab1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    ab2 = fd1 < fd0;
    boolean lb4 = false;

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
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[4][5] -= fd1;
    Thought lo0 = Thought11.getInstance(ao3, ao4, fo0, fo1);
    Thought lo1 = Thought8.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    Thought lo2 = Thought71.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    fd1 = ad1 - ad2;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    lb3 = ad1 > ad2;
    ab1 = ab2 || ab3;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    Output.points[4][6] -= ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb3);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    double ld0 = 899.5870473845165;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld1 = 351.45546186529333;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb2);
}
    boolean lb4 = true;
    lb3 = lb4 || fb0;
    fb1 = !lb2;
    Output.points[4][7] += ld1;
    Output.points[4][8] -= fd0;
    Output.points[5][0] += fd1;

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
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    double ld0 = 161.9353016720358;
    boolean lb1 = false;
    lb1 = ld0 > fd0;
    fb0 = fd1 < ld0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    lb1 = !lb2;
    boolean lb3 = false;
if(fo0 != null){
          fo0.m1(ld0, fd0, fd1, ld0, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, lb2, lb3, fb0, fb1);
}
    lb1 = lb2 && lb3;
    Thought lo4 = Thought78.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
    Output.points[5][1] += ld0;
    fd0 *= -1;

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
    fd0 = fd1 + fd0;
    double ld0 = 992.840337439993;
    Thought lo1 = Thought39.getInstance(fd0, fd1, ld0, fd0);
    Output.points[5][2] += fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
        Thought lo2 = Thought5.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    fb0 = fd0 < fd1;
    boolean lb3 = true;
    fb0 = ld0 < fd0;
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
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
