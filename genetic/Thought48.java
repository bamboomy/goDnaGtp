package genetic;
import java.util.ArrayList;
class Thought48 extends Thought{
private static ArrayList<Thought48> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 584.6206096829527;
private double fd1 = 52.777358076482386;
private Thought fo0 = null;
private Thought fo1 = null;
Thought48 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought48 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought48 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    double ld0 = 461.6201059733426;
    Thought lo1 = Thought72.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld0;
    Thought lo2 = Thought94.getInstance();
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    double ld3 = 5.16663252315851;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb4 = true;
    double ld5 = 549.6513492886099;

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
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        Output.points[3][0] -= fd1;
    fb0 = fd0 > fd1;
    fb1 = lb0 && lb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought84.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    ab1 = !ab2;

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
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    lb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb0);
}
    double ld2 = 395.80747284889884;
    Output.points[3][1] -= ad2;
    Output.points[3][2] += ad3;
    Thought lo3 = Thought77.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
        lb0 = lb1 || fb0;
    fd0 = fd1 + ld2;
    Thought lo4 = Thought24.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
    if (fb1) {
        lb0 = lb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb5 = true;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb5, lb0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2();
}
    ab4 = fb0 && fb1;
    Thought lo0 = Thought34.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    Output.points[3][3] -= ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ad1;
    Thought lo1 = Thought35.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = fd1 > ad1;
    ab4 = fb0 && fb1;
    ad2 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    lb2 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb3 = false;
    ab4 = ad1 < ad2;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    double ld4 = 506.26171726481846;

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
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought11.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought8.getInstance(fo1, ao1, ao2, ao3);
    fd1 = fd0 + fd1;
        double ld2 = 239.67948376304113;
if(ao4 != null){
      ao4.m3(ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld2);
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    Output.points[3][4] -= fd0;
    fb0 = fb1 && lb3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
}
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, fb0, fb1, lb3, fb0);
}
    fd1 = ld2 + fd0;
    boolean lb4 = false;
    double ld5 = 66.77652877913609;
    fb0 = fd0 < fd1;
    ld2 = ld5 + fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, lb3, lb4, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld0 = 427.7117995863449;
    double ld1 = 688.4064991360075;
        Thought lo2 = Thought79.getInstance(ad1, ad2, ad3, ad4);
    boolean lb3 = false;
    fb0 = fb1 || lb3;
    fd0 = fd1 - ld0;
    boolean lb4 = true;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb3);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    Thought lo5 = Thought76.getInstance(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3, lb4, fb0, fb1, lb3);
    boolean lb6 = true;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb4, lb6, fb0, fb1);
}
    ld0 *= -1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    lb3 = ad1 < ad2;
    Output.points[3][5] -= ad3;
    lb4 = ad4 < fd0;
if(ao4 != null){
      ao4.m1(fd1, ld0, ld1, ad1, lb6, fb0, fb1, lb3);
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
    ab2 = !ab3;
    ab4 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
        fb0 = fd0 < fd1;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
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
    Thought lo0 = Thought52.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < ad1;
    double ld1 = 206.75443037388862;
    Output.points[3][6] -= ad1;
    Output.points[3][7] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld1, ad1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought56.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought18.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 526.844386093698;
    fd0 *= -1;
    fb1 = !fb0;
    Thought lo2 = Thought51.getInstance();
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(ld1, fd0, fd1, ld1);
}
        Thought lo3 = Thought59.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Output.points[3][8] += ld1;
        fb1 = fd0 < fd1;
        boolean lb4 = false;
if(fo0 != null){
          lb4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
        fb1 = !lb4;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[4][0] += ld1;
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
    ab2 = fd1 > fd0;
    Output.points[4][1] -= fd1;
    ab3 = !ab4;
    boolean lb0 = true;
    ab4 = !fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    double ld2 = 940.3802485944672;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = fd0 < fd1;
    ld2 = fd0 - fd1;
    ab4 = ld2 < fd0;
    fd1 *= -1;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ld2 = fo1.m3(fd0, fd1, ld2, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(ab4, fb0, fb1, lb0);
}
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
        fd0 = fd1 + ld2;
        lb0 = !lb1;
        double ld5 = 279.60403144674433;
        ld2 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, ld2, fd0, fd1, lb3, ab1, ab2, ab3);
}
        ld5 = ld2 - fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought81.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      lb0 = fo0.m2();
}
    lb2 = fb0 || fb1;
    boolean lb3 = false;
        fd0 *= -1;
    Thought lo4 = Thought30.getInstance(fd1, ad1, ad2, ad3);
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(lb0, lb2, lb3, lb5);
}
    fb0 = fb1 || lb0;
    lb2 = lb3 || lb5;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[4][2] -= ad2;
    Output.points[4][3] += ad3;
    ad4 *= -1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld0 = 661.6316483862811;
    ab4 = ad4 > fd0;
    fb0 = fd1 < ld0;
    ad1 *= -1;
    double ld1 = 451.1101619588617;
    boolean lb2 = true;
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad4 > fd0;
if(fo0 != null){
          lb2 = fo0.m2(fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        boolean lb3 = true;
        ab4 = fd1 < ld0;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb3, lb2);
}
        double ld4 = 638.6964018271527;
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
    fb1 = !fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    double ld0 = 280.27000380823176;
    Thought lo1 = Thought3.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought28.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    Thought lo0 = Thought96.getInstance(ao1, ao2, ao3, ao4);
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    double ld2 = 750.4916396119602;
    Thought lo3 = Thought32.getInstance(fd0, fd1, ld2, ad1, fb0, fb1, lb1, fb0);
    boolean lb4 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, ad1, ad2);
}
    fb1 = !lb1;
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought39.getInstance(lb4, fb0, fb1, lb1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        Output.points[4][4] -= ld2;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb1);
}
        boolean lb6 = true;
        boolean lb7 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb7, lb1, lb4, fb0);
}
        fd1 *= -1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 944.7556760937014;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 529.3157949142211;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(ld1, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ld1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo2 = Thought45.getInstance(fd1, ld0, ld1, fd0);
    ab4 = !fb0;
    Output.points[4][5] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        double ld0 = 946.8517700204968;
        ab3 = ab4 || fb0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
        ad1 = ad2 - ad3;
        ab4 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m1(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
        fb0 = ad1 > ad2;
        ad3 *= -1;
        ad4 = fd0 + fd1;
if(ao2 != null){
          ao2.m1();
}
        fb1 = ld0 < ad1;
        ab1 = ad2 > ad3;
        ab2 = ab3 || ab4;
        fb0 = ad4 > fd0;
if(ao3 != null){
          ao3.m3(fd1, ld0, ad1, ad2);
}
        fb1 = ab1 || ab2;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    double ld0 = 409.01035435751874;
    ld0 = fd0 + fd1;
    fb1 = !fb0;
    fb1 = ld0 > fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
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
    Output.points[4][6] -= fd0;
    Thought lo0 = Thought83.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    Output.points[4][7] += fd1;
    ab3 = ab4 || fb0;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (ab4) {
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        for(int i0=0; i0<10; i0++){
            ab2 = fd0 > fd1;
            ab3 = ab4 || fb0;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
            }
        Thought lo2 = Thought72.getInstance(fb1, lb1, ab1, ab2);
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        ab3 = ab4 || fb0;
        fb1 = lb1 && ab1;
        Output.points[4][8] -= fd0;
        fd1 = fd0 - fd1;
        boolean lb3 = true;
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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    Thought lo0 = Thought38.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    Thought lo1 = Thought2.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    Output.points[5][0] -= fd0;
    fd1 = ad1 + ad2;
    Output.points[5][1] += ad3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
        fb0 = fb1 && fb0;
        boolean lb2 = true;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 > ad4;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        boolean lb0 = false;
        ad4 = fd0 - fd1;
        Thought lo1 = Thought94.getInstance();
        ab2 = ab3 && ab4;
        fb0 = ad1 < ad2;
        fb1 = !lb0;
        ab1 = ad3 < ad4;
        }
    boolean lb2 = true;
    Output.points[5][2] -= fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, ab1);
}
    ab2 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 998.0063523513757;
    Thought lo1 = Thought2.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fd0 *= -1;
    boolean lb2 = true;
    fd1 *= -1;
    fb0 = ld0 < fd0;

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
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    Thought lo1 = Thought97.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(ao2 != null){
      ab4 = ao2.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Output.points[5][3] -= fd0;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
    fd1 = fd0 + fd1;
    Output.points[5][4] -= fd0;
    if (ab1) {
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought49.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, lb1, ab1);
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        boolean lb3 = true;
        ab1 = ab2 && ab3;
        Thought lo4 = Thought47.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb3);
if(ao1 != null){
          lb0 = ao1.m2();
}
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao3.m2(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb3);
}
        lb0 = lb1 || ab1;
        Thought lo5 = Thought7.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
        Thought lo6 = Thought14.getInstance(ao1, ao2, ao3, ao4);
        fb1 = !lb3;
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
    ab2 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought78.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    lb1 = ab1 && ab2;
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    double ld2 = 662.5758314998583;
    fb0 = ad2 < ad3;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld2, ad1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ld2 *= -1;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    boolean lb3 = true;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, lb1, lb3, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 286.11074510004624;
if(fo1 != null){
      ld0 = fo1.m3();
}
    fd0 *= -1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    boolean lb3 = false;
    lb2 = ld0 < fd0;
    fd1 = ld0 - fd0;
    if (lb3) {
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb1);
}
        lb2 = lb3 && fb0;
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
    if (ab1) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        Output.points[5][5] += fd0;
        ab2 = fd1 < fd0;
        fd1 *= -1;
        ab3 = ab4 && fb0;
        fb1 = !ab1;
        } else if (ab2) {
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[5][6] += fd0;
        lb0 = ab1 || ab2;
        ab3 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo0.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought22.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fb0 = fb1 && fb0;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought54.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    ad1 *= -1;
    lb2 = !fb0;

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
    ab1 = ab2 || ab3;
    ab4 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
        lb0 = ad2 < ad3;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    double ld2 = 267.4460809760202;
        ab3 = ab4 && fb0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
        Thought lo3 = Thought85.getInstance();
        ab3 = ld2 > ad1;
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
    double ld0 = 871.0326739756846;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    fb0 = fd1 > ld0;
    double ld1 = 126.01859556181633;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld0, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    Output.points[5][7] -= fd0;
    boolean lb2 = false;
    Thought lo3 = Thought81.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, ld1, fd0);
    fb0 = fb1 && lb2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb2, fb0, fb1);
}
    ld0 = ld1 - fd0;
    lb2 = !fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo4 = Thought52.getInstance(fd1, ld0, ld1, fd0, fb1, lb2, fb0, fb1);
if(fo1 != null){
      lb2 = fo1.m2();
}
if(ao1 != null){
      fd1 = ao1.m3(ld0, ld1, fd0, fd1);
}
    fb0 = ld0 < ld1;
    double ld5 = 118.55769264633476;
    ld5 = fd0 - fd1;
    double ld6 = 592.9697702086931;
    double ld7 = 499.69841680371195;
    Output.points[5][8] += ld0;
    ld1 = ld5 - ld6;

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
    double ld0 = 838.2944892798555;
    Output.points[6][0] -= ld0;
    Output.points[6][1] -= ad1;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    Thought lo1 = Thought77.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fb1 = fd0 > fd1;
    ld0 = ad1 + ad2;
    boolean lb2 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      fb1 = ao2.m2();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    Thought lo0 = Thought86.getInstance(ab2, ab3, ab4, fb0);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = !ab1;
    ab2 = fd1 > fd0;
    ab3 = !ab4;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    boolean lb3 = true;
    Thought lo4 = Thought87.getInstance();
    fd1 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    double ld0 = 277.9421125442519;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ld0);
}
    ab2 = ad1 < ad2;
    ad3 = ad4 + fd0;
    ab3 = fd1 < ld0;
        Thought lo1 = Thought27.getInstance(ab4, fb0, fb1, ab1);
    ab2 = !ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought87.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
    ab3 = ad2 < ad3;

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
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
    Thought lo0 = Thought32.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought74.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    double ld0 = 233.8239442462593;
    ld0 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    Output.points[6][2] += fd1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld1 = 783.9012955437577;
    fb0 = !fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fd0 = fd1 + ld0;
    Thought lo3 = Thought59.getInstance();
    boolean lb4 = false;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(ld0, ld1, fd0, fd1);
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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fd0 *= -1;
    fb0 = !fb1;
    Output.points[6][3] -= fd1;
    lb0 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    Output.points[6][4] -= fd1;
    fd0 = fd1 + fd0;

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
