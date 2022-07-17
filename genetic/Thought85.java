package genetic;
import java.util.ArrayList;
class Thought85 extends Thought{
private static ArrayList<Thought85> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 477.715780326109;
private double fd1 = 17.894027828372568;
private Thought fo0 = null;
private Thought fo1 = null;
Thought85 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought85 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought85 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought85 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought85 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought274.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 718.2870862025931;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought30.getInstance();
    double ld3 = 318.83304827236157;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        boolean lb4 = false;
        double ld5 = 16.5194996254692;
        Thought lo6 = Thought356.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ld5, ld1, ld3, fd0);
}
        fb0 = !fb1;
        boolean lb7 = false;
        if (lb4) {
            Thought lo8 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd1, ld5, ld1, ld3);
            fd0 = fd1 - ld5;
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
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Output.points[3][0] -= fd0;
    fd1 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    Output.points[3][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    lb0 = lb1 || ab1;
    fd0 *= -1;
    boolean lb2 = true;
    boolean lb3 = true;
if(fo0 != null){
          lb3 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;
    fd1 = fd0 + fd1;
    Thought lo5 = Thought23.getInstance(fo1, fo0, fo1, fo0);
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
          fo0.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    double ld0 = 670.4878912007617;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ld0 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ld0 *= -1;
    fb1 = ad1 > ad2;
    Thought lo1 = Thought136.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = false;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    boolean lb3 = false;
    Thought lo4 = Thought78.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);

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
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[3][2] -= ad4;
    boolean lb2 = true;
    Output.points[3][3] -= fd0;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, lb2);
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
    double ld0 = 688.6214654440697;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld2 = 772.667575716586;
    boolean lb3 = true;
    ld0 = ld2 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld0, ld2, fd0, fd1);
}
    Thought lo4 = Thought173.getInstance(ao2, ao3, ao4, fo0, ld0, ld2, fd0, fd1);

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
    fb0 = ad1 < ad2;
    double ld0 = 78.59354264057521;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[3][4] -= ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld1 = 174.0193599642627;
    Thought lo2 = Thought196.getInstance();
    fb0 = fb1 && fb0;
    fb1 = ld1 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought291.getInstance(lb3, fb0, fb1, lb3);
    double ld5 = 148.9775123457152;
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld1 = ao3.m3(ld5, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
    fd1 = ld0 + ld1;
    ld5 = ad1 + ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao3.m3(ld1, ld5, ad1, ad2, fb1, lb3, fb0, fb1);
}
    ad3 = ad4 + fd0;
    double ld6 = 217.6460956513364;
    lb3 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb3, fb0, fb1);
}
    double ld7 = 489.5425317213434;

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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[3][5] -= fd0;

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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo0 = Thought399.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ad4 *= -1;
if(ao2 != null){
      ao2.m3();
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
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fd0 *= -1;
        double ld0 = 848.5289531327327;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fd1 *= -1;
        fb0 = ld0 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        }
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
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
    fd0 *= -1;
    Thought lo0 = Thought210.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    ab4 = !fb0;
    boolean lb1 = true;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              ab4 = fo1.m2(fb0, fb1, lb1, ab1);
}
            fd0 = fd1 - fd0;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    fd1 = ad1 - ad2;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    lb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      lb0 = fo0.m2(lb1, lb2, fb0, fb1);
}
    ad1 *= -1;
    lb0 = lb1 && lb2;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[3][6] += ad3;
    fb0 = fb1 || lb0;
if(fo0 != null){
      lb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    lb2 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
    ad4 = fd0 + fd1;

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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 769.8655217723417;
    fb0 = ld1 < ad1;
    Thought lo2 = Thought280.getInstance();
    ad2 = ad3 + ad4;
    fb1 = lb0 && ab1;
    fd0 = fd1 + ld1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][7] += ad1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
    lb3 = ld1 < ad1;
    double ld5 = 521.1060630123196;
    lb4 = ab1 || ab2;
    boolean lb6 = false;

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
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
    lb0 = !fb0;
    Thought lo1 = Thought169.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    lb0 = lb2 && fb0;
    fb1 = lb0 && lb2;
    fb0 = fd1 > fd0;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb2, lb3);
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
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought302.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb1;
    ad3 = ad4 + fd0;
    boolean lb3 = true;
    lb2 = !lb3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    fb1 = ad1 > ad2;
    Thought lo4 = Thought186.getInstance(ad3, ad4, fd0, fd1);
    double ld5 = 737.9971349344054;
    ld5 *= -1;
    Thought lo6 = Thought329.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld5, ad1, lb1, lb2, lb3, fb0);
}
    Output.points[3][8] += ad2;

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
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
    if (ab2) {
        Thought lo0 = Thought232.getInstance();
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
        fd1 = fd0 - fd1;
        fd0 *= -1;
        fd1 *= -1;
        double ld1 = 824.1190560405437;
        boolean lb2 = false;
        Output.points[4][0] += ld1;
if(ao1 != null){
          fo1 = ao1.m4(lb2, ab1, ab2, ab3);
}
        if (ab4) {
            boolean lb3 = true;
            ab4 = fb0 && fb1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
              ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
            fd1 *= -1;
            Output.points[4][1] += ld1;
            boolean lb4 = true;
            lb3 = lb4 && lb2;
if(ao4 != null){
              ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
if(ao3 != null){
              ao3.m2(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
            boolean lb5 = false;
            double ld6 = 261.1783280201883;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
if(ao2 != null){
      ao2.m2();
}
    Thought lo0 = Thought299.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    double ld1 = 964.5009319359358;
    ad2 *= -1;
    double ld2 = 5.315406557018247;
    Output.points[4][2] -= ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m3();
}
    fd1 = ld1 + ld2;
    boolean lb3 = true;
    Thought lo4 = Thought42.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb3);
}
    boolean lb5 = false;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought273.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought253.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
        boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb2;
    Thought lo3 = Thought197.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
    double ld4 = 344.71818829374644;
    fb1 = fd0 > fd1;
    ld4 = fd0 - fd1;
    ld4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld4, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
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
    ab1 = fd0 > fd1;
    double ld0 = 711.6420942263154;
    Thought lo1 = Thought193.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 718.6675544508425;
    ab1 = ab2 && ab3;
    ld0 = ld2 + fd0;
    fd1 = ld0 - ld2;
    boolean lb3 = true;
    double ld4 = 764.4918307188983;
    ab3 = ab4 || fb0;
    double ld5 = 977.3967455460122;
    ld4 = ld5 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, ld2, ld4);
}
    ld5 = fd0 - fd1;
    lb3 = ld0 < ld2;
    Output.points[4][3] -= ld4;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fb0 = fb1 || lb0;
        Output.points[4][4] += ad2;
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m2(fb0, fb1, lb0, fb0);
}
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
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
    Output.points[4][5] -= ad2;
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 > ad2;
    ab3 = ad3 < ad4;
    Output.points[4][6] += fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;
    fb0 = fb1 || ab1;
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
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
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    if (fb1) {
        fd0 = fd1 + fd0;
        fb0 = fd1 > fd0;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m2();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
        Thought lo0 = Thought122.getInstance(ao2, ao3, ao4, fo0);
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
        Output.points[4][7] += fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought60.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought155.getInstance();
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
    ad2 = ad3 - ad4;
    double ld0 = 935.6130413260272;
    double ld1 = 762.9273890637828;
    Thought lo2 = Thought33.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[4][8] += ld0;
        Thought lo4 = Thought243.getInstance(ld1, ad1, ad2, ad3);
    double ld5 = 933.1797144844089;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ld0 = ao1.m3(ld1, ld5, ad1, ad2, fb1, lb3, fb0, fb1);
}
    boolean lb6 = true;
    lb3 = !lb6;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb3, lb6);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 < ld0;
    fb1 = ld1 < ld5;
    lb3 = !lb6;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb3, lb6);
}
if(ao4 != null){
      ao4.m2(fb0, fb1, lb3, lb6);
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
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    ab4 = fd1 > fd0;
    Thought lo0 = Thought66.getInstance(ao1, ao2, ao3, ao4);
    if (fb0) {
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
        double ld1 = 836.4552902004667;
        ab1 = ab2 || ab3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
        ab4 = fb0 && fb1;
        Thought lo2 = Thought182.getInstance(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
        Output.points[5][0] += fd0;
        ab1 = fd1 < ld1;
        ab2 = fd0 > fd1;
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
            for(int i1=0; i1<10; i1++){
if(ao3 != null){
                  ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    fb1 = ab1 || ab2;
    ad1 = ad2 + ad3;
    ab3 = !ab4;
    boolean lb0 = true;
    double ld1 = 678.6526239348534;
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ld1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    double ld2 = 844.2160597134676;
    Thought lo3 = Thought251.getInstance();
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao4.m3(ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(ad4, fd0, fd1, ld1);
}
    ld2 = ad1 + ad2;
    boolean lb5 = true;
    ab4 = !fb0;
    fb1 = lb0 || lb4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    Thought lo6 = Thought339.getInstance(ld1, ld2, ad1, ad2, lb5, ab1, ab2, ab3);
    ab4 = ad3 < ad4;

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
    Thought lo0 = Thought365.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    if (fb1) {
        Output.points[5][1] += fd1;
        boolean lb1 = true;
        } else if (fb0) {
        for(int i0=0; i0<10; i0++){
            fb1 = fd0 < fd1;
            fd0 = fd1 - fd0;
if(fo0 != null){
              fo0.m2();
}
            fb0 = fb1 || fb0;
            Output.points[5][2] -= fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
              fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fd0 *= -1;
            Output.points[5][3] += fd1;
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
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    Output.points[5][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought112.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 965.0381725187418;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    Output.points[5][5] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ld1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[5][6] -= ad1;
    boolean lb0 = false;
    Thought lo1 = Thought26.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fb0 = fb1 || lb0;
    boolean lb2 = false;
    lb2 = fd1 < ad1;
    ad2 *= -1;

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
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    double ld0 = 346.0248149451532;
    double ld1 = 398.3366239804532;
    ab2 = !ab3;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb2 = ad3 < ad4;
    boolean lb3 = true;
    lb3 = !ab1;
    ab2 = fd0 < fd1;
    Thought lo4 = Thought114.getInstance();
    Output.points[5][7] += ld0;
    Output.points[5][8] += ld1;
    ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, lb2, lb3, ab1);
}
if(fo0 != null){
      ad4 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Output.points[6][0] += fd0;
    Thought lo5 = Thought124.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought127.getInstance(fd1, ld0, ld1, ad1);
    Thought lo7 = Thought224.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, ad1, ad2, fb1, lb2, lb3, ab1);
}
    ad3 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m1();
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought35.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
        double ld1 = 924.7023634632516;
        fb1 = ld1 < fd0;
        if (fb0) {
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
            fb1 = fb0 || fb1;
if(ao2 != null){
              ld1 = ao2.m3(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
            fd1 *= -1;
}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = !fb0;
    double ld0 = 316.44391944207035;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fd0 < fd1;

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
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    ab2 = fd0 < fd1;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    double ld1 = 393.28852376714127;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 || lb0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = fd1 < ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
}
        ab4 = fd1 < ld1;
    fb0 = fb1 && lb0;

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
    Thought lo0 = Thought286.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ad2 < ad3;
        ad4 *= -1;
    if (ab1) {
        fd0 = fd1 - ad1;
        Output.points[6][1] -= ad2;
        Output.points[6][2] += ad3;
        ad4 *= -1;
        Thought lo1 = Thought78.getInstance(fd0, fd1, ad1, ad2);
        boolean lb2 = false;
        Output.points[6][3] += ad3;
        ad4 *= -1;
        double ld3 = 869.8977084134478;
        Thought lo4 = Thought179.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld3);
        ab1 = ad1 > ad2;
        ab2 = ab3 || ab4;
        if (fb0) {
            fb1 = !lb2;
            Output.points[6][4] -= ad3;
            ab1 = !ab2;
            Thought lo5 = Thought137.getInstance(ad4, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
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
    double ld0 = 676.1943963632715;
    fb0 = !fb1;
    fb0 = !fb1;
    double ld1 = 829.8583962428194;
    fb0 = ld1 < fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    boolean lb3 = true;
    boolean lb4 = false;
    lb4 = fb0 && fb1;
if(fo0 != null){
      lb2 = fo0.m2();
}
    lb3 = lb4 || fb0;

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought159.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo1.m1(fb1, fb0, fb1, fb0);
}
    double ld1 = 764.4458644469937;
    boolean lb2 = true;
    Thought lo3 = Thought83.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fb0 = fd1 > ld1;
    double ld4 = 867.0347239595651;
    fb1 = !lb2;
    boolean lb5 = false;
    boolean lb6 = false;
    lb5 = lb6 && fb0;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld4);
}
    fd0 = fd1 + ld1;
    Output.points[6][5] -= ld4;
    fb1 = lb2 || lb5;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld4, lb6, fb0, fb1, lb2);
}
    lb5 = lb6 || fb0;

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
    lb0 = fd0 < fd1;
    boolean lb1 = false;
        lb1 = fb0 && fb1;
    lb0 = fd0 < fd1;
    double ld2 = 715.4191402079423;
    Thought lo3 = Thought199.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
        fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fd1 < ld2;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ld2, fd0);
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
